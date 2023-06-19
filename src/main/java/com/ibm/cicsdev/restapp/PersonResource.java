package com.ibm.cicsdev.restapp;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

import com.ibm.cicsdev.restapp.bean.Person;
import com.ibm.cicsdev.restapp.bean.MedicalParameters;


@Path("person")
@Produces( MediaType.APPLICATION_JSON )
public class PersonResource {

	static List<Person> people = new ArrayList<Person>();
	static List<LinkedList<MedicalParameters> > peopleMedical = new ArrayList< LinkedList<MedicalParameters> >();
	
	@GET
    public List<Person> getPeople(
		@QueryParam("name") @DefaultValue("") String name,
		@QueryParam("city") @DefaultValue("") String city,
		@QueryParam("status") @DefaultValue("0") float status
	) {
		List<Person> peopleFiltered = new ArrayList<Person>();
		for (Person person : people) {
			if (person.getName().contains(name) && person.getCity().contains(city) && person.getStatus() >= status) {
				peopleFiltered.add(person);
			}
		}
		return peopleFiltered;
    }
	
    @GET
    @Path("/{id}")
    public Person getPerson(@PathParam("id") int id) {
    	return people.get(id);
    }
    
    @GET
    @Path("/{id}/medical")
    public List<MedicalParameters> getMedical(@PathParam("id") int id) {
    	return peopleMedical.get(id);
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void createPerson(Person person) {
    	people.add(person);
    }
    
    @POST
    @Path("/medical")
    @Consumes(MediaType.APPLICATION_JSON)
    public void createMedical(LinkedList<MedicalParameters> medical) {
    	peopleMedical.add(medical);
    }
    
    @POST
    @Path("/all")
    @Consumes(MediaType.APPLICATION_JSON)
    public void createPeople(List<Person> people) {
    	PersonResource.people = people;
    }
    
    @POST
    @Path("/all/medical")
    @Consumes(MediaType.APPLICATION_JSON)
    public void createPeopleMedical(List< LinkedList<MedicalParameters> > peopleMedical) {
    	PersonResource.peopleMedical = peopleMedical;
    }
    
    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    // NOT THREAD SAFE!!!
    public void updatePersonMedical(@PathParam("id") int id, MedicalParameters medicalParameters) {
    	Queue<MedicalParameters> medical = peopleMedical.get(id);
    	if (medical.size() >= 100) {
    		medical.remove();
    	}
    	medical.add(medicalParameters);
    }
}

package com.ibm.cicsdev.restapp.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "person")
public class Person {
    
    @XmlElement(name = "name")
    private String name;
    
    @XmlElement(name = "sex")
    private String sex;
    
    @XmlElement(name = "city")
    private String city;
    
    @XmlElement(name = "alert")
    private boolean alert;
    
    @XmlElement(name = "birthdate")
    private String birthdate;
    
    @XmlElement(name = "status")
    private float status;
    
   	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public boolean isAlert() {
		return alert;
	}

	public void setAlert(boolean alert) {
		this.alert = alert;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	
	public float getStatus() {
		return status;
	}

	public void setStatus(float status) {
		this.status = status;
	}
}

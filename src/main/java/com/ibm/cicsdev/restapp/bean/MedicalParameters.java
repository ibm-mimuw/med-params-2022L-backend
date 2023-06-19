package com.ibm.cicsdev.restapp.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "medical")
public class MedicalParameters {

    @XmlElement(name = "timestamp")
    private String timestamp;
    
    @XmlElement(name = "pulse")
    private int pulse;
    
    @XmlElement(name = "sugar")
    private int sugar;
    
    @XmlElement(name = "temperature")
    private float temperature;
    
    @XmlElement(name = "systolic_bp")
    private int systolicBP;
    
	@XmlElement(name = "diastolic_bp")
    private int diastolicBP;
    
    @XmlElement(name = "oxygen")
    private int oxygen;
    
    @XmlElement(name = "respirations_rpm")
    private int respirationsRPM;
    
    @XmlElement(name = "co2")
    private float co2;
    
    @XmlElement(name = "wbc")
    private int wbc;
    
    @XmlElement(name = "alcohol")
    private float alcohol;
    
    @XmlElement(name = "cortizol")
    private int cortizol;

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public int getPulse() {
		return pulse;
	}

	public void setPulse(int pulse) {
		this.pulse = pulse;
	}

	public float getSugar() {
		return sugar;
	}

	public void setSugar(int sugar) {
		this.sugar = sugar;
	}

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temp) {
		this.temperature = temp;
	}

	public float getSystolicBP() {
		return systolicBP;
	}

	public void setSystolicBP(int systolicBP) {
		this.systolicBP = systolicBP;
	}

	public float getDiastolicBP() {
		return diastolicBP;
	}

	public void setDiastolicBP(int diastolicBP) {
		this.diastolicBP = diastolicBP;
	}
	
	public float getOxygen() {
		return oxygen;
	}

	public void setOxygen(int oxygen) {
		this.oxygen = oxygen;
	}

	public int getRespirationsRPM() {
		return respirationsRPM;
	}

	public void setRespirationsRPM(int respirationsRPM) {
		this.respirationsRPM = respirationsRPM;
	}

	public float getCo2() {
		return co2;
	}

	public void setCo2(float co2) {
		this.co2 = co2;
	}

	public float getWbc() {
		return wbc;
	}

	public void setWbc(int wbc) {
		this.wbc = wbc;
	}

	public float getAlcohol() {
		return alcohol;
	}

	public void setAlcohol(float alcohol) {
		this.alcohol = alcohol;
	}

	public float getCortizol() {
		return cortizol;
	}

	public void setCortizol(int cortizol) {
		this.cortizol = cortizol;
	}
}

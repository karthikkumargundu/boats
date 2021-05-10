package com.ltts.ConnectedBoatSimulatorUI.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Boatessentials {
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	private String hullid;
	private int noofengine;
	private String status;
	@JsonFormat(pattern = "yyyy/MM/dd")
    private Date boatstarttime;
	
	public Boatessentials() {
		super();
	}

	
	
	
	public Boatessentials(String hullid, int noofengine, String status, Date boatstarttime) {
		super();
		this.hullid = hullid;
		this.noofengine = noofengine;
		this.status = status;
		this.boatstarttime = boatstarttime;
	}




	public String getHullid() {
		return hullid;
	}




	public void setHullid(String hullid) {
		this.hullid = hullid;
	}




	public int getNoofengine() {
		return noofengine;
	}




	public void setNoofengine(int noofengine) {
		this.noofengine = noofengine;
	}




	public String getStatus() {
		return status;
	}




	public void setStatus(String status) {
		this.status = status;
	}




	public Date getBoatstarttime() {
		return boatstarttime;
	}




	public void setBoatstarttime(Date boatstarttime) {
		this.boatstarttime = boatstarttime;
	}




	@Override
	public String toString() {
		return "Boatessentials [hullid=" + hullid + ", noofengine=" + noofengine + ", status=" + status
				+ ", boatstarttime=" + boatstarttime + "]";
	}

	
	
	
	
	
}

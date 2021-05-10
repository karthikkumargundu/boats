package com.ltts.ConnectedBoatSimulatorUI.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Boatengine {
	 @Id
	    @GeneratedValue(strategy= GenerationType.IDENTITY)
		private String hullid;
	 	private String engineid;
	 	private int enginerpm;
	 	private int oilpressure;
	 	private int oiltemperature;
	 	private int enginetemperature;
	 	@JsonFormat(pattern = "yyyy/MM/dd")
	     private Date engineruntime;
	 	private float enginefuelrate;
	 	
	 	public Boatengine() {
			super();
		}

		public Boatengine(String hullid, String engineid, int enginerpm, int oilpressure, int oiltemperature,
				int enginetemperature, Date engineruntime, float enginefuelrate) {
			super();
			this.hullid = hullid;
			this.engineid = engineid;
			this.enginerpm = enginerpm;
			this.oilpressure = oilpressure;
			this.oiltemperature = oiltemperature;
			this.enginetemperature = enginetemperature;
			this.engineruntime = engineruntime;
			this.enginefuelrate = enginefuelrate;
		}

		public String getHullid() {
			return hullid;
		}

		public void setHullid(String hullid) {
			this.hullid = hullid;
		}

		public String getEngineid() {
			return engineid;
		}

		public void setEngineid(String engineid) {
			this.engineid = engineid;
		}

		public int getEnginerpm() {
			return enginerpm;
		}

		public void setEnginerpm(int enginerpm) {
			this.enginerpm = enginerpm;
		}

		public int getOilpressure() {
			return oilpressure;
		}

		public void setOilpressure(int oilpressure) {
			this.oilpressure = oilpressure;
		}

		public int getOiltemperature() {
			return oiltemperature;
		}

		public void setOiltemperature(int oiltemperature) {
			this.oiltemperature = oiltemperature;
		}

		public int getEnginetemperature() {
			return enginetemperature;
		}

		public void setEnginetemperature(int enginetemperature) {
			this.enginetemperature = enginetemperature;
		}

		public Date getEngineruntime() {
			return engineruntime;
		}

		public void setEngineruntime(Date engineruntime) {
			this.engineruntime = engineruntime;
		}

		public float getEnginefuelrate() {
			return enginefuelrate;
		}

		public void setEnginefuelrate(float enginefuelrate) {
			this.enginefuelrate = enginefuelrate;
		}

		@Override
		public String toString() {
			return "Boatengine [hullid=" + hullid + ", engineid=" + engineid + ", enginerpm=" + enginerpm
					+ ", oilpressure=" + oilpressure + ", oiltemperature=" + oiltemperature + ", enginetemperature="
					+ enginetemperature + ", engineruntime=" + engineruntime + ", enginefuelrate=" + enginefuelrate
					+ "]";
		}

	 	
}

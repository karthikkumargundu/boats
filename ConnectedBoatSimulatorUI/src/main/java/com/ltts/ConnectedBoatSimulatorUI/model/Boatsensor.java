package com.ltts.ConnectedBoatSimulatorUI.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Boatsensor {
	 @Id
	    @GeneratedValue(strategy= GenerationType.IDENTITY)
		private String hullid;
	 	private  int oceandepth;
	 	private String doorsensor;
	 	
	 	public Boatsensor() {
			super();
		}

		public Boatsensor(String hullid, int oceandepth, String doorsensor) {
			super();
			this.hullid = hullid;
			this.oceandepth = oceandepth;
			this.doorsensor = doorsensor;
		}

		public String getHullid() {
			return hullid;
		}

		public void setHullid(String hullid) {
			this.hullid = hullid;
		}

		public int getOceandepth() {
			return oceandepth;
		}

		public void setOceandepth(int oceandepth) {
			this.oceandepth = oceandepth;
		}

		public String getDoorsensor() {
			return doorsensor;
		}

		public void setDoorsensor(String doorsensor) {
			this.doorsensor = doorsensor;
		}

		@Override
		public String toString() {
			return "Boatsensor [hullid=" + hullid + ", oceandepth=" + oceandepth + ", doorsensor=" + doorsensor + "]";
		}
	 	
	 	
}

package com.ltts.ConnectedBoatSimulatorUI.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Boatlog {
	 @Id
	    @GeneratedValue(strategy= GenerationType.IDENTITY)
		private String hullid;
	 	private String name;
	 	private String model;
	 	private int noofengine;
	 	
	 	public Boatlog() {
			super();
		}

		
		public String getHullid() {
			return hullid;
		}

		public void setHullid(String hullid) {
			this.hullid = hullid;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public int getNoofengine() {
			return noofengine;
		}

		public void setNoofengine(int noofengine) {
			this.noofengine = noofengine;
		}
	 	
		
		
		public Boatlog(String hullid, String name, String model, int noofengine) {
			super();
			this.hullid = hullid;
			this.name = name;
			this.model = model;
			this.noofengine = noofengine;
		}


		@Override
		public String toString() {
			return "Boatlog [hullid=" + hullid + ", name=" + name + ", model=" + model + ", noofengine=" + noofengine
					+ "]";
		}


}

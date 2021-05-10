package com.ltts.ConnectedBoatSimulatorUI.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Boatlocation {
	 @Id
	    @GeneratedValue(strategy= GenerationType.IDENTITY)
		private String hullid;
	 	private  double longitude;
	 	private double latitude;
	 	private int altitude;
	 	private String heading;
	 	private int speed;
	 	 @JsonFormat(pattern = "yyyy/MM/dd")
		    private Date  timestamp;
	 	
	 	public Boatlocation() {
			super();
		}

		public Boatlocation(String hullid, double longitude, double latitude, int altitude, String heading, int speed,
				Date timestamp) {
			super();
			this.hullid = hullid;
			this.longitude = longitude;
			this.latitude = latitude;
			this.altitude = altitude;
			this.heading = heading;
			this.speed = speed;
			this.timestamp = timestamp;
		}

		public String getHullid() {
			return hullid;
		}

		public void setHullid(String hullid) {
			this.hullid = hullid;
		}

		public double getLongitude() {
			return longitude;
		}

		public void setLongitude(double longitude) {
			this.longitude = longitude;
		}

		public double getLatitude() {
			return latitude;
		}

		public void setLatitude(double latitude) {
			this.latitude = latitude;
		}

		public int getAltitude() {
			return altitude;
		}

		public void setAltitude(int altitude) {
			this.altitude = altitude;
		}

		public String getHeading() {
			return heading;
		}

		public void setHeading(String heading) {
			this.heading = heading;
		}

		public int getSpeed() {
			return speed;
		}

		public void setSpeed(int speed) {
			this.speed = speed;
		}

		public Date getTimestamp() {
			return timestamp;
		}

		public void setTimestamp(Date timestamp) {
			this.timestamp = timestamp;
		}

		@Override
		public String toString() {
			return "Boatlocation [hullid=" + hullid + ", longitude=" + longitude + ", latitude=" + latitude
					+ ", altitude=" + altitude + ", heading=" + heading + ", speed=" + speed + ", timestamp="
					+ timestamp + "]";
		}
	 	
			 	
}

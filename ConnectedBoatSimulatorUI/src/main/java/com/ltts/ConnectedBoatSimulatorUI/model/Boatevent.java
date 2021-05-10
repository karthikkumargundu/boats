package com.ltts.ConnectedBoatSimulatorUI.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Boatevent {
	 @Id
	    @GeneratedValue(strategy= GenerationType.IDENTITY)
		private String hullid;
	 @JsonFormat(pattern = "yyyy/MM/dd")
	    private Date timestamp;
	 	private int idle;
	 	
	 	public Boatevent() {
			super();
		}

		public Boatevent(String hullid, Date timestamp, int idle) {
			super();
			this.hullid = hullid;
			this.timestamp = timestamp;
			this.idle = idle;
		}

		public String getHullid() {
			return hullid;
		}

		public void setHullid(String hullid) {
			this.hullid = hullid;
		}

		public Date getTimestamp() {
			return timestamp;
		}

		public void setTimestamp(Date timestamp) {
			this.timestamp = timestamp;
		}

		public int getIdle() {
			return idle;
		}

		public void setIdle(int idle) {
			this.idle = idle;
		}

		@Override
		public String toString() {
			return "Boatevent [hullid=" + hullid + ", timestamp=" + timestamp + ", idle=" + idle + "]";
		}

	
}

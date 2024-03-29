package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//This Table Must Already Be Populated and Generated by Developer
@Entity
@Table(name="masterservice")
public class MasterService {
		int s_id;						//auto generated 	-->	@Id
		String s_name;      			//Added By Vendor	--> Checkboxes
		double s_price;					//Added By Vendor 	--> Rs.500 
		
		
		
		public MasterService() {
		}
	
		public MasterService(int s_id) {
			this.s_id = s_id;
		}
	
		public MasterService(int s_id, String s_name, double s_price) {
			super();
			this.s_id = s_id;
			this.s_name = s_name;
			this.s_price = s_price;
		}
		
		
		
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		public int getS_id() {
			return s_id;
		}
		public void setS_id(int s_id) {
			this.s_id = s_id;
		}
		
		
		
		@Column(length=70)
		public String getS_name() {
			return s_name;
		}
		public void setS_name(String s_name) {
			this.s_name = s_name;
		}
		
		@Column(columnDefinition="double(7,2)")
		public double getS_price() {
			return s_price;
		}
	
		public void setS_price(double s_price) {
			this.s_price = s_price;
		}
		
		
		@Override
		public String toString() {
			return "Service [s_id=" + s_id + ", s_name=" + s_name + ", s_price=" + s_price + "]";
		}


}

		

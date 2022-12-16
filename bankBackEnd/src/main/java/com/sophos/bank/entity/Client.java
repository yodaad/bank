package com.sophos.bank.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bank_db")
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String client_id;
	private int id_number;
	private String first_name;
	private String last_name;
	private String email;
	private Date dob = new Date();
	private Date doc = new Date();
	private String creation_user = "admin";
	private Date mod_date = new Date();
	private String mod_user = "admin";
	
	
	public Client() {
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getClient_id() {
		return client_id;
	}


	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}


	public int getId_number() {
		return id_number;
	}


	public void setId_number(int id_number) {
		this.id_number = id_number;
	}


	public String getFirst_name() {
		return first_name;
	}


	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	public String getLast_name() {
		return last_name;
	}


	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Date getDob() {
		return dob;
	}


	public void setDob(Date dob) {
		this.dob = dob;
	}


	public Date getDoc() {
		return doc;
	}


	public void setDoc(Date doc) {
		this.doc = doc;
	}


	public String getCreation_user() {
		return creation_user;
	}


	public void setCreation_user(String creation_user) {
		this.creation_user = creation_user;
	}


	public Date getMod_date() {
		return mod_date;
	}


	public void setMod_date(Date mod_date) {
		this.mod_date = mod_date;
	}


	public String getMod_user() {
		return mod_user;
	}


	public void setMod_user(String mod_user) {
		this.mod_user = mod_user;
	}
}

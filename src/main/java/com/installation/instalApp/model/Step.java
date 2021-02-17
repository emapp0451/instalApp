package com.installation.instalApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="step", catalog="installation")
public class Step {
	
	public Step() {
		
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "st_id")
	private Integer st_id;
	@Column(name = "statement", columnDefinition = "TEXT")
	private String statement;
	@Column(name = "step_url")
	private String stepUrl;
	@Column(name = "s_id")
	private Integer sId;
	
	public String getStatement() {
		return statement;
	}
	public void setStatement(String statement) {
		this.statement = statement;
	}
	
	public String getStepUrl() {
		return stepUrl;
	}
	public void setStepUrl(String stepUrl) {
		this.stepUrl = stepUrl;
	}
	
	public Integer getSt_id() {
		return st_id;
	}
	public void setSt_id(Integer st_id) {
		this.st_id = st_id;
	}
	public Integer getsId() {
		return sId;
	}
	public void setsId(Integer sId) {
		this.sId = sId;
	}
	
}

package com.installation.instalApp.model;

import java.util.List;

public class SoftwarePayloadBean {
	
	public SoftwarePayloadBean() {
		
	}
	private Software software;
	
	private List<Step> steps;

	public Software getSoftware() {
		return software;
	}

	public void setSoftware(Software software) {
		this.software = software;
	}

	public List<Step> getSteps() {
		return steps;
	}

	public void setSteps(List<Step> steps) {
		this.steps = steps;
	}
	
	

}

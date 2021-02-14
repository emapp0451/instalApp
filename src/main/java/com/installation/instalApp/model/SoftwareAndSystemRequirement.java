package com.installation.instalApp.model;

public class SoftwareAndSystemRequirement {
	
	public SoftwareAndSystemRequirement() {
		
	}
	
	private String edition;
	private String subEdition;
	private String version;
	private String about;
	private Integer ram;
	private Integer hardDisk;
	private String os;
	private Integer operating_bit;
	
	
	public SoftwareAndSystemRequirement(String edition, String sub_edition, String version, String about, Integer ram,
			Integer hard_disk, String os, Integer operating_bit) {
		super();
		this.edition = edition;
		this.subEdition = sub_edition;
		this.version = version;
		this.about = about;
		this.ram = ram;
		this.hardDisk = hard_disk;
		this.os = os;
		this.operating_bit = operating_bit;
	}
	public String getEdition() {
		return edition;
	}
	public void setEdition(String edition) {
		this.edition = edition;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public Integer getRam() {
		return ram;
	}
	public void setRam(Integer ram) {
		this.ram = ram;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String getSubEdition() {
		return subEdition;
	}
	public void setSubEdition(String subEdition) {
		this.subEdition = subEdition;
	}
	public Integer getHardDisk() {
		return hardDisk;
	}
	public void setHardDisk(Integer hardDisk) {
		this.hardDisk = hardDisk;
	}
	public Integer getOperatingBit() {
		return operating_bit;
	}
	public void setOperatingBit(Integer operatingBit) {
		this.operating_bit = operatingBit;
	}

}

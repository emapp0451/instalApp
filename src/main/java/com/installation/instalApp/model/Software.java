package com.installation.instalApp.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="software", catalog="installation")
public class Software {
	
	public Software() {
		
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "s_id")
	private Integer sId;
	@Column(name = "edition")
	private String edition;
	@Column(name = "sub_edition")
	private String subEdition;
	@Column(name = "version")
	private String version;
	@Column(name = "about", columnDefinition = "TEXT")
	private String about;
	@Column(name = "type")
	private String type;
	@Column(name = "software_url")
	private String url;
	@Column(name = "make")
	private String make;
	@Column(name = "license_required")
	private String license;
	@Column(name = "price")
	private String price;
	@Column(name = "ram")
	private Integer ram;
	@Column(name = "hard_disk")
	private Integer hardDisk;
	@Column(name = "graphics")
	private Integer graphics;
	@Column(name = "operating_bit")
	private Integer operatingBit;
	@Column(name = "os")
	private String os;
	@Column(name = "system_req")
	private String systemReq;
	@OneToMany( cascade = CascadeType.ALL)
	@JoinColumn(name= "s_id", referencedColumnName = "s_id")
	private List<Step> steps;
	
	
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getSubEdition() {
		return subEdition;
	}
	public void setSubEdition(String subEdition) {
		this.subEdition = subEdition;
	}
	public Integer getsId() {
		return sId;
	}
	public void setsId(Integer sId) {
		this.sId = sId;
	}
	public Integer getRam() {
		return ram;
	}
	public void setRam(Integer ram) {
		this.ram = ram;
	}
	public Integer getHardDisk() {
		return hardDisk;
	}
	public void setHardDisk(Integer hardDisk) {
		this.hardDisk = hardDisk;
	}
	public Integer getGraphics() {
		return graphics;
	}
	public void setGraphics(Integer graphics) {
		this.graphics = graphics;
	}
	public Integer getOperatingBit() {
		return operatingBit;
	}
	public void setOperatingBit(Integer operatingBit) {
		this.operatingBit = operatingBit;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String getSystemReq() {
		return systemReq;
	}
	public void setSystemReq(String systemReq) {
		this.systemReq = systemReq;
	}
	public List<Step> getSteps() {
		return steps;
	}
	public void setSteps(List<Step> steps) {
		this.steps = steps;
	}
	
	

}

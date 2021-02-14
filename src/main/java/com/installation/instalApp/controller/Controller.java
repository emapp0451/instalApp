package com.installation.instalApp.controller;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.installation.instalApp.model.Software;
import com.installation.instalApp.model.SoftwarePayloadBean;
import com.installation.instalApp.projections.SoftwareProjection;
import com.installation.instalApp.repository.SoftwareRepository;
import com.installation.instalApp.service.SoftwareService;

@RestController
@ComponentScan(basePackages= "com.installation.instalApp.service")
@RequestMapping(path = "/test")
public class Controller {
		    
	public Controller() {
		// TODO Auto-generated constructor stub
	}
	@Autowired
	private SoftwareRepository softwareRepo;
	@Autowired
	private SoftwareService softwareServ;
	
	
	 	@Autowired
	    DataSource dataSource;
	 	
	@SuppressWarnings("rawtypes")
	@RequestMapping(
			value = "/createSoftware",
			method = RequestMethod.POST,
			produces = { MimeTypeUtils.APPLICATION_JSON_VALUE },
			consumes = {MimeTypeUtils.APPLICATION_JSON_VALUE},
			headers = "Accept=application/json"
			)
	public ResponseEntity saveSoftware(@RequestBody SoftwarePayloadBean softwarePayloadBean){
		
		Software software = softwareServ.setsoftwareData(softwarePayloadBean);
		softwareRepo.save(software);
		try {
			return ResponseEntity.status(HttpStatus.CREATED).build();
		} catch (Exception e) {
			return new ResponseEntity<Iterable<Software>>(HttpStatus.BAD_REQUEST);
	}
	}
	
	@RequestMapping(
			value = "/findSoftwareAndRequirement",
			method = RequestMethod.GET,
			produces = { MimeTypeUtils.APPLICATION_JSON_VALUE },
			headers = "Accept=application/json"
			)
	public ResponseEntity<Iterable<Software>> findAllHospitalAndArea(){
		try {
			return new ResponseEntity<Iterable<Software>>(softwareRepo.findAll(), HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<Iterable<Software>>(HttpStatus.BAD_REQUEST);
	}
	}
	
	@RequestMapping(
			value = "/findAllSoftwareByType",
			method = RequestMethod.GET,
			produces = { MimeTypeUtils.APPLICATION_JSON_VALUE },
			headers = "Accept=application/json"
		)
	public ResponseEntity<List<SoftwareProjection>> findAllSoftwareByType(@RequestParam("type") String type) {
		try {
			return ResponseEntity.status(HttpStatus.OK).body(softwareRepo.findAllSoftwareByType(type));
		}catch (Exception e) {
			return new ResponseEntity<List<SoftwareProjection>>(HttpStatus.BAD_REQUEST);
	}
		
	}
	@RequestMapping(
			value = "/findAllSoftwareBySubEdition",
			method = RequestMethod.GET,
			produces = { MimeTypeUtils.APPLICATION_JSON_VALUE },
			headers = "Accept=application/json"
		)
	public ResponseEntity<Iterable<Software>> findAllSoftwareBySubEdition(@RequestParam("subEdition") String subEdition) {
			try {
				return new ResponseEntity<Iterable<Software>>(softwareRepo.findAllSoftwareBySubEdition(subEdition), HttpStatus.OK);
			}catch (Exception e) {
				return new ResponseEntity<Iterable<Software>>(HttpStatus.BAD_REQUEST);
			}
	}
	
	@RequestMapping(
			value = "/filterSoftware",
			method = RequestMethod.GET,
			produces = { MimeTypeUtils.APPLICATION_JSON_VALUE },
			headers = "Accept=application/json"
		)
	public ResponseEntity<List<SoftwareProjection>> findAllSoftwareByEdition(@RequestParam("filter") String filter) {
		try {
			return ResponseEntity.status(HttpStatus.OK).body(softwareRepo.findAllSoftwareByEdition(filter));
		}catch (Exception e) {
			return new ResponseEntity<List<SoftwareProjection>>(HttpStatus.BAD_REQUEST);
	}
	}
}

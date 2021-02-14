package com.installation.instalApp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.installation.instalApp.model.Software;
import com.installation.instalApp.model.SoftwarePayloadBean;
import com.installation.instalApp.model.Step;
@Service
public class SoftwareService {
	
	public SoftwareService(){
		
	}
	
	public Software setsoftwareData(SoftwarePayloadBean softwarePayloadBean) {
		Software software = new Software();
		software.setEdition(softwarePayloadBean.getSoftware().getEdition());
		software.setSubEdition(softwarePayloadBean.getSoftware().getSubEdition());
		software.setVersion(softwarePayloadBean.getSoftware().getVersion());
		software.setAbout(softwarePayloadBean.getSoftware().getAbout());
		software.setType(softwarePayloadBean.getSoftware().getType());
		software.setUrl(softwarePayloadBean.getSoftware().getUrl());
		software.setMake(softwarePayloadBean.getSoftware().getMake());
		software.setLicense(softwarePayloadBean.getSoftware().getLicense());
		software.setPrice(softwarePayloadBean.getSoftware().getPrice());
		software.setRam(softwarePayloadBean.getSoftware().getRam());
		software.setHardDisk(softwarePayloadBean.getSoftware().getHardDisk());
		software.setGraphics(softwarePayloadBean.getSoftware().getGraphics());
		software.setOperatingBit(softwarePayloadBean.getSoftware().getOperatingBit());
		software.setOs(softwarePayloadBean.getSoftware().getOs());
		software.setSystemReq(softwarePayloadBean.getSoftware().getSystemReq());
		List<Step> steps = softwarePayloadBean.getSoftware().getSteps();
		software.setSteps(steps);
		
		/*SystemRequirement systemRequirement1 = new SystemRequirement();
		systemRequirement1.setRam(softwarePayloadBean.getSystemRequirement().get(0).getRam());
		systemRequirement1.setHardDisk(softwarePayloadBean.getSystemRequirement().get(0).getHardDisk());
		systemRequirement1.setGraphics(softwarePayloadBean.getSystemRequirement().get(0).getGraphics());
		systemRequirement1.setOperating_bit(softwarePayloadBean.getSystemRequirement().get(0).getOperating_bit());
		systemRequirement1.setOs(softwarePayloadBean.getSystemRequirement().get(0).getOs());
		systemRequirement1.setSystem_req(softwarePayloadBean.getSystemRequirement().get(0).getSystem_req());*/
		
		//systemRequirements.add(systemRequirement1);
		//software.setSystemRequirements(systemRequirements);
		
		
		
		return software;
				
	}

}

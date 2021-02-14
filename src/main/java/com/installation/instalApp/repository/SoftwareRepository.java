package com.installation.instalApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.installation.instalApp.model.Software;
import com.installation.instalApp.model.SoftwareAndSystemRequirement;
import com.installation.instalApp.projections.SoftwareProjection;
@Repository
public interface SoftwareRepository extends JpaRepository<Software, Integer> {

	/*public final static String FIND_SOFTWARE_AND_SYSTEM_REQUIREMENT = "SELECT new com.installation.instalApp.model.SoftwareAndSystemRequirement(sof.edition, sof.subEdition, sof.version, sof.about, " + 
																	" sr.ram, sr.hardDisk, sr.os, sr.operating_bit) " + 
																	"from Software sof join SoftwareSystemRequirement ssr on sof.s_id = ssr.s_id " + 
																	" join SystemRequirement sr on sr.sr_id = ssr.sr_id " + 
																	" where sof.type = :type";*/
	
	//public final static String FIND_SOFTWARE_BY_TYPE = "SELECT new com.installation.instalApp.model.Software(sof.edition, sof.subEdition, sof.version, sof.about, sof.url, sof.make, sof.license, sof.price) FROM com.installation.instalApp.model.Software sof WHERE sof.type = :type";
	public final static String FIND_SOFTWARE_BY_TYPE =  "select sof.edition, sof.sub_edition, "
											+ "sof.version, sof.about, sof.software_url, sof.make, sof.license_required, sof.price from software as sof where sof.type = :type";
	
	public final static String FILTER_SOFTWARE =  "select sof.edition, sof.sub_edition, "
											+ "sof.version, sof.about, sof.software_url, sof.make, sof.license_required, sof.price from software as sof where sof.edition like %:filter%";
	
	/*public final static String FIND_SOFTWARE_BY_TYPE =  "select new com.installation.instalApp.model.SoftwareResponse(sof.edition, sof.sub_edition, "
											+ "sof.version, sof.about, sof.url, sof.make, sof.license, sof.price) "
											+ "from com.installation.instalApp.model.software as sof where sof.type = :type";*/
	
	/*@Query(FIND_SOFTWARE_AND_SYSTEM_REQUIREMENT)
	List<SoftwareAndSystemRequirement> findSoftwareAndRequirement(@Param("type") String type);*/
	
	//get Software based on type
	@Query(value =FIND_SOFTWARE_BY_TYPE, nativeQuery = true)
	List<SoftwareProjection> findAllSoftwareByType(@Param("type") String type);
	
	@Query(value =FILTER_SOFTWARE, nativeQuery = true)
	List<SoftwareProjection> findAllSoftwareByEdition(@Param("filter") String filter);
	
	List<Software> findAllSoftwareBySubEdition(String subEdition);
}

package api.mobile_0025.controllers;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.mobile_0025.dto.MobileDTO;
import api.mobile_0025.services.MobileService;

@RestController
public class MobileController {
	
	@Autowired
	MobileService mobileservice;
	
	@RequestMapping("/createMobile_0025")
	public boolean createMobile_0025(@RequestBody MobileDTO mobileDTO) {
		return mobileservice.createMobile_0025(mobileDTO);
	}
	
	@RequestMapping("/getAllMobiles_0025")
	public Iterator<MobileDTO> getAllMobiles_0025(){
		return mobileservice.getAllMobiles_0025();
	}
	
    @GetMapping("/getMobileDetail_0025/{mobileId}")
	public MobileDTO getMobileDetail_0025byId(@PathVariable("mobileId")int mobileId) {
		return mobileservice.getMobileDetail_0025byId(mobileId);
	}

}

package api.mobile_0025.services;

import java.util.Iterator;

import api.mobile_0025.dto.MobileDTO;

public interface MobileService {
	
	public boolean createMobile_0025(MobileDTO mobileDTO);
	public Iterator<MobileDTO> getAllMobiles_0025();
	public MobileDTO getMobileDetail_0025byId(int mobileId);
	public MobileDTO updateMobileDetail_0025byId(int mobileId);

}

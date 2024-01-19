package api.mobile_0025.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api.mobile_0025.dto.MobileDTO;
import api.mobile_0025.entity.MobilePhone;
import api.mobile_0025.repository.MobileRepository;

@Service
public class MobileServiceImpl implements MobileService{
	
	@Autowired
	MobileRepository mobileRepository;

	@Override
	public boolean createMobile_0025(MobileDTO mobileDTO) {
		MobilePhone objMobilePhone = new MobilePhone();
		BeanUtils.copyProperties(mobileDTO, objMobilePhone);
		
		if (mobileRepository.save(objMobilePhone) != null)
			return true;
		else
		return false;
	}

	@Override
	public Iterator<MobileDTO> getAllMobiles_0025() {
		Iterator<MobilePhone> iter = mobileRepository.findAll().iterator();
		ArrayList<MobileDTO> list = new ArrayList<>();
		
		while(iter.hasNext()) {
			MobilePhone objMobilePhone = iter.next();
			MobileDTO mobileDTO = new MobileDTO();
			
			BeanUtils.copyProperties(objMobilePhone, mobileDTO);
			list.add(mobileDTO);
		}
		return list.iterator();
	}

	@Override
	public MobileDTO getMobileDetail_0025byId(int mobileId) {
		Optional<MobilePhone> optMobilePhone = mobileRepository.findById(mobileId);
		if(optMobilePhone.isPresent()) {
			MobilePhone objMobilePhone = optMobilePhone.get();
			MobileDTO mobileDTO = new MobileDTO();
			BeanUtils.copyProperties(objMobilePhone, mobileDTO);
			return mobileDTO;
		}
		return null;
	}

	@Override
	public MobileDTO updateMobileDetail_0025byId(int mobileId) {
		Optional<MobilePhone> optMobilePhone = mobileRepository.findById(mobileId);
		if(optMobilePhone.isPresent()) {
			MobilePhone objMobilePhone = optMobilePhone.get();
			
		}
		return null;
	}
	
	

}

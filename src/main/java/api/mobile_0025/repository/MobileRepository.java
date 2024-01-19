package api.mobile_0025.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api.mobile_0025.entity.MobilePhone;

@Repository
public interface MobileRepository extends JpaRepository<MobilePhone, Integer>{

}

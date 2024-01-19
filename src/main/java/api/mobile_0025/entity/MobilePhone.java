package api.mobile_0025.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "mobilephone_0025")
public class MobilePhone {

	@Id
	@GeneratedValue(generator = "increment")
	@Column(name = "phone_id")
	int phoneId;

	@Column(name = "phone_name")
	String phoneName;

	@Column(name = "phone_memory")
	int phoneMemory;

	@Column(name = "phone_os")
	String phoneOS;

	@Column(name = "phone_size")
	int phoneSize;

	public int getPhoneId() {
		return phoneId;
	}

	public void setPhoneId(int phoneId) {
		this.phoneId = phoneId;
	}

	public String getPhoneName() {
		return phoneName;
	}

	public void setPhoneName(String phoneName) {
		this.phoneName = phoneName;
	}

	public int getPhoneMemory() {
		return phoneMemory;
	}

	public void setPhoneMemory(int phoneMemory) {
		this.phoneMemory = phoneMemory;
	}

	public String getPhoneOS() {
		return phoneOS;
	}

	public void setPhoneOS(String phoneOS) {
		this.phoneOS = phoneOS;
	}

	public int getPhoneSize() {
		return phoneSize;
	}

	public void setPhoneSize(int phoneSize) {
		this.phoneSize = phoneSize;
	}

}

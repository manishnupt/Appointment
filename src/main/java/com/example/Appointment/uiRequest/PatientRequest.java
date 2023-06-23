package com.example.Appointment.uiRequest;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class PatientRequest {
	

	    private String name;
	    private String email;
	    private String phone;
	    private String insuranceProvider;
	    private String policyNumber;
		
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getInsuranceProvider() {
			return insuranceProvider;
		}
		public void setInsuranceProvider(String insuranceProvider) {
			this.insuranceProvider = insuranceProvider;
		}
		public String getPolicyNumber() {
			return policyNumber;
		}
		public void setPolicyNumber(String policyNumber) {
			this.policyNumber = policyNumber;
		}
	    
	    
		

}

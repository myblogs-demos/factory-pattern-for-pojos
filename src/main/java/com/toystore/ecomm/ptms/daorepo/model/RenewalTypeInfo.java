package com.toystore.ecomm.ptms.daorepo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.toystore.ecomm.ptms.daorepo.factory.POJOFactory;

@Entity
@Table(name = "RENEWAL_TYPE")
public class RenewalTypeInfo {
	
	static {
        POJOFactory.register("RENEWALTYPEINFO", RenewalTypeInfo.class);
    }
	
	@Id
	@Column(name = "RENEWAL_TYPE_ID", nullable = false)
	private Integer renewalTypeId;
	
	@Column(name = "RENEWAL_NAME", nullable = false)
	private String renewalName;
	
	@Column(name = "RENEWAL_DESC", nullable = true)
	private String renewalDesc;

	public Integer getRenewalTypeId() {
		return renewalTypeId;
	}

	public void setRenewalTypeId(Integer renewalTypeId) {
		this.renewalTypeId = renewalTypeId;
	}

	public String getRenewalName() {
		return renewalName;
	}

	public void setRenewalName(String renewalName) {
		this.renewalName = renewalName;
	}

	public String getRenewalDesc() {
		return renewalDesc;
	}

	public void setRenewalDesc(String renewalDesc) {
		this.renewalDesc = renewalDesc;
	}
}

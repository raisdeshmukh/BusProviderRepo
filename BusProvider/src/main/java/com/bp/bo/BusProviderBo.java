package com.bp.bo;

import java.io.Serializable;



public class BusProviderBo implements Serializable {

protected int busProviderNo;
protected String bussinessName;
protected String primaryContactNo;
protected String primaryEmailAddress;
protected String status;
public int getBusProviderNo() {
	return busProviderNo;
}
public void setBusProviderNo(int busProviderNo) {
	this.busProviderNo = busProviderNo;
}
public String getBussinessName() {
	return bussinessName;
}
public void setBussinessName(String bussinessName) {
	this.bussinessName = bussinessName;
}
public String getPrimaryContactNo() {
	return primaryContactNo;
}
public void setPrimaryContactNo(String primaryContactNo) {
	this.primaryContactNo = primaryContactNo;
}
public String getPrimaryEmailAddress() {
	return primaryEmailAddress;
}
public void setPrimaryEmailAddress(String primaryEmailAddress) {
	this.primaryEmailAddress = primaryEmailAddress;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
@Override
public String toString() {
	return "BusProviderBo [busProviderNo=" + busProviderNo + ", bussinessName=" + bussinessName + ", primaryContactNo="
			+ primaryContactNo + ", primaryEmailAddress=" + primaryEmailAddress + ", status=" + status + "]";
}




	
}

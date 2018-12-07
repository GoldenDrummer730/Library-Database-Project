package com.example.demo.domain;

public class Library_Branch {
	
	private String BranchId;
	private String BranchName;
	private String Address;
	
	public Library_Branch(String branchid, String branchname, String address)
	{
		BranchId = branchid;
		BranchName = branchname;
		Address = address;
	}

	public String getBranchId() {
		return BranchId;
	}

	public void setBranchId(String branchId) {
		BranchId = branchId;
	}

	public String getBranchName() {
		return BranchName;
	}

	public void setBranchName(String branchName) {
		BranchName = branchName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	@Override
	public String toString() {
		return "Library_Branch [BranchId=" + BranchId + ", BranchName=" + BranchName + ", Address=" + Address + "]";
	}
	
}

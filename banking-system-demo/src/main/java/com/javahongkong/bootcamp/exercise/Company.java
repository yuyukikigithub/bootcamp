package com.javahongkong.bootcamp.exercise;

public class Company extends AccountHolder{
	private String companyName;
	private int taxId;

	public Company(int taxId) {
		// complete the function
		super(taxId);
	}

	public Company(String companyName, int taxId ) {
		// complete the function
		this(taxId);
		this.companyName=companyName;
	}

	public String getCompanyName() {
		// complete the function
		return this.companyName;
	}

	
}

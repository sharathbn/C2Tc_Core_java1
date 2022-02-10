package com.tns.Framework;

public abstract class ShopAcc {
	private int accNo;
	private String accNm;
	private float charges;
	
	public ShopAcc(int accNo, String accNm, float charges) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.charges = charges;
	}
	public void bookProduct(float charges) {
		
	}
	public void items(float charges) {
		
	}
	@Override
	public String toString() {
		return "ShopAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}

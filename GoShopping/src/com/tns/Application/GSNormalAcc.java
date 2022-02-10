package com.tns.Application;

import com.tns.Framework.NormalAcc;

public class GSNormalAcc extends NormalAcc {

	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
		super(accNo, accNm, charges, deliveryCharge);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void bookProduct(float charges) {
		// TODO Auto-generated method stub
		super.bookProduct(charges);
	}

	@Override
	public String toString() {
		return "GSNormalAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	

}

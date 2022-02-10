package com.tns.Application;

import com.tns.Framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc{
	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void bookProduct(float charges) {
		// TODO Auto-generated method stub
		super.bookProduct(charges);
	}

	@Override
	public String toString() {
		return "GSPrimeAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	
	
	

	

}

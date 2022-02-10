package com.tns.Framework;

public abstract class PrimeAcc extends ShopAcc {
	private boolean isPrime;
    private static final float deliveryCharges=20;
    
    
	public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges);
		this.isPrime = isPrime;
	}

	@Override
	public void bookProduct(float charges) {
		// TODO Auto-generated method stub
		super.bookProduct(charges);
	}

	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

		

}

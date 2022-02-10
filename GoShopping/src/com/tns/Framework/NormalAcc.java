package com.tns.Framework;

public abstract class NormalAcc extends ShopAcc {
	private final float deliveryCharge;
	
	

	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
		super(accNo, accNm, charges);
		this.deliveryCharge = deliveryCharge;
	}

	@Override
	public void bookProduct(float charges) {
		// TODO Auto-generated method stub
		super.bookProduct(charges);
	}

	@Override
	public String toString() {
		return "NormalAcc [deliveryCharge=" + deliveryCharge + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

	

}

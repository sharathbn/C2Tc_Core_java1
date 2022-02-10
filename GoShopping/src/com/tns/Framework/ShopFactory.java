package com.tns.Framework;

public abstract class ShopFactory {
	public PrimeAcc getNewPrimeAccount(int AccNo,String AccNm,float charges,boolean isPrime) {
		return null;
	}
    public NormalAcc getNewNormalAccount(int AccNo,String accNm,float charges,float deliveryCharges) {
		return null;
    	
    }
	}



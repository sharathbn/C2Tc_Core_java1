package com.tns.Application;

import com.tns.Framework.NormalAcc;
import com.tns.Framework.PrimeAcc;
import com.tns.Framework.ShopFactory;

public class GSShopFactory extends ShopFactory {

	@Override
	public PrimeAcc getNewPrimeAccount(int AccNo, String AccNm, float charges, boolean isPrime) {
		// TODO Auto-generated method stub
		return super.getNewPrimeAccount(AccNo, AccNm, charges, isPrime);
	}

	@Override
	public NormalAcc getNewNormalAccount(int AccNo, String accNm, float charges, float deliveryCharges) {
		// TODO Auto-generated method stub
		return super.getNewNormalAccount(AccNo, accNm, charges, deliveryCharges);
	}

}

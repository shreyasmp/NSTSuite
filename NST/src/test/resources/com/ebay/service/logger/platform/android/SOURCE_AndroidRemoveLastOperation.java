package com.ebay.service.logger.platform.android;

import androidx.test.filters.LargeTest;

import com.test.EnterCheckoutSession;
import com.test.PurchaseCheckoutSession;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.ebay.test.utils.testrail.TestCase;

/**
 * AndroidEmptyTestClass.java
 * <p>
 * eBay Created by <author> on 07/16/19
 * <p>
 * Copyright 2019 eBay. All rights reserved.
 */
@LargeTest
@PreconditionUser
@PreconditionCountry(siteId = EbaySite.SITE_ID.US)
public class AndroidEmptyTestClass extends AndroidBaseClass
{
  
	// AUTO GENERATED MEMBER FIELD CODE BLOCK - DO NOT MODIFY CONTENTS
	EnterCheckoutSession enterCheckoutSession = new EnterCheckoutSession();
	PurchaseCheckoutSession purchaseCheckoutSession = new PurchaseCheckoutSession();
	// END OF AUTO GENERATED MEMBER FIELD CODE BLOCK
	
	private final String assertionMessage
		= "Test case was unsuccessful.";

	@Test
	@TestCase(id = "C2121462")
	public void firstTestMethod() throws Throwable
	{

		int i = 0;

		// AUTO GENERATED METHOD CODE BLOCK - DO NOT MODIFY CONTENTS
		// CORRESPONDING API CALL: EnterCheckout
		// OPERATION INDEX: 1
		enterCheckoutSession.enterCheckout();
		// END OF AUTO GENERATED METHOD CODE BLOCK

		i++;

		// AUTO GENERATED METHOD CODE BLOCK - DO NOT MODIFY CONTENTS
		// CORRESPONDING API CALL: PurchaseCheckout
		// OPERATION INDEX: 2
		purchaseCheckoutSession.completePurchase();
		// END OF AUTO GENERATED METHOD CODE BLOCK

	}

	@Test
	@TestCase(id = "C2152776Edit")
	public void secondTestMethod() throws Throwable
	{
		// TODO: implement test
		Assert.fail("unimplemented test.")
	}

	/**
	 * Simple private method for evaluation purposes.,
	 */
	private void doSomething()
	{
		int b = 0;
		b++;
	}
}
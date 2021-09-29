package com.yash.calculatesum.business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddSumTest {

	@Test
	void test_forMultipleValue() {
		AddSum as=new AddSum();
		int actualResult= as.calculateAddition(new int[] {1,3,4});
		int expectedResult=8;
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void test_for_emptyArry() {
		AddSum as=new AddSum();
		int actualResult= as.calculateAddition(new int[] {});
		int expectedResult=0;
		assertEquals(expectedResult, actualResult);
		
	}
	
	@Test
	void test_for_singleValue() {
		AddSum as=new AddSum();
		int actualResult= as.calculateAddition(new int[] {1});
		int expectedResult=1;
		assertEquals(expectedResult, actualResult);
		
	}

}

package com.yash.calculatesum.business;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;


import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.yash.calculatesum.businessinterface.DaoDataService;

@RunWith(SpringRunner.class)
@WebMvcTest(value = AddSum.class)
class AddSumTestDataServiceMock2 {
 
	@InjectMocks
	AddSum as;
	
	@Mock
	DaoDataService daoDataService;

	@Test
	void test_forMultipeValueUsingDaoDataService() {
		when(daoDataService.getData()).thenReturn(new int[] {1,2,3});
		assertEquals(6, as.calculateSumUsingDataService());
		
	}
	
	@Test
	void test_for_emptyArry() {
		when(daoDataService.getData()).thenReturn(new int[] {});
		assertEquals(0, as.calculateSumUsingDataService());
		
	}
	
	@Test
	void test_for_singleValue() {
		when(daoDataService.getData()).thenReturn(new int[] {1});
		assertEquals(1, as.calculateSumUsingDataService());	
	
	}

}

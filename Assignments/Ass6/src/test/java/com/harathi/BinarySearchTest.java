package com.harathi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes=ApplicationContext.class)
class BinarySearchTest {

	@Autowired
	BinarySearchTest binarySearch;
	
	@Test
	void test() {
		int result=binarySearch.search(new int[] {1,2}, 2);
		assertEquals(result, 3);
		
		
	}

	private int search(int[] is, int i) {
		
		return 0;
	}

}

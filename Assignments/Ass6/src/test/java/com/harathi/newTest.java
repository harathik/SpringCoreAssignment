package com.harathi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.harathi.BasicApplicationScope;
import com.harathi.SomeExternalService;


@RunWith(SpringRunner.class)
@ContextConfiguration(classes=BasicApplicationScope.class)
class SomeBasicExample {

	@Autowired
	SomeExternalService some;
	
	@Test
	void test() {
		assertEquals(some.getClassName(), "Basic Appliction");
		
	}

}

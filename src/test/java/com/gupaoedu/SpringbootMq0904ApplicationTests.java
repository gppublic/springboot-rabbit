package com.gupaoedu;

import com.gupaoedu.provider.MyProvider;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMq0904ApplicationTests {

	@Autowired
	MyProvider provider;

	@Test
	public void contextLoads() {
		provider.send();
	}

}

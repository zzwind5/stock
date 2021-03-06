package com.stock.process;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class StockHistoryUpdateProcessingTest {

	@Autowired
	private StockHistoryUpdateProcessing stockHistoryProcess;
	
	@Test
	public void processTest() {
		stockHistoryProcess.process();
	}
}

package com.stock.process;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class StockFileImportProcessingTest {

	@Autowired
	private StockFileImportProcessing stockImportProcess;;
	
	@Test
	public void processTest() {
		stockImportProcess.process();
	}
	
	@Test
	public void importStockMessageTest() throws IOException {
		stockImportProcess.importStockMessage();
	}
}

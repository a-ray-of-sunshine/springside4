package org.springside.examples.quickstart.log;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogTest {
	
	private static final Logger logger = LoggerFactory.getLogger(LogTest.class);

	@Test
	public void logtest(){
		logger.trace("trace");
		logger.debug("debug");
		logger.info("info");
		logger.warn("warn");
		logger.error("error");
	}
}

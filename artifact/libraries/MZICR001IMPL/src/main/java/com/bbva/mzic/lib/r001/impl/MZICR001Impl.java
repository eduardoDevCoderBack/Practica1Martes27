package com.bbva.mzic.lib.r001.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The MZICR001Impl class...
 */
public class MZICR001Impl extends MZICR001Abstract {

	private static final Logger LOGGER = LoggerFactory.getLogger(MZICR001Impl.class);

	/**
	 * The execute method...
	 */
	@Override
	public void executeExampleMetod(String name) {
		LOGGER.info(“execute: ” + name); 
	}

	// TODO - Implementation of business logic
	
}

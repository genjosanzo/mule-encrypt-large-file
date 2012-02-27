package com.example;

import java.io.File;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mule.tck.junit4.FunctionalTestCase;
import org.mule.util.FileUtils;

public class EncryptFileTestCase extends FunctionalTestCase {
	private File fileEnc;

	protected String getConfigResources() {
		return "mule-config.xml";
	}

	@Before
	public void setUp() {
		fileEnc = new File(
				"target/tmp/largeFilesOutbound/ubuntu-10.04.3-desktop-amd64.iso.pgp");
		FileUtils.deleteQuietly(fileEnc);
	}

	@Test
	public void largeFilesAfterEncryptedDoesNotGetDeleted() throws Exception {
		int i=0;
		do {
			Thread.sleep(300000);// 5 minutes
			logger.info("Itreation #"+ i++ +" performed, time to get back to sleep");
		} while (fileEnc.length() < 886596353);
		logger.info("File correctly encrypted");
		Thread.sleep(30000);
		Assert.assertFalse(new File("target/tmp/largeFilesInbound/ubuntu-10.04.3-desktop-amd64.iso").exists());
	}
}

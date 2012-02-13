package com.example;

import org.junit.Test;
import org.mule.tck.junit4.FunctionalTestCase;

public class EncryptFileTestCase extends FunctionalTestCase {
  protected String getConfigResources() {
    return "mule-config.xml";
  }

  @Test
  public void largeFilesAfterEncryptedDoesNotGetDeleted() throws Exception {
    Thread.sleep(300000);//5 minutes
  }
}

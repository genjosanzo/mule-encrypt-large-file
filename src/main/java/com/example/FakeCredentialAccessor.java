package com.example;

import org.mule.api.MuleEvent;
import org.mule.api.security.CredentialsAccessor;

public class FakeCredentialAccessor implements CredentialsAccessor {
  private String credentials;

  public FakeCredentialAccessor() {

  }

  public FakeCredentialAccessor(String string) {
    this.credentials = string;
  }

  public String getCredentials() {
    return credentials;
  }

  public void setCredentials(String credentials) {
    this.credentials = credentials;
  }

  public Object getCredentials(MuleEvent event) {
    return this.credentials;
  }

  public void setCredentials(MuleEvent event, Object credentials){
  }
}

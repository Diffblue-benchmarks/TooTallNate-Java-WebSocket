package org.java_websocket.handshake;

import org.java_websocket.handshake.HandshakeImpl1Client;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class HandshakeImpl1ClientTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999d4ebd4b6897f4d0a() {

    // Act, creating object to test constructor
    final HandshakeImpl1Client actual = new HandshakeImpl1Client();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("*", actual.getResourceDescriptor());
    Assert.assertNull(actual.getContent());

  }

  // Test written by Diffblue Cover
  @Test
  public void getResourceDescriptorOutputNotNull999b252df47e16457c7() {

    // Arrange
    final HandshakeImpl1Client thisObj = new HandshakeImpl1Client();

    // Act
    final String actual = thisObj.getResourceDescriptor();

    // Assert result
    Assert.assertEquals("*", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void setResourceDescriptorInputNotNullOutputVoid999e3508e35378793eb() {

    // Arrange
    final HandshakeImpl1Client thisObj = new HandshakeImpl1Client();
    final String arg0 = "*";

    // Act
    thisObj.setResourceDescriptor(arg0);

    // The method returns void, testing that no exception is thrown

  }
}

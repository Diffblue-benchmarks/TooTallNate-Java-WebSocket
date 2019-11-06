package org.java_websocket.handshake;

import org.java_websocket.handshake.HandshakeImpl1Client;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class HandshakeImpl1Client_getResourceDescriptorTest_3_Test {
  @Test
  public void getResourceDescriptorTest() throws Exception {
    // Arrange
    HandshakeImpl1Client handshakeImpl1Client = new HandshakeImpl1Client();

    // Act
    String actual = handshakeImpl1Client.getResourceDescriptor();

    // Assert
    Assert.assertEquals("*", actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

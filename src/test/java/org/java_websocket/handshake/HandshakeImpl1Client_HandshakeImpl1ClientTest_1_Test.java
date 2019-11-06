package org.java_websocket.handshake;

import org.java_websocket.handshake.HandshakeImpl1Client;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class HandshakeImpl1Client_HandshakeImpl1ClientTest_1_Test {
  @Test
  public void HandshakeImpl1ClientTest() throws Exception {
    // Arrange and Act
    HandshakeImpl1Client handshakeImpl1Client = new HandshakeImpl1Client();

    // Assert
    String toStringResult = handshakeImpl1Client.toString();
    byte[] content = handshakeImpl1Client.getContent();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals("*", handshakeImpl1Client.getResourceDescriptor());
    Assert.assertEquals(null, content);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

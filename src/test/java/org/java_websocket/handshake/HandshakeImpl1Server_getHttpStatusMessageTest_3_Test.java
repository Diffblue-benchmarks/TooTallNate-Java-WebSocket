package org.java_websocket.handshake;

import org.java_websocket.handshake.HandshakeImpl1Server;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class HandshakeImpl1Server_getHttpStatusMessageTest_3_Test {
  @Test
  public void getHttpStatusMessageTest() throws Exception {
    // Arrange
    HandshakeImpl1Server handshakeImpl1Server = new HandshakeImpl1Server();

    // Act
    String actual = handshakeImpl1Server.getHttpStatusMessage();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

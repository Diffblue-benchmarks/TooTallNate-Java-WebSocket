package org.java_websocket.handshake;

import org.java_websocket.handshake.HandshakeImpl1Server;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class HandshakeImpl1Server_getHttpStatusTest_2_Test {
  @Test
  public void getHttpStatusTest() throws Exception {
    // Arrange
    HandshakeImpl1Server handshakeImpl1Server = new HandshakeImpl1Server();

    // Act
    short actual = handshakeImpl1Server.getHttpStatus();

    // Assert
    Assert.assertEquals((short) 0, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

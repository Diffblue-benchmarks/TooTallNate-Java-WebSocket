package org.java_websocket.handshake;

import org.java_websocket.handshake.HandshakeImpl1Server;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class HandshakeImpl1Server_setHttpStatusMessageTest_4_Test {
  @Test
  public void setHttpStatusMessageTest() throws Exception {
    // Arrange
    HandshakeImpl1Server handshakeImpl1Server = new HandshakeImpl1Server();
    String message = "aaaaa";

    // Act
    handshakeImpl1Server.setHttpStatusMessage(message);

    // Assert
    String httpStatusMessage = handshakeImpl1Server.getHttpStatusMessage();
    short httpStatus = handshakeImpl1Server.getHttpStatus();
    String toStringResult = handshakeImpl1Server.toString();
    Assert.assertEquals("aaaaa", httpStatusMessage);
    Assert.assertEquals(null, handshakeImpl1Server.getContent());
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals((short) 0, httpStatus);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

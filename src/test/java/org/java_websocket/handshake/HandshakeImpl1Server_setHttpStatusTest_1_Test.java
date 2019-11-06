package org.java_websocket.handshake;

import org.java_websocket.handshake.HandshakeImpl1Server;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class HandshakeImpl1Server_setHttpStatusTest_1_Test {
  @Test
  public void setHttpStatusTest() throws Exception {
    // Arrange
    HandshakeImpl1Server handshakeImpl1Server = new HandshakeImpl1Server();
    short status = (short) 1;

    // Act
    handshakeImpl1Server.setHttpStatus(status);

    // Assert
    String httpStatusMessage = handshakeImpl1Server.getHttpStatusMessage();
    short httpStatus = handshakeImpl1Server.getHttpStatus();
    String toStringResult = handshakeImpl1Server.toString();
    Assert.assertEquals(null, httpStatusMessage);
    Assert.assertEquals(null, handshakeImpl1Server.getContent());
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals((short) 1, httpStatus);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

package org.java_websocket.protocols;

import org.java_websocket.protocols.Protocol;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Protocol_ProtocolTest_4_Test {
  @Test
  public void ProtocolTest() throws Exception {
    // Arrange
    String providedProtocol = " ";

    // Act
    Protocol protocol = new Protocol(providedProtocol);

    // Assert
    String toStringResult = protocol.toString();
    Assert.assertEquals(" ", toStringResult);
    Assert.assertEquals(" ", protocol.getProvidedProtocol());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

package org.java_websocket.protocols;

import org.java_websocket.protocols.Protocol;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Protocol_acceptProvidedProtocolTest_1_Test {
  @Test
  public void acceptProvidedProtocolTest() throws Exception {
    // Arrange
    Protocol protocol = new Protocol(" ");
    String inputProtocolHeader = " ";

    // Act
    boolean actual = protocol.acceptProvidedProtocol(inputProtocolHeader);

    // Assert
    Assert.assertFalse(actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

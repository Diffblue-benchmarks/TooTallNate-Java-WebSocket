package org.java_websocket.protocols;

import org.java_websocket.protocols.Protocol;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Protocol_getProvidedProtocolTest_6_Test {
  @Test
  public void getProvidedProtocolTest() throws Exception {
    // Arrange
    Protocol protocol = new Protocol(" ");

    // Act
    String actual = protocol.getProvidedProtocol();

    // Assert
    Assert.assertEquals(" ", actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

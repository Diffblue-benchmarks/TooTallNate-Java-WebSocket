package org.java_websocket.protocols;

import org.java_websocket.protocols.IProtocol;
import org.java_websocket.protocols.Protocol;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Protocol_copyInstanceTest_5_Test {
  @Test
  public void copyInstanceTest() throws Exception {
    // Arrange
    Protocol protocol = new Protocol(" ");

    // Act
    IProtocol actual = protocol.copyInstance();

    // Assert
    Assert.assertTrue(actual instanceof Protocol);
    String toStringResult = actual.toString();
    Assert.assertEquals(" ", toStringResult);
    Assert.assertEquals(" ", actual.getProvidedProtocol());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

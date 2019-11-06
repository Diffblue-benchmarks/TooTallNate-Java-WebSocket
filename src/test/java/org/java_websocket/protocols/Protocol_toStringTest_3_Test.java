package org.java_websocket.protocols;

import org.java_websocket.protocols.Protocol;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Protocol_toStringTest_3_Test {
  @Test
  public void toStringTest() throws Exception {
    // Arrange
    Protocol protocol = new Protocol(" ");

    // Act
    String actual = protocol.toString();

    // Assert
    Assert.assertEquals(" ", actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

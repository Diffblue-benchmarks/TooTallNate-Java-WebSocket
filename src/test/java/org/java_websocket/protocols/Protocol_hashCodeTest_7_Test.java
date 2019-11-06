package org.java_websocket.protocols;

import org.java_websocket.protocols.Protocol;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Protocol_hashCodeTest_7_Test {
  @Test
  public void hashCodeTest() throws Exception {
    // Arrange
    Protocol protocol = new Protocol(" ");

    // Act
    int actual = protocol.hashCode();

    // Assert
    Assert.assertEquals(32, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

package org.java_websocket.protocols;

import org.java_websocket.protocols.Protocol;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Protocol_equalsTest_2_Test {
  @Test
  public void equalsTest() throws Exception {
    // Arrange
    Protocol protocol = new Protocol(" ");
    String o = " ";

    // Act
    boolean actual = protocol.equals(o);

    // Assert
    Assert.assertFalse(actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

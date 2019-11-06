package org.java_websocket.handshake;

import org.java_websocket.handshake.HandshakedataImpl1;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class HandshakedataImpl1_putTest_1_Test {
  @Test
  public void putTest() throws Exception {
    // Arrange
    HandshakedataImpl1 handshakedataImpl1 = new HandshakedataImpl1();
    String name = "aaaaa";
    String value = "aaaaa";

    // Act
    handshakedataImpl1.put(name, value);

    // Assert
    String toStringResult = handshakedataImpl1.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(null, handshakedataImpl1.getContent());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

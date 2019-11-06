package org.java_websocket.handshake;

import org.java_websocket.handshake.HandshakedataImpl1;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class HandshakedataImpl1_hasFieldValueTest_5_Test {
  @Test
  public void hasFieldValueTest() throws Exception {
    // Arrange
    HandshakedataImpl1 handshakedataImpl1 = new HandshakedataImpl1();
    String name = "aaaaa";

    // Act
    boolean actual = handshakedataImpl1.hasFieldValue(name);

    // Assert
    Assert.assertFalse(actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

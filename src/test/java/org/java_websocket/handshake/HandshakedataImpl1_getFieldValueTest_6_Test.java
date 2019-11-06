package org.java_websocket.handshake;

import org.java_websocket.handshake.HandshakedataImpl1;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class HandshakedataImpl1_getFieldValueTest_6_Test {
  @Test
  public void getFieldValueTest() throws Exception {
    // Arrange
    HandshakedataImpl1 handshakedataImpl1 = new HandshakedataImpl1();
    String name = "aaaaa";

    // Act
    String actual = handshakedataImpl1.getFieldValue(name);

    // Assert
    Assert.assertEquals("", actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

package org.java_websocket.handshake;

import org.java_websocket.handshake.HandshakedataImpl1;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class HandshakedataImpl1_getContentTest_4_Test {
  @Test
  public void getContentTest() throws Exception {
    // Arrange
    HandshakedataImpl1 handshakedataImpl1 = new HandshakedataImpl1();

    // Act
    byte[] actual = handshakedataImpl1.getContent();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

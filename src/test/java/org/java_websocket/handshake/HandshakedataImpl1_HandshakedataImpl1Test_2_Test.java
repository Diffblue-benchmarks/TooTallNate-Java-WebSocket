package org.java_websocket.handshake;

import org.java_websocket.handshake.HandshakedataImpl1;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class HandshakedataImpl1_HandshakedataImpl1Test_2_Test {
  @Test
  public void HandshakedataImpl1Test() throws Exception {
    // Arrange and Act
    HandshakedataImpl1 handshakedataImpl1 = new HandshakedataImpl1();

    // Assert
    String toStringResult = handshakedataImpl1.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(null, handshakedataImpl1.getContent());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

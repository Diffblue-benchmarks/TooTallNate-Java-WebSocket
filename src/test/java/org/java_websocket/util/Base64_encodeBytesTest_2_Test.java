package org.java_websocket.util;

import org.java_websocket.util.Base64;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Base64_encodeBytesTest_2_Test {
  @Test
  public void encodeBytesTest() throws Exception {
    // Arrange
    byte[] source = new byte[]{-9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9,
        -9, -9};

    // Act
    String actual = Base64.encodeBytes(source);

    // Assert
    Assert.assertEquals("9/f39/f39/f39/f39/f39/f39/f39/f3", actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

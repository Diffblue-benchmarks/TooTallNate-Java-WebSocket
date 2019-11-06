package org.java_websocket.util;

import org.java_websocket.util.Charsetfunctions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Charsetfunctions_stringAsciiTest_2_Test {
  @Test
  public void stringAsciiTest() throws Exception {
    // Arrange
    byte[] bytes = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    // Act
    String actual = Charsetfunctions.stringAscii(bytes);

    // Assert
    Assert.assertEquals(
        "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000",
        actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

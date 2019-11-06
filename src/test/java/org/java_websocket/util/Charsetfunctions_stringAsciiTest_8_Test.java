package org.java_websocket.util;

import org.java_websocket.util.Charsetfunctions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Charsetfunctions_stringAsciiTest_8_Test {
  @Test
  public void stringAsciiTest() throws Exception {
    // Arrange
    byte[] bytes = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    int offset = 0;
    int length = 0;

    // Act
    String actual = Charsetfunctions.stringAscii(bytes, offset, length);

    // Assert
    Assert.assertEquals("", actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

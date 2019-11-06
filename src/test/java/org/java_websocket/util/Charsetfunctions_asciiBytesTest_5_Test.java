package org.java_websocket.util;

import org.java_websocket.util.Charsetfunctions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Charsetfunctions_asciiBytesTest_5_Test {
  @Test
  public void asciiBytesTest() throws Exception {
    // Arrange
    String s = "ASCII";

    // Act
    byte[] actual = Charsetfunctions.asciiBytes(s);

    // Assert
    Assert.assertEquals(5, actual.length);
    Assert.assertArrayEquals(new byte[]{65, 83, 67, 73, 73}, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

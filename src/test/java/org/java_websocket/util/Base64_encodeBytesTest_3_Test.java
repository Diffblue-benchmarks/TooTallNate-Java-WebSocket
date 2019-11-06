package org.java_websocket.util;

import org.java_websocket.util.Base64;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class Base64_encodeBytesTest_3_Test {
  @Test
  public void encodeBytesTest() throws Exception {
    // Arrange
    byte[] source = new byte[]{-9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9,
        -9, -9};
    int off = -9;
    int len = -9;
    int options = -9;

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    Base64.encodeBytes(source, off, len, options);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}

package org.java_websocket.util;

import java.nio.ByteBuffer;
import org.java_websocket.util.Charsetfunctions;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class Charsetfunctions_isValidUTF8Test_4_Test {
  @Test
  public void isValidUTF8Test() throws Exception {
    // Arrange
    ByteBuffer data = (ByteBuffer) null;
    int off = 0;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    Charsetfunctions.isValidUTF8(data, off);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}

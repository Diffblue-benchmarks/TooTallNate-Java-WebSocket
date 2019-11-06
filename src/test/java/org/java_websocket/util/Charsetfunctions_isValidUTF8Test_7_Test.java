package org.java_websocket.util;

import java.nio.ByteBuffer;
import org.java_websocket.util.Charsetfunctions;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class Charsetfunctions_isValidUTF8Test_7_Test {
  @Test
  public void isValidUTF8Test() throws Exception {
    // Arrange
    ByteBuffer data = (ByteBuffer) null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    Charsetfunctions.isValidUTF8(data);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}

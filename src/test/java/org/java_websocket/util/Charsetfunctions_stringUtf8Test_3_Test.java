package org.java_websocket.util;

import java.nio.ByteBuffer;
import org.java_websocket.util.Charsetfunctions;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class Charsetfunctions_stringUtf8Test_3_Test {
  @Test
  public void stringUtf8Test() throws Exception {
    // Arrange
    ByteBuffer bytes = (ByteBuffer) null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    Charsetfunctions.stringUtf8(bytes);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}

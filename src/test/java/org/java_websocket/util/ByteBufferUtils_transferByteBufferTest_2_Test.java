package org.java_websocket.util;

import java.nio.ByteBuffer;
import org.java_websocket.util.ByteBufferUtils;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ByteBufferUtils_transferByteBufferTest_2_Test {
  @Test
  public void transferByteBufferTest() throws Exception {
    // Arrange
    ByteBuffer source = (ByteBuffer) null;
    ByteBuffer dest = (ByteBuffer) null;

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    ByteBufferUtils.transferByteBuffer(source, dest);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}

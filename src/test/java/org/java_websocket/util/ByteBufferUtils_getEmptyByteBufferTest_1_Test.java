package org.java_websocket.util;

import java.nio.ByteBuffer;
import org.java_websocket.util.ByteBufferUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ByteBufferUtils_getEmptyByteBufferTest_1_Test {
  @Test
  public void getEmptyByteBufferTest() throws Exception {
    // Arrange and Act
    ByteBuffer actual = ByteBufferUtils.getEmptyByteBuffer();

    // Assert
    int capacityResult = actual.capacity();
    String toStringResult = actual.toString();
    boolean hasArrayResult = actual.hasArray();
    boolean hasRemainingResult = actual.hasRemaining();
    byte[] arrayResult = actual.array();
    Assert.assertEquals(0, capacityResult);
    Assert.assertEquals(0, arrayResult.length);
    Assert.assertArrayEquals(new byte[]{}, arrayResult);
    Assert.assertFalse(hasRemainingResult);
    Assert.assertTrue(hasArrayResult);
    Assert.assertEquals("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]", toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

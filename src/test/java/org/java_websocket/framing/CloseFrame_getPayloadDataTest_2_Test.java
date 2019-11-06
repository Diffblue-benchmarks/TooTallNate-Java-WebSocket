package org.java_websocket.framing;

import java.nio.ByteBuffer;
import org.java_websocket.framing.CloseFrame;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CloseFrame_getPayloadDataTest_2_Test {
  @Test
  public void getPayloadDataTest() throws Exception {
    // Arrange
    CloseFrame closeFrame = new CloseFrame();

    // Act
    ByteBuffer actual = closeFrame.getPayloadData();

    // Assert
    int capacityResult = actual.capacity();
    String toStringResult = actual.toString();
    boolean hasArrayResult = actual.hasArray();
    boolean hasRemainingResult = actual.hasRemaining();
    byte[] arrayResult = actual.array();
    Assert.assertEquals(2, capacityResult);
    Assert.assertEquals(2, arrayResult.length);
    Assert.assertArrayEquals(new byte[]{3, -24}, arrayResult);
    Assert.assertTrue(hasRemainingResult);
    Assert.assertTrue(hasArrayResult);
    Assert.assertEquals("java.nio.HeapByteBuffer[pos=0 lim=2 cap=2]", toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

package org.java_websocket.drafts;

import java.nio.ByteBuffer;
import org.java_websocket.drafts.Draft_6455;
import org.java_websocket.framing.BinaryFrame;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Draft_6455_createBinaryFrameTest_10_Test {
  @Test
  public void createBinaryFrameTest() throws Exception {
    // Arrange
    Draft_6455 draft_6455 = new Draft_6455();
    BinaryFrame framedata = new BinaryFrame();

    // Act
    ByteBuffer actual = draft_6455.createBinaryFrame(framedata);

    // Assert
    int capacityResult = actual.capacity();
    String toStringResult = actual.toString();
    boolean hasArrayResult = actual.hasArray();
    boolean hasRemainingResult = actual.hasRemaining();
    byte[] arrayResult = actual.array();
    Assert.assertEquals(2, capacityResult);
    Assert.assertEquals(2, arrayResult.length);
    Assert.assertArrayEquals(new byte[]{-126, 0}, arrayResult);
    Assert.assertTrue(hasRemainingResult);
    Assert.assertTrue(hasArrayResult);
    Assert.assertEquals("java.nio.HeapByteBuffer[pos=0 lim=2 cap=2]", toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

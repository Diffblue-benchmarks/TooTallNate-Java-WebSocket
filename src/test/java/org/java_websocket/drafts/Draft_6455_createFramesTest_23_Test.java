package org.java_websocket.drafts;

import java.nio.ByteBuffer;
import java.util.List;
import org.java_websocket.drafts.Draft_6455;
import org.java_websocket.framing.Framedata;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Draft_6455_createFramesTest_23_Test {
  @Test
  public void createFramesTest() throws Exception {
    // Arrange
    Draft_6455 draft_6455 = new Draft_6455();
    ByteBuffer byteBuffer = (ByteBuffer) null;
    boolean mask = true;

    // Act
    draft_6455.createFrames(byteBuffer, mask);

    // Assert
    Assert.assertEquals(null, byteBuffer);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

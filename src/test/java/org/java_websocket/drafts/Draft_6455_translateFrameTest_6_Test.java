package org.java_websocket.drafts;

import java.nio.ByteBuffer;
import java.util.List;
import org.java_websocket.drafts.Draft_6455;
import org.java_websocket.framing.Framedata;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class Draft_6455_translateFrameTest_6_Test {
  @Test
  public void translateFrameTest() throws Exception {
    // Arrange
    Draft_6455 draft_6455 = new Draft_6455();
    ByteBuffer buffer = (ByteBuffer) null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    draft_6455.translateFrame(buffer);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}

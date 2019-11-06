package org.java_websocket.framing;

import java.nio.ByteBuffer;
import org.java_websocket.framing.CloseFrame;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class CloseFrame_setPayloadTest_1_Test {
  @Test
  public void setPayloadTest() throws Exception {
    // Arrange
    CloseFrame closeFrame = new CloseFrame();
    ByteBuffer payload = (ByteBuffer) null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    closeFrame.setPayload(payload);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}

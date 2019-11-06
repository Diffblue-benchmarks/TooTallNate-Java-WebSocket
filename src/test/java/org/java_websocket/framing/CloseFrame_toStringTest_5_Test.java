package org.java_websocket.framing;

import org.java_websocket.framing.CloseFrame;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CloseFrame_toStringTest_5_Test {
  @Test
  public void toStringTest() throws Exception {
    // Arrange
    CloseFrame closeFrame = new CloseFrame();

    // Act
    String actual = closeFrame.toString();

    // Assert
    Assert.assertEquals(
        "Framedata{ optcode:CLOSING, fin:true, rsv1:false, rsv2:false, rsv3:false, payloadlength:[pos:0, len:2], payload:\u0003�}code: 1000",
        actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

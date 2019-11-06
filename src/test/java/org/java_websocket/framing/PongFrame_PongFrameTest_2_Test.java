package org.java_websocket.framing;

import org.java_websocket.enums.Opcode;
import org.java_websocket.framing.PingFrame;
import org.java_websocket.framing.PongFrame;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PongFrame_PongFrameTest_2_Test {
  @Test
  public void PongFrameTest() throws Exception {
    // Arrange
    PingFrame pingFrame = new PingFrame();

    // Act
    PongFrame pongFrame = new PongFrame(pingFrame);

    // Assert
    boolean isRSV1Result = pongFrame.isRSV1();
    String toStringResult = pongFrame.toString();
    boolean isRSV3Result = pongFrame.isRSV3();
    boolean transfereMasked = pongFrame.getTransfereMasked();
    boolean isRSV2Result = pongFrame.isRSV2();
    Opcode opcode = pongFrame.getOpcode();
    Assert.assertFalse(isRSV1Result);
    Assert.assertTrue(pongFrame.isFin());
    Assert.assertEquals(Opcode.PONG, opcode);
    Assert.assertFalse(isRSV2Result);
    Assert.assertFalse(transfereMasked);
    Assert.assertFalse(isRSV3Result);
    Assert.assertEquals(
        "Framedata{ optcode:PONG, fin:true, rsv1:false, rsv2:false, rsv3:false, payloadlength:[pos:0, len:0], payload:}",
        toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

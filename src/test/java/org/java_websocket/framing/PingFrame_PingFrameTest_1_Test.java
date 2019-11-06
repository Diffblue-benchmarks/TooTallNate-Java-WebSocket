package org.java_websocket.framing;

import org.java_websocket.enums.Opcode;
import org.java_websocket.framing.PingFrame;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PingFrame_PingFrameTest_1_Test {
  @Test
  public void PingFrameTest() throws Exception {
    // Arrange and Act
    PingFrame pingFrame = new PingFrame();

    // Assert
    boolean isRSV1Result = pingFrame.isRSV1();
    String toStringResult = pingFrame.toString();
    boolean isRSV3Result = pingFrame.isRSV3();
    boolean transfereMasked = pingFrame.getTransfereMasked();
    boolean isRSV2Result = pingFrame.isRSV2();
    Opcode opcode = pingFrame.getOpcode();
    Assert.assertFalse(isRSV1Result);
    Assert.assertTrue(pingFrame.isFin());
    Assert.assertEquals(Opcode.PING, opcode);
    Assert.assertFalse(isRSV2Result);
    Assert.assertFalse(transfereMasked);
    Assert.assertFalse(isRSV3Result);
    Assert.assertEquals(
        "Framedata{ optcode:PING, fin:true, rsv1:false, rsv2:false, rsv3:false, payloadlength:[pos:0, len:0], payload:}",
        toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

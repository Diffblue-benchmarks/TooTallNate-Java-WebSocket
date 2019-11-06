package org.java_websocket.framing;

import org.java_websocket.enums.Opcode;
import org.java_websocket.framing.ContinuousFrame;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ContinuousFrame_ContinuousFrameTest_1_Test {
  @Test
  public void ContinuousFrameTest() throws Exception {
    // Arrange and Act
    ContinuousFrame continuousFrame = new ContinuousFrame();

    // Assert
    boolean isRSV1Result = continuousFrame.isRSV1();
    String toStringResult = continuousFrame.toString();
    boolean isRSV3Result = continuousFrame.isRSV3();
    boolean transfereMasked = continuousFrame.getTransfereMasked();
    boolean isRSV2Result = continuousFrame.isRSV2();
    Opcode opcode = continuousFrame.getOpcode();
    Assert.assertFalse(isRSV1Result);
    Assert.assertTrue(continuousFrame.isFin());
    Assert.assertEquals(Opcode.CONTINUOUS, opcode);
    Assert.assertFalse(isRSV2Result);
    Assert.assertFalse(transfereMasked);
    Assert.assertFalse(isRSV3Result);
    Assert.assertEquals(
        "Framedata{ optcode:CONTINUOUS, fin:true, rsv1:false, rsv2:false, rsv3:false, payloadlength:[pos:0, len:0], payload:}",
        toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

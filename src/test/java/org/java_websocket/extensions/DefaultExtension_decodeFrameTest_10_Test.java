package org.java_websocket.extensions;

import org.java_websocket.enums.Opcode;
import org.java_websocket.extensions.DefaultExtension;
import org.java_websocket.framing.BinaryFrame;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DefaultExtension_decodeFrameTest_10_Test {
  @Test
  public void decodeFrameTest() throws Exception {
    // Arrange
    DefaultExtension defaultExtension = new DefaultExtension();
    BinaryFrame binaryFrame = new BinaryFrame();

    // Act
    defaultExtension.decodeFrame(binaryFrame);

    // Assert
    String toStringResult = binaryFrame.toString();
    boolean isRSV3Result = binaryFrame.isRSV3();
    boolean transfereMasked = binaryFrame.getTransfereMasked();
    boolean isRSV2Result = binaryFrame.isRSV2();
    Opcode opcode = binaryFrame.getOpcode();
    Assert.assertEquals(
        "Framedata{ optcode:BINARY, fin:true, rsv1:false, rsv2:false, rsv3:false, payloadlength:[pos:0, len:0], payload:}",
        toStringResult);
    Assert.assertTrue(binaryFrame.isFin());
    Assert.assertEquals(Opcode.BINARY, opcode);
    Assert.assertFalse(isRSV2Result);
    Assert.assertFalse(transfereMasked);
    Assert.assertFalse(isRSV3Result);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

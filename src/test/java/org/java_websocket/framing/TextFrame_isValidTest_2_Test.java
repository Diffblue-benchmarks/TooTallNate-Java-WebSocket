package org.java_websocket.framing;

import org.java_websocket.enums.Opcode;
import org.java_websocket.framing.TextFrame;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TextFrame_isValidTest_2_Test {
  @Test
  public void isValidTest() throws Exception {
    // Arrange
    TextFrame textFrame = new TextFrame();

    // Act
    textFrame.isValid();

    // Assert
    boolean isRSV1Result = textFrame.isRSV1();
    String toStringResult = textFrame.toString();
    boolean isRSV3Result = textFrame.isRSV3();
    boolean transfereMasked = textFrame.getTransfereMasked();
    boolean isRSV2Result = textFrame.isRSV2();
    Opcode opcode = textFrame.getOpcode();
    Assert.assertFalse(isRSV1Result);
    Assert.assertTrue(textFrame.isFin());
    Assert.assertEquals(Opcode.TEXT, opcode);
    Assert.assertFalse(isRSV2Result);
    Assert.assertFalse(transfereMasked);
    Assert.assertFalse(isRSV3Result);
    Assert.assertEquals(
        "Framedata{ optcode:TEXT, fin:true, rsv1:false, rsv2:false, rsv3:false, payloadlength:[pos:0, len:0], payload:}",
        toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

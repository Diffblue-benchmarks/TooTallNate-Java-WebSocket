package org.java_websocket.drafts;

import java.util.List;
import org.java_websocket.drafts.Draft_6455;
import org.java_websocket.enums.Opcode;
import org.java_websocket.framing.Framedata;
import org.java_websocket.framing.TextFrame;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Draft_6455_createFramesTest_12_Test {
  @Test
  public void createFramesTest() throws Exception {
    // Arrange
    Draft_6455 draft_6455 = new Draft_6455();
    String text = "";
    boolean mask = true;

    // Act
    List<Framedata> actual = draft_6455.createFrames(text, mask);

    // Assert
    Assert.assertEquals(1, actual.size());
    Framedata getResult = actual.get(0);
    Assert.assertTrue(getResult instanceof TextFrame);
    boolean isRSV1Result = getResult.isRSV1();
    String toStringResult = ((TextFrame) getResult).toString();
    boolean isRSV3Result = getResult.isRSV3();
    boolean transfereMasked = getResult.getTransfereMasked();
    boolean isRSV2Result = getResult.isRSV2();
    Opcode opcode = getResult.getOpcode();
    Assert.assertFalse(isRSV1Result);
    Assert.assertTrue(getResult.isFin());
    Assert.assertEquals(Opcode.TEXT, opcode);
    Assert.assertFalse(isRSV2Result);
    Assert.assertTrue(transfereMasked);
    Assert.assertFalse(isRSV3Result);
    Assert.assertEquals(
        "Framedata{ optcode:TEXT, fin:true, rsv1:false, rsv2:false, rsv3:false, payloadlength:[pos:0, len:0], payload:}",
        toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

package org.java_websocket.framing;

import org.java_websocket.framing.CloseFrame;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CloseFrame_getMessageTest_9_Test {
  @Test
  public void getMessageTest() throws Exception {
    // Arrange
    CloseFrame closeFrame = new CloseFrame();

    // Act
    String actual = closeFrame.getMessage();

    // Assert
    Assert.assertEquals("", actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

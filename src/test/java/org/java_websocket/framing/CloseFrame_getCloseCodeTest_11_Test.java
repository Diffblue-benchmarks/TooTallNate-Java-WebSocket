package org.java_websocket.framing;

import org.java_websocket.framing.CloseFrame;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CloseFrame_getCloseCodeTest_11_Test {
  @Test
  public void getCloseCodeTest() throws Exception {
    // Arrange
    CloseFrame closeFrame = new CloseFrame();

    // Act
    int actual = closeFrame.getCloseCode();

    // Assert
    Assert.assertEquals(1000, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

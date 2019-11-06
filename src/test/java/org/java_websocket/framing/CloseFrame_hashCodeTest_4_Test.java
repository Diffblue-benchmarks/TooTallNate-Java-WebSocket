package org.java_websocket.framing;

import org.java_websocket.framing.CloseFrame;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CloseFrame_hashCodeTest_4_Test {
  @Test
  public void hashCodeTest() throws Exception {
    // Arrange
    CloseFrame closeFrame = new CloseFrame();

    // Act
    int actual = closeFrame.hashCode();

    // Assert
    Assert.assertEquals(-1854831320, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

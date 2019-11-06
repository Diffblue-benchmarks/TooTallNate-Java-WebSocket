package org.java_websocket.framing;

import org.java_websocket.framing.CloseFrame;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CloseFrame_equalsTest_7_Test {
  @Test
  public void equalsTest() throws Exception {
    // Arrange
    CloseFrame closeFrame = new CloseFrame();
    String o = "";

    // Act
    boolean actual = closeFrame.equals(o);

    // Assert
    Assert.assertFalse(actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

package org.java_websocket.drafts;

import org.java_websocket.drafts.Draft_6455;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Draft_6455_toStringTest_1_Test {
  @Test
  public void toStringTest() throws Exception {
    // Arrange
    Draft_6455 draft_6455 = new Draft_6455();

    // Act
    String actual = draft_6455.toString();

    // Assert
    Assert.assertEquals("Draft_6455 extension: DefaultExtension max frame size: 2147483647", actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

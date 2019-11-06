package org.java_websocket.drafts;

import org.java_websocket.drafts.Draft_6455;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Draft_6455_hashCodeTest_8_Test {
  @Test
  public void hashCodeTest() throws Exception {
    // Arrange
    Draft_6455 draft_6455 = new Draft_6455();

    // Act
    int actual = draft_6455.hashCode();

    // Assert
    Assert.assertEquals(-1585097248, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

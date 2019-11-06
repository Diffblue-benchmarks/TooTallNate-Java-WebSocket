package org.java_websocket.drafts;

import org.java_websocket.drafts.Draft_6455;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Draft_6455_equalsTest_19_Test {
  @Test
  public void equalsTest() throws Exception {
    // Arrange
    Draft_6455 draft_6455 = new Draft_6455();
    String o = "";

    // Act
    boolean actual = draft_6455.equals(o);

    // Assert
    Assert.assertFalse(actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

package org.java_websocket.drafts;

import org.java_websocket.drafts.Draft_6455;
import org.java_websocket.enums.CloseHandshakeType;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Draft_6455_getCloseHandshakeTypeTest_5_Test {
  @Test
  public void getCloseHandshakeTypeTest() throws Exception {
    // Arrange
    Draft_6455 draft_6455 = new Draft_6455();

    // Act
    CloseHandshakeType actual = draft_6455.getCloseHandshakeType();

    // Assert
    Assert.assertEquals(CloseHandshakeType.TWOWAY, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

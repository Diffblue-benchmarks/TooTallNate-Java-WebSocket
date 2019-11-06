package org.java_websocket.exceptions;

import org.java_websocket.exceptions.IncompleteHandshakeException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class IncompleteHandshakeException_getPreferredSizeTest_3_Test {
  @Test
  public void getPreferredSizeTest() throws Exception {
    // Arrange
    IncompleteHandshakeException incompleteHandshakeException = new IncompleteHandshakeException();

    // Act
    int actual = incompleteHandshakeException.getPreferredSize();

    // Assert
    Assert.assertEquals(0, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

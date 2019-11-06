package org.java_websocket.exceptions;

import org.java_websocket.exceptions.IncompleteException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class IncompleteException_getPreferredSizeTest_1_Test {
  @Test
  public void getPreferredSizeTest() throws Exception {
    // Arrange
    IncompleteException incompleteException = new IncompleteException(1);

    // Act
    int actual = incompleteException.getPreferredSize();

    // Assert
    Assert.assertEquals(1, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

package org.java_websocket.exceptions;

import org.java_websocket.exceptions.IncompleteException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class IncompleteException_IncompleteExceptionTest_2_Test {
  @Test
  public void IncompleteExceptionTest() throws Exception {
    // Arrange
    int preferredSize = 1;

    // Act
    IncompleteException incompleteException = new IncompleteException(preferredSize);

    // Assert
    String toStringResult = incompleteException.toString();
    Throwable[] suppressed = incompleteException.getSuppressed();
    String message = incompleteException.getMessage();
    int preferredSize1 = incompleteException.getPreferredSize();
    Throwable cause = incompleteException.getCause();
    Assert.assertEquals("org.java_websocket.exceptions.IncompleteException", toStringResult);
    Assert.assertEquals(null, incompleteException.getLocalizedMessage());
    Assert.assertEquals(null, cause);
    Assert.assertEquals(1, preferredSize1);
    Assert.assertEquals(null, message);
    Assert.assertEquals(0, suppressed.length);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

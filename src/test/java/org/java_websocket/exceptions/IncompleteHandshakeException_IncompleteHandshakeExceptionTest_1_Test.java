package org.java_websocket.exceptions;

import org.java_websocket.exceptions.IncompleteHandshakeException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class IncompleteHandshakeException_IncompleteHandshakeExceptionTest_1_Test {
  @Test
  public void IncompleteHandshakeExceptionTest() throws Exception {
    // Arrange
    int preferredSize = 0;

    // Act
    IncompleteHandshakeException incompleteHandshakeException = new IncompleteHandshakeException(preferredSize);

    // Assert
    String toStringResult = incompleteHandshakeException.toString();
    Throwable[] suppressed = incompleteHandshakeException.getSuppressed();
    String message = incompleteHandshakeException.getMessage();
    int preferredSize1 = incompleteHandshakeException.getPreferredSize();
    Throwable cause = incompleteHandshakeException.getCause();
    Assert.assertEquals("org.java_websocket.exceptions.IncompleteHandshakeException", toStringResult);
    Assert.assertEquals(null, incompleteHandshakeException.getLocalizedMessage());
    Assert.assertEquals(null, cause);
    Assert.assertEquals(0, preferredSize1);
    Assert.assertEquals(null, message);
    Assert.assertEquals(0, suppressed.length);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

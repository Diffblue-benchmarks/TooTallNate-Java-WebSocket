package org.java_websocket.exceptions;

import org.java_websocket.exceptions.NotSendableException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class NotSendableException_NotSendableExceptionTest_2_Test {
  @Test
  public void NotSendableExceptionTest() throws Exception {
    // Arrange
    String s = "aaaaa";

    // Act
    NotSendableException notSendableException = new NotSendableException(s);

    // Assert
    String toStringResult = notSendableException.toString();
    Throwable[] suppressed = notSendableException.getSuppressed();
    String message = notSendableException.getMessage();
    Throwable cause = notSendableException.getCause();
    Assert.assertEquals("org.java_websocket.exceptions.NotSendableException: aaaaa", toStringResult);
    Assert.assertEquals("aaaaa", notSendableException.getLocalizedMessage());
    Assert.assertEquals(null, cause);
    Assert.assertEquals("aaaaa", message);
    Assert.assertEquals(0, suppressed.length);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

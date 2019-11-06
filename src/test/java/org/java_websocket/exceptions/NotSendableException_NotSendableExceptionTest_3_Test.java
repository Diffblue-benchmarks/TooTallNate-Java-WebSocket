package org.java_websocket.exceptions;

import org.java_websocket.exceptions.NotSendableException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class NotSendableException_NotSendableExceptionTest_3_Test {
  @Test
  public void NotSendableExceptionTest() throws Exception {
    // Arrange
    Throwable t = new Throwable();

    // Act
    NotSendableException notSendableException = new NotSendableException(t);

    // Assert
    String toStringResult = notSendableException.toString();
    Throwable[] suppressed = notSendableException.getSuppressed();
    String message = notSendableException.getMessage();
    Throwable cause = notSendableException.getCause();
    Assert.assertEquals("org.java_websocket.exceptions.NotSendableException: java.lang.Throwable", toStringResult);
    Assert.assertEquals("java.lang.Throwable", notSendableException.getLocalizedMessage());
    String toStringResult1 = cause.toString();
    String message1 = cause.getMessage();
    Throwable cause1 = cause.getCause();
    Assert.assertEquals("java.lang.Throwable", message);
    Assert.assertEquals(0, suppressed.length);
    Assert.assertEquals(null, cause1);
    Assert.assertEquals(null, message1);
    Assert.assertEquals("java.lang.Throwable", toStringResult1);
    Assert.assertEquals(null, cause.getLocalizedMessage());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

package org.java_websocket.exceptions;

import org.java_websocket.exceptions.InvalidFrameException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class InvalidFrameException_InvalidFrameExceptionTest_1_Test {
  @Test
  public void InvalidFrameExceptionTest() throws Exception {
    // Arrange
    Throwable t = new Throwable();

    // Act
    InvalidFrameException invalidFrameException = new InvalidFrameException(t);

    // Assert
    String toStringResult = invalidFrameException.toString();
    Throwable[] suppressed = invalidFrameException.getSuppressed();
    String message = invalidFrameException.getMessage();
    Throwable cause = invalidFrameException.getCause();
    int closeCode = invalidFrameException.getCloseCode();
    Assert.assertEquals("org.java_websocket.exceptions.InvalidFrameException: java.lang.Throwable", toStringResult);
    Assert.assertEquals("java.lang.Throwable", invalidFrameException.getLocalizedMessage());
    Assert.assertEquals(1002, closeCode);
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

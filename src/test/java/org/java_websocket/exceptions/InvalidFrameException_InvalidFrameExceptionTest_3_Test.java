package org.java_websocket.exceptions;

import org.java_websocket.exceptions.InvalidFrameException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class InvalidFrameException_InvalidFrameExceptionTest_3_Test {
  @Test
  public void InvalidFrameExceptionTest() throws Exception {
    // Arrange and Act
    InvalidFrameException invalidFrameException = new InvalidFrameException();

    // Assert
    String toStringResult = invalidFrameException.toString();
    Throwable[] suppressed = invalidFrameException.getSuppressed();
    String message = invalidFrameException.getMessage();
    Throwable cause = invalidFrameException.getCause();
    int closeCode = invalidFrameException.getCloseCode();
    Assert.assertEquals("org.java_websocket.exceptions.InvalidFrameException", toStringResult);
    Assert.assertEquals(null, invalidFrameException.getLocalizedMessage());
    Assert.assertEquals(1002, closeCode);
    Assert.assertEquals(null, cause);
    Assert.assertEquals(null, message);
    Assert.assertEquals(0, suppressed.length);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

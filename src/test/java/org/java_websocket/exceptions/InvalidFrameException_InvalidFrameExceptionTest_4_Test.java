package org.java_websocket.exceptions;

import org.java_websocket.exceptions.InvalidFrameException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class InvalidFrameException_InvalidFrameExceptionTest_4_Test {
  @Test
  public void InvalidFrameExceptionTest() throws Exception {
    // Arrange
    String s = "aaaaa";

    // Act
    InvalidFrameException invalidFrameException = new InvalidFrameException(s);

    // Assert
    String toStringResult = invalidFrameException.toString();
    Throwable[] suppressed = invalidFrameException.getSuppressed();
    String message = invalidFrameException.getMessage();
    Throwable cause = invalidFrameException.getCause();
    int closeCode = invalidFrameException.getCloseCode();
    Assert.assertEquals("org.java_websocket.exceptions.InvalidFrameException: aaaaa", toStringResult);
    Assert.assertEquals("aaaaa", invalidFrameException.getLocalizedMessage());
    Assert.assertEquals(1002, closeCode);
    Assert.assertEquals(null, cause);
    Assert.assertEquals("aaaaa", message);
    Assert.assertEquals(0, suppressed.length);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

package org.java_websocket.exceptions;

import org.java_websocket.exceptions.InvalidHandshakeException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class InvalidHandshakeException_InvalidHandshakeExceptionTest_4_Test {
  @Test
  public void InvalidHandshakeExceptionTest() throws Exception {
    // Arrange
    String s = "aaaaa";

    // Act
    InvalidHandshakeException invalidHandshakeException = new InvalidHandshakeException(s);

    // Assert
    String toStringResult = invalidHandshakeException.toString();
    Throwable[] suppressed = invalidHandshakeException.getSuppressed();
    String message = invalidHandshakeException.getMessage();
    Throwable cause = invalidHandshakeException.getCause();
    int closeCode = invalidHandshakeException.getCloseCode();
    Assert.assertEquals("org.java_websocket.exceptions.InvalidHandshakeException: aaaaa", toStringResult);
    Assert.assertEquals("aaaaa", invalidHandshakeException.getLocalizedMessage());
    Assert.assertEquals(1002, closeCode);
    Assert.assertEquals(null, cause);
    Assert.assertEquals("aaaaa", message);
    Assert.assertEquals(0, suppressed.length);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

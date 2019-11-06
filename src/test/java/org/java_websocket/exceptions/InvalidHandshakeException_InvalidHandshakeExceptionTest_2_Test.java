package org.java_websocket.exceptions;

import org.java_websocket.exceptions.InvalidHandshakeException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class InvalidHandshakeException_InvalidHandshakeExceptionTest_2_Test {
  @Test
  public void InvalidHandshakeExceptionTest() throws Exception {
    // Arrange and Act
    InvalidHandshakeException invalidHandshakeException = new InvalidHandshakeException();

    // Assert
    String toStringResult = invalidHandshakeException.toString();
    Throwable[] suppressed = invalidHandshakeException.getSuppressed();
    String message = invalidHandshakeException.getMessage();
    Throwable cause = invalidHandshakeException.getCause();
    int closeCode = invalidHandshakeException.getCloseCode();
    Assert.assertEquals("org.java_websocket.exceptions.InvalidHandshakeException", toStringResult);
    Assert.assertEquals(null, invalidHandshakeException.getLocalizedMessage());
    Assert.assertEquals(1002, closeCode);
    Assert.assertEquals(null, cause);
    Assert.assertEquals(null, message);
    Assert.assertEquals(0, suppressed.length);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

package org.java_websocket.exceptions;

import org.java_websocket.exceptions.InvalidHandshakeException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class InvalidHandshakeException_InvalidHandshakeExceptionTest_3_Test {
  @Test
  public void InvalidHandshakeExceptionTest() throws Exception {
    // Arrange
    Throwable t = new Throwable();

    // Act
    InvalidHandshakeException invalidHandshakeException = new InvalidHandshakeException(t);

    // Assert
    String toStringResult = invalidHandshakeException.toString();
    Throwable[] suppressed = invalidHandshakeException.getSuppressed();
    String message = invalidHandshakeException.getMessage();
    Throwable cause = invalidHandshakeException.getCause();
    int closeCode = invalidHandshakeException.getCloseCode();
    Assert.assertEquals("org.java_websocket.exceptions.InvalidHandshakeException: java.lang.Throwable", toStringResult);
    Assert.assertEquals("java.lang.Throwable", invalidHandshakeException.getLocalizedMessage());
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

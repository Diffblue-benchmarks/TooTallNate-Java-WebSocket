package org.java_websocket.exceptions;

import org.java_websocket.exceptions.InvalidDataException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class InvalidDataException_InvalidDataExceptionTest_5_Test {
  @Test
  public void InvalidDataExceptionTest() throws Exception {
    // Arrange
    int closecode = 1;
    Throwable t = new Throwable();

    // Act
    InvalidDataException invalidDataException = new InvalidDataException(closecode, t);

    // Assert
    String toStringResult = invalidDataException.toString();
    Throwable[] suppressed = invalidDataException.getSuppressed();
    String message = invalidDataException.getMessage();
    Throwable cause = invalidDataException.getCause();
    int closeCode = invalidDataException.getCloseCode();
    Assert.assertEquals("org.java_websocket.exceptions.InvalidDataException: java.lang.Throwable", toStringResult);
    Assert.assertEquals("java.lang.Throwable", invalidDataException.getLocalizedMessage());
    Assert.assertEquals(1, closeCode);
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

package org.java_websocket.exceptions;

import org.java_websocket.exceptions.InvalidDataException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class InvalidDataException_InvalidDataExceptionTest_2_Test {
  @Test
  public void InvalidDataExceptionTest() throws Exception {
    // Arrange
    int closecode = 1;
    String s = "aaaaa";

    // Act
    InvalidDataException invalidDataException = new InvalidDataException(closecode, s);

    // Assert
    String toStringResult = invalidDataException.toString();
    Throwable[] suppressed = invalidDataException.getSuppressed();
    String message = invalidDataException.getMessage();
    Throwable cause = invalidDataException.getCause();
    int closeCode = invalidDataException.getCloseCode();
    Assert.assertEquals("org.java_websocket.exceptions.InvalidDataException: aaaaa", toStringResult);
    Assert.assertEquals("aaaaa", invalidDataException.getLocalizedMessage());
    Assert.assertEquals(1, closeCode);
    Assert.assertEquals(null, cause);
    Assert.assertEquals("aaaaa", message);
    Assert.assertEquals(0, suppressed.length);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

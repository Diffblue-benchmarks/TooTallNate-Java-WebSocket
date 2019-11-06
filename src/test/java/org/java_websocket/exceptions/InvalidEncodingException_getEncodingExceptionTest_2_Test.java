package org.java_websocket.exceptions;

import java.io.UnsupportedEncodingException;
import org.java_websocket.exceptions.InvalidEncodingException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class InvalidEncodingException_getEncodingExceptionTest_2_Test {
  @Test
  public void getEncodingExceptionTest() throws Exception {
    // Arrange
    InvalidEncodingException invalidEncodingException = new InvalidEncodingException(
        new UnsupportedEncodingException());

    // Act
    UnsupportedEncodingException actual = invalidEncodingException.getEncodingException();

    // Assert
    String toStringResult = actual.toString();
    Throwable[] suppressed = actual.getSuppressed();
    String message = actual.getMessage();
    Throwable cause = actual.getCause();
    Assert.assertEquals("java.io.UnsupportedEncodingException", toStringResult);
    Assert.assertEquals(null, actual.getLocalizedMessage());
    Assert.assertEquals(null, cause);
    Assert.assertEquals(null, message);
    Assert.assertEquals(0, suppressed.length);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

package org.java_websocket.exceptions;

import java.io.UnsupportedEncodingException;
import org.java_websocket.exceptions.InvalidEncodingException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class InvalidEncodingException_InvalidEncodingExceptionTest_1_Test {
  @Test
  public void InvalidEncodingExceptionTest() throws Exception {
    // Arrange
    UnsupportedEncodingException encodingException = new UnsupportedEncodingException();

    // Act
    InvalidEncodingException invalidEncodingException = new InvalidEncodingException(encodingException);

    // Assert
    String toStringResult = invalidEncodingException.toString();
    Throwable[] suppressed = invalidEncodingException.getSuppressed();
    UnsupportedEncodingException encodingException1 = invalidEncodingException.getEncodingException();
    String message = invalidEncodingException.getMessage();
    Throwable cause = invalidEncodingException.getCause();
    Assert.assertEquals("org.java_websocket.exceptions.InvalidEncodingException", toStringResult);
    Assert.assertEquals(null, invalidEncodingException.getLocalizedMessage());
    Assert.assertEquals(null, cause);
    Assert.assertEquals(null, message);
    String toStringResult1 = encodingException1.toString();
    String message1 = encodingException1.getMessage();
    Throwable cause1 = encodingException1.getCause();
    Assert.assertEquals(0, suppressed.length);
    Assert.assertEquals(null, encodingException1.getLocalizedMessage());
    Assert.assertEquals(null, cause1);
    Assert.assertEquals(null, message1);
    Assert.assertEquals("java.io.UnsupportedEncodingException", toStringResult1);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

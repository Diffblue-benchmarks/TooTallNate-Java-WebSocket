package org.java_websocket.exceptions;

import org.java_websocket.exceptions.InvalidEncodingException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.io.UnsupportedEncodingException;



public class InvalidEncodingExceptionTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull999c62aa20af765cfd8() {

    // Arrange
    final UnsupportedEncodingException arg0 = new UnsupportedEncodingException();

    // Act, creating object to test constructor
    final InvalidEncodingException actual = new InvalidEncodingException(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getEncodingException());
    Assert.assertNull(actual.getEncodingException().getMessage());
    Assert.assertNull(actual.getMessage());

  }

  // Test written by Diffblue Cover
  @Test
  public void getEncodingExceptionOutputNotNull9995c83d1e1b86b6930() {

    // Arrange
    final UnsupportedEncodingException unsupportedEncodingException = new UnsupportedEncodingException();
    final InvalidEncodingException thisObj = new InvalidEncodingException(unsupportedEncodingException);

    // Act
    final UnsupportedEncodingException actual = thisObj.getEncodingException();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getMessage());

  }
}

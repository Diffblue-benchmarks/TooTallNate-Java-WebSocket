package org.java_websocket.exceptions;

import org.java_websocket.exceptions.InvalidFrameException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class InvalidFrameExceptionTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999fec54aa69e20d445() {

    // Act, creating object to test constructor
    final InvalidFrameException actual = new InvalidFrameException();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1002, actual.getCloseCode());
    Assert.assertNull(actual.getMessage());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullOutputNotNull99928d4995523f8a801() {

    // Arrange
    final String arg0 = "aaaaa";
    final Throwable arg1 = new Throwable();

    // Act, creating object to test constructor
    final InvalidFrameException actual = new InvalidFrameException(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1002, actual.getCloseCode());
    Assert.assertEquals("aaaaa", actual.getMessage());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull999022bc9bd4cb820a0() {

    // Arrange
    final String arg0 = "aaaaa";

    // Act, creating object to test constructor
    final InvalidFrameException actual = new InvalidFrameException(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1002, actual.getCloseCode());
    Assert.assertEquals("aaaaa", actual.getMessage());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull999580a95640cb1a62f() {

    // Arrange
    final Throwable arg0 = new Throwable();

    // Act, creating object to test constructor
    final InvalidFrameException actual = new InvalidFrameException(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1002, actual.getCloseCode());
    Assert.assertEquals("java.lang.Throwable", actual.getMessage());

  }
}

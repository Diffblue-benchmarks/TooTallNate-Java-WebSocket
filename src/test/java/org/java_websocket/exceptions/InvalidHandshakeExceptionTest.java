package org.java_websocket.exceptions;

import org.java_websocket.exceptions.InvalidHandshakeException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class InvalidHandshakeExceptionTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99995722a6e2450090f() {

    // Act, creating object to test constructor
    final InvalidHandshakeException actual = new InvalidHandshakeException();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1002, actual.getCloseCode());
    Assert.assertNull(actual.getMessage());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullOutputNotNull999b7dbab2a500e06c8() {

    // Arrange
    final String arg0 = "aaaaa";
    final Throwable arg1 = new Throwable();

    // Act, creating object to test constructor
    final InvalidHandshakeException actual = new InvalidHandshakeException(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1002, actual.getCloseCode());
    Assert.assertEquals("aaaaa", actual.getMessage());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull999aaebf2e07f52f869() {

    // Arrange
    final String arg0 = "aaaaa";

    // Act, creating object to test constructor
    final InvalidHandshakeException actual = new InvalidHandshakeException(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1002, actual.getCloseCode());
    Assert.assertEquals("aaaaa", actual.getMessage());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull999bbd600b1eb071ae6() {

    // Arrange
    final Throwable arg0 = new Throwable();

    // Act, creating object to test constructor
    final InvalidHandshakeException actual = new InvalidHandshakeException(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1002, actual.getCloseCode());
    Assert.assertEquals("java.lang.Throwable", actual.getMessage());

  }
}

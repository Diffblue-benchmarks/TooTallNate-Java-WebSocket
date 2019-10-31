package org.java_websocket.exceptions;

import org.java_websocket.exceptions.NotSendableException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class NotSendableExceptionTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullOutputNotNull999bae47d4b66febc69() {

    // Arrange
    final String arg0 = "aaaaa";
    final Throwable arg1 = new Throwable();

    // Act, creating object to test constructor
    final NotSendableException actual = new NotSendableException(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("aaaaa", actual.getMessage());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull999484f0d5bee1b1818() {

    // Arrange
    final String arg0 = "aaaaa";

    // Act, creating object to test constructor
    final NotSendableException actual = new NotSendableException(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("aaaaa", actual.getMessage());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull9993cb5d5d8048834a4() {

    // Arrange
    final Throwable arg0 = new Throwable();

    // Act, creating object to test constructor
    final NotSendableException actual = new NotSendableException(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("java.lang.Throwable", actual.getMessage());

  }
}

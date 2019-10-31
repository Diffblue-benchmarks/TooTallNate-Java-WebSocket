package org.java_websocket.exceptions;

import org.java_websocket.exceptions.InvalidDataException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class InvalidDataExceptionTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorInputPositiveNotNullNotNullOutputNotNull999cf5946309d38a2b5() {

    // Arrange
    final int arg0 = 1;
    final String arg1 = "aaaaa";
    final Throwable arg2 = new Throwable();

    // Act, creating object to test constructor
    final InvalidDataException actual = new InvalidDataException(arg0, arg1, arg2);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.getCloseCode());
    Assert.assertEquals("aaaaa", actual.getMessage());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputPositiveNotNullOutputNotNull999de7a6b2271a608ab() {

    // Arrange
    final int arg0 = 1;
    final String arg1 = "aaaaa";

    // Act, creating object to test constructor
    final InvalidDataException actual = new InvalidDataException(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.getCloseCode());
    Assert.assertEquals("aaaaa", actual.getMessage());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputPositiveNotNullOutputNotNull9997a0c8394f2aaf1a7() {

    // Arrange
    final int arg0 = 1;
    final Throwable arg1 = new Throwable();

    // Act, creating object to test constructor
    final InvalidDataException actual = new InvalidDataException(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.getCloseCode());
    Assert.assertEquals("java.lang.Throwable", actual.getMessage());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputPositiveOutputNotNull99970a1be7118f30d82() {

    // Arrange
    final int arg0 = 1;

    // Act, creating object to test constructor
    final InvalidDataException actual = new InvalidDataException(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.getCloseCode());
    Assert.assertNull(actual.getMessage());

  }

  // Test written by Diffblue Cover
  @Test
  public void getCloseCodeOutputPositive999c2b54a3063f52559() {

    // Arrange
    final InvalidDataException thisObj = new InvalidDataException(1);

    // Act
    final int actual = thisObj.getCloseCode();

    // Assert result
    Assert.assertEquals(1, actual);

  }
}

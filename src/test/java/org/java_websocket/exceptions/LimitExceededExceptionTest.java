package org.java_websocket.exceptions;

import org.java_websocket.exceptions.LimitExceededException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class LimitExceededExceptionTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9997c3b534bdea1e566() {

    // Act, creating object to test constructor
    final LimitExceededException actual = new LimitExceededException();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(2147483647, actual.getLimit());
    Assert.assertEquals(1009, actual.getCloseCode());
    Assert.assertNull(actual.getMessage());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullPositiveOutputNotNull999e82b532dc5b9081e() {

    // Arrange
    final String arg0 = "aaaaa";
    final int arg1 = 1009;

    // Act, creating object to test constructor
    final LimitExceededException actual = new LimitExceededException(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1009, actual.getLimit());
    Assert.assertEquals(1009, actual.getCloseCode());
    Assert.assertEquals("aaaaa", actual.getMessage());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull999181f659b36723716() {

    // Arrange
    final String arg0 = "aaaaa";

    // Act, creating object to test constructor
    final LimitExceededException actual = new LimitExceededException(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(2147483647, actual.getLimit());
    Assert.assertEquals(1009, actual.getCloseCode());
    Assert.assertEquals("aaaaa", actual.getMessage());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputPositiveOutputNotNull999c4af4a416bed5dfd() {

    // Arrange
    final int arg0 = 1009;

    // Act, creating object to test constructor
    final LimitExceededException actual = new LimitExceededException(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1009, actual.getLimit());
    Assert.assertEquals(1009, actual.getCloseCode());
    Assert.assertNull(actual.getMessage());

  }

  // Test written by Diffblue Cover
  @Test
  public void getLimitOutputPositive9996bf00c10351caf07() {

    // Arrange
    final LimitExceededException thisObj = new LimitExceededException();

    // Act
    final int actual = thisObj.getLimit();

    // Assert result
    Assert.assertEquals(2147483647, actual);

  }
}

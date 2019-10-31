package org.java_websocket.exceptions;

import org.java_websocket.exceptions.IncompleteHandshakeException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class IncompleteHandshakeExceptionTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99985b53f5cbac04b02() {

    // Act, creating object to test constructor
    final IncompleteHandshakeException actual = new IncompleteHandshakeException();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getPreferredSize());
    Assert.assertNull(actual.getMessage());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputZeroOutputNotNull9994d8028a52d588570() {

    // Arrange
    final int arg0 = 0;

    // Act, creating object to test constructor
    final IncompleteHandshakeException actual = new IncompleteHandshakeException(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getPreferredSize());
    Assert.assertNull(actual.getMessage());

  }

  // Test written by Diffblue Cover
  @Test
  public void getPreferredSizeOutputZero9994e2bed27b03165e9() {

    // Arrange
    final IncompleteHandshakeException thisObj = new IncompleteHandshakeException();

    // Act
    final int actual = thisObj.getPreferredSize();

    // Assert result
    Assert.assertEquals(0, actual);

  }
}

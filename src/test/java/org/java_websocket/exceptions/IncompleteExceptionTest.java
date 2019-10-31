package org.java_websocket.exceptions;

import org.java_websocket.exceptions.IncompleteException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class IncompleteExceptionTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorInputPositiveOutputNotNull999c60a9fc527573cc5() {

    // Arrange
    final int arg0 = 1;

    // Act, creating object to test constructor
    final IncompleteException actual = new IncompleteException(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.getPreferredSize());
    Assert.assertNull(actual.getMessage());

  }

  // Test written by Diffblue Cover
  @Test
  public void getPreferredSizeOutputPositive999faa92951ece3e3d7() {

    // Arrange
    final IncompleteException thisObj = new IncompleteException(1);

    // Act
    final int actual = thisObj.getPreferredSize();

    // Assert result
    Assert.assertEquals(1, actual);

  }
}

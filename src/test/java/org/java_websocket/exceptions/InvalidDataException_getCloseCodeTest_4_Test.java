package org.java_websocket.exceptions;

import org.java_websocket.exceptions.InvalidDataException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class InvalidDataException_getCloseCodeTest_4_Test {
  @Test
  public void getCloseCodeTest() throws Exception {
    // Arrange
    InvalidDataException invalidDataException = new InvalidDataException(1);

    // Act
    int actual = invalidDataException.getCloseCode();

    // Assert
    Assert.assertEquals(1, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

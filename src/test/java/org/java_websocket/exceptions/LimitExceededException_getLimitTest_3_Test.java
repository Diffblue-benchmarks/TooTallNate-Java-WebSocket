package org.java_websocket.exceptions;

import org.java_websocket.exceptions.LimitExceededException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class LimitExceededException_getLimitTest_3_Test {
  @Test
  public void getLimitTest() throws Exception {
    // Arrange
    LimitExceededException limitExceededException = new LimitExceededException();

    // Act
    int actual = limitExceededException.getLimit();

    // Assert
    Assert.assertEquals(2147483647, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

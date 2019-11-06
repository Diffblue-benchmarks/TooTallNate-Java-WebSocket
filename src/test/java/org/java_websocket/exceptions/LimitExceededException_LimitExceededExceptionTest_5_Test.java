package org.java_websocket.exceptions;

import org.java_websocket.exceptions.LimitExceededException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class LimitExceededException_LimitExceededExceptionTest_5_Test {
  @Test
  public void LimitExceededExceptionTest() throws Exception {
    // Arrange
    String s = "aaaaa";
    int limit = 1009;

    // Act
    LimitExceededException limitExceededException = new LimitExceededException(s, limit);

    // Assert
    Throwable[] suppressed = limitExceededException.getSuppressed();
    String message = limitExceededException.getMessage();
    Throwable cause = limitExceededException.getCause();
    int limit1 = limitExceededException.getLimit();
    int closeCode = limitExceededException.getCloseCode();
    Assert.assertEquals(0, suppressed.length);
    Assert.assertEquals("aaaaa", limitExceededException.getLocalizedMessage());
    Assert.assertEquals(1009, closeCode);
    Assert.assertEquals(1009, limit1);
    Assert.assertEquals(null, cause);
    Assert.assertEquals("aaaaa", message);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

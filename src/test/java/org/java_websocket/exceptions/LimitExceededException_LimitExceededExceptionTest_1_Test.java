package org.java_websocket.exceptions;

import org.java_websocket.exceptions.LimitExceededException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class LimitExceededException_LimitExceededExceptionTest_1_Test {
  @Test
  public void LimitExceededExceptionTest() throws Exception {
    // Arrange
    String s = "aaaaa";

    // Act
    LimitExceededException limitExceededException = new LimitExceededException(s);

    // Assert
    String toStringResult = limitExceededException.toString();
    Throwable[] suppressed = limitExceededException.getSuppressed();
    String message = limitExceededException.getMessage();
    Throwable cause = limitExceededException.getCause();
    int limit = limitExceededException.getLimit();
    int closeCode = limitExceededException.getCloseCode();
    Assert.assertEquals("org.java_websocket.exceptions.LimitExceededException: aaaaa", toStringResult);
    Assert.assertEquals("aaaaa", limitExceededException.getLocalizedMessage());
    Assert.assertEquals(1009, closeCode);
    Assert.assertEquals(2147483647, limit);
    Assert.assertEquals(null, cause);
    Assert.assertEquals("aaaaa", message);
    Assert.assertEquals(0, suppressed.length);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

package org.java_websocket.exceptions;

import org.java_websocket.exceptions.LimitExceededException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class LimitExceededException_LimitExceededExceptionTest_2_Test {
  @Test
  public void LimitExceededExceptionTest() throws Exception {
    // Arrange
    int limit = 1009;

    // Act
    LimitExceededException limitExceededException = new LimitExceededException(limit);

    // Assert
    String toStringResult = limitExceededException.toString();
    Throwable[] suppressed = limitExceededException.getSuppressed();
    String message = limitExceededException.getMessage();
    Throwable cause = limitExceededException.getCause();
    int limit1 = limitExceededException.getLimit();
    int closeCode = limitExceededException.getCloseCode();
    Assert.assertEquals("org.java_websocket.exceptions.LimitExceededException", toStringResult);
    Assert.assertEquals(null, limitExceededException.getLocalizedMessage());
    Assert.assertEquals(1009, closeCode);
    Assert.assertEquals(1009, limit1);
    Assert.assertEquals(null, cause);
    Assert.assertEquals(null, message);
    Assert.assertEquals(0, suppressed.length);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

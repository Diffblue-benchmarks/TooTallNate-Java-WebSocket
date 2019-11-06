package org.java_websocket.exceptions;

import org.java_websocket.exceptions.WebsocketNotConnectedException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WebsocketNotConnectedException_WebsocketNotConnectedExceptionTest_1_Test {
  @Test
  public void WebsocketNotConnectedExceptionTest() throws Exception {
    // Arrange and Act
    WebsocketNotConnectedException websocketNotConnectedException = new WebsocketNotConnectedException();

    // Assert
    String toStringResult = websocketNotConnectedException.toString();
    Throwable[] suppressed = websocketNotConnectedException.getSuppressed();
    String message = websocketNotConnectedException.getMessage();
    Throwable cause = websocketNotConnectedException.getCause();
    Assert.assertEquals("org.java_websocket.exceptions.WebsocketNotConnectedException", toStringResult);
    Assert.assertEquals(null, websocketNotConnectedException.getLocalizedMessage());
    Assert.assertEquals(null, cause);
    Assert.assertEquals(null, message);
    Assert.assertEquals(0, suppressed.length);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

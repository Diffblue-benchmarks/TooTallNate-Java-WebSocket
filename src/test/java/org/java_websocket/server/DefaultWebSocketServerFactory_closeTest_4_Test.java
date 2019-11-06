package org.java_websocket.server;

import org.java_websocket.server.DefaultWebSocketServerFactory;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DefaultWebSocketServerFactory_closeTest_4_Test {
  @Test
  public void closeTest() throws Exception {
    // Arrange
    DefaultWebSocketServerFactory defaultWebSocketServerFactory = new DefaultWebSocketServerFactory();

    // Act
    defaultWebSocketServerFactory.close();
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

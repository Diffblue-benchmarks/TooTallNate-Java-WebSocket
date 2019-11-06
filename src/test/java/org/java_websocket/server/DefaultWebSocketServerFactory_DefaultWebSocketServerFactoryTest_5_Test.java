package org.java_websocket.server;

import org.java_websocket.server.DefaultWebSocketServerFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DefaultWebSocketServerFactory_DefaultWebSocketServerFactoryTest_5_Test {
  @Test
  public void DefaultWebSocketServerFactoryTest() throws Exception {
    // Arrange and Act
    DefaultWebSocketServerFactory defaultWebSocketServerFactory = new DefaultWebSocketServerFactory();

    // Assert
    Assert.assertNotNull(defaultWebSocketServerFactory.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

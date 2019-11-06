package org.java_websocket.server;

import org.java_websocket.WebSocketAdapter;
import org.java_websocket.WebSocketImpl;
import org.java_websocket.drafts.Draft_6455;
import org.java_websocket.server.DefaultWebSocketServerFactory;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class DefaultWebSocketServerFactory_createWebSocketTest_1_Test {
  @Test
  public void createWebSocketTest() throws Exception {
    // Arrange
    DefaultWebSocketServerFactory defaultWebSocketServerFactory = new DefaultWebSocketServerFactory();
    WebSocketAdapter a = (WebSocketAdapter) null;
    Draft_6455 d = new Draft_6455();

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    defaultWebSocketServerFactory.createWebSocket(a, d);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}

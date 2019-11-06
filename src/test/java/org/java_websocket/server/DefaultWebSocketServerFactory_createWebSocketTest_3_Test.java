package org.java_websocket.server;

import java.util.ArrayList;
import org.java_websocket.WebSocketAdapter;
import org.java_websocket.WebSocketImpl;
import org.java_websocket.drafts.Draft;
import org.java_websocket.drafts.Draft_6455;
import org.java_websocket.server.DefaultWebSocketServerFactory;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class DefaultWebSocketServerFactory_createWebSocketTest_3_Test {
  @Test
  public void createWebSocketTest() throws Exception {
    // Arrange
    DefaultWebSocketServerFactory defaultWebSocketServerFactory = new DefaultWebSocketServerFactory();
    WebSocketAdapter a = (WebSocketAdapter) null;
    ArrayList<Draft> arrayList = new ArrayList<Draft>();
    arrayList.add(new Draft_6455());

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    defaultWebSocketServerFactory.createWebSocket(a, arrayList);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}

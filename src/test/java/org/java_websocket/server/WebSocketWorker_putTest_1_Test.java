package org.java_websocket.server;

import java.util.ArrayList;
import org.java_websocket.WebSocketImpl;
import org.java_websocket.drafts.Draft;
import org.java_websocket.drafts.Draft_6455;
import org.java_websocket.server.WebSocketServer;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class WebSocketWorker_putTest_1_Test {
  @Test
  public void putTest() throws Exception {
    // Arrange
    WebSocketServer.WebSocketWorker webSocketWorker = ((WebSocketServer) null).new WebSocketWorker();
    ArrayList<Draft> arrayList = new ArrayList<Draft>();
    arrayList.add(new Draft_6455());
    WebSocketImpl ws = (WebSocketImpl) null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    webSocketWorker.put(ws);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}

package org.java_websocket;

import org.java_websocket.WebSocketImpl;
import org.java_websocket.WebSocketListener;
import org.java_websocket.drafts.Draft_6455;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class WebSocketImpl_WebSocketImplTest_2_Test {
  @Test
  public void WebSocketImplTest() throws Exception {
    // Arrange
    WebSocketListener listener = (WebSocketListener) null;
    Draft_6455 draft = new Draft_6455();

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    new WebSocketImpl(listener, draft);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}

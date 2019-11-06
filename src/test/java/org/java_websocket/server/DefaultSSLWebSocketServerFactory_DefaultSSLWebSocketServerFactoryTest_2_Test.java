package org.java_websocket.server;

import javax.net.ssl.SSLContext;
import org.java_websocket.server.DefaultSSLWebSocketServerFactory;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class DefaultSSLWebSocketServerFactory_DefaultSSLWebSocketServerFactoryTest_2_Test {
  @Test
  public void DefaultSSLWebSocketServerFactoryTest() throws Exception {
    // Arrange
    SSLContext sslContext = (SSLContext) null;

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    new DefaultSSLWebSocketServerFactory(sslContext);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}

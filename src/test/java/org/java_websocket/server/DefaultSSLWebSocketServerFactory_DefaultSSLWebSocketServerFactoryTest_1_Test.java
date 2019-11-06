package org.java_websocket.server;

import java.util.concurrent.ForkJoinPool;
import javax.net.ssl.SSLContext;
import org.java_websocket.server.DefaultSSLWebSocketServerFactory;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class DefaultSSLWebSocketServerFactory_DefaultSSLWebSocketServerFactoryTest_1_Test {
  @Test
  public void DefaultSSLWebSocketServerFactoryTest() throws Exception {
    // Arrange
    SSLContext sslContext = (SSLContext) null;
    ForkJoinPool exec = new ForkJoinPool();

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    new DefaultSSLWebSocketServerFactory(sslContext, exec);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}

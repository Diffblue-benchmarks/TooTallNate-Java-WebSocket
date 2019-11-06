package org.java_websocket.server;

import java.util.concurrent.ForkJoinPool;
import javax.net.ssl.SSLContext;
import org.java_websocket.server.CustomSSLWebSocketServerFactory;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class CustomSSLWebSocketServerFactory_CustomSSLWebSocketServerFactoryTest_1_Test {
  @Test
  public void CustomSSLWebSocketServerFactoryTest() throws Exception {
    // Arrange
    SSLContext sslContext = (SSLContext) null;
    ForkJoinPool executerService = new ForkJoinPool();
    String string = "aaaaa";
    String[] enabledProtocols = new String[]{string, "aaaaa", "aaaaa"};
    String[] enabledCiphersuites = new String[]{"aaaaa", string};

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    new CustomSSLWebSocketServerFactory(sslContext, executerService, enabledProtocols, enabledCiphersuites);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}

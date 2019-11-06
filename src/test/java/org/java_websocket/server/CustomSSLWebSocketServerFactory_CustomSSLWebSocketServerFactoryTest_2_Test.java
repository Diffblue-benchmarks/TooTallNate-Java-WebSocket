package org.java_websocket.server;

import javax.net.ssl.SSLContext;
import org.java_websocket.server.CustomSSLWebSocketServerFactory;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class CustomSSLWebSocketServerFactory_CustomSSLWebSocketServerFactoryTest_2_Test {
  @Test
  public void CustomSSLWebSocketServerFactoryTest() throws Exception {
    // Arrange
    SSLContext sslContext = (SSLContext) null;
    String string = "aaaaa";
    String string1 = "aaaaa";
    String[] enabledProtocols = new String[]{string, string1, "aaaaa"};
    String[] enabledCiphersuites = new String[]{"aakaa", string, string1};

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    new CustomSSLWebSocketServerFactory(sslContext, enabledProtocols, enabledCiphersuites);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}

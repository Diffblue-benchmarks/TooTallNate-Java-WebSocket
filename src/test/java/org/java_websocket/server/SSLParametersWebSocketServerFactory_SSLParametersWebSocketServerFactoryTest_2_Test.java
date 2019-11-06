package org.java_websocket.server;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;
import org.java_websocket.server.SSLParametersWebSocketServerFactory;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class SSLParametersWebSocketServerFactory_SSLParametersWebSocketServerFactoryTest_2_Test {
  @Test
  public void SSLParametersWebSocketServerFactoryTest() throws Exception {
    // Arrange
    SSLContext sslContext = (SSLContext) null;
    SSLParameters sslParameters = new SSLParameters();

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    new SSLParametersWebSocketServerFactory(sslContext, sslParameters);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}

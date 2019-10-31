package org.java_websocket.server;

import org.java_websocket.server.DefaultSSLWebSocketServerFactory;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.util.concurrent.ForkJoinPool;
import javax.net.ssl.SSLContext;



public class DefaultSSLWebSocketServerFactoryTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNullNotNullOutputIllegalArgumentException99902d6aa812babacdd() {

    // Arrange
    final SSLContext arg0 = null;
    final ForkJoinPool arg1 = new ForkJoinPool();

    // Act, creating object to test constructor
    thrown.expect(IllegalArgumentException.class);
    new DefaultSSLWebSocketServerFactory(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNullOutputIllegalArgumentException999bad9465cb58ce291() {

    // Arrange
    final SSLContext arg0 = null;

    // Act, creating object to test constructor
    thrown.expect(IllegalArgumentException.class);
    new DefaultSSLWebSocketServerFactory(arg0);

    // The method is not expected to return due to exception thrown

  }
}

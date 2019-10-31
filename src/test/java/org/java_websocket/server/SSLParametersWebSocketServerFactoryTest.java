package org.java_websocket.server;

import org.java_websocket.server.SSLParametersWebSocketServerFactory;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.util.concurrent.ForkJoinPool;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;



public class SSLParametersWebSocketServerFactoryTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNullNotNullOutputIllegalArgumentException99964ca193968c6cbac() {

    // Arrange
    final SSLContext arg0 = null;
    final SSLParameters arg1 = new SSLParameters();

    // Act, creating object to test constructor
    thrown.expect(IllegalArgumentException.class);
    new SSLParametersWebSocketServerFactory(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNullNotNullNotNullOutputIllegalArgumentException9998a39dbe085168a7d() {

    // Arrange
    final SSLContext arg0 = null;
    final ForkJoinPool arg1 = new ForkJoinPool();
    final SSLParameters arg2 = new SSLParameters();

    // Act, creating object to test constructor
    thrown.expect(IllegalArgumentException.class);
    new SSLParametersWebSocketServerFactory(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }
}

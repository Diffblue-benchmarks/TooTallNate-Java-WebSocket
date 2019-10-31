package org.java_websocket;

import org.java_websocket.SSLSocketChannel2;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.io.IOException;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.concurrent.ForkJoinPool;
import javax.net.ssl.SSLEngine;



public class SSLSocketChannel2Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNullNullNotNullNullOutputIllegalArgumentException99963d2223b05dabdc3() throws IOException {

    // Arrange
    final SocketChannel arg0 = null;
    final SSLEngine arg1 = null;
    final ForkJoinPool arg2 = new ForkJoinPool();
    final SelectionKey arg3 = null;

    // Act, creating object to test constructor
    thrown.expect(IllegalArgumentException.class);
    new SSLSocketChannel2(arg0, arg1, arg2, arg3);

    // The method is not expected to return due to exception thrown

  }
}

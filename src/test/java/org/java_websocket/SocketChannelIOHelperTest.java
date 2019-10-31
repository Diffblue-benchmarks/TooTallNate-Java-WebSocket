package org.java_websocket;

import org.java_websocket.AbstractWrappedByteChannel;
import org.java_websocket.SocketChannelIOHelper;
import org.java_websocket.WebSocketImpl;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;



public class SocketChannelIOHelperTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void batchInputNullNotNullOutputFalse999527f07f4d618fbd5() throws IOException {

    // Arrange
    final WebSocketImpl arg0 = null;
    final AbstractWrappedByteChannel abstractWrappedByteChannel1 = new AbstractWrappedByteChannel((ByteChannel) null);
    final AbstractWrappedByteChannel abstractWrappedByteChannel = new AbstractWrappedByteChannel(abstractWrappedByteChannel1);
    final AbstractWrappedByteChannel arg1 = new AbstractWrappedByteChannel(abstractWrappedByteChannel);

    // Act
    final boolean actual = SocketChannelIOHelper.batch(arg0, arg1);

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void readMoreInputNullNullNotNullOutputNullPointerException999fcccc2012d9a32d0() throws IOException {

    // Arrange
    final ByteBuffer arg0 = null;
    final WebSocketImpl arg1 = null;
    final AbstractWrappedByteChannel abstractWrappedByteChannel2 = new AbstractWrappedByteChannel((ByteChannel) null);
    final AbstractWrappedByteChannel abstractWrappedByteChannel1 = new AbstractWrappedByteChannel(abstractWrappedByteChannel2);
    final AbstractWrappedByteChannel abstractWrappedByteChannel = new AbstractWrappedByteChannel(abstractWrappedByteChannel1);
    final AbstractWrappedByteChannel arg2 = new AbstractWrappedByteChannel(abstractWrappedByteChannel);

    // Act
    thrown.expect(NullPointerException.class);
    SocketChannelIOHelper.readMore(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void readInputNullNullNotNullOutputNullPointerException999cd118882eb68d7e6() throws IOException {

    // Arrange
    final ByteBuffer arg0 = null;
    final WebSocketImpl arg1 = null;
    final AbstractWrappedByteChannel abstractWrappedByteChannel1 = new AbstractWrappedByteChannel((ByteChannel) null);
    final AbstractWrappedByteChannel abstractWrappedByteChannel = new AbstractWrappedByteChannel(abstractWrappedByteChannel1);
    final AbstractWrappedByteChannel arg2 = new AbstractWrappedByteChannel(abstractWrappedByteChannel);

    // Act
    thrown.expect(NullPointerException.class);
    SocketChannelIOHelper.read(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }
}

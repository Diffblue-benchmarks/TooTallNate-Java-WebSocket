package org.java_websocket;

import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import org.java_websocket.AbstractWrappedByteChannel;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class AbstractWrappedByteChannel_readTest_3_Test {
  @Test
  public void readTest() throws Exception {
    // Arrange
    AbstractWrappedByteChannel abstractWrappedByteChannel = new AbstractWrappedByteChannel(
        new AbstractWrappedByteChannel(
            new AbstractWrappedByteChannel(new AbstractWrappedByteChannel((ByteChannel) null))));
    ByteBuffer dst = (ByteBuffer) null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    abstractWrappedByteChannel.read(dst);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}

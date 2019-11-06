package org.java_websocket;

import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import org.java_websocket.AbstractWrappedByteChannel;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class AbstractWrappedByteChannel_readMoreTest_9_Test {
  @Test
  public void readMoreTest() throws Exception {
    // Arrange
    AbstractWrappedByteChannel abstractWrappedByteChannel = new AbstractWrappedByteChannel(
        new AbstractWrappedByteChannel(
            new AbstractWrappedByteChannel(new AbstractWrappedByteChannel((ByteChannel) null))));
    ByteBuffer dst = (ByteBuffer) null;

    // Act
    int actual = abstractWrappedByteChannel.readMore(dst);

    // Assert
    Assert.assertEquals(0, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

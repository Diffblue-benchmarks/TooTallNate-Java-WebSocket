package org.java_websocket;

import java.nio.channels.ByteChannel;
import org.java_websocket.AbstractWrappedByteChannel;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class AbstractWrappedByteChannel_AbstractWrappedByteChannelTest_4_Test {
  @Test
  public void AbstractWrappedByteChannelTest() throws Exception {
    // Arrange
    AbstractWrappedByteChannel towrap = new AbstractWrappedByteChannel(new AbstractWrappedByteChannel(
        new AbstractWrappedByteChannel(new AbstractWrappedByteChannel((ByteChannel) null))));

    // Act
    AbstractWrappedByteChannel abstractWrappedByteChannel = new AbstractWrappedByteChannel(towrap);

    // Assert
    String toStringResult = abstractWrappedByteChannel.toString();
    boolean isNeedWriteResult = abstractWrappedByteChannel.isNeedWrite();
    boolean isBlockingResult = abstractWrappedByteChannel.isBlocking();
    Assert.assertNotNull(toStringResult);
    Assert.assertFalse(abstractWrappedByteChannel.isNeedRead());
    Assert.assertFalse(isBlockingResult);
    Assert.assertFalse(isNeedWriteResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

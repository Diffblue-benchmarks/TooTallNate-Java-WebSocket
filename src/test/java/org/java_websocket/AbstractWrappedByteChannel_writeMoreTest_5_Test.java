package org.java_websocket;

import java.nio.channels.ByteChannel;
import org.java_websocket.AbstractWrappedByteChannel;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class AbstractWrappedByteChannel_writeMoreTest_5_Test {
  @Test
  public void writeMoreTest() throws Exception {
    // Arrange
    AbstractWrappedByteChannel abstractWrappedByteChannel = new AbstractWrappedByteChannel(
        new AbstractWrappedByteChannel(
            new AbstractWrappedByteChannel(new AbstractWrappedByteChannel((ByteChannel) null))));

    // Act
    abstractWrappedByteChannel.writeMore();

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

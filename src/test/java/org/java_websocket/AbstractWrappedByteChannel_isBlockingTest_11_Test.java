package org.java_websocket;

import java.nio.channels.ByteChannel;
import org.java_websocket.AbstractWrappedByteChannel;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class AbstractWrappedByteChannel_isBlockingTest_11_Test {
  @Test
  public void isBlockingTest() throws Exception {
    // Arrange
    AbstractWrappedByteChannel abstractWrappedByteChannel = new AbstractWrappedByteChannel(
        new AbstractWrappedByteChannel(
            new AbstractWrappedByteChannel(new AbstractWrappedByteChannel((ByteChannel) null))));

    // Act
    boolean actual = abstractWrappedByteChannel.isBlocking();

    // Assert
    Assert.assertFalse(actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

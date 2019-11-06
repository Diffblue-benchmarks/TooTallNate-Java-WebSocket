package org.java_websocket;

import java.nio.channels.ByteChannel;
import org.java_websocket.AbstractWrappedByteChannel;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class AbstractWrappedByteChannel_closeTest_7_Test {
  @Test
  public void closeTest() throws Exception {
    // Arrange
    AbstractWrappedByteChannel abstractWrappedByteChannel = new AbstractWrappedByteChannel(
        new AbstractWrappedByteChannel(
            new AbstractWrappedByteChannel(new AbstractWrappedByteChannel((ByteChannel) null))));

    // Act and Assert
    thrown.expect(NullPointerException.class);
    abstractWrappedByteChannel.close();
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}

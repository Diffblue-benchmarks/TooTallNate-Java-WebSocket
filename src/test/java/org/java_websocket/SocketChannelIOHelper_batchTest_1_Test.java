package org.java_websocket;

import java.nio.channels.ByteChannel;
import java.util.ArrayList;
import org.java_websocket.AbstractWrappedByteChannel;
import org.java_websocket.SocketChannelIOHelper;
import org.java_websocket.WebSocketImpl;
import org.java_websocket.drafts.Draft;
import org.java_websocket.drafts.Draft_6455;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SocketChannelIOHelper_batchTest_1_Test {
  @Test
  public void batchTest() throws Exception {
    // Arrange
    ArrayList<Draft> arrayList = new ArrayList<Draft>();
    arrayList.add(new Draft_6455());
    WebSocketImpl ws = (WebSocketImpl) null;
    AbstractWrappedByteChannel sockchannel = new AbstractWrappedByteChannel(
        new AbstractWrappedByteChannel(new AbstractWrappedByteChannel((ByteChannel) null)));

    // Act
    boolean actual = SocketChannelIOHelper.batch(ws, sockchannel);

    // Assert
    Assert.assertFalse(actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

package org.java_websocket;

import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.util.ArrayList;
import org.java_websocket.AbstractWrappedByteChannel;
import org.java_websocket.SocketChannelIOHelper;
import org.java_websocket.WebSocketImpl;
import org.java_websocket.drafts.Draft;
import org.java_websocket.drafts.Draft_6455;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class SocketChannelIOHelper_readMoreTest_3_Test {
  @Test
  public void readMoreTest() throws Exception {
    // Arrange
    ByteBuffer buf = (ByteBuffer) null;
    ArrayList<Draft> arrayList = new ArrayList<Draft>();
    arrayList.add(new Draft_6455());
    WebSocketImpl ws = (WebSocketImpl) null;
    AbstractWrappedByteChannel channel = new AbstractWrappedByteChannel(new AbstractWrappedByteChannel(
        new AbstractWrappedByteChannel(new AbstractWrappedByteChannel((ByteChannel) null))));

    // Act and Assert
    thrown.expect(NullPointerException.class);
    SocketChannelIOHelper.readMore(buf, ws, channel);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}

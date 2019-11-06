package org.java_websocket.drafts;

import java.util.ArrayList;
import org.java_websocket.WebSocketImpl;
import org.java_websocket.drafts.Draft;
import org.java_websocket.drafts.Draft_6455;
import org.java_websocket.framing.BinaryFrame;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class Draft_6455_processFrameTest_21_Test {
  @Test
  public void processFrameTest() throws Exception {
    // Arrange
    Draft_6455 draft_6455 = new Draft_6455();
    ArrayList<Draft> arrayList = new ArrayList<Draft>();
    arrayList.add(new Draft_6455());
    WebSocketImpl webSocketImpl = (WebSocketImpl) null;
    BinaryFrame frame = new BinaryFrame();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    draft_6455.processFrame(webSocketImpl, frame);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}

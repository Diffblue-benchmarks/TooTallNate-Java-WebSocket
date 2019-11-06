package org.java_websocket.drafts;

import org.java_websocket.drafts.Draft_6455;
import org.java_websocket.enums.HandshakeState;
import org.java_websocket.handshake.HandshakeImpl1Client;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Draft_6455_acceptHandshakeAsServerTest_25_Test {
  @Test
  public void acceptHandshakeAsServerTest() throws Exception {
    // Arrange
    Draft_6455 draft_6455 = new Draft_6455();
    HandshakeImpl1Client handshakedata = new HandshakeImpl1Client();

    // Act
    HandshakeState actual = draft_6455.acceptHandshakeAsServer(handshakedata);

    // Assert
    Assert.assertEquals(HandshakeState.NOT_MATCHED, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

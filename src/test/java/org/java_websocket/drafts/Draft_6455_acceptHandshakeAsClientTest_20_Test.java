package org.java_websocket.drafts;

import org.java_websocket.drafts.Draft_6455;
import org.java_websocket.enums.HandshakeState;
import org.java_websocket.handshake.HandshakeImpl1Client;
import org.java_websocket.handshake.HandshakeImpl1Server;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Draft_6455_acceptHandshakeAsClientTest_20_Test {
  @Test
  public void acceptHandshakeAsClientTest() throws Exception {
    // Arrange
    Draft_6455 draft_6455 = new Draft_6455();
    HandshakeImpl1Client request = new HandshakeImpl1Client();
    HandshakeImpl1Server response = new HandshakeImpl1Server();

    // Act
    HandshakeState actual = draft_6455.acceptHandshakeAsClient(request, response);

    // Assert
    Assert.assertEquals(HandshakeState.NOT_MATCHED, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

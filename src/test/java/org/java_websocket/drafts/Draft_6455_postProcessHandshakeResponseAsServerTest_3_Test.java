package org.java_websocket.drafts;

import org.java_websocket.drafts.Draft_6455;
import org.java_websocket.handshake.HandshakeBuilder;
import org.java_websocket.handshake.HandshakeImpl1Client;
import org.java_websocket.handshake.HandshakeImpl1Server;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Draft_6455_postProcessHandshakeResponseAsServerTest_3_Test {
  @Test
  public void postProcessHandshakeResponseAsServerTest() throws Exception {
    // Arrange
    Draft_6455 draft_6455 = new Draft_6455();
    HandshakeImpl1Client request = new HandshakeImpl1Client();
    HandshakeImpl1Server response = new HandshakeImpl1Server();

    // Act
    HandshakeBuilder actual = draft_6455.postProcessHandshakeResponseAsServer(request, response);

    // Assert
    Assert.assertTrue(actual instanceof HandshakeImpl1Server);
    String httpStatusMessage = ((HandshakeImpl1Server) actual).getHttpStatusMessage();
    short httpStatus = ((HandshakeImpl1Server) actual).getHttpStatus();
    String toStringResult = ((HandshakeImpl1Server) actual).toString();
    Assert.assertEquals("Web Socket Protocol Handshake", httpStatusMessage);
    Assert.assertEquals(null, actual.getContent());
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals((short) 0, httpStatus);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

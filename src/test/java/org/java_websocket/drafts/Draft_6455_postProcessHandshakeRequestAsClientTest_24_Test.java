package org.java_websocket.drafts;

import org.java_websocket.drafts.Draft_6455;
import org.java_websocket.handshake.ClientHandshakeBuilder;
import org.java_websocket.handshake.HandshakeImpl1Client;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Draft_6455_postProcessHandshakeRequestAsClientTest_24_Test {
  @Test
  public void postProcessHandshakeRequestAsClientTest() throws Exception {
    // Arrange
    Draft_6455 draft_6455 = new Draft_6455();
    HandshakeImpl1Client request = new HandshakeImpl1Client();

    // Act
    ClientHandshakeBuilder actual = draft_6455.postProcessHandshakeRequestAsClient(request);

    // Assert
    Assert.assertTrue(actual instanceof HandshakeImpl1Client);
    String toStringResult = ((HandshakeImpl1Client) actual).toString();
    byte[] content = actual.getContent();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals("*", actual.getResourceDescriptor());
    Assert.assertEquals(null, content);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

package org.java_websocket.drafts;

import java.util.List;
import org.java_websocket.drafts.Draft_6455;
import org.java_websocket.protocols.IProtocol;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Draft_6455_getKnownProtocolsTest_15_Test {
  @Test
  public void getKnownProtocolsTest() throws Exception {
    // Arrange
    Draft_6455 draft_6455 = new Draft_6455();

    // Act
    List<IProtocol> actual = draft_6455.getKnownProtocols();

    // Assert
    Assert.assertTrue(actual instanceof java.util.ArrayList);
    Assert.assertEquals(1, actual.size());
    IProtocol getResult = actual.get(0);
    Assert.assertTrue(getResult instanceof org.java_websocket.protocols.Protocol);
    String toStringResult = getResult.toString();
    Assert.assertEquals("", toStringResult);
    Assert.assertEquals("", getResult.getProvidedProtocol());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

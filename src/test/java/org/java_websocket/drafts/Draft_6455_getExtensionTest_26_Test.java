package org.java_websocket.drafts;

import org.java_websocket.drafts.Draft_6455;
import org.java_websocket.extensions.IExtension;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Draft_6455_getExtensionTest_26_Test {
  @Test
  public void getExtensionTest() throws Exception {
    // Arrange
    Draft_6455 draft_6455 = new Draft_6455();

    // Act
    IExtension actual = draft_6455.getExtension();

    // Assert
    Assert.assertTrue(actual instanceof org.java_websocket.extensions.DefaultExtension);
    String toStringResult = actual.toString();
    String providedExtensionAsClient = actual.getProvidedExtensionAsClient();
    Assert.assertEquals("DefaultExtension", toStringResult);
    Assert.assertEquals("", actual.getProvidedExtensionAsServer());
    Assert.assertEquals("", providedExtensionAsClient);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

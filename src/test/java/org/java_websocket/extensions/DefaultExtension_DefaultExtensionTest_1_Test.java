package org.java_websocket.extensions;

import org.java_websocket.extensions.DefaultExtension;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DefaultExtension_DefaultExtensionTest_1_Test {
  @Test
  public void DefaultExtensionTest() throws Exception {
    // Arrange and Act
    DefaultExtension defaultExtension = new DefaultExtension();

    // Assert
    String toStringResult = defaultExtension.toString();
    String providedExtensionAsClient = defaultExtension.getProvidedExtensionAsClient();
    Assert.assertEquals("DefaultExtension", toStringResult);
    Assert.assertEquals("", defaultExtension.getProvidedExtensionAsServer());
    Assert.assertEquals("", providedExtensionAsClient);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

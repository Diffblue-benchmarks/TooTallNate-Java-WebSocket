package org.java_websocket.extensions;

import org.java_websocket.extensions.DefaultExtension;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DefaultExtension_resetTest_4_Test {
  @Test
  public void resetTest() throws Exception {
    // Arrange
    DefaultExtension defaultExtension = new DefaultExtension();

    // Act
    defaultExtension.reset();

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

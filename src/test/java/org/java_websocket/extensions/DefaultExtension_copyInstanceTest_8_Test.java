package org.java_websocket.extensions;

import org.java_websocket.extensions.DefaultExtension;
import org.java_websocket.extensions.IExtension;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DefaultExtension_copyInstanceTest_8_Test {
  @Test
  public void copyInstanceTest() throws Exception {
    // Arrange
    DefaultExtension defaultExtension = new DefaultExtension();

    // Act
    IExtension actual = defaultExtension.copyInstance();

    // Assert
    Assert.assertTrue(actual instanceof DefaultExtension);
    String toStringResult = actual.toString();
    String providedExtensionAsClient = actual.getProvidedExtensionAsClient();
    Assert.assertEquals("DefaultExtension", toStringResult);
    Assert.assertEquals("", actual.getProvidedExtensionAsServer());
    Assert.assertEquals("", providedExtensionAsClient);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

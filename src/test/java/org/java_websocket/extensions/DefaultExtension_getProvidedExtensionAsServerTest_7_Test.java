package org.java_websocket.extensions;

import org.java_websocket.extensions.DefaultExtension;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DefaultExtension_getProvidedExtensionAsServerTest_7_Test {
  @Test
  public void getProvidedExtensionAsServerTest() throws Exception {
    // Arrange
    DefaultExtension defaultExtension = new DefaultExtension();

    // Act
    String actual = defaultExtension.getProvidedExtensionAsServer();

    // Assert
    Assert.assertEquals("", actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

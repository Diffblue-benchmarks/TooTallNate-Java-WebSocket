package org.java_websocket.extensions;

import org.java_websocket.extensions.DefaultExtension;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DefaultExtension_getProvidedExtensionAsClientTest_6_Test {
  @Test
  public void getProvidedExtensionAsClientTest() throws Exception {
    // Arrange
    DefaultExtension defaultExtension = new DefaultExtension();

    // Act
    String actual = defaultExtension.getProvidedExtensionAsClient();

    // Assert
    Assert.assertEquals("", actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

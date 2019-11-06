package org.java_websocket.extensions;

import org.java_websocket.extensions.DefaultExtension;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DefaultExtension_acceptProvidedExtensionAsServerTest_13_Test {
  @Test
  public void acceptProvidedExtensionAsServerTest() throws Exception {
    // Arrange
    DefaultExtension defaultExtension = new DefaultExtension();
    String inputExtension = " RSV2: ";

    // Act
    boolean actual = defaultExtension.acceptProvidedExtensionAsServer(inputExtension);

    // Assert
    Assert.assertTrue(actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

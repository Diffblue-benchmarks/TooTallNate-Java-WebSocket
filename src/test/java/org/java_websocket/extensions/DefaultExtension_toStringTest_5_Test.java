package org.java_websocket.extensions;

import org.java_websocket.extensions.DefaultExtension;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DefaultExtension_toStringTest_5_Test {
  @Test
  public void toStringTest() throws Exception {
    // Arrange
    DefaultExtension defaultExtension = new DefaultExtension();

    // Act
    String actual = defaultExtension.toString();

    // Assert
    Assert.assertEquals("DefaultExtension", actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

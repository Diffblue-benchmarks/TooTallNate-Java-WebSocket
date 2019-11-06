package org.java_websocket.extensions;

import org.java_websocket.extensions.DefaultExtension;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DefaultExtension_equalsTest_11_Test {
  @Test
  public void equalsTest() throws Exception {
    // Arrange
    DefaultExtension defaultExtension = new DefaultExtension();
    String o = " RSV2: ";

    // Act
    boolean actual = defaultExtension.equals(o);

    // Assert
    Assert.assertFalse(actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

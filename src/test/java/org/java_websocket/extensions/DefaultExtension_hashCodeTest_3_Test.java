package org.java_websocket.extensions;

import org.java_websocket.extensions.DefaultExtension;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DefaultExtension_hashCodeTest_3_Test {
  @Test
  public void hashCodeTest() throws Exception {
    // Arrange
    DefaultExtension defaultExtension = new DefaultExtension();

    // Act
    int actual = defaultExtension.hashCode();

    // Assert
    Assert.assertEquals(1151421920, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

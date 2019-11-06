package org.java_websocket.util;

import org.java_websocket.util.NamedThreadFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class NamedThreadFactory_NamedThreadFactoryTest_1_Test {
  @Test
  public void NamedThreadFactoryTest() throws Exception {
    // Arrange
    String threadPrefix = "aaaaa";

    // Act
    NamedThreadFactory namedThreadFactory = new NamedThreadFactory(threadPrefix);

    // Assert
    Assert.assertNotNull(namedThreadFactory.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

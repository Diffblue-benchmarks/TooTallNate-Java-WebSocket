package org.java_websocket.util;

import java.io.ByteArrayOutputStream;
import org.java_websocket.util.Base64;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class OutputStream_closeTest_1_Test {
  @Test
  public void closeTest() throws Exception {
    // Arrange
    Base64.OutputStream outputStream = new Base64.OutputStream(new ByteArrayOutputStream());

    // Act
    outputStream.close();

    // Assert
    Assert.assertNotNull(outputStream.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

package org.java_websocket.util;

import java.io.ByteArrayOutputStream;
import org.java_websocket.util.Base64;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class OutputStream_writeTest_4_Test {
  @Test
  public void writeTest() throws Exception {
    // Arrange
    Base64.OutputStream outputStream = new Base64.OutputStream(new ByteArrayOutputStream());
    int theByte = -5;

    // Act
    outputStream.write(theByte);

    // Assert
    Assert.assertNotNull(outputStream.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

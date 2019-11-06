package org.java_websocket.util;

import java.io.ByteArrayOutputStream;
import org.java_websocket.util.Base64;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class OutputStream_flushBase64Test_5_Test {
  @Test
  public void flushBase64Test() throws Exception {
    // Arrange
    Base64.OutputStream outputStream = new Base64.OutputStream(new ByteArrayOutputStream());

    // Act
    outputStream.flushBase64();

    // Assert
    Assert.assertNotNull(outputStream.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

package org.java_websocket.util;

import java.io.ByteArrayOutputStream;
import org.java_websocket.util.Base64;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class OutputStream_Base64$OutputStreamTest_3_Test {
  @Test
  public void Base64$OutputStreamTest() throws Exception {
    // Arrange
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    int options = -5;

    // Act
    Base64.OutputStream outputStream = new Base64.OutputStream(out, options);

    // Assert
    Assert.assertNotNull(outputStream.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

package org.java_websocket.util;

import java.io.ByteArrayOutputStream;
import org.java_websocket.util.Base64;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class OutputStream_writeTest_6_Test {
  @Test
  public void writeTest() throws Exception {
    // Arrange
    Base64.OutputStream outputStream = new Base64.OutputStream(new ByteArrayOutputStream());
    byte[] byteArray = new byte[]{-5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5,
        -5, -5, -5};
    int off = -5;
    int len = -5;

    // Act
    outputStream.write(byteArray, off, len);

    // Assert
    Assert.assertEquals(24, byteArray.length);
    Assert.assertEquals((byte) -5, byteArray[0]);
    Assert.assertEquals((byte) -5, byteArray[1]);
    Assert.assertEquals((byte) -5, byteArray[2]);
    Assert.assertEquals((byte) -5, byteArray[3]);
    Assert.assertEquals((byte) -5, byteArray[4]);
    Assert.assertEquals((byte) -5, byteArray[5]);
    Assert.assertEquals((byte) -5, byteArray[18]);
    Assert.assertEquals((byte) -5, byteArray[19]);
    Assert.assertEquals((byte) -5, byteArray[20]);
    Assert.assertEquals((byte) -5, byteArray[21]);
    Assert.assertEquals((byte) -5, byteArray[22]);
    Assert.assertEquals((byte) -5, byteArray[23]);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

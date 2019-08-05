package org.java_websocket.util;

import org.java_websocket.util.Base64;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.io.IOException;

public class Base64Test {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  /* testedClasses: Base64 */
  // Test written by Diffblue Cover.
  @Test
  public void encodeBytesInput3OutputNotNull() {

    // Arrange
    final byte[] source = {-32, 27, 90};

    // Act
    final String actual = Base64.encodeBytes(source);

    // Assert result
    Assert.assertEquals("4Bta", actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void encodeBytesInputNullPositivePositivePositiveOutputIllegalArgumentException()
      throws IOException {

    // Arrange
    final byte[] source = null;
    final int off = 3;
    final int len = 9;
    final int options = 42;

    // Act
    thrown.expect(IllegalArgumentException.class);
    Base64.encodeBytes(source, off, len, options);

    // Method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void encodeBytesToBytesInput1NegativePositivePositiveOutputIllegalArgumentException()
      throws IOException {

    // Arrange
    final byte[] source = {0};
    final int off = -32;
    final int len = 57;
    final int options = 8;

    // Act
    thrown.expect(IllegalArgumentException.class);
    Base64.encodeBytesToBytes(source, off, len, options);

    // Method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void encodeBytesToBytesInput1PositivePositivePositiveOutputIllegalArgumentException()
      throws IOException {

    // Arrange
    final byte[] source = {0};
    final int off = 1;
    final int len = 57;
    final int options = 8;

    // Act
    thrown.expect(IllegalArgumentException.class);
    Base64.encodeBytesToBytes(source, off, len, options);

    // Method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void encodeBytesToBytesInput3ZeroPositivePositiveOutput4() throws IOException {

    // Arrange
    final byte[] source = {100, -21, -11};
    final int off = 0;
    final int len = 3;
    final int options = 8;

    // Act
    final byte[] actual = Base64.encodeBytesToBytes(source, off, len, options);

    // Assert result
    Assert.assertArrayEquals(new byte[] {90, 79, 118, 49}, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void encodeBytesToBytesInput5PositiveNegativePositiveOutputIllegalArgumentException()
      throws IOException {

    // Arrange
    final byte[] source = {0, 0, 0, 0, 0};
    final int off = 500082752;
    final int len = -500082747;
    final int options = 8;

    // Act
    thrown.expect(IllegalArgumentException.class);
    Base64.encodeBytesToBytes(source, off, len, options);

    // Method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void encodeBytesToBytesInput15PositivePositivePositiveOutput20() throws IOException {

    // Arrange
    final byte[] source = {4,  -72, 2, -64,  -46,
                           14, 1,   6, 70,   -128,
                           0,  14,  0, -124, 1};
    final int off = 1;
    final int len = 14;
    final int options = 32;

    // Act
    final byte[] actual = Base64.encodeBytesToBytes(source, off, len, options);

    // Assert result
    Assert.assertEquals("i-A-oVs00ZP---s-W-3=", new String(actual, "ascii"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void encodeBytesToBytesInputNullPositivePositivePositiveOutputIllegalArgumentException()
      throws IOException {

    // Arrange
    final byte[] source = null;
    final int off = 3;
    final int len = 7;
    final int options = 10;

    // Act
    thrown.expect(IllegalArgumentException.class);
    Base64.encodeBytesToBytes(source, off, len, options);

    // Method is not expected to return due to exception thrown
  }
}

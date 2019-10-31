package org.java_websocket.util;

import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.util.Charsetfunctions;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.nio.ByteBuffer;



public class CharsetfunctionsTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void asciiBytesInputNotNullOutput5999930557836d4f5020() {

    // Arrange
    final String arg0 = "ASCII";

    // Act
    final byte[] actual = Charsetfunctions.asciiBytes(arg0);

    // Assert result
    Assert.assertArrayEquals(new byte[]{ (short) 65, (short) 83, (short) 67, (short) 73, (short) 73 }, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isValidUTF8InputNullZeroOutputNullPointerException9995bf5aeb4f19ec0b9() {

    // Arrange
    final ByteBuffer arg0 = null;
    final int arg1 = 0;

    // Act
    thrown.expect(NullPointerException.class);
    Charsetfunctions.isValidUTF8(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void isValidUTF8InputNullOutputNullPointerException999a888bde3c5a9823b() {

    // Arrange
    final ByteBuffer arg0 = null;

    // Act
    thrown.expect(NullPointerException.class);
    Charsetfunctions.isValidUTF8(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void stringAsciiInput24ZeroZeroOutputNotNull999164c999313a130b1() {

    // Arrange
    final byte[] arg0 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final int arg1 = 0;
    final int arg2 = 0;

    // Act
    final String actual = Charsetfunctions.stringAscii(arg0, arg1, arg2);

    // Assert result
    Assert.assertEquals("", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void stringAsciiInput24OutputNotNull999d1f76b6d4c258789() {

    // Arrange
    final byte[] arg0 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };

    // Act
    final String actual = Charsetfunctions.stringAscii(arg0);

    // Assert result
    Assert.assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void stringUtf8Input24OutputNotNull999a821ed537c7e71ea() throws InvalidDataException {

    // Arrange
    final byte[] arg0 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };

    // Act
    final String actual = Charsetfunctions.stringUtf8(arg0);

    // Assert result
    Assert.assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void stringUtf8InputNullOutputNullPointerException9995350db592babf157() throws InvalidDataException {

    // Arrange
    final ByteBuffer arg0 = null;

    // Act
    thrown.expect(NullPointerException.class);
    Charsetfunctions.stringUtf8(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void utf8BytesInputNotNullOutput5999016e20daf2dfb1f2() {

    // Arrange
    final String arg0 = "ASCII";

    // Act
    final byte[] actual = Charsetfunctions.utf8Bytes(arg0);

    // Assert result
    Assert.assertArrayEquals(new byte[]{ (short) 65, (short) 83, (short) 67, (short) 73, (short) 73 }, actual);

  }
}

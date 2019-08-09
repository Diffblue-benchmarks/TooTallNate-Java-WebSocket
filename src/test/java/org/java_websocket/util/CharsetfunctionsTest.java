package org.java_websocket.util;

import org.java_websocket.exceptions.InvalidDataException;
import org.junit.Assert;
import org.junit.Test;

import java.nio.ByteBuffer;

public class CharsetfunctionsTest {

  @Test
  public void testAsciiBytes() {
    Assert.assertArrayEquals(new byte[] {102, 111, 111}, Charsetfunctions.asciiBytes("foo"));
  }

  @Test
  public void testStringUtf8ByteBuffer() throws InvalidDataException {
    Assert.assertEquals("foo", Charsetfunctions.stringUtf8(ByteBuffer.wrap(new byte[] {102, 111, 111})));
  }


  @Test
  public void testIsValidUTF8off() {
    Assert.assertFalse(Charsetfunctions.isValidUTF8(ByteBuffer.wrap(new byte[] {100}), 2));
    Assert.assertFalse(Charsetfunctions.isValidUTF8(ByteBuffer.wrap(new byte[] {(byte) 128}), 0));

    Assert.assertTrue(Charsetfunctions.isValidUTF8(ByteBuffer.wrap(new byte[] {100}), 0));
  }

  @Test
  public void testIsValidUTF8() {
    Assert.assertFalse(Charsetfunctions.isValidUTF8(ByteBuffer.wrap(new byte[] {(byte) 128})));

    Assert.assertTrue(Charsetfunctions.isValidUTF8(ByteBuffer.wrap(new byte[] {100})));
  }

  @Test
  public void testStringAscii1() {
    Assert.assertEquals("oBar", Charsetfunctions.stringAscii(new byte[] {102, 111, 111, 66, 97, 114}, 2, 4));

  }

  @Test
  public void testStringAscii2() {
    Assert.assertEquals("foo", Charsetfunctions.stringAscii(new byte[] {102, 111, 111}));
  }

  @Test
  public void testUtf8Bytes() {
    Assert.assertArrayEquals(new byte[] {102, 111, 111, 66, 97, 114}, Charsetfunctions.utf8Bytes("fooBar"));
  }
}

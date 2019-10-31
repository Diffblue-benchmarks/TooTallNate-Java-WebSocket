package org.java_websocket.util;

import com.diffblue.deeptestutils.Reflector;
import org.java_websocket.util.Base64.OutputStream;
import org.java_websocket.util.Base64;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;



public class Base64Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void encodeBytesInput24NegativeNegativeNegativeOutputIllegalArgumentException9997898eb6e2777b3fb() throws IOException {

    // Arrange
    final byte[] arg0 = { (short) -9, (short) -9, (short) -9, (short) -9, (short) -9, (short) -9, (short) -9, (short) -9, (short) -9, (short) -9, (short) -9, (short) -9, (short) -9, (short) -9, (short) -9, (short) -9, (short) -9, (short) -9, (short) -9, (short) -9, (short) -9, (short) -9, (short) -9, (short) -9 };
    final int arg1 = -9;
    final int arg2 = -9;
    final int arg3 = -9;

    // Act
    thrown.expect(IllegalArgumentException.class);
    Base64.encodeBytes(arg0, arg1, arg2, arg3);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void encodeBytesInput24OutputNotNull999f976dcc2f148abdb() {

    // Arrange
    final byte[] arg0 = { (short) -9, (short) -9, (short) -9, (short) -9, (short) -9, (short) -9, (short) -9, (short) -9, (short) -9, (short) -9, (short) -9, (short) -9, (short) -9, (short) -9, (short) -9, (short) -9, (short) -9, (short) -9, (short) -9, (short) -9, (short) -9, (short) -9, (short) -9, (short) -9 };

    // Act
    final String actual = Base64.encodeBytes(arg0);

    // Assert result
    Assert.assertEquals("9/f39/f39/f39/f39/f39/f39/f39/f3", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void encodeBytesToBytesInput24NegativeNegativeNegativeOutputIllegalArgumentException99913c7341750c0a95f() throws IOException {

    // Arrange
    final byte[] arg0 = { (short) -9, (short) -9, (short) -9, (short) -9, (short) -9, (short) -9, (short) -9, (short) -9, (short) -9, (short) -9, (short) -9, (short) -9, (short) -9, (short) -9, (short) -9, (short) -9, (short) -9, (short) -9, (short) -9, (short) -9, (short) -9, (short) -9, (short) -9, (short) -9 };
    final int arg1 = -9;
    final int arg2 = -9;
    final int arg3 = -9;

    // Act
    thrown.expect(IllegalArgumentException.class);
    Base64.encodeBytesToBytes(arg0, arg1, arg2, arg3);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void closeOutputVoid999aa236847d11d68e3() throws IOException {

    // Arrange
    final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    final Base64.OutputStream thisObj = new Base64.OutputStream(byteArrayOutputStream);

    // Act
    thisObj.close();

    // Assert side effects
    Assert.assertNull(Reflector.getInstanceField(thisObj, "out"));

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNegativeOutputNotNull9995f037938ce532e76() {

    // Arrange
    final ByteArrayOutputStream arg0 = new ByteArrayOutputStream();
    final int arg1 = -5;

    // Act, creating object to test constructor
    final Base64.OutputStream actual = new Base64.OutputStream(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(Reflector.getInstanceField(actual, "out"));
    Assert.assertArrayEquals(new byte[]{ (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 }, ((byte[]) Reflector.getInstanceField(Reflector.getInstanceField(actual, "out"), "buf")));
    Assert.assertEquals(0, ((ByteArrayOutputStream) Reflector.getInstanceField(actual, "out")).size());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull9998ca71f3f5c6bf54a() {

    // Arrange
    final ByteArrayOutputStream arg0 = new ByteArrayOutputStream();

    // Act, creating object to test constructor
    final Base64.OutputStream actual = new Base64.OutputStream(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(Reflector.getInstanceField(actual, "out"));
    Assert.assertArrayEquals(new byte[]{ (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 }, ((byte[]) Reflector.getInstanceField(Reflector.getInstanceField(actual, "out"), "buf")));
    Assert.assertEquals(0, ((ByteArrayOutputStream) Reflector.getInstanceField(actual, "out")).size());

  }

  // Test written by Diffblue Cover
  @Test
  public void flushBase64OutputVoid999de5f20170ee685b0() throws IOException {

    // Arrange
    final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    final Base64.OutputStream thisObj = new Base64.OutputStream(byteArrayOutputStream);

    // Act
    thisObj.flushBase64();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void writeInput24NegativeNegativeOutputVoid999cfa7b7ef9363d767() throws IOException {

    // Arrange
    final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    final Base64.OutputStream thisObj = new Base64.OutputStream(byteArrayOutputStream);
    final byte[] arg0 = { (short) -5, (short) -5, (short) -5, (short) -5, (short) -5, (short) -5, (short) -5, (short) -5, (short) -5, (short) -5, (short) -5, (short) -5, (short) -5, (short) -5, (short) -5, (short) -5, (short) -5, (short) -5, (short) -5, (short) -5, (short) -5, (short) -5, (short) -5, (short) -5 };
    final int arg1 = -5;
    final int arg2 = -5;

    // Act
    thisObj.write(arg0, arg1, arg2);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void writeInputNegativeOutputVoid999761169608e263d60() throws IOException {

    // Arrange
    final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    final Base64.OutputStream thisObj = new Base64.OutputStream(byteArrayOutputStream);
    final int arg0 = -5;

    // Act
    thisObj.write(arg0);

    // The method returns void, testing that no exception is thrown

  }
}

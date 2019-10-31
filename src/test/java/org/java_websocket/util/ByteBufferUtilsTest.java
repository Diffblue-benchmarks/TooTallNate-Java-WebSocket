package org.java_websocket.util;

import com.diffblue.deeptestutils.Reflector;
import org.java_websocket.util.ByteBufferUtils;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.nio.ByteBuffer;



public class ByteBufferUtilsTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void getEmptyByteBufferOutputNotNull999da0bd523c56c57e8() {

    // Act
    final ByteBuffer actual = ByteBufferUtils.getEmptyByteBuffer();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertArrayEquals(new byte[]{ }, ((byte[]) Reflector.getInstanceField(actual, "hb")));
    Assert.assertFalse((Boolean) Reflector.getInstanceField(actual, "isReadOnly"));
    Assert.assertTrue((Boolean) Reflector.getInstanceField(actual, "bigEndian"));
    Assert.assertFalse((Boolean) Reflector.getInstanceField(actual, "nativeByteOrder"));
    Assert.assertEquals(0, Reflector.getInstanceField(actual, "offset"));
    Assert.assertEquals(0L, Reflector.getInstanceField(actual, "address"));

  }

  // Test written by Diffblue Cover
  @Test
  public void transferByteBufferInputNullNullOutputIllegalArgumentException999c826038f923356dd() {

    // Arrange
    final ByteBuffer arg0 = null;
    final ByteBuffer arg1 = null;

    // Act
    thrown.expect(IllegalArgumentException.class);
    ByteBufferUtils.transferByteBuffer(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }
}

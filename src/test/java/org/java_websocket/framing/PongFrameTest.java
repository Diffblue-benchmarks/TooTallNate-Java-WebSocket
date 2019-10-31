package org.java_websocket.framing;

import com.diffblue.deeptestutils.Reflector;
import org.java_websocket.enums.Opcode;
import org.java_websocket.framing.PingFrame;
import org.java_websocket.framing.PongFrame;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class PongFrameTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999e3e5842fd2c7959d() {

    // Act, creating object to test constructor
    final PongFrame actual = new PongFrame();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertFalse(actual.isRSV3());
    Assert.assertFalse(actual.isRSV2());
    Assert.assertTrue(actual.isFin());
    Assert.assertFalse(actual.isRSV1());
    Assert.assertEquals(Opcode.PONG, actual.getOpcode());
    Assert.assertFalse(actual.getTransfereMasked());
    Assert.assertNotNull(actual.getPayloadData());
    Assert.assertArrayEquals(new byte[]{ }, ((byte[]) Reflector.getInstanceField(actual.getPayloadData(), "hb")));
    Assert.assertFalse((Boolean) Reflector.getInstanceField(actual.getPayloadData(), "isReadOnly"));
    Assert.assertTrue((Boolean) Reflector.getInstanceField(actual.getPayloadData(), "bigEndian"));
    Assert.assertFalse((Boolean) Reflector.getInstanceField(actual.getPayloadData(), "nativeByteOrder"));
    Assert.assertEquals(0, Reflector.getInstanceField(actual.getPayloadData(), "offset"));
    Assert.assertEquals(0L, Reflector.getInstanceField(actual.getPayloadData(), "address"));

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull999322cea870fe69b58() {

    // Arrange
    final PingFrame arg0 = new PingFrame();

    // Act, creating object to test constructor
    final PongFrame actual = new PongFrame(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertFalse(actual.isRSV3());
    Assert.assertFalse(actual.isRSV2());
    Assert.assertTrue(actual.isFin());
    Assert.assertFalse(actual.isRSV1());
    Assert.assertEquals(Opcode.PONG, actual.getOpcode());
    Assert.assertFalse(actual.getTransfereMasked());
    Assert.assertNotNull(actual.getPayloadData());
    Assert.assertArrayEquals(new byte[]{ }, ((byte[]) Reflector.getInstanceField(actual.getPayloadData(), "hb")));
    Assert.assertFalse((Boolean) Reflector.getInstanceField(actual.getPayloadData(), "isReadOnly"));
    Assert.assertTrue((Boolean) Reflector.getInstanceField(actual.getPayloadData(), "bigEndian"));
    Assert.assertFalse((Boolean) Reflector.getInstanceField(actual.getPayloadData(), "nativeByteOrder"));
    Assert.assertEquals(0, Reflector.getInstanceField(actual.getPayloadData(), "offset"));
    Assert.assertEquals(0L, Reflector.getInstanceField(actual.getPayloadData(), "address"));

  }
}

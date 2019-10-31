package org.java_websocket.framing;

import com.diffblue.deeptestutils.Reflector;
import org.java_websocket.enums.Opcode;
import org.java_websocket.framing.BinaryFrame;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class BinaryFrameTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999e0726654e5f8a0be() {

    // Act, creating object to test constructor
    final BinaryFrame actual = new BinaryFrame();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertFalse(actual.isRSV3());
    Assert.assertFalse(actual.isRSV2());
    Assert.assertTrue(actual.isFin());
    Assert.assertFalse(actual.isRSV1());
    Assert.assertEquals(Opcode.BINARY, actual.getOpcode());
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

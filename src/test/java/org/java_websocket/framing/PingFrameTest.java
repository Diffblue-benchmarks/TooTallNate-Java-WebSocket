package org.java_websocket.framing;

import com.diffblue.deeptestutils.Reflector;
import org.java_websocket.enums.Opcode;
import org.java_websocket.framing.PingFrame;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class PingFrameTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999a9772a4f96584810() {

    // Act, creating object to test constructor
    final PingFrame actual = new PingFrame();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertFalse(actual.isRSV3());
    Assert.assertFalse(actual.isRSV2());
    Assert.assertTrue(actual.isFin());
    Assert.assertFalse(actual.isRSV1());
    Assert.assertEquals(Opcode.PING, actual.getOpcode());
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

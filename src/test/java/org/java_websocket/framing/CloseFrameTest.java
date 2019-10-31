package org.java_websocket.framing;

import com.diffblue.deeptestutils.Reflector;
import org.java_websocket.enums.Opcode;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.framing.CloseFrame;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.nio.ByteBuffer;



public class CloseFrameTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999d7821dd36dc52e3e() {

    // Act, creating object to test constructor
    final CloseFrame actual = new CloseFrame();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1000, actual.getCloseCode());
    Assert.assertEquals("", actual.getMessage());
    Assert.assertFalse(actual.isRSV3());
    Assert.assertFalse(actual.isRSV2());
    Assert.assertTrue(actual.isFin());
    Assert.assertFalse(actual.isRSV1());
    Assert.assertEquals(Opcode.CLOSING, actual.getOpcode());
    Assert.assertFalse(actual.getTransfereMasked());
    Assert.assertNotNull(actual.getPayloadData());
    Assert.assertArrayEquals(new byte[]{ (short) 3, (short) -24 }, ((byte[]) Reflector.getInstanceField(actual.getPayloadData(), "hb")));
    Assert.assertFalse((Boolean) Reflector.getInstanceField(actual.getPayloadData(), "isReadOnly"));
    Assert.assertTrue((Boolean) Reflector.getInstanceField(actual.getPayloadData(), "bigEndian"));
    Assert.assertFalse((Boolean) Reflector.getInstanceField(actual.getPayloadData(), "nativeByteOrder"));
    Assert.assertEquals(0, Reflector.getInstanceField(actual.getPayloadData(), "offset"));
    Assert.assertEquals(0L, Reflector.getInstanceField(actual.getPayloadData(), "address"));

  }

  // Test written by Diffblue Cover
  @Test
  public void equalsInputNotNullOutputFalse99964898136e8b6da38() {

    // Arrange
    final CloseFrame thisObj = new CloseFrame();
    final Object arg0 = "";

    // Act
    final boolean actual = thisObj.equals(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getCloseCodeOutputPositive99979caca6cb1137493() {

    // Arrange
    final CloseFrame thisObj = new CloseFrame();

    // Act
    final int actual = thisObj.getCloseCode();

    // Assert result
    Assert.assertEquals(1000, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getMessageOutputNotNull999bf35d4c085dbd018() {

    // Arrange
    final CloseFrame thisObj = new CloseFrame();

    // Act
    final String actual = thisObj.getMessage();

    // Assert result
    Assert.assertEquals("", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getPayloadDataOutputNotNull999df440e5df3a52073() {

    // Arrange
    final CloseFrame thisObj = new CloseFrame();

    // Act
    final ByteBuffer actual = thisObj.getPayloadData();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertArrayEquals(new byte[]{ (short) 3, (short) -24 }, ((byte[]) Reflector.getInstanceField(actual, "hb")));
    Assert.assertFalse((Boolean) Reflector.getInstanceField(actual, "isReadOnly"));
    Assert.assertTrue((Boolean) Reflector.getInstanceField(actual, "bigEndian"));
    Assert.assertFalse((Boolean) Reflector.getInstanceField(actual, "nativeByteOrder"));
    Assert.assertEquals(0, Reflector.getInstanceField(actual, "offset"));
    Assert.assertEquals(0L, Reflector.getInstanceField(actual, "address"));

  }

  // Test written by Diffblue Cover
  @Test
  public void hashCodeOutputNegative99924d271a2df821cde() {

    // Arrange
    final CloseFrame thisObj = new CloseFrame();

    // Act
    final int actual = thisObj.hashCode();

    // Assert result
    Assert.assertEquals(-577910324, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isValidOutputVoid9997dd97433a8d5ec02() throws InvalidDataException {

    // Arrange
    final CloseFrame thisObj = new CloseFrame();

    // Act
    thisObj.isValid();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setCodeInputZeroOutputVoid99915cdd6c5c76c08c8() {

    // Arrange
    final CloseFrame thisObj = new CloseFrame();
    final int arg0 = 0;

    // Act
    thisObj.setCode(arg0);

    // Assert side effects
    Assert.assertEquals(0, thisObj.getCloseCode());
    Assert.assertNotNull(thisObj.getPayloadData());
    Assert.assertArrayEquals(new byte[]{ (short) 0, (short) 0 }, ((byte[]) Reflector.getInstanceField(thisObj.getPayloadData(), "hb")));
    Assert.assertFalse((Boolean) Reflector.getInstanceField(thisObj.getPayloadData(), "isReadOnly"));
    Assert.assertTrue((Boolean) Reflector.getInstanceField(thisObj.getPayloadData(), "bigEndian"));
    Assert.assertFalse((Boolean) Reflector.getInstanceField(thisObj.getPayloadData(), "nativeByteOrder"));
    Assert.assertEquals(0, Reflector.getInstanceField(thisObj.getPayloadData(), "offset"));
    Assert.assertEquals(0L, Reflector.getInstanceField(thisObj.getPayloadData(), "address"));

  }

  // Test written by Diffblue Cover
  @Test
  public void setPayloadInputNullOutputNullPointerException999baff6f163e256dd7() {

    // Arrange
    final CloseFrame thisObj = new CloseFrame();
    final ByteBuffer arg0 = null;
    try {

      // Act
      thrown.expect(NullPointerException.class);
      thisObj.setPayload(arg0);
    } catch (NullPointerException ex) {

      // Assert side effects
      Assert.assertEquals(1005, thisObj.getCloseCode());
      throw ex;
    }

  }

  // Test written by Diffblue Cover
  @Test
  public void setReasonInputNotNullOutputVoid999130983aa3124414e() {

    // Arrange
    final CloseFrame thisObj = new CloseFrame();
    final String arg0 = "";

    // Act
    thisObj.setReason(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void toStringOutputNotNull999cc67f4406c9306f1() {

    // Arrange
    final CloseFrame thisObj = new CloseFrame();

    // Act
    final String actual = thisObj.toString();

    // Assert result
    Assert.assertEquals("Framedata{ optcode:CLOSING, fin:true, rsv1:false, rsv2:false, rsv3:false, payloadlength:[pos:0, len:2], payload:\u0003\ufffd}code: 1000", actual);

  }
}

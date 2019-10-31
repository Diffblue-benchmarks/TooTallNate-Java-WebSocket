package org.java_websocket.drafts;

import com.diffblue.deeptestutils.Reflector;
import org.java_websocket.WebSocketImpl;
import org.java_websocket.drafts.Draft;
import org.java_websocket.drafts.Draft_6455;
import org.java_websocket.enums.CloseHandshakeType;
import org.java_websocket.enums.HandshakeState;
import org.java_websocket.enums.Opcode;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.exceptions.InvalidHandshakeException;
import org.java_websocket.extensions.DefaultExtension;
import org.java_websocket.extensions.IExtension;
import org.java_websocket.framing.BinaryFrame;
import org.java_websocket.framing.Framedata;
import org.java_websocket.framing.TextFrame;
import org.java_websocket.handshake.ClientHandshakeBuilder;
import org.java_websocket.handshake.HandshakeBuilder;
import org.java_websocket.handshake.HandshakeImpl1Client;
import org.java_websocket.handshake.HandshakeImpl1Server;
import org.java_websocket.protocols.IProtocol;
import org.java_websocket.protocols.Protocol;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;



public class Draft_6455Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void acceptHandshakeAsClientInputNotNullNotNullOutputNot_matched9993941163f056e8a5f() throws InvalidHandshakeException {

    // Arrange
    final Draft_6455 thisObj = new Draft_6455();
    final HandshakeImpl1Client arg0 = new HandshakeImpl1Client();
    final HandshakeImpl1Server arg1 = new HandshakeImpl1Server();

    // Act
    final HandshakeState actual = thisObj.acceptHandshakeAsClient(arg0, arg1);

    // Assert result
    Assert.assertEquals(HandshakeState.NOT_MATCHED, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void acceptHandshakeAsServerInputNotNullOutputNot_matched999ea13686cacd93b5e() throws InvalidHandshakeException {

    // Arrange
    final Draft_6455 thisObj = new Draft_6455();
    final HandshakeImpl1Client arg0 = new HandshakeImpl1Client();

    // Act
    final HandshakeState actual = thisObj.acceptHandshakeAsServer(arg0);

    // Assert result
    Assert.assertEquals(HandshakeState.NOT_MATCHED, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999105e99b1a9adf5c4() {

    // Act, creating object to test constructor
    final Draft_6455 actual = new Draft_6455();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getKnownExtensions());
    Assert.assertEquals(1, actual.getKnownExtensions().size());
    Assert.assertNotNull(actual.getKnownExtensions().get(0));
    Assert.assertEquals(actual.getKnownExtensions().get(0), actual.getExtension());
    Assert.assertEquals(2147483647, actual.getMaxFrameSize());
    Assert.assertNotNull(actual.getKnownProtocols());
    Assert.assertEquals(1, actual.getKnownProtocols().size());
    Assert.assertNotNull(actual.getKnownProtocols().get(0));
    Assert.assertEquals("", ((Protocol) actual.getKnownProtocols().get(0)).getProvidedProtocol());
    Assert.assertNull(actual.getProtocol());
    Assert.assertNull(actual.continuousFrameType);
    Assert.assertNull(actual.getRole());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNegativeOutputIllegalArgumentException999150914f14962fd6b() {

    // Arrange
    final ArrayList<IExtension> arg0 = new ArrayList<IExtension>();
    final DefaultExtension defaultExtension = new DefaultExtension();
    arg0.add(defaultExtension);
    final int arg1 = -128;

    // Act, creating object to test constructor
    thrown.expect(IllegalArgumentException.class);
    new Draft_6455(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullNegativeOutputIllegalArgumentException99953ac8cb02a225a87() {

    // Arrange
    final ArrayList<IExtension> arg0 = new ArrayList<IExtension>();
    final DefaultExtension defaultExtension = new DefaultExtension();
    arg0.add(defaultExtension);
    final ArrayList<IProtocol> arg1 = new ArrayList<IProtocol>();
    final Protocol protocol = new Protocol("");
    arg1.add(protocol);
    final int arg2 = -128;

    // Act, creating object to test constructor
    thrown.expect(IllegalArgumentException.class);
    new Draft_6455(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullOutputNotNull9996037e5b1d09717f4() {

    // Arrange
    final ArrayList<IExtension> arg0 = new ArrayList<IExtension>();
    final DefaultExtension defaultExtension = new DefaultExtension();
    arg0.add(defaultExtension);
    final ArrayList<IProtocol> arg1 = new ArrayList<IProtocol>();
    final Protocol protocol = new Protocol("");
    arg1.add(protocol);

    // Act, creating object to test constructor
    final Draft_6455 actual = new Draft_6455(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getKnownExtensions());
    Assert.assertEquals(1, actual.getKnownExtensions().size());
    Assert.assertNotNull(actual.getKnownExtensions().get(0));
    Assert.assertNotNull(actual.getExtension());
    Assert.assertEquals(2147483647, actual.getMaxFrameSize());
    Assert.assertNotNull(actual.getKnownProtocols());
    Assert.assertEquals(1, actual.getKnownProtocols().size());
    Assert.assertNotNull(actual.getKnownProtocols().get(0));
    Assert.assertEquals("", ((Protocol) actual.getKnownProtocols().get(0)).getProvidedProtocol());
    Assert.assertNull(actual.getProtocol());
    Assert.assertNull(actual.continuousFrameType);
    Assert.assertNull(actual.getRole());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull999f22bb6824bb3cec0() {

    // Arrange
    final ArrayList<IExtension> arg0 = new ArrayList<IExtension>();
    final DefaultExtension defaultExtension = new DefaultExtension();
    arg0.add(defaultExtension);

    // Act, creating object to test constructor
    final Draft_6455 actual = new Draft_6455(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getKnownExtensions());
    Assert.assertEquals(1, actual.getKnownExtensions().size());
    Assert.assertNotNull(actual.getKnownExtensions().get(0));
    Assert.assertNotNull(actual.getExtension());
    Assert.assertEquals(2147483647, actual.getMaxFrameSize());
    Assert.assertNotNull(actual.getKnownProtocols());
    Assert.assertEquals(1, actual.getKnownProtocols().size());
    Assert.assertNotNull(actual.getKnownProtocols().get(0));
    Assert.assertEquals("", ((Protocol) actual.getKnownProtocols().get(0)).getProvidedProtocol());
    Assert.assertNull(actual.getProtocol());
    Assert.assertNull(actual.continuousFrameType);
    Assert.assertNull(actual.getRole());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull999ab9bb70c74a9c69e() {

    // Arrange
    final DefaultExtension arg0 = new DefaultExtension();

    // Act, creating object to test constructor
    final Draft_6455 actual = new Draft_6455(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getKnownExtensions());
    Assert.assertEquals(1, actual.getKnownExtensions().size());
    Assert.assertNotNull(actual.getKnownExtensions().get(0));
    Assert.assertNotNull(actual.getExtension());
    Assert.assertEquals(2147483647, actual.getMaxFrameSize());
    Assert.assertNotNull(actual.getKnownProtocols());
    Assert.assertEquals(1, actual.getKnownProtocols().size());
    Assert.assertNotNull(actual.getKnownProtocols().get(0));
    Assert.assertEquals("", ((Protocol) actual.getKnownProtocols().get(0)).getProvidedProtocol());
    Assert.assertNull(actual.getProtocol());
    Assert.assertNull(actual.continuousFrameType);
    Assert.assertNull(actual.getRole());

  }

  // Test written by Diffblue Cover
  @Test
  public void copyInstanceOutputNotNull9991babe09db5731d81() {

    // Arrange
    final Draft_6455 thisObj = new Draft_6455();

    // Act
    final Draft actual = thisObj.copyInstance();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(((Draft_6455) actual).getKnownExtensions());
    Assert.assertEquals(1, ((Draft_6455) actual).getKnownExtensions().size());
    Assert.assertNotNull(((Draft_6455) actual).getKnownExtensions().get(0));
    Assert.assertNotNull(((Draft_6455) actual).getExtension());
    Assert.assertEquals(2147483647, ((Draft_6455) actual).getMaxFrameSize());
    Assert.assertNotNull(((Draft_6455) actual).getKnownProtocols());
    Assert.assertEquals(1, ((Draft_6455) actual).getKnownProtocols().size());
    Assert.assertNotNull(((Draft_6455) actual).getKnownProtocols().get(0));
    Assert.assertEquals("", ((Protocol) ((Draft_6455) actual).getKnownProtocols().get(0)).getProvidedProtocol());
    Assert.assertNull(((Draft_6455) actual).getProtocol());
    Assert.assertNull(((Draft_6455) actual).continuousFrameType);
    Assert.assertNull(((Draft_6455) actual).getRole());

  }

  // Test written by Diffblue Cover
  @Test
  public void createBinaryFrameInputNotNullOutputNotNull999c0a97f80e6782c82() {

    // Arrange
    final Draft_6455 thisObj = new Draft_6455();
    final BinaryFrame arg0 = new BinaryFrame();

    // Act
    final ByteBuffer actual = thisObj.createBinaryFrame(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertArrayEquals(new byte[]{ (short) -126, (short) 0 }, ((byte[]) Reflector.getInstanceField(actual, "hb")));
    Assert.assertFalse((Boolean) Reflector.getInstanceField(actual, "isReadOnly"));
    Assert.assertTrue((Boolean) Reflector.getInstanceField(actual, "bigEndian"));
    Assert.assertFalse((Boolean) Reflector.getInstanceField(actual, "nativeByteOrder"));
    Assert.assertEquals(0, Reflector.getInstanceField(actual, "offset"));
    Assert.assertEquals(0L, Reflector.getInstanceField(actual, "address"));

  }

  // Test written by Diffblue Cover
  @Test
  public void createFramesInputNotNullTrueOutputNotNull999173fceff546e73df() {

    // Arrange
    final Draft_6455 thisObj = new Draft_6455();
    final String arg0 = "";
    final boolean arg1 = true;

    // Act
    final List<Framedata> actual = thisObj.createFrames(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(Reflector.getInstanceField(actual, "elementData"));
    Assert.assertEquals(1, ((Object[]) Reflector.getInstanceField(actual, "elementData")).length);
    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(actual, "elementData"))[0]);
    Assert.assertFalse(((TextFrame) ((Object[]) Reflector.getInstanceField(actual, "elementData"))[0]).isRSV3());
    Assert.assertFalse(((TextFrame) ((Object[]) Reflector.getInstanceField(actual, "elementData"))[0]).isRSV2());
    Assert.assertTrue(((TextFrame) ((Object[]) Reflector.getInstanceField(actual, "elementData"))[0]).isFin());
    Assert.assertFalse(((TextFrame) ((Object[]) Reflector.getInstanceField(actual, "elementData"))[0]).isRSV1());
    Assert.assertEquals(Opcode.TEXT, ((TextFrame) ((Object[]) Reflector.getInstanceField(actual, "elementData"))[0]).getOpcode());
    Assert.assertTrue(((TextFrame) ((Object[]) Reflector.getInstanceField(actual, "elementData"))[0]).getTransfereMasked());
    Assert.assertNotNull(((TextFrame) ((Object[]) Reflector.getInstanceField(actual, "elementData"))[0]).getPayloadData());
    Assert.assertArrayEquals(new byte[]{ }, ((byte[]) Reflector.getInstanceField(((TextFrame) ((Object[]) Reflector.getInstanceField(actual, "elementData"))[0]).getPayloadData(), "hb")));
    Assert.assertFalse((Boolean) Reflector.getInstanceField(((TextFrame) ((Object[]) Reflector.getInstanceField(actual, "elementData"))[0]).getPayloadData(), "isReadOnly"));
    Assert.assertTrue((Boolean) Reflector.getInstanceField(((TextFrame) ((Object[]) Reflector.getInstanceField(actual, "elementData"))[0]).getPayloadData(), "bigEndian"));
    Assert.assertFalse((Boolean) Reflector.getInstanceField(((TextFrame) ((Object[]) Reflector.getInstanceField(actual, "elementData"))[0]).getPayloadData(), "nativeByteOrder"));
    Assert.assertEquals(0, Reflector.getInstanceField(((TextFrame) ((Object[]) Reflector.getInstanceField(actual, "elementData"))[0]).getPayloadData(), "offset"));
    Assert.assertEquals(0L, Reflector.getInstanceField(((TextFrame) ((Object[]) Reflector.getInstanceField(actual, "elementData"))[0]).getPayloadData(), "address"));
    Assert.assertEquals(1, Reflector.getInstanceField(actual, "size"));

  }

  // Test written by Diffblue Cover
  @Test
  public void createFramesInputNullTrueOutputNotNull999fba6aa9710283fcc() {

    // Arrange
    final Draft_6455 thisObj = new Draft_6455();
    final ByteBuffer arg0 = null;
    final boolean arg1 = true;

    // Act
    final List<Framedata> actual = thisObj.createFrames(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(Reflector.getInstanceField(actual, "elementData"));
    Assert.assertEquals(1, ((Object[]) Reflector.getInstanceField(actual, "elementData")).length);
    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(actual, "elementData"))[0]);
    Assert.assertFalse(((BinaryFrame) ((Object[]) Reflector.getInstanceField(actual, "elementData"))[0]).isRSV3());
    Assert.assertFalse(((BinaryFrame) ((Object[]) Reflector.getInstanceField(actual, "elementData"))[0]).isRSV2());
    Assert.assertTrue(((BinaryFrame) ((Object[]) Reflector.getInstanceField(actual, "elementData"))[0]).isFin());
    Assert.assertFalse(((BinaryFrame) ((Object[]) Reflector.getInstanceField(actual, "elementData"))[0]).isRSV1());
    Assert.assertEquals(Opcode.BINARY, ((BinaryFrame) ((Object[]) Reflector.getInstanceField(actual, "elementData"))[0]).getOpcode());
    Assert.assertTrue(((BinaryFrame) ((Object[]) Reflector.getInstanceField(actual, "elementData"))[0]).getTransfereMasked());
    Assert.assertNull(((BinaryFrame) ((Object[]) Reflector.getInstanceField(actual, "elementData"))[0]).getPayloadData());
    Assert.assertEquals(1, Reflector.getInstanceField(actual, "size"));

  }

  // Test written by Diffblue Cover
  @Test
  public void equalsInputNotNullOutputFalse99936b713644ff0a7e9() {

    // Arrange
    final Draft_6455 thisObj = new Draft_6455();
    final Object arg0 = "";

    // Act
    final boolean actual = thisObj.equals(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getCloseHandshakeTypeOutputTwoway999666b203818e09e30() {

    // Arrange
    final Draft_6455 thisObj = new Draft_6455();

    // Act
    final CloseHandshakeType actual = thisObj.getCloseHandshakeType();

    // Assert result
    Assert.assertEquals(CloseHandshakeType.TWOWAY, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getExtensionOutputNotNull999d0d08a9c4b7333e4() {

    // Arrange
    final Draft_6455 thisObj = new Draft_6455();

    // Act
    final IExtension actual = thisObj.getExtension();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getKnownExtensionsOutput19998e69be96ef8be221() {

    // Arrange
    final Draft_6455 thisObj = new Draft_6455();

    // Act
    final List<IExtension> actual = thisObj.getKnownExtensions();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.size());
    Assert.assertNotNull(actual.get(0));

  }

  // Test written by Diffblue Cover
  @Test
  public void getKnownProtocolsOutput19991b50cf51e41ec6d3() {

    // Arrange
    final Draft_6455 thisObj = new Draft_6455();

    // Act
    final List<IProtocol> actual = thisObj.getKnownProtocols();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.size());
    Assert.assertNotNull(actual.get(0));
    Assert.assertEquals("", ((Protocol) actual.get(0)).getProvidedProtocol());

  }

  // Test written by Diffblue Cover
  @Test
  public void getMaxFrameSizeOutputPositive999c95886bd3af9b2ee() {

    // Arrange
    final Draft_6455 thisObj = new Draft_6455();

    // Act
    final int actual = thisObj.getMaxFrameSize();

    // Assert result
    Assert.assertEquals(2147483647, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getProtocolOutputVoid999ba7f4aec2e7c195e() {

    // Arrange
    final Draft_6455 thisObj = new Draft_6455();

    // Act
    final IProtocol actual = thisObj.getProtocol();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void hashCodeOutputNegative999b9b2097c7526ab6b() {

    // Arrange
    final Draft_6455 thisObj = new Draft_6455();

    // Act
    final int actual = thisObj.hashCode();

    // Assert result
    Assert.assertEquals(-1471999720, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void postProcessHandshakeRequestAsClientInputNotNullOutputNotNull9998e548cc0db490a50() {

    // Arrange
    final Draft_6455 thisObj = new Draft_6455();
    final HandshakeImpl1Client arg0 = new HandshakeImpl1Client();

    // Act
    final ClientHandshakeBuilder actual = thisObj.postProcessHandshakeRequestAsClient(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("*", ((HandshakeImpl1Client) actual).getResourceDescriptor());
    Assert.assertNull(((HandshakeImpl1Client) actual).getContent());

  }

  // Test written by Diffblue Cover
  @Test
  public void postProcessHandshakeResponseAsServerInputNotNullNotNullOutputNotNull999801d69111f287ff9() throws InvalidHandshakeException {

    // Arrange
    final Draft_6455 thisObj = new Draft_6455();
    final HandshakeImpl1Client arg0 = new HandshakeImpl1Client();
    final HandshakeImpl1Server arg1 = new HandshakeImpl1Server();

    // Act
    final HandshakeBuilder actual = thisObj.postProcessHandshakeResponseAsServer(arg0, arg1);

    // Assert side effects
    Assert.assertNotNull(arg1);
    Assert.assertEquals((short) 0, ((HandshakeImpl1Server) arg1).getHttpStatus());
    Assert.assertEquals("Web Socket Protocol Handshake", ((HandshakeImpl1Server) arg1).getHttpStatusMessage());
    Assert.assertNull(((HandshakeImpl1Server) arg1).getContent());

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals((short) 0, ((HandshakeImpl1Server) actual).getHttpStatus());
    Assert.assertEquals("Web Socket Protocol Handshake", ((HandshakeImpl1Server) actual).getHttpStatusMessage());
    Assert.assertNull(((HandshakeImpl1Server) actual).getContent());

  }

  // Test written by Diffblue Cover
  @Test
  public void processFrameInputNullNotNullOutputNullPointerException99947fcd88a36995d64() throws InvalidDataException {

    // Arrange
    final Draft_6455 thisObj = new Draft_6455();
    final WebSocketImpl arg0 = null;
    final BinaryFrame arg1 = new BinaryFrame();

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.processFrame(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void resetOutputVoid9996e839e7046ebaa2b() {

    // Arrange
    final Draft_6455 thisObj = new Draft_6455();

    // Act
    thisObj.reset();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void toStringOutputNotNull999e2f3089440339cb9() {

    // Arrange
    final Draft_6455 thisObj = new Draft_6455();

    // Act
    final String actual = thisObj.toString();

    // Assert result
    Assert.assertEquals("Draft_6455 extension: DefaultExtension max frame size: 2147483647", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void translateFrameInputNullOutputNullPointerException99929ac3fc31d8df113() throws InvalidDataException {

    // Arrange
    final Draft_6455 thisObj = new Draft_6455();
    final ByteBuffer arg0 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.translateFrame(arg0);

    // The method is not expected to return due to exception thrown

  }
}

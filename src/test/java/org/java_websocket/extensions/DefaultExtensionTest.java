package org.java_websocket.extensions;

import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.extensions.DefaultExtension;
import org.java_websocket.extensions.IExtension;
import org.java_websocket.framing.BinaryFrame;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class DefaultExtensionTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptProvidedExtensionAsClientInputNotNullOutputTrue99972160ae15f661e12() {

    // Arrange
    final DefaultExtension thisObj = new DefaultExtension();
    final String arg0 = " RSV2: ";

    // Act
    final boolean actual = thisObj.acceptProvidedExtensionAsClient(arg0);

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void acceptProvidedExtensionAsServerInputNotNullOutputTrue9997d8b835356767ca0() {

    // Arrange
    final DefaultExtension thisObj = new DefaultExtension();
    final String arg0 = " RSV2: ";

    // Act
    final boolean actual = thisObj.acceptProvidedExtensionAsServer(arg0);

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999d342f8ba29ac2fad() {

    // Act, creating object to test constructor
    final DefaultExtension actual = new DefaultExtension();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void copyInstanceOutputNotNull9991dc69da4af91cf1d() {

    // Arrange
    final DefaultExtension thisObj = new DefaultExtension();

    // Act
    final IExtension actual = thisObj.copyInstance();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void decodeFrameInputNotNullOutputVoid999a9bb420c77f45cc4() throws InvalidDataException {

    // Arrange
    final DefaultExtension thisObj = new DefaultExtension();
    final BinaryFrame arg0 = new BinaryFrame();

    // Act
    thisObj.decodeFrame(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void encodeFrameInputNotNullOutputVoid9997d859398ae4cef5d() {

    // Arrange
    final DefaultExtension thisObj = new DefaultExtension();
    final BinaryFrame arg0 = new BinaryFrame();

    // Act
    thisObj.encodeFrame(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void equalsInputNotNullOutputFalse999480cd0306760d33f() {

    // Arrange
    final DefaultExtension thisObj = new DefaultExtension();
    final Object arg0 = " RSV2: ";

    // Act
    final boolean actual = thisObj.equals(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getProvidedExtensionAsClientOutputNotNull9997025928671167264() {

    // Arrange
    final DefaultExtension thisObj = new DefaultExtension();

    // Act
    final String actual = thisObj.getProvidedExtensionAsClient();

    // Assert result
    Assert.assertEquals("", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getProvidedExtensionAsServerOutputNotNull999ceeeaf27918c753e() {

    // Arrange
    final DefaultExtension thisObj = new DefaultExtension();

    // Act
    final String actual = thisObj.getProvidedExtensionAsServer();

    // Assert result
    Assert.assertEquals("", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void hashCodeOutputPositive99987621059b2abf52b() {

    // Arrange
    final DefaultExtension thisObj = new DefaultExtension();

    // Act
    final int actual = thisObj.hashCode();

    // Assert result
    Assert.assertEquals(2005169944, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isFrameValidInputNotNullOutputVoid999724d32fe2d654f91() throws InvalidDataException {

    // Arrange
    final DefaultExtension thisObj = new DefaultExtension();
    final BinaryFrame arg0 = new BinaryFrame();

    // Act
    thisObj.isFrameValid(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void resetOutputVoid9991263e910fb35e1e1() {

    // Arrange
    final DefaultExtension thisObj = new DefaultExtension();

    // Act
    thisObj.reset();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void toStringOutputNotNull99917bec60c5203bec0() {

    // Arrange
    final DefaultExtension thisObj = new DefaultExtension();

    // Act
    final String actual = thisObj.toString();

    // Assert result
    Assert.assertEquals("DefaultExtension", actual);

  }
}

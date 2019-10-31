package org.java_websocket.protocols;

import org.java_websocket.protocols.IProtocol;
import org.java_websocket.protocols.Protocol;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ProtocolTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptProvidedProtocolInputNotNullOutputFalse9991416f1e2229e58ea() {

    // Arrange
    final Protocol thisObj = new Protocol(" ");
    final String arg0 = " ";

    // Act
    final boolean actual = thisObj.acceptProvidedProtocol(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull99996c5f043172b35f8() {

    // Arrange
    final String arg0 = " ";

    // Act, creating object to test constructor
    final Protocol actual = new Protocol(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(" ", actual.getProvidedProtocol());

  }

  // Test written by Diffblue Cover
  @Test
  public void copyInstanceOutputNotNull9995225edb5c6280a67() {

    // Arrange
    final Protocol thisObj = new Protocol(" ");

    // Act
    final IProtocol actual = thisObj.copyInstance();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(" ", ((Protocol) actual).getProvidedProtocol());

  }

  // Test written by Diffblue Cover
  @Test
  public void equalsInputNotNullOutputFalse99914193a6848401a0f() {

    // Arrange
    final Protocol thisObj = new Protocol(" ");
    final Object arg0 = " ";

    // Act
    final boolean actual = thisObj.equals(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getProvidedProtocolOutputNotNull99902f90447092bedb9() {

    // Arrange
    final Protocol thisObj = new Protocol(" ");

    // Act
    final String actual = thisObj.getProvidedProtocol();

    // Assert result
    Assert.assertEquals(" ", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void hashCodeOutputPositive999f3540131efb64b91() {

    // Arrange
    final Protocol thisObj = new Protocol(" ");

    // Act
    final int actual = thisObj.hashCode();

    // Assert result
    Assert.assertEquals(32, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void toStringOutputNotNull999513f92116baa36ca() {

    // Arrange
    final Protocol thisObj = new Protocol(" ");

    // Act
    final String actual = thisObj.toString();

    // Assert result
    Assert.assertEquals(" ", actual);

  }
}

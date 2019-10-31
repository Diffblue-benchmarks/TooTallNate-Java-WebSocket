package org.java_websocket;

import org.java_websocket.AbstractWrappedByteChannel;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;



public class AbstractWrappedByteChannelTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void closeOutputNullPointerException999c2a1e4c5166836ee() throws IOException {

    // Arrange
    final AbstractWrappedByteChannel abstractWrappedByteChannel2 = new AbstractWrappedByteChannel((ByteChannel) null);
    final AbstractWrappedByteChannel abstractWrappedByteChannel1 = new AbstractWrappedByteChannel(abstractWrappedByteChannel2);
    final AbstractWrappedByteChannel abstractWrappedByteChannel = new AbstractWrappedByteChannel(abstractWrappedByteChannel1);
    final AbstractWrappedByteChannel thisObj = new AbstractWrappedByteChannel(abstractWrappedByteChannel);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.close();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull999eac75f7eb7daa79f() {

    // Arrange
    final AbstractWrappedByteChannel abstractWrappedByteChannel1 = new AbstractWrappedByteChannel((ByteChannel) null);
    final AbstractWrappedByteChannel abstractWrappedByteChannel = new AbstractWrappedByteChannel(abstractWrappedByteChannel1);
    final AbstractWrappedByteChannel arg0 = new AbstractWrappedByteChannel(abstractWrappedByteChannel);

    // Act, creating object to test constructor
    final AbstractWrappedByteChannel actual = new AbstractWrappedByteChannel(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull9995793b39a46896e3d() {

    // Arrange
    final AbstractWrappedByteChannel abstractWrappedByteChannel2 = new AbstractWrappedByteChannel((ByteChannel) null);
    final AbstractWrappedByteChannel abstractWrappedByteChannel1 = new AbstractWrappedByteChannel(abstractWrappedByteChannel2);
    final AbstractWrappedByteChannel abstractWrappedByteChannel = new AbstractWrappedByteChannel(abstractWrappedByteChannel1);
    final AbstractWrappedByteChannel arg0 = new AbstractWrappedByteChannel(abstractWrappedByteChannel);

    // Act, creating object to test constructor
    final AbstractWrappedByteChannel actual = new AbstractWrappedByteChannel(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isBlockingOutputFalse999a8b45370086ea623() {

    // Arrange
    final AbstractWrappedByteChannel abstractWrappedByteChannel2 = new AbstractWrappedByteChannel((ByteChannel) null);
    final AbstractWrappedByteChannel abstractWrappedByteChannel1 = new AbstractWrappedByteChannel(abstractWrappedByteChannel2);
    final AbstractWrappedByteChannel abstractWrappedByteChannel = new AbstractWrappedByteChannel(abstractWrappedByteChannel1);
    final AbstractWrappedByteChannel thisObj = new AbstractWrappedByteChannel(abstractWrappedByteChannel);

    // Act
    final boolean actual = thisObj.isBlocking();

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isNeedReadOutputFalse999b5fbde2bab871099() {

    // Arrange
    final AbstractWrappedByteChannel abstractWrappedByteChannel2 = new AbstractWrappedByteChannel((ByteChannel) null);
    final AbstractWrappedByteChannel abstractWrappedByteChannel1 = new AbstractWrappedByteChannel(abstractWrappedByteChannel2);
    final AbstractWrappedByteChannel abstractWrappedByteChannel = new AbstractWrappedByteChannel(abstractWrappedByteChannel1);
    final AbstractWrappedByteChannel thisObj = new AbstractWrappedByteChannel(abstractWrappedByteChannel);

    // Act
    final boolean actual = thisObj.isNeedRead();

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isNeedWriteOutputFalse9999a37fd73b1ef8f8b() {

    // Arrange
    final AbstractWrappedByteChannel abstractWrappedByteChannel2 = new AbstractWrappedByteChannel((ByteChannel) null);
    final AbstractWrappedByteChannel abstractWrappedByteChannel1 = new AbstractWrappedByteChannel(abstractWrappedByteChannel2);
    final AbstractWrappedByteChannel abstractWrappedByteChannel = new AbstractWrappedByteChannel(abstractWrappedByteChannel1);
    final AbstractWrappedByteChannel thisObj = new AbstractWrappedByteChannel(abstractWrappedByteChannel);

    // Act
    final boolean actual = thisObj.isNeedWrite();

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isOpenOutputNullPointerException999b85d0364f8986f34() {

    // Arrange
    final AbstractWrappedByteChannel abstractWrappedByteChannel2 = new AbstractWrappedByteChannel((ByteChannel) null);
    final AbstractWrappedByteChannel abstractWrappedByteChannel1 = new AbstractWrappedByteChannel(abstractWrappedByteChannel2);
    final AbstractWrappedByteChannel abstractWrappedByteChannel = new AbstractWrappedByteChannel(abstractWrappedByteChannel1);
    final AbstractWrappedByteChannel thisObj = new AbstractWrappedByteChannel(abstractWrappedByteChannel);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.isOpen();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void readMoreInputNullOutputZero9997c766ca5a1ee274f() throws IOException {

    // Arrange
    final AbstractWrappedByteChannel abstractWrappedByteChannel2 = new AbstractWrappedByteChannel((ByteChannel) null);
    final AbstractWrappedByteChannel abstractWrappedByteChannel1 = new AbstractWrappedByteChannel(abstractWrappedByteChannel2);
    final AbstractWrappedByteChannel abstractWrappedByteChannel = new AbstractWrappedByteChannel(abstractWrappedByteChannel1);
    final AbstractWrappedByteChannel thisObj = new AbstractWrappedByteChannel(abstractWrappedByteChannel);
    final ByteBuffer arg0 = null;

    // Act
    final int actual = thisObj.readMore(arg0);

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void readInputNullOutputNullPointerException99953af000990ae5d68() throws IOException {

    // Arrange
    final AbstractWrappedByteChannel abstractWrappedByteChannel2 = new AbstractWrappedByteChannel((ByteChannel) null);
    final AbstractWrappedByteChannel abstractWrappedByteChannel1 = new AbstractWrappedByteChannel(abstractWrappedByteChannel2);
    final AbstractWrappedByteChannel abstractWrappedByteChannel = new AbstractWrappedByteChannel(abstractWrappedByteChannel1);
    final AbstractWrappedByteChannel thisObj = new AbstractWrappedByteChannel(abstractWrappedByteChannel);
    final ByteBuffer arg0 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.read(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void writeMoreOutputVoid99952f75c8fec188650() throws IOException {

    // Arrange
    final AbstractWrappedByteChannel abstractWrappedByteChannel2 = new AbstractWrappedByteChannel((ByteChannel) null);
    final AbstractWrappedByteChannel abstractWrappedByteChannel1 = new AbstractWrappedByteChannel(abstractWrappedByteChannel2);
    final AbstractWrappedByteChannel abstractWrappedByteChannel = new AbstractWrappedByteChannel(abstractWrappedByteChannel1);
    final AbstractWrappedByteChannel thisObj = new AbstractWrappedByteChannel(abstractWrappedByteChannel);

    // Act
    thisObj.writeMore();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void writeInputNullOutputNullPointerException999a9d34aa4dcdcf7c9() throws IOException {

    // Arrange
    final AbstractWrappedByteChannel abstractWrappedByteChannel2 = new AbstractWrappedByteChannel((ByteChannel) null);
    final AbstractWrappedByteChannel abstractWrappedByteChannel1 = new AbstractWrappedByteChannel(abstractWrappedByteChannel2);
    final AbstractWrappedByteChannel abstractWrappedByteChannel = new AbstractWrappedByteChannel(abstractWrappedByteChannel1);
    final AbstractWrappedByteChannel thisObj = new AbstractWrappedByteChannel(abstractWrappedByteChannel);
    final ByteBuffer arg0 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.write(arg0);

    // The method is not expected to return due to exception thrown

  }
}

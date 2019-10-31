package org.java_websocket.handshake;

import org.java_websocket.handshake.HandshakeImpl1Server;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class HandshakeImpl1ServerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999c3c0e5cc942856ee() {

    // Act, creating object to test constructor
    final HandshakeImpl1Server actual = new HandshakeImpl1Server();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals((short) 0, actual.getHttpStatus());
    Assert.assertNull(actual.getHttpStatusMessage());
    Assert.assertNull(actual.getContent());

  }

  // Test written by Diffblue Cover
  @Test
  public void getHttpStatusMessageOutputVoid999b87348a2a9bb0fe4() {

    // Arrange
    final HandshakeImpl1Server thisObj = new HandshakeImpl1Server();

    // Act
    final String actual = thisObj.getHttpStatusMessage();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getHttpStatusOutputZero999e16f791a2769d7fc() {

    // Arrange
    final HandshakeImpl1Server thisObj = new HandshakeImpl1Server();

    // Act
    final short actual = thisObj.getHttpStatus();

    // Assert result
    Assert.assertEquals((short) 0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void setHttpStatusMessageInputNotNullOutputVoid9990a331ff413c2ea14() {

    // Arrange
    final HandshakeImpl1Server thisObj = new HandshakeImpl1Server();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setHttpStatusMessage(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getHttpStatusMessage());

  }

  // Test written by Diffblue Cover
  @Test
  public void setHttpStatusInputPositiveOutputVoid999b3cb11ea73a6ac7f() {

    // Arrange
    final HandshakeImpl1Server thisObj = new HandshakeImpl1Server();
    final short arg0 = (short) 1;

    // Act
    thisObj.setHttpStatus(arg0);

    // Assert side effects
    Assert.assertEquals((short) 1, thisObj.getHttpStatus());

  }
}

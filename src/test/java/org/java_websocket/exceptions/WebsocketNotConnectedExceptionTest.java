package org.java_websocket.exceptions;

import org.java_websocket.exceptions.WebsocketNotConnectedException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class WebsocketNotConnectedExceptionTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999ba2bcfa71e674096() {

    // Act, creating object to test constructor
    final WebsocketNotConnectedException actual = new WebsocketNotConnectedException();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getMessage());

  }
}

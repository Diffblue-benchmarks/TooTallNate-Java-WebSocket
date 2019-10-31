package org.java_websocket.enums;

import org.java_websocket.enums.HandshakeState;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class HandshakeStateTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void valueOfInputNotNullOutputMatched9995ea85e0c9c91ce23() {

    // Arrange
    final String arg0 = "MATCHED";

    // Act
    final HandshakeState actual = HandshakeState.valueOf(arg0);

    // Assert result
    Assert.assertEquals(HandshakeState.MATCHED, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void valuesOutput2999613bc5b7dfabe7fc() {

    // Act
    final HandshakeState[] actual = HandshakeState.values();

    // Assert result
    Assert.assertArrayEquals(new HandshakeState[]{ HandshakeState.MATCHED, HandshakeState.NOT_MATCHED }, actual);

  }
}

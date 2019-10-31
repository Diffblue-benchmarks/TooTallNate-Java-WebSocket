package org.java_websocket.enums;

import org.java_websocket.enums.CloseHandshakeType;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class CloseHandshakeTypeTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void valueOfInputNotNullOutputNone99912330f52aceb3ff9() {

    // Arrange
    final String arg0 = "NONE";

    // Act
    final CloseHandshakeType actual = CloseHandshakeType.valueOf(arg0);

    // Assert result
    Assert.assertEquals(CloseHandshakeType.NONE, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void valuesOutput3999e5ebc6c36e46beef() {

    // Act
    final CloseHandshakeType[] actual = CloseHandshakeType.values();

    // Assert result
    Assert.assertArrayEquals(new CloseHandshakeType[]{ CloseHandshakeType.NONE, CloseHandshakeType.ONEWAY, CloseHandshakeType.TWOWAY }, actual);

  }
}

package org.java_websocket.enums;

import org.java_websocket.enums.Opcode;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class OpcodeTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void valueOfInputNotNullOutputBinary999d47b22546f25f578() {

    // Arrange
    final String arg0 = "BINARY";

    // Act
    final Opcode actual = Opcode.valueOf(arg0);

    // Assert result
    Assert.assertEquals(Opcode.BINARY, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void valuesOutput69999150169b41dde1b3() {

    // Act
    final Opcode[] actual = Opcode.values();

    // Assert result
    Assert.assertArrayEquals(new Opcode[]{ Opcode.CONTINUOUS, Opcode.TEXT, Opcode.BINARY, Opcode.PING, Opcode.PONG, Opcode.CLOSING }, actual);

  }
}

package org.java_websocket.enums;

import org.java_websocket.enums.ReadyState;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class ReadyStateTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void valueOfInputNotNullOutputClosed999a0c7e6b5278e4898() {

    // Arrange
    final String arg0 = "CLOSED";

    // Act
    final ReadyState actual = ReadyState.valueOf(arg0);

    // Assert result
    Assert.assertEquals(ReadyState.CLOSED, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void valuesOutput4999b4edd193ac2d565a() {

    // Act
    final ReadyState[] actual = ReadyState.values();

    // Assert result
    Assert.assertArrayEquals(new ReadyState[]{ ReadyState.NOT_YET_CONNECTED, ReadyState.OPEN, ReadyState.CLOSING, ReadyState.CLOSED }, actual);

  }
}

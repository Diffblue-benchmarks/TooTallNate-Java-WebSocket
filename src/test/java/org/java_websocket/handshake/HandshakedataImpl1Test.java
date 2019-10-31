package org.java_websocket.handshake;

import org.java_websocket.handshake.HandshakedataImpl1;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.Iterator;



public class HandshakedataImpl1Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99938ad408cfc1e589c() {

    // Act, creating object to test constructor
    final HandshakedataImpl1 actual = new HandshakedataImpl1();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getContent());

  }

  // Test written by Diffblue Cover
  @Test
  public void getContentOutputVoid999528126874623f14e() {

    // Arrange
    final HandshakedataImpl1 thisObj = new HandshakedataImpl1();

    // Act
    final byte[] actual = thisObj.getContent();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getFieldValueInputNotNullOutputNotNull999796bdab68f16189b() {

    // Arrange
    final HandshakedataImpl1 thisObj = new HandshakedataImpl1();
    final String arg0 = "aaaaa";

    // Act
    final String actual = thisObj.getFieldValue(arg0);

    // Assert result
    Assert.assertEquals("", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void hasFieldValueInputNotNullOutputFalse9996009c83153a062c1() {

    // Arrange
    final HandshakedataImpl1 thisObj = new HandshakedataImpl1();
    final String arg0 = "aaaaa";

    // Act
    final boolean actual = thisObj.hasFieldValue(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void iterateHttpFieldsOutputNotNull99930aea5ed66fdce92() {

    // Arrange
    final HandshakedataImpl1 thisObj = new HandshakedataImpl1();

    // Act
    final Iterator<String> actual = thisObj.iterateHttpFields();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void putInputNotNullNotNullOutputVoid999782b395035bb37e2() {

    // Arrange
    final HandshakedataImpl1 thisObj = new HandshakedataImpl1();
    final String arg0 = "aaaaa";
    final String arg1 = "aaaaa";

    // Act
    thisObj.put(arg0, arg1);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setContentInput24OutputVoid999e2225ecb78af04b7() {

    // Arrange
    final HandshakedataImpl1 thisObj = new HandshakedataImpl1();
    final byte[] arg0 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };

    // Act
    thisObj.setContent(arg0);

    // Assert side effects
    Assert.assertArrayEquals(new byte[]{ (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 }, thisObj.getContent());

  }
}

package org.java_websocket;

import org.java_websocket.WebSocketImpl;
import org.java_websocket.WebSocketListener;
import org.java_websocket.drafts.Draft;
import org.java_websocket.drafts.Draft_6455;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;



public class WebSocketImplTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNullNotNullOutputIllegalArgumentException999dd4eb243cece02e7() {

    // Arrange
    final WebSocketListener arg0 = null;
    final Draft_6455 arg1 = new Draft_6455();

    // Act, creating object to test constructor
    thrown.expect(IllegalArgumentException.class);
    new WebSocketImpl(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNullNotNullOutputIllegalArgumentException999bad3905908b98f69() {

    // Arrange
    final WebSocketListener arg0 = null;
    final ArrayList<Draft> arg1 = new ArrayList<Draft>();
    final Draft_6455 draft_6455 = new Draft_6455();
    arg1.add(draft_6455);

    // Act, creating object to test constructor
    thrown.expect(IllegalArgumentException.class);
    new WebSocketImpl(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }
}

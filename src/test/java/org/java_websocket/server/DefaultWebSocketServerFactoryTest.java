package org.java_websocket.server;

import org.java_websocket.WebSocketAdapter;
import org.java_websocket.drafts.Draft;
import org.java_websocket.drafts.Draft_6455;
import org.java_websocket.server.DefaultWebSocketServerFactory;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;



public class DefaultWebSocketServerFactoryTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void closeOutputVoid9990899f15a4f47662c() {

    // Arrange
    final DefaultWebSocketServerFactory thisObj = new DefaultWebSocketServerFactory();

    // Act
    thisObj.close();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999a4fd3c60aa6622de() {

    // Act, creating object to test constructor
    final DefaultWebSocketServerFactory actual = new DefaultWebSocketServerFactory();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void createWebSocketInputNullNotNullOutputIllegalArgumentException999554992e2f249a594() {

    // Arrange
    final DefaultWebSocketServerFactory thisObj = new DefaultWebSocketServerFactory();
    final WebSocketAdapter arg0 = null;
    final Draft_6455 arg1 = new Draft_6455();

    // Act
    thrown.expect(IllegalArgumentException.class);
    thisObj.createWebSocket(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void createWebSocketInputNullNotNullOutputIllegalArgumentException9995d28023965eaea7c() {

    // Arrange
    final DefaultWebSocketServerFactory thisObj = new DefaultWebSocketServerFactory();
    final WebSocketAdapter arg0 = null;
    final ArrayList<Draft> arg1 = new ArrayList<Draft>();
    final Draft_6455 draft_6455 = new Draft_6455();
    arg1.add(draft_6455);

    // Act
    thrown.expect(IllegalArgumentException.class);
    thisObj.createWebSocket(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void wrapChannelInputNullNullOutputVoid999c755acc5683d225e() {

    // Arrange
    final DefaultWebSocketServerFactory thisObj = new DefaultWebSocketServerFactory();
    final SocketChannel arg0 = null;
    final SelectionKey arg1 = null;

    // Act
    final SocketChannel actual = thisObj.wrapChannel(arg0, arg1);

    // The method returns void, testing that no exception is thrown

  }
}

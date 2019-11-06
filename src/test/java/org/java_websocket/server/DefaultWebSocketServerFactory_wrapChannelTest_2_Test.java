//package org.java_websocket.server;
//
//import java.nio.channels.SocketChannel;
//import org.java_websocket.server.DefaultWebSocketServerFactory;
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.rules.Timeout;
//import sun.nio.ch.InheritedChannel;
//import sun.nio.ch.SelectionKeyImpl;
//
//public class DefaultWebSocketServerFactory_wrapChannelTest_2_Test {
//  @Test
//  public void wrapChannelTest() throws Exception {
//    // Arrange
//    DefaultWebSocketServerFactory defaultWebSocketServerFactory = new DefaultWebSocketServerFactory();
//    InheritedChannel.InheritedSocketChannelImpl channel = (InheritedChannel.InheritedSocketChannelImpl) null;
//    SelectionKeyImpl key = (SelectionKeyImpl) null;
//
//    // Act
//    SocketChannel actual = defaultWebSocketServerFactory.wrapChannel(channel, key);
//
//    // Assert
//    Assert.assertEquals(null, actual);
//  }
//  @org.junit.Rule
//  public Timeout timeout = new Timeout(10000);
//}
//
//package org.java_websocket;
//
//import java.util.concurrent.ForkJoinPool;
//import javax.net.ssl.SSLEngine;
//import org.java_websocket.SSLSocketChannel;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.rules.ExpectedException;
//import org.junit.rules.Timeout;
//import sun.nio.ch.InheritedChannel;
//import sun.nio.ch.SelectionKeyImpl;
//
//public class SSLSocketChannel_SSLSocketChannelTest_1_Test {
//  @Test
//  public void SSLSocketChannelTest() throws Exception {
//    // Arrange
//    InheritedChannel.InheritedSocketChannelImpl inputSocketChannel = (InheritedChannel.InheritedSocketChannelImpl) null;
//    SSLEngine inputEngine = (SSLEngine) null;
//    ForkJoinPool inputExecutor = new ForkJoinPool();
//    SelectionKeyImpl key = (SelectionKeyImpl) null;
//
//    // Act and Assert
//    thrown.expect(IllegalArgumentException.class);
//    new SSLSocketChannel(inputSocketChannel, inputEngine, inputExecutor, key);
//  }
//  @Rule
//  public Timeout timeout = new Timeout(10000);
//  @Rule
//  public ExpectedException thrown = ExpectedException.none();
//}
//
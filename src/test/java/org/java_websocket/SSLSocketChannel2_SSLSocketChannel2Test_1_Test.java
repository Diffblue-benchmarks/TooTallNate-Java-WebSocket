//package org.java_websocket;
//
//import java.util.concurrent.ForkJoinPool;
//import javax.net.ssl.SSLEngine;
//import org.java_websocket.SSLSocketChannel2;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.rules.ExpectedException;
//import org.junit.rules.Timeout;
//import sun.nio.ch.InheritedChannel;
//import sun.nio.ch.SelectionKeyImpl;
//
//public class SSLSocketChannel2_SSLSocketChannel2Test_1_Test {
//  @Test
//  public void SSLSocketChannel2Test() throws Exception {
//    // Arrange
//    InheritedChannel.InheritedSocketChannelImpl channel = (InheritedChannel.InheritedSocketChannelImpl) null;
//    SSLEngine sslEngine = (SSLEngine) null;
//    ForkJoinPool exec = new ForkJoinPool();
//    SelectionKeyImpl key = (SelectionKeyImpl) null;
//
//    // Act and Assert
//    thrown.expect(IllegalArgumentException.class);
//    new SSLSocketChannel2(channel, sslEngine, exec, key);
//  }
//  @Rule
//  public Timeout timeout = new Timeout(10000);
//  @Rule
//  public ExpectedException thrown = ExpectedException.none();
//}
//
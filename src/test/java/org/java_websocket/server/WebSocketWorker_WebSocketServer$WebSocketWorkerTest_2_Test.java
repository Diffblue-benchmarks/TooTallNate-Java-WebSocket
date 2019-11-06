package org.java_websocket.server;

import org.java_websocket.server.WebSocketServer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WebSocketWorker_WebSocketServer$WebSocketWorkerTest_2_Test {
  @Test
  public void WebSocketServer$WebSocketWorkerTest() throws Exception {
    // Arrange
    WebSocketServer this$0 = (WebSocketServer) null;

    // Act
    WebSocketServer.WebSocketWorker webSocketWorker = this$0.new WebSocketWorker();

    // Assert
    ThreadGroup threadGroup = webSocketWorker.getThreadGroup();
    long id = webSocketWorker.getId();
    String name = webSocketWorker.getName();
    String toStringResult = webSocketWorker.toString();
    boolean isDaemonResult = webSocketWorker.isDaemon();
    StackTraceElement[] stackTrace = webSocketWorker.getStackTrace();
    int priority = webSocketWorker.getPriority();
    boolean isInterruptedResult = webSocketWorker.isInterrupted();
    Thread.State state = webSocketWorker.getState();
    String name1 = threadGroup.getName();
    int maxPriority = threadGroup.getMaxPriority();
    String toStringResult1 = threadGroup.toString();
    boolean isDaemonResult1 = threadGroup.isDaemon();
    boolean isDestroyedResult = threadGroup.isDestroyed();
    ThreadGroup parent = threadGroup.getParent();
    Assert.assertEquals(Thread.State.NEW, state);
    Assert.assertEquals(59L, id);
    Assert.assertEquals("Thread[WebSocketWorker-59,5,main]", toStringResult);
    Assert.assertFalse(isInterruptedResult);
    Assert.assertFalse(isDaemonResult);
    Assert.assertEquals("WebSocketWorker-59", name);
    Assert.assertEquals(0, stackTrace.length);
    Assert.assertEquals(5, priority);
    Assert.assertEquals("main", name1);
    Assert.assertEquals(10, maxPriority);
    Assert.assertFalse(isDaemonResult1);
    Assert.assertFalse(isDestroyedResult);
    String name2 = parent.getName();
    int maxPriority1 = parent.getMaxPriority();
    String toStringResult2 = parent.toString();
    boolean isDaemonResult2 = parent.isDaemon();
    boolean isDestroyedResult1 = parent.isDestroyed();
    Assert.assertEquals("java.lang.ThreadGroup[name=main,maxpri=10]", toStringResult1);
    Assert.assertEquals(null, parent.getParent());
    Assert.assertFalse(isDestroyedResult1);
    Assert.assertFalse(isDaemonResult2);
    Assert.assertEquals("java.lang.ThreadGroup[name=system,maxpri=10]", toStringResult2);
    Assert.assertEquals(10, maxPriority1);
    Assert.assertEquals("system", name2);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

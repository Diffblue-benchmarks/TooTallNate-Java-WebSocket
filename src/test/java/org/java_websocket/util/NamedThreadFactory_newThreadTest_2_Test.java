package org.java_websocket.util;

import org.java_websocket.server.WebSocketServer;
import org.java_websocket.util.NamedThreadFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class NamedThreadFactory_newThreadTest_2_Test {
  @Test
  public void newThreadTest() throws Exception {
    // Arrange
    NamedThreadFactory namedThreadFactory = new NamedThreadFactory("aaaaa");
    WebSocketServer.WebSocketWorker runnable = ((WebSocketServer) null).new WebSocketWorker();

    // Act
    Thread actual = namedThreadFactory.newThread(runnable);

    // Assert
    ThreadGroup threadGroup = actual.getThreadGroup();
    long id = actual.getId();
    String name = actual.getName();
    String toStringResult = actual.toString();
    boolean isDaemonResult = actual.isDaemon();
    StackTraceElement[] stackTrace = actual.getStackTrace();
    int priority = actual.getPriority();
    boolean isInterruptedResult = actual.isInterrupted();
    Thread.State state = actual.getState();
    String name1 = threadGroup.getName();
    int maxPriority = threadGroup.getMaxPriority();
    String toStringResult1 = threadGroup.toString();
    boolean isDaemonResult1 = threadGroup.isDaemon();
    boolean isDestroyedResult = threadGroup.isDestroyed();
    ThreadGroup parent = threadGroup.getParent();
    Assert.assertEquals(Thread.State.NEW, state);
    Assert.assertEquals(69L, id);
    Assert.assertEquals("Thread[aaaaa-1,5,main]", toStringResult);
    Assert.assertFalse(isInterruptedResult);
    Assert.assertFalse(isDaemonResult);
    Assert.assertEquals("aaaaa-1", name);
    Assert.assertEquals(0, stackTrace.length);
    Assert.assertEquals(5, priority);
    Assert.assertFalse(isDestroyedResult);
    Assert.assertEquals("main", name1);
    Assert.assertEquals("java.lang.ThreadGroup[name=main,maxpri=10]", toStringResult1);
    Assert.assertFalse(isDaemonResult1);
    String name2 = parent.getName();
    int maxPriority1 = parent.getMaxPriority();
    String toStringResult2 = parent.toString();
    boolean isDaemonResult2 = parent.isDaemon();
    boolean isDestroyedResult1 = parent.isDestroyed();
    Assert.assertEquals(10, maxPriority);
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

package org.java_websocket.util;

import com.diffblue.deeptestutils.Reflector;
import org.java_websocket.server.WebSocketServer.WebSocketWorker;
import org.java_websocket.util.NamedThreadFactory;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class NamedThreadFactoryTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull9997f555437e51c9f7c() {

    // Arrange
    final String arg0 = "aaaaa";

    // Act, creating object to test constructor
    final NamedThreadFactory actual = new NamedThreadFactory(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

//  // Test written by Diffblue Cover
//  @Test
//  public void newThreadInputNotNullOutputNotNull999ace3af1dff1ad9be() {
//
//    // Arrange
//    final NamedThreadFactory thisObj = new NamedThreadFactory("aaaaa");
//    final WebSocketWorker arg0 = null.new WebSocketWorker();
//
//    // Act
//    final Thread actual = thisObj.newThread(arg0);
//
    // Assert side effects
//    Assert.assertNotNull(arg0);
//    Assert.assertEquals(5, ((WebSocketWorker) arg0).getPriority());
//    Assert.assertNull(Reflector.getInstanceField(arg0, "inheritableThreadLocals"));
//    Assert.assertNotNull(((WebSocketWorker) arg0).getThreadGroup());
//    Assert.assertEquals(6, Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "nUnstartedThreads"));
//    Assert.assertEquals("main", ((WebSocketWorker) arg0).getThreadGroup().getName());
//    Assert.assertEquals(10, ((WebSocketWorker) arg0).getThreadGroup().getMaxPriority());
//    Assert.assertFalse(((WebSocketWorker) arg0).getThreadGroup().isDaemon());
//    Assert.assertNotNull(Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "threads"));
//    Assert.assertEquals(4, ((Thread[]) Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "threads")).length);
//    Assert.assertNotNull(((Thread[]) Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "threads"))[0]);
//    Assert.assertEquals(5, ((Thread[]) Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "threads"))[0].getPriority());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "threads"))[0], "inheritableThreadLocals"));
//    Assert.assertNull(((Thread[]) Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "threads"))[0].getThreadGroup());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "threads"))[0], "parkBlocker"));
//    Assert.assertEquals("main", ((Thread[]) Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "threads"))[0].getName());
//    Assert.assertFalse(((Thread[]) Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "threads"))[0].isDaemon());
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "threads"))[0], "threadLocalRandomProbe"));
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "threads"))[0], "threadLocalRandomSecondarySeed"));
//    Assert.assertEquals(0L, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "threads"))[0], "threadLocalRandomSeed"));
//    Assert.assertEquals(1L, ((Thread[]) Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "threads"))[0].getId());
//    Assert.assertNotNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "threads"))[0], "threadLocals"));
//    Assert.assertNotNull(((Thread[]) Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "threads"))[1]);
//    Assert.assertEquals(10, ((Thread[]) Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "threads"))[1].getPriority());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "threads"))[1], "inheritableThreadLocals"));
//    Assert.assertNull(((Thread[]) Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "threads"))[1].getThreadGroup());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "threads"))[1], "parkBlocker"));
//    Assert.assertEquals("jnr.ffi.util.ref.internal.Finalizer", ((Thread[]) Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "threads"))[1].getName());
//    Assert.assertTrue(((Thread[]) Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "threads"))[1].isDaemon());
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "threads"))[1], "threadLocalRandomProbe"));
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "threads"))[1], "threadLocalRandomSecondarySeed"));
//    Assert.assertEquals(0L, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "threads"))[1], "threadLocalRandomSeed"));
//    Assert.assertEquals(10L, ((Thread[]) Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "threads"))[1].getId());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "threads"))[1], "threadLocals"));
//    Assert.assertNotNull(((Thread[]) Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "threads"))[2]);
//    Assert.assertEquals(5, ((Thread[]) Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "threads"))[2].getPriority());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "threads"))[2], "inheritableThreadLocals"));
//    Assert.assertNull(((Thread[]) Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "threads"))[2].getThreadGroup());
//    Assert.assertNotNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "threads"))[2], "parkBlocker"));
//    Assert.assertNotNull(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "threads"))[2], "parkBlocker"), "head"));
//    Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "match"));
//    Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "item"));
//    Assert.assertNotNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "next"));
//    Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "next"), "match"));
//    Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "next"), "item"));
//    Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "next"), "next"));
//    Assert.assertEquals(0, Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "next"), "mode"));
//    Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "next"), "waiter"));
//    Assert.assertEquals(0, Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "mode"));
//    Assert.assertNotNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "waiter"));
//    Assert.assertEquals(5, ((Thread) Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "waiter")).getPriority());
//    Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "waiter"), "inheritableThreadLocals"));
//    Assert.assertNull(((Thread) Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "waiter")).getThreadGroup());
//    Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "waiter"), "parkBlocker"));
//    Assert.assertEquals("pool-1-thread-2", ((Thread) Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "waiter")).getName());
//    Assert.assertFalse(((Thread) Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "waiter")).isDaemon());
//    Assert.assertEquals(0, Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "waiter"), "threadLocalRandomProbe"));
//    Assert.assertEquals(0, Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "waiter"), "threadLocalRandomSecondarySeed"));
//    Assert.assertEquals(0L, Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "waiter"), "threadLocalRandomSeed"));
//    Assert.assertEquals(12L, ((Thread) Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "waiter")).getId());
//    Assert.assertNotNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "waiter"), "threadLocals"));
//    Assert.assertEquals("pool-1-thread-1", ((Thread[]) Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "threads"))[2].getName());
//    Assert.assertFalse(((Thread[]) Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "threads"))[2].isDaemon());
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "threads"))[2], "threadLocalRandomProbe"));
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "threads"))[2], "threadLocalRandomSecondarySeed"));
//    Assert.assertEquals(0L, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "threads"))[2], "threadLocalRandomSeed"));
//    Assert.assertEquals(11L, ((Thread[]) Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "threads"))[2].getId());
//    Assert.assertNotNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "threads"))[2], "threadLocals"));
//    Assert.assertEquals(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "waiter"), ((Thread[]) Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "threads"))[3]);
//    Assert.assertFalse(((WebSocketWorker) arg0).getThreadGroup().isDestroyed());
//    Assert.assertNull(Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "groups"));
//    Assert.assertEquals(0, Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "ngroups"));
//    Assert.assertFalse((Boolean) Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "vmAllowSuspension"));
//    Assert.assertEquals(4, Reflector.getInstanceField(((WebSocketWorker) arg0).getThreadGroup(), "nthreads"));
//    Assert.assertNull(Reflector.getInstanceField(arg0, "parkBlocker"));
//    Assert.assertEquals("WebSocketWorker-16", ((WebSocketWorker) arg0).getName());
//    Assert.assertFalse(((WebSocketWorker) arg0).isDaemon());
//    Assert.assertEquals(0, Reflector.getInstanceField(arg0, "threadLocalRandomProbe"));
//    Assert.assertEquals(0, Reflector.getInstanceField(arg0, "threadLocalRandomSecondarySeed"));
//    Assert.assertEquals(0L, Reflector.getInstanceField(arg0, "threadLocalRandomSeed"));
//    Assert.assertEquals(16L, ((WebSocketWorker) arg0).getId());
//    Assert.assertNull(Reflector.getInstanceField(arg0, "threadLocals"));
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertEquals(5, actual.getPriority());
//    Assert.assertNull(Reflector.getInstanceField(actual, "inheritableThreadLocals"));
//    Assert.assertNotNull(actual.getThreadGroup());
//    Assert.assertEquals(6, Reflector.getInstanceField(actual.getThreadGroup(), "nUnstartedThreads"));
//    Assert.assertEquals("main", actual.getThreadGroup().getName());
//    Assert.assertEquals(10, actual.getThreadGroup().getMaxPriority());
//    Assert.assertFalse(actual.getThreadGroup().isDaemon());
//    Assert.assertNotNull(Reflector.getInstanceField(actual.getThreadGroup(), "threads"));
//    Assert.assertEquals(4, ((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads")).length);
//    Assert.assertNotNull(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[0]);
//    Assert.assertEquals(5, ((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[0].getPriority());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[0], "inheritableThreadLocals"));
//    Assert.assertNull(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[0].getThreadGroup());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[0], "parkBlocker"));
//    Assert.assertEquals("main", ((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[0].getName());
//    Assert.assertFalse(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[0].isDaemon());
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[0], "threadLocalRandomProbe"));
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[0], "threadLocalRandomSecondarySeed"));
//    Assert.assertEquals(0L, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[0], "threadLocalRandomSeed"));
//    Assert.assertEquals(1L, ((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[0].getId());
//    Assert.assertNotNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[0], "threadLocals"));
//    Assert.assertNotNull(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[1]);
//    Assert.assertEquals(10, ((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[1].getPriority());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[1], "inheritableThreadLocals"));
//    Assert.assertNull(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[1].getThreadGroup());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[1], "parkBlocker"));
//    Assert.assertEquals("jnr.ffi.util.ref.internal.Finalizer", ((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[1].getName());
//    Assert.assertTrue(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[1].isDaemon());
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[1], "threadLocalRandomProbe"));
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[1], "threadLocalRandomSecondarySeed"));
//    Assert.assertEquals(0L, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[1], "threadLocalRandomSeed"));
//    Assert.assertEquals(10L, ((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[1].getId());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[1], "threadLocals"));
//    Assert.assertNotNull(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2]);
//    Assert.assertEquals(5, ((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2].getPriority());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2], "inheritableThreadLocals"));
//    Assert.assertNull(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2].getThreadGroup());
//    Assert.assertNotNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2], "parkBlocker"));
//    Assert.assertNotNull(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2], "parkBlocker"), "head"));
//    Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "match"));
//    Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "item"));
//    Assert.assertNotNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "next"));
//    Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "next"), "match"));
//    Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "next"), "item"));
//    Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "next"), "next"));
//    Assert.assertEquals(0, Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "next"), "mode"));
//    Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "next"), "waiter"));
//    Assert.assertEquals(0, Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "mode"));
//    Assert.assertNotNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "waiter"));
//    Assert.assertEquals(5, ((Thread) Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "waiter")).getPriority());
//    Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "waiter"), "inheritableThreadLocals"));
//    Assert.assertNull(((Thread) Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "waiter")).getThreadGroup());
//    Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "waiter"), "parkBlocker"));
//    Assert.assertEquals("pool-1-thread-2", ((Thread) Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "waiter")).getName());
//    Assert.assertFalse(((Thread) Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "waiter")).isDaemon());
//    Assert.assertEquals(0, Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "waiter"), "threadLocalRandomProbe"));
//    Assert.assertEquals(0, Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "waiter"), "threadLocalRandomSecondarySeed"));
//    Assert.assertEquals(0L, Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "waiter"), "threadLocalRandomSeed"));
//    Assert.assertEquals(12L, ((Thread) Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "waiter")).getId());
//    Assert.assertNotNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "waiter"), "threadLocals"));
//    Assert.assertEquals("pool-1-thread-1", ((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2].getName());
//    Assert.assertFalse(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2].isDaemon());
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2], "threadLocalRandomProbe"));
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2], "threadLocalRandomSecondarySeed"));
//    Assert.assertEquals(0L, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2], "threadLocalRandomSeed"));
//    Assert.assertEquals(11L, ((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2].getId());
//    Assert.assertNotNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2], "threadLocals"));
//    Assert.assertEquals(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "waiter"), ((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[3]);
//    Assert.assertFalse(actual.getThreadGroup().isDestroyed());
//    Assert.assertNull(Reflector.getInstanceField(actual.getThreadGroup(), "groups"));
//    Assert.assertEquals(0, Reflector.getInstanceField(actual.getThreadGroup(), "ngroups"));
//    Assert.assertFalse((Boolean) Reflector.getInstanceField(actual.getThreadGroup(), "vmAllowSuspension"));
//    Assert.assertEquals(4, Reflector.getInstanceField(actual.getThreadGroup(), "nthreads"));
//    Assert.assertNull(Reflector.getInstanceField(actual, "parkBlocker"));
//    Assert.assertEquals("aaaaa-1", actual.getName());
//    Assert.assertFalse(actual.isDaemon());
//    Assert.assertEquals(0, Reflector.getInstanceField(actual, "threadLocalRandomProbe"));
//    Assert.assertEquals(0, Reflector.getInstanceField(actual, "threadLocalRandomSecondarySeed"));
//    Assert.assertEquals(0L, Reflector.getInstanceField(actual, "threadLocalRandomSeed"));
//    Assert.assertEquals(17L, actual.getId());
//    Assert.assertNull(Reflector.getInstanceField(actual, "threadLocals"));
//
//  }
}

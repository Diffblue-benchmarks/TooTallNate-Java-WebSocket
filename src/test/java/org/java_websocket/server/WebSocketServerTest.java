package org.java_websocket.server;

import com.diffblue.deeptestutils.Reflector;
import org.java_websocket.WebSocketImpl;
import org.java_websocket.server.WebSocketServer.WebSocketWorker;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class WebSocketServerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

//  // Test written by Diffblue Cover
//  @Test
//  public void putInputNullOutputNullPointerException999d2ff27c0c4db9cca() throws InterruptedException {
//
//    // Arrange
//    final WebSocketWorker thisObj = null.new WebSocketWorker();
//    final WebSocketImpl arg0 = null;
//    try {
//
//      // Act
//      thrown.expect(NullPointerException.class);
//      thisObj.put(arg0);
//    } catch (NullPointerException ex) {
//
//      // Assert side effects
//      Assert.assertNotNull(thisObj.getThreadGroup());
//      Assert.assertEquals(2, Reflector.getInstanceField(thisObj.getThreadGroup(), "nUnstartedThreads"));
//      Assert.assertEquals("main", thisObj.getThreadGroup().getName());
//      Assert.assertEquals(10, thisObj.getThreadGroup().getMaxPriority());
//      Assert.assertFalse(thisObj.getThreadGroup().isDaemon());
//      Assert.assertNotNull(Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"));
//      Assert.assertEquals(4, ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads")).length);
//      Assert.assertNotNull(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[0]);
//      Assert.assertEquals(5, ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[0].getPriority());
//      Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[0], "inheritableThreadLocals"));
//      Assert.assertNull(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[0].getThreadGroup());
//      Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[0], "parkBlocker"));
//      Assert.assertEquals("main", ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[0].getName());
//      Assert.assertFalse(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[0].isDaemon());
//      Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[0], "threadLocalRandomProbe"));
//      Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[0], "threadLocalRandomSecondarySeed"));
//      Assert.assertEquals(0L, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[0], "threadLocalRandomSeed"));
//      Assert.assertEquals(1L, ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[0].getId());
//      Assert.assertNotNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[0], "threadLocals"));
//      Assert.assertNotNull(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[1]);
//      Assert.assertEquals(10, ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[1].getPriority());
//      Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[1], "inheritableThreadLocals"));
//      Assert.assertNull(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[1].getThreadGroup());
//      Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[1], "parkBlocker"));
//      Assert.assertEquals("jnr.ffi.util.ref.internal.Finalizer", ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[1].getName());
//      Assert.assertTrue(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[1].isDaemon());
//      Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[1], "threadLocalRandomProbe"));
//      Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[1], "threadLocalRandomSecondarySeed"));
//      Assert.assertEquals(0L, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[1], "threadLocalRandomSeed"));
//      Assert.assertEquals(10L, ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[1].getId());
//      Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[1], "threadLocals"));
//      Assert.assertNotNull(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2]);
//      Assert.assertEquals(5, ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2].getPriority());
//      Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2], "inheritableThreadLocals"));
//      Assert.assertNull(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2].getThreadGroup());
//      Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2], "parkBlocker"));
//      Assert.assertEquals("pool-1-thread-1", ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2].getName());
//      Assert.assertFalse(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2].isDaemon());
//      Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2], "threadLocalRandomProbe"));
//      Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2], "threadLocalRandomSecondarySeed"));
//      Assert.assertEquals(0L, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2], "threadLocalRandomSeed"));
//      Assert.assertEquals(11L, ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2].getId());
//      Assert.assertNotNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2], "threadLocals"));
//      Assert.assertNotNull(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3]);
//      Assert.assertEquals(5, ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3].getPriority());
//      Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3], "inheritableThreadLocals"));
//      Assert.assertNull(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3].getThreadGroup());
//      Assert.assertNotNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3], "parkBlocker"));
//      Assert.assertNotNull(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3], "parkBlocker"), "head"));
//      Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3], "parkBlocker"), "head"), "match"));
//      Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3], "parkBlocker"), "head"), "item"));
//      Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3], "parkBlocker"), "head"), "next"));
//      Assert.assertEquals(0, Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3], "parkBlocker"), "head"), "mode"));
//      Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3], "parkBlocker"), "head"), "waiter"));
//      Assert.assertEquals("pool-1-thread-2", ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3].getName());
//      Assert.assertFalse(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3].isDaemon());
//      Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3], "threadLocalRandomProbe"));
//      Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3], "threadLocalRandomSecondarySeed"));
//      Assert.assertEquals(0L, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3], "threadLocalRandomSeed"));
//      Assert.assertEquals(12L, ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3].getId());
//      Assert.assertNotNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3], "threadLocals"));
//      Assert.assertFalse(thisObj.getThreadGroup().isDestroyed());
//      Assert.assertNull(Reflector.getInstanceField(thisObj.getThreadGroup(), "groups"));
//      Assert.assertEquals(0, Reflector.getInstanceField(thisObj.getThreadGroup(), "ngroups"));
//      Assert.assertFalse((Boolean) Reflector.getInstanceField(thisObj.getThreadGroup(), "vmAllowSuspension"));
//      Assert.assertEquals(4, Reflector.getInstanceField(thisObj.getThreadGroup(), "nthreads"));
//      throw ex;
//    }
//
//  }
}

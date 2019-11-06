package org.java_websocket.drafts;

import java.util.ArrayList;
import org.java_websocket.drafts.Draft_6455;
import org.java_websocket.extensions.DefaultExtension;
import org.java_websocket.extensions.IExtension;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class Draft_6455_Draft_6455Test_17_Test {
  @Test
  public void Draft_6455Test() throws Exception {
    // Arrange
    ArrayList<IExtension> arrayList = new ArrayList<IExtension>();
    arrayList.add(new DefaultExtension());
    int inputMaxFrameSize = -128;

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    new Draft_6455(arrayList, inputMaxFrameSize);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}

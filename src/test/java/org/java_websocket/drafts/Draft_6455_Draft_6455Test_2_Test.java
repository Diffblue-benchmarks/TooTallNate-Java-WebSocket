package org.java_websocket.drafts;

import java.util.ArrayList;
import org.java_websocket.drafts.Draft_6455;
import org.java_websocket.extensions.DefaultExtension;
import org.java_websocket.extensions.IExtension;
import org.java_websocket.protocols.IProtocol;
import org.java_websocket.protocols.Protocol;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class Draft_6455_Draft_6455Test_2_Test {
  @Test
  public void Draft_6455Test() throws Exception {
    // Arrange
    ArrayList<IExtension> arrayList = new ArrayList<IExtension>();
    arrayList.add(new DefaultExtension());
    ArrayList<IProtocol> arrayList1 = new ArrayList<IProtocol>();
    arrayList1.add(new Protocol(""));
    int inputMaxFrameSize = -128;

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    new Draft_6455(arrayList, arrayList1, inputMaxFrameSize);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}

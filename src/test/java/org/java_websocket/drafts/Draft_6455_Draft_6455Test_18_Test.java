package org.java_websocket.drafts;

import java.util.ArrayList;
import java.util.List;
import org.java_websocket.drafts.Draft_6455;
import org.java_websocket.enums.CloseHandshakeType;
import org.java_websocket.enums.Role;
import org.java_websocket.extensions.DefaultExtension;
import org.java_websocket.extensions.IExtension;
import org.java_websocket.protocols.IProtocol;
import org.java_websocket.protocols.Protocol;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Draft_6455_Draft_6455Test_18_Test {
  @Test
  public void Draft_6455Test() throws Exception {
    // Arrange
    ArrayList<IExtension> arrayList = new ArrayList<IExtension>();
    arrayList.add(new DefaultExtension());
    ArrayList<IProtocol> arrayList1 = new ArrayList<IProtocol>();
    arrayList1.add(new Protocol(""));

    // Act
    Draft_6455 draft_6455 = new Draft_6455(arrayList, arrayList1);

    // Assert
    List<IProtocol> knownProtocols = draft_6455.getKnownProtocols();
    Role role = draft_6455.getRole();
    String toStringResult = draft_6455.toString();
    IExtension extension = draft_6455.getExtension();
    List<IExtension> knownExtensions = draft_6455.getKnownExtensions();
    IProtocol protocol = draft_6455.getProtocol();
    int maxFrameSize = draft_6455.getMaxFrameSize();
    Assert.assertTrue(knownProtocols instanceof ArrayList);
    Assert.assertEquals(CloseHandshakeType.TWOWAY, draft_6455.getCloseHandshakeType());
    Assert.assertEquals(1, knownProtocols.size());
    IProtocol getResult = knownProtocols.get(0);
    Assert.assertEquals(2147483647, maxFrameSize);
    Assert.assertEquals(null, role);
    Assert.assertEquals(null, protocol);
    Assert.assertTrue(knownExtensions instanceof ArrayList);
    Assert.assertTrue(extension instanceof DefaultExtension);
    Assert.assertEquals(1, knownExtensions.size());
    IExtension getResult1 = knownExtensions.get(0);
    String toStringResult1 = extension.toString();
    String providedExtensionAsClient = extension.getProvidedExtensionAsClient();
    Assert.assertEquals("Draft_6455 extension: DefaultExtension max frame size: 2147483647", toStringResult);
    Assert.assertEquals("", extension.getProvidedExtensionAsServer());
    Assert.assertEquals("", providedExtensionAsClient);
    Assert.assertEquals("DefaultExtension", toStringResult1);
    Assert.assertTrue(getResult1 instanceof DefaultExtension);
    Assert.assertTrue(getResult instanceof Protocol);
    String toStringResult2 = getResult1.toString();
    String providedExtensionAsClient1 = getResult1.getProvidedExtensionAsClient();
    String providedExtensionAsServer = getResult1.getProvidedExtensionAsServer();
    String toStringResult3 = getResult.toString();
    Assert.assertEquals("", providedExtensionAsServer);
    Assert.assertEquals("", getResult.getProvidedProtocol());
    Assert.assertEquals("", toStringResult3);
    Assert.assertEquals("", providedExtensionAsClient1);
    Assert.assertEquals("DefaultExtension", toStringResult2);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

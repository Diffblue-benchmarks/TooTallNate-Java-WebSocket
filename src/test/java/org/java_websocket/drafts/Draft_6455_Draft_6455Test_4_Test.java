package org.java_websocket.drafts;

import java.util.List;
import org.java_websocket.drafts.Draft_6455;
import org.java_websocket.enums.CloseHandshakeType;
import org.java_websocket.enums.Role;
import org.java_websocket.extensions.IExtension;
import org.java_websocket.protocols.IProtocol;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Draft_6455_Draft_6455Test_4_Test {
  @Test
  public void Draft_6455Test() throws Exception {
    // Arrange and Act
    Draft_6455 draft_6455 = new Draft_6455();

    // Assert
    Role role = draft_6455.getRole();
    String toStringResult = draft_6455.toString();
    IExtension extension = draft_6455.getExtension();
    List<IExtension> knownExtensions = draft_6455.getKnownExtensions();
    IProtocol protocol = draft_6455.getProtocol();
    int maxFrameSize = draft_6455.getMaxFrameSize();
    Assert.assertEquals(null, role);
    Assert.assertEquals(CloseHandshakeType.TWOWAY, draft_6455.getCloseHandshakeType());
    Assert.assertEquals(2147483647, maxFrameSize);
    Assert.assertEquals(null, protocol);
    Assert.assertTrue(knownExtensions instanceof java.util.ArrayList);
    Assert.assertTrue(extension instanceof org.java_websocket.extensions.DefaultExtension);
    Assert.assertEquals(1, knownExtensions.size());
    String toStringResult1 = extension.toString();
    String providedExtensionAsClient = extension.getProvidedExtensionAsClient();
    Assert.assertEquals("Draft_6455 extension: DefaultExtension max frame size: 2147483647", toStringResult);
    Assert.assertEquals("", extension.getProvidedExtensionAsServer());
    Assert.assertEquals("", providedExtensionAsClient);
    Assert.assertEquals("DefaultExtension", toStringResult1);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

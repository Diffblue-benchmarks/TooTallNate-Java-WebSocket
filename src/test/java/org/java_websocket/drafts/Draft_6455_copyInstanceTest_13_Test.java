package org.java_websocket.drafts;

import java.util.List;
import org.java_websocket.drafts.Draft;
import org.java_websocket.drafts.Draft_6455;
import org.java_websocket.enums.CloseHandshakeType;
import org.java_websocket.enums.Role;
import org.java_websocket.extensions.IExtension;
import org.java_websocket.protocols.IProtocol;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Draft_6455_copyInstanceTest_13_Test {
  @Test
  public void copyInstanceTest() throws Exception {
    // Arrange
    Draft_6455 draft_6455 = new Draft_6455();

    // Act
    Draft actual = draft_6455.copyInstance();

    // Assert
    Assert.assertTrue(actual instanceof Draft_6455);
    Role role = actual.getRole();
    String toStringResult = actual.toString();
    IExtension extension = ((Draft_6455) actual).getExtension();
    List<IExtension> knownExtensions = ((Draft_6455) actual).getKnownExtensions();
    IProtocol protocol = ((Draft_6455) actual).getProtocol();
    int maxFrameSize = ((Draft_6455) actual).getMaxFrameSize();
    Assert.assertEquals(null, role);
    Assert.assertEquals(CloseHandshakeType.TWOWAY, actual.getCloseHandshakeType());
    Assert.assertEquals(2147483647, maxFrameSize);
    Assert.assertEquals(null, protocol);
    Assert.assertTrue(knownExtensions instanceof java.util.ArrayList);
    Assert.assertTrue(extension instanceof org.java_websocket.extensions.DefaultExtension);
    Assert.assertEquals(1, knownExtensions.size());
    IExtension getResult = knownExtensions.get(0);
    String toStringResult1 = extension.toString();
    String providedExtensionAsClient = extension.getProvidedExtensionAsClient();
    Assert.assertEquals("Draft_6455 extension: DefaultExtension max frame size: 2147483647", toStringResult);
    Assert.assertEquals("", extension.getProvidedExtensionAsServer());
    Assert.assertEquals("", providedExtensionAsClient);
    Assert.assertEquals("DefaultExtension", toStringResult1);
    Assert.assertTrue(getResult instanceof org.java_websocket.extensions.DefaultExtension);
    String toStringResult2 = getResult.toString();
    String providedExtensionAsClient1 = getResult.getProvidedExtensionAsClient();
    Assert.assertEquals("DefaultExtension", toStringResult2);
    Assert.assertEquals("", getResult.getProvidedExtensionAsServer());
    Assert.assertEquals("", providedExtensionAsClient1);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

package org.java_websocket.drafts;

import java.util.List;
import org.java_websocket.drafts.Draft_6455;
import org.java_websocket.extensions.IExtension;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Draft_6455_getKnownExtensionsTest_14_Test {
  @Test
  public void getKnownExtensionsTest() throws Exception {
    // Arrange
    Draft_6455 draft_6455 = new Draft_6455();

    // Act
    List<IExtension> actual = draft_6455.getKnownExtensions();

    // Assert
    Assert.assertTrue(actual instanceof java.util.ArrayList);
    Assert.assertEquals(1, actual.size());
    IExtension getResult = actual.get(0);
    Assert.assertTrue(getResult instanceof org.java_websocket.extensions.DefaultExtension);
    String toStringResult = getResult.toString();
    String providedExtensionAsClient = getResult.getProvidedExtensionAsClient();
    Assert.assertEquals("DefaultExtension", toStringResult);
    Assert.assertEquals("", getResult.getProvidedExtensionAsServer());
    Assert.assertEquals("", providedExtensionAsClient);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}

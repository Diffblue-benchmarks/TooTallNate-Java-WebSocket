package org.java_websocket.enums;

import org.java_websocket.enums.Role;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class RoleTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void valueOfInputNotNullOutputClient999aca30be47d46de84() {

    // Arrange
    final String arg0 = "CLIENT";

    // Act
    final Role actual = Role.valueOf(arg0);

    // Assert result
    Assert.assertEquals(Role.CLIENT, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void valuesOutput29992381af6e328272e9() {

    // Act
    final Role[] actual = Role.values();

    // Assert result
    Assert.assertArrayEquals(new Role[]{ Role.CLIENT, Role.SERVER }, actual);

  }
}

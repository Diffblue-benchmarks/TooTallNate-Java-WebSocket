package org.java_websocket.util;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.IOException;

public class Base64Test {

	@Rule public final ExpectedException thrown = ExpectedException.none();

	@Test
	public void testEncodeBytes() throws IOException {
		Assert.assertEquals("", Base64.encodeBytes(new byte[0]));
		Assert.assertEquals("QHE=",
			Base64.encodeBytes(new byte[] {49, 121, 64, 113, -63, 43, -24, 62, 4, 48}, 2, 2, 0));
	}

	@Test
	public void testEncodeBytes2() throws IOException {
		thrown.expect(IllegalArgumentException.class);
		Base64.encodeBytes(new byte[0], -2, -2, -56);
	}

	@Test
	public void testEncodeBytes3() throws IOException {
		thrown.expect(IllegalArgumentException.class);
		Base64.encodeBytes(new byte[] {64, -128, 32, 18, 16, 16, 0, 18, 16},
			2064072977, -2064007440, 10);
	}

	@Test
	public void testEncodeBytes4() {
		thrown.expect(NullPointerException.class);
		Base64.encodeBytes(null);
	}

	@Test
	public void testEncodeBytes5() throws IOException {
		thrown.expect(IllegalArgumentException.class);
		Base64.encodeBytes(null, 32766, 0, 8);
	}

	@Test
	public void testEncodeBytesToBytes1() throws IOException {
		Assert.assertArrayEquals(new byte[] {95, 68, 111, 78, 55, 45, 61, 61},
			Base64.encodeBytesToBytes(new byte[] {-108, -19, 24, 32}, 0, 4, 32));
		Assert.assertArrayEquals(new byte[] {95, 68, 111, 78, 55, 67, 111, 61},
			Base64.encodeBytesToBytes(new byte[] {-108, -19, 24, 32, -35}, 0, 5, 40));
		Assert.assertArrayEquals(new byte[] {95, 68, 111, 78, 55, 67, 111, 61},
			Base64.encodeBytesToBytes(new byte[] {-108, -19, 24, 32, -35}, 0, 5, 32));
		Assert.assertArrayEquals(new byte[] {87, 50, 77, 61},
			Base64.encodeBytesToBytes(new byte[] {115, 42, 123, 99, 10, -33, 75, 30, 91, 99}, 8, 2, 48));
		Assert.assertArrayEquals(new byte[] {87, 50, 77, 61},
			Base64.encodeBytesToBytes(new byte[] {115, 42, 123, 99, 10, -33, 75, 30, 91, 99}, 8, 2, 56));
		Assert.assertArrayEquals(new byte[] {76, 53, 66, 61},
			Base64.encodeBytesToBytes(new byte[] {113, 42, 123, 99, 10, -33, 75, 30, 88, 99}, 8, 2, 36));Assert.assertArrayEquals(new byte[] {87, 71, 77, 61},
			Base64.encodeBytesToBytes(new byte[] {113, 42, 123, 99, 10, -33, 75, 30, 88, 99}, 8, 2, 4));
	}

	@Test
	public void testEncodeBytesToBytes2() throws IOException {
		thrown.expect(IllegalArgumentException.class);
		Base64.encodeBytesToBytes(new byte[] {83, 10,	91, 67, 42, -1, 107, 62, 91, 67}, 8, 6, 26);
	}
}

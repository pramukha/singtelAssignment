package com.singtel.service.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.singtel.Bird;

import static org.mockito.Matchers.matches;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.io.PrintStream;

class BirdTest {

	@Test
	void test() {
		Bird b1 = new Bird();
//		assertEquals("I am singing",b1.sing());
		mock(Bird.class);
		PrintStream out = mock(PrintStream.class);
        System.setOut(out);
        b1.sing();
        verify(out).println(matches("I am singing"));
	}

}

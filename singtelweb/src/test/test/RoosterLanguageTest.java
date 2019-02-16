package com.singtel.service.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Matchers.matches;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.io.PrintStream;

import org.junit.jupiter.api.Test;

import com.singtel.Rooster;

class RoosterLanguageTest {

	@Test
	void test() {
		Rooster r1 = new Rooster();
		mock(Rooster.class);
		PrintStream out = mock(PrintStream.class);
        System.setOut(out);
		r1.sound("Dutch");
        verify(out).println(matches("kukeleku"));
	}

}

package com.singtel.service.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Matchers.matches;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.io.PrintStream;

import org.junit.jupiter.api.Test;

import com.singtel.Dog;
import com.singtel.IMakeSound;
import com.singtel.Parrot;

class ParrotTest {

	@Test
	void test() {
		Parrot p1 = new Parrot();
		mock(Parrot.class);
		PrintStream out = mock(PrintStream.class);
        System.setOut(out);
        IMakeSound dog = new Dog();
		p1.livingWith(dog);
		p1.sound();
        verify(out).println(matches("Woof, woof"));
	}

}

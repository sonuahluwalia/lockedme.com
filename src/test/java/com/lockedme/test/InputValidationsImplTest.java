package com.lockedme.test;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.lockedme.InputValidationsImpl;

public class InputValidationsImplTest {
	static InputValidationsImpl input;

	@BeforeClass
	public static void initializationTest() {
		input = new InputValidationsImpl();

	}

	@Test 
	public void testReadMainOption() {
		try {
			assertEquals(1, input.readMainOption());
			assertEquals(2, input.readMainOption());
			assertEquals(3, input.readMainOption());

		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test 
	public void testReadOption2() {
		try {
			//input.readMainOption();
			assertEquals(1, input.readOption2());
			assertEquals(2, input.readOption2());
			assertEquals(3, input.readOption2());
			assertEquals(4, input.readOption2());
			

		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}

	}

	@Test
	public void testReadFilename() {
		assertEquals("sonu.txt", input.readFilename());
		assertEquals("sonu1.txt", input.readFilename());
		assertEquals("sonu2.txt", input.readFilename());		
		
	}

}

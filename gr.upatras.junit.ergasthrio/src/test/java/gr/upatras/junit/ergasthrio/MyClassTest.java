package gr.upatras.junit.ergasthrio;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyClassTest {

	@Test
    void testafaireshforPOSITIVE() {
		MyClass tester = new MyClass();
        assertEquals("POSITIVE", tester.afairesh(10, 5), "Expected result is POSITIVE");
	}
    @Test
    void testafaireshforNEGATIVE() {
    	MyClass tester = new MyClass();
        assertEquals("NEGATIVE", tester.afairesh(5, 10), "Expected result is NEGATIVE");
	}
}
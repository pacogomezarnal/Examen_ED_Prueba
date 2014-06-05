package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import codigo.Suma;

public class PruebaSuma {
	Suma s=new Suma();

	@Before
	public void setUp() throws Exception {
		s.setA(10);
		s.setB(5);
	}

	@Test
	public void test() {
		assertEquals(15,s.sumar());
	}

}

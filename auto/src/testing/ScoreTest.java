package testing;

import org.junit.Test;
//import junit.framework.Test;
import junit.framework.TestCase;
//import junit.framework.TestSuite;


public class ScoreTest extends TestCase{
	
	Grade grade = new Grade();
	
	@Test
	public void testX() {
		char output = grade.letterGrade(110);
		assertEquals('X', output);
	}
	

	@Test
	public void testA2() {
		char output = grade.letterGrade(95);
		assertEquals('A', output);
	}
	
	
	@Test
	public void testB() {
		char output = grade.letterGrade(85);
		assertEquals('B', output);
	}
	
	
	@Test
	public void testC2() {
		char output = grade.letterGrade(75);
		assertEquals('C', output);
	}
	
	
	@Test
	public void testD2() {
		char output = grade.letterGrade(65);
		assertEquals('D', output);
	}
		
	@Test
	public void testF() {
		char output = grade.letterGrade(40);
		assertEquals('F', output);
	}
	
	@Test
	public void testF2() {
		char output = grade.letterGrade(30);
		assertEquals('F', output);
	}
	
	@Test
	public void testbva1() {
		char output = grade.letterGrade(-2);
		assertEquals('X', output);
	}
	
	@Test
	public void testbva2() {
		char output = grade.letterGrade(-1);
		assertEquals('X', output);
	}
	
	@Test
	public void testbva3() {
		char output = grade.letterGrade(0);
		assertEquals('F', output);
	}
	
	@Test
	public void testbva4() {
		char output = grade.letterGrade(1);
		assertEquals('F', output);
	}
	
	@Test
	public void testbva5() {
		char output = grade.letterGrade(99);
		assertEquals('A', output);
	}
	
	@Test
	public void testbva6() {
		char output = grade.letterGrade(100);
		assertEquals('A', output);

	}
	
	@Test
	public void testbva7() {
		char output = grade.letterGrade(101);
		assertEquals('X', output);
		
	}
	
	@Test
	public void testA3() {
		char output = grade.letterGrade(90);
		assertEquals('A', output);
	}
	
	@Test
	public void testB2() {
		char output = grade.letterGrade(80);
		assertEquals('B', output);
	}
	
	@Test
	public void testC() {
		char output = grade.letterGrade(70);
		assertEquals('C', output);
	}
	
	@Test
	public void testE() {
		char output = grade.letterGrade(60);
		assertEquals('D', output);
	}
	
}

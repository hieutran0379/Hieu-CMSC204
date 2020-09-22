import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class GradeBookTest {

	GradeBook gradeBook1;
	GradeBook gradeBook2;


	@Before
	public void setUp() throws Exception {
		gradeBook1 = new GradeBook(5);
		gradeBook1.addScore(55);
		gradeBook1.addScore(70);
		gradeBook1.addScore(88);
		gradeBook1.addScore(40);
		gradeBook1.addScore(90);

		gradeBook2 = new GradeBook(5);
		gradeBook2.addScore(59);
		gradeBook2.addScore(45);
		gradeBook2.addScore(64);
		gradeBook2.addScore(73);
		gradeBook2.addScore(99);}

	@After
	public void tearDown() throws Exception {
		gradeBook1 = null;
		gradeBook2 = null;

}

	@Test
	public void addScoreTest() {
		assertTrue(gradeBook1.toString().equals("55.0 70.0 88.0 40.0 90.0 "));
		assertTrue(gradeBook2.toString().equals("59.0 45.0 64.0 73.0 99.0 "));

}

@Test
	public void testSum() {
		assertEquals(343, gradeBook1.sum(), .0001);
		assertEquals(340, gradeBook2.sum(), .0001);

}

@Test
	public void testMinimum() {
		assertEquals(40, gradeBook1.minimum(), .001);
		assertEquals(45, gradeBook2.minimum(), .001);

}

@Test
	public void testFinalScore() {
		assertEquals(303, gradeBook1.finalScore(), .0001);
		assertEquals(295, gradeBook2.finalScore(), .0001);

}


}
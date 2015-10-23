package org.apache.commons.collections4.comparators;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ComparableComparatorTest</code> contains tests for the class <code>{@link ComparableComparator}</code>.
 *
 * @generatedBy CodePro at 10/23/15 2:02 PM
 * @author Nikhil
 * @version $Revision: 1.0 $
 */
public class ComparableComparatorTest {
	/**
	 * Run the ComparableComparator() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testComparableComparator_1()
		throws Exception {

		ComparableComparator result = new ComparableComparator();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ComparableComparator<Comparable> comparableComparator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testComparableComparator_2()
		throws Exception {

		ComparableComparator result = ComparableComparator.comparableComparator();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int compare(E,E) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testCompare_1()
		throws Exception {
		ComparableComparator fixture = new ComparableComparator();

		int result = fixture.compare(null, null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.comparators.ComparableComparator.compare(ComparableComparator.java:95)
		assertEquals(0, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		ComparableComparator fixture = new ComparableComparator();
		Object object = new ComparableComparator();

		boolean result = fixture.equals(object);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		ComparableComparator fixture = new ComparableComparator();
		Object object = new Object();

		boolean result = fixture.equals(object);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		ComparableComparator fixture = new ComparableComparator();
		Object object = null;

		boolean result = fixture.equals(object);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testEquals_4()
		throws Exception {
		ComparableComparator fixture = new ComparableComparator();
		Object object = new Object();

		boolean result = fixture.equals(object);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		ComparableComparator fixture = new ComparableComparator();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(1769708912, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ComparableComparatorTest.class);
	}
}
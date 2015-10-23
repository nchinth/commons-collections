package org.apache.commons.collections4.comparators;

import java.util.Comparator;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ReverseComparatorTest</code> contains tests for the class <code>{@link ReverseComparator}</code>.
 *
 * @generatedBy CodePro at 10/23/15 2:02 PM
 * @author Nikhil
 * @version $Revision: 1.0 $
 */
public class ReverseComparatorTest {
	/**
	 * Run the ReverseComparator() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testReverseComparator_1()
		throws Exception {

		ReverseComparator result = new ReverseComparator();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ReverseComparator(Comparator<? super E>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testReverseComparator_2()
		throws Exception {
		Comparator<? extends Object> comparator = new BooleanComparator();

		ReverseComparator result = new ReverseComparator(comparator);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ReverseComparator(Comparator<? super E>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testReverseComparator_3()
		throws Exception {
		Comparator<? extends Object> comparator = null;

		ReverseComparator result = new ReverseComparator(comparator);

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
		ReverseComparator fixture = new ReverseComparator();

		int result = fixture.compare(null, null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.comparators.ComparableComparator.compare(ComparableComparator.java:95)
		//       at org.apache.commons.collections4.comparators.ComparableComparator.compare(ComparableComparator.java:1)
		//       at org.apache.commons.collections4.comparators.ReverseComparator.compare(ReverseComparator.java:77)
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
		ReverseComparator fixture = new ReverseComparator();
		Object object = new ReverseComparator();

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
		ReverseComparator fixture = new ReverseComparator();
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
	public void testEquals_3()
		throws Exception {
		ReverseComparator fixture = new ReverseComparator();
		Object object = new ReverseComparator();

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
	public void testEquals_4()
		throws Exception {
		ReverseComparator fixture = new ReverseComparator();
		Object object = new ReverseComparator();

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
	public void testEquals_5()
		throws Exception {
		ReverseComparator fixture = new ReverseComparator();
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
		ReverseComparator fixture = new ReverseComparator();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(1661506632, result);
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
		new org.junit.runner.JUnitCore().run(ReverseComparatorTest.class);
	}
}
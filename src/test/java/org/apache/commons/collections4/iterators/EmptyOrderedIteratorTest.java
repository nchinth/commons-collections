package org.apache.commons.collections4.iterators;

import org.apache.commons.collections4.OrderedIterator;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>EmptyOrderedIteratorTest</code> contains tests for the class <code>{@link EmptyOrderedIterator}</code>.
 *
 * @generatedBy CodePro at 10/23/15 2:02 PM
 * @author Nikhil
 * @version $Revision: 1.0 $
 */
public class EmptyOrderedIteratorTest {
	/**
	 * Run the EmptyOrderedIterator() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testEmptyOrderedIterator_1()
		throws Exception {

		EmptyOrderedIterator result = new EmptyOrderedIterator();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.hasNext());
		assertEquals(false, result.hasPrevious());
		assertEquals(0, result.nextIndex());
		assertEquals(-1, result.previousIndex());
	}

	/**
	 * Run the OrderedIterator<Object> emptyOrderedIterator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testEmptyOrderedIterator_2()
		throws Exception {

		OrderedIterator<Object> result = EmptyOrderedIterator.emptyOrderedIterator();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.hasPrevious());
		assertEquals(false, result.hasNext());
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
		new org.junit.runner.JUnitCore().run(EmptyOrderedIteratorTest.class);
	}
}
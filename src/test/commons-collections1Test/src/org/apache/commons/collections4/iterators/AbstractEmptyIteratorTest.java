package org.apache.commons.collections4.iterators;

import java.util.NoSuchElementException;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AbstractEmptyIteratorTest</code> contains tests for the class <code>{@link AbstractEmptyIterator}</code>.
 *
 * @generatedBy CodePro at 10/23/15 2:02 PM
 * @author Nikhil
 * @version $Revision: 1.0 $
 */
public class AbstractEmptyIteratorTest {
	/**
	 * Run the void add(E) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test(expected = java.lang.UnsupportedOperationException.class)
	public void testAdd_1()
		throws Exception {
		AbstractEmptyIterator fixture = new EmptyMapIterator();

		fixture.add(null);

		// add additional test code here
	}

	/**
	 * Run the boolean hasNext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testHasNext_1()
		throws Exception {
		AbstractEmptyIterator fixture = new EmptyMapIterator();

		boolean result = fixture.hasNext();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasPrevious() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testHasPrevious_1()
		throws Exception {
		AbstractEmptyIterator fixture = new EmptyMapIterator();

		boolean result = fixture.hasPrevious();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the Object next() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test(expected = java.util.NoSuchElementException.class)
	public void testNext_1()
		throws Exception {
		AbstractEmptyIterator fixture = new EmptyMapIterator();

		Object result = fixture.next();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int nextIndex() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testNextIndex_1()
		throws Exception {
		AbstractEmptyIterator fixture = new EmptyMapIterator();

		int result = fixture.nextIndex();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the Object previous() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test(expected = java.util.NoSuchElementException.class)
	public void testPrevious_1()
		throws Exception {
		AbstractEmptyIterator fixture = new EmptyMapIterator();

		Object result = fixture.previous();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int previousIndex() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testPreviousIndex_1()
		throws Exception {
		AbstractEmptyIterator fixture = new EmptyMapIterator();

		int result = fixture.previousIndex();

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the void remove() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testRemove_1()
		throws Exception {
		AbstractEmptyIterator fixture = new EmptyMapIterator();

		fixture.remove();

		// add additional test code here
	}

	/**
	 * Run the void reset() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testReset_1()
		throws Exception {
		AbstractEmptyIterator fixture = new EmptyMapIterator();

		fixture.reset();

		// add additional test code here
	}

	/**
	 * Run the void set(E) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testSet_1()
		throws Exception {
		AbstractEmptyIterator fixture = new EmptyMapIterator();

		fixture.set(null);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(AbstractEmptyIteratorTest.class);
	}
}
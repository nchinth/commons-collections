package org.apache.commons.collections4.iterators;

import java.util.Iterator;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>UniqueFilterIteratorTest</code> contains tests for the class <code>{@link UniqueFilterIterator}</code>.
 *
 * @generatedBy CodePro at 10/23/15 2:18 PM
 * @author Nikhil
 * @version $Revision: 1.0 $
 */
public class UniqueFilterIteratorTest {
	/**
	 * Run the UniqueFilterIterator(Iterator<? extends E>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testUniqueFilterIterator_1()
		throws Exception {
		Iterator<? extends Object> iterator = new CollatingIterator();

		UniqueFilterIterator result = new UniqueFilterIterator(iterator);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.hasNext());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
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
	 * @generatedBy CodePro at 10/23/15 2:18 PM
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
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(UniqueFilterIteratorTest.class);
	}
}
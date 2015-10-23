package org.apache.commons.collections4.bag;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import org.apache.commons.collections4.SortedBag;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>UnmodifiableSortedBagTest</code> contains tests for the class <code>{@link UnmodifiableSortedBag}</code>.
 *
 * @generatedBy CodePro at 10/23/15 2:02 PM
 * @author Nikhil
 * @version $Revision: 1.0 $
 */
public class UnmodifiableSortedBagTest {
	/**
	 * Run the SortedBag<Object> unmodifiableSortedBag(SortedBag<E>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testUnmodifiableSortedBag_1()
		throws Exception {
		SortedBag<Object> bag = new TreeBag();

		SortedBag<Object> result = UnmodifiableSortedBag.unmodifiableSortedBag(bag);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the SortedBag<Object> unmodifiableSortedBag(SortedBag<E>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testUnmodifiableSortedBag_2()
		throws Exception {
		SortedBag<Object> bag = new TreeBag();

		SortedBag<Object> result = UnmodifiableSortedBag.unmodifiableSortedBag(bag);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
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
		new org.junit.runner.JUnitCore().run(UnmodifiableSortedBagTest.class);
	}
}
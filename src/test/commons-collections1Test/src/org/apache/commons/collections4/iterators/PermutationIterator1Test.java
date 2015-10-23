package org.apache.commons.collections4.iterators;

import java.util.Collection;
import java.util.List;
import org.apache.commons.collections4.list.GrowthList;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>PermutationIteratorTest</code> contains tests for the class <code>{@link PermutationIterator}</code>.
 *
 * @generatedBy CodePro at 10/23/15 2:02 PM
 * @author Nikhil
 * @version $Revision: 1.0 $
 */
public class PermutationIterator1Test {
	/**
	 * Run the PermutationIterator(Collection<? extends E>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testPermutationIterator_1()
		throws Exception {
		Collection<? extends Object> coll = new GrowthList();

		PermutationIterator result = new PermutationIterator(coll);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.hasNext());
	}

	/**
	 * Run the PermutationIterator(Collection<? extends E>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testPermutationIterator_2()
		throws Exception {
		Collection<? extends Object> coll = new GrowthList();

		PermutationIterator result = new PermutationIterator(coll);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.hasNext());
	}

	/**
	 * Run the PermutationIterator(Collection<? extends E>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testPermutationIterator_3()
		throws Exception {
		Collection<? extends Object> coll = null;

		PermutationIterator result = new PermutationIterator(coll);

		// add additional test code here
		assertNotNull(result);
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
		PermutationIterator fixture = new PermutationIterator(new GrowthList());

		boolean result = fixture.hasNext();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean hasNext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testHasNext_2()
		throws Exception {
		PermutationIterator fixture = new PermutationIterator(new GrowthList());

		boolean result = fixture.hasNext();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the List<Object> next() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testNext_1()
		throws Exception {
		PermutationIterator fixture = new PermutationIterator(new GrowthList());

		List<Object> result = fixture.next();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Object> next() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testNext_2()
		throws Exception {
		PermutationIterator fixture = new PermutationIterator(new GrowthList());

		List<Object> result = fixture.next();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Object> next() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testNext_3()
		throws Exception {
		PermutationIterator fixture = new PermutationIterator(new GrowthList());

		List<Object> result = fixture.next();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Object> next() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testNext_4()
		throws Exception {
		PermutationIterator fixture = new PermutationIterator(new GrowthList());

		List<Object> result = fixture.next();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Object> next() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testNext_5()
		throws Exception {
		PermutationIterator fixture = new PermutationIterator(new GrowthList());

		List<Object> result = fixture.next();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Object> next() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testNext_6()
		throws Exception {
		PermutationIterator fixture = new PermutationIterator(new GrowthList());

		List<Object> result = fixture.next();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Object> next() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testNext_7()
		throws Exception {
		PermutationIterator fixture = new PermutationIterator(new GrowthList());

		List<Object> result = fixture.next();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the void remove() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test(expected = java.lang.UnsupportedOperationException.class)
	public void testRemove_1()
		throws Exception {
		PermutationIterator fixture = new PermutationIterator(new GrowthList());

		fixture.remove();

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
		new org.junit.runner.JUnitCore().run(PermutationIterator1Test.class);
	}
}
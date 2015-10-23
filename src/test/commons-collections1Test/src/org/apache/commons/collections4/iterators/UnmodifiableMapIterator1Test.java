package org.apache.commons.collections4.iterators;

import java.util.Map;
import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.map.LRUMap;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>UnmodifiableMapIteratorTest</code> contains tests for the class <code>{@link UnmodifiableMapIterator}</code>.
 *
 * @generatedBy CodePro at 10/23/15 2:01 PM
 * @author Nikhil
 * @version $Revision: 1.0 $
 */
public class UnmodifiableMapIterator1Test {
	/**
	 * Run the MapIterator<Object, Object> unmodifiableMapIterator(MapIterator<? extends K,? extends V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testUnmodifiableMapIterator_1()
		throws Exception {
		MapIterator<? extends Object, ? extends Object> iterator = new AbstractMapIteratorDecorator(new EntrySetMapIterator(new LRUMap()));

		MapIterator<Object, Object> result = UnmodifiableMapIterator.unmodifiableMapIterator(iterator);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.hasNext());
	}

	/**
	 * Run the MapIterator<Object, Object> unmodifiableMapIterator(MapIterator<? extends K,? extends V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testUnmodifiableMapIterator_2()
		throws Exception {
		MapIterator<? extends Object, ? extends Object> iterator = new AbstractMapIteratorDecorator(new EntrySetMapIterator(new LRUMap()));

		MapIterator<Object, Object> result = UnmodifiableMapIterator.unmodifiableMapIterator(iterator);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.hasNext());
	}

	/**
	 * Run the MapIterator<Object, Object> unmodifiableMapIterator(MapIterator<? extends K,? extends V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testUnmodifiableMapIterator_3()
		throws Exception {
		MapIterator<? extends Object, ? extends Object> iterator = null;

		MapIterator<Object, Object> result = UnmodifiableMapIterator.unmodifiableMapIterator(iterator);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
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
	 * @generatedBy CodePro at 10/23/15 2:01 PM
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
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(UnmodifiableMapIterator1Test.class);
	}
}
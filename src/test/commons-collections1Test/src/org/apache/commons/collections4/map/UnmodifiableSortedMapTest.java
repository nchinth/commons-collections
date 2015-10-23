package org.apache.commons.collections4.map;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import org.apache.commons.collections4.trie.PatriciaTrie;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>UnmodifiableSortedMapTest</code> contains tests for the class <code>{@link UnmodifiableSortedMap}</code>.
 *
 * @generatedBy CodePro at 10/23/15 2:02 PM
 * @author Nikhil
 * @version $Revision: 1.0 $
 */
public class UnmodifiableSortedMapTest {
	/**
	 * Run the SortedMap<Object, Object> unmodifiableSortedMap(SortedMap<K,? extends V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testUnmodifiableSortedMap_1()
		throws Exception {
		SortedMap<Object, ? extends Object> map = new PatriciaTrie();

		SortedMap<Object, Object> result = UnmodifiableSortedMap.unmodifiableSortedMap(map);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the SortedMap<Object, Object> unmodifiableSortedMap(SortedMap<K,? extends V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testUnmodifiableSortedMap_2()
		throws Exception {
		SortedMap<Object, ? extends Object> map = new PatriciaTrie();

		SortedMap<Object, Object> result = UnmodifiableSortedMap.unmodifiableSortedMap(map);

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
		new org.junit.runner.JUnitCore().run(UnmodifiableSortedMapTest.class);
	}
}
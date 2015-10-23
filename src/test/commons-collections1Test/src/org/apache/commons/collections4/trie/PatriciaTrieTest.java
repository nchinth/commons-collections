package org.apache.commons.collections4.trie;

import java.util.Map;
import org.apache.commons.collections4.map.LRUMap;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>PatriciaTrieTest</code> contains tests for the class <code>{@link PatriciaTrie}</code>.
 *
 * @generatedBy CodePro at 10/23/15 2:01 PM
 * @author Nikhil
 * @version $Revision: 1.0 $
 */
public class PatriciaTrieTest {
	/**
	 * Run the PatriciaTrie() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testPatriciaTrie_1()
		throws Exception {

		PatriciaTrie result = new PatriciaTrie();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the PatriciaTrie(Map<? extends String,? extends E>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testPatriciaTrie_2()
		throws Exception {
		Map<? extends String, ? extends Object> m = new LRUMap();

		PatriciaTrie result = new PatriciaTrie(m);

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
		new org.junit.runner.JUnitCore().run(PatriciaTrieTest.class);
	}
}
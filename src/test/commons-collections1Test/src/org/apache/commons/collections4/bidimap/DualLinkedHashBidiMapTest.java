package org.apache.commons.collections4.bidimap;

import java.util.Map;
import java.util.Set;
import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.map.LRUMap;
import org.apache.commons.collections4.set.ListOrderedSet;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DualLinkedHashBidiMapTest</code> contains tests for the class <code>{@link DualLinkedHashBidiMap}</code>.
 *
 * @generatedBy CodePro at 10/23/15 2:01 PM
 * @author Nikhil
 * @version $Revision: 1.0 $
 */
public class DualLinkedHashBidiMapTest {
	/**
	 * Run the DualLinkedHashBidiMap() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testDualLinkedHashBidiMap_1()
		throws Exception {

		DualLinkedHashBidiMap result = new DualLinkedHashBidiMap();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the DualLinkedHashBidiMap(Map<? extends K,? extends V>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testDualLinkedHashBidiMap_2()
		throws Exception {
		Map<? extends Object, ? extends Object> map = new LRUMap();

		DualLinkedHashBidiMap result = new DualLinkedHashBidiMap(map);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the DualLinkedHashBidiMap(Map<K,V>,Map<V,K>,BidiMap<V,K>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testDualLinkedHashBidiMap_3()
		throws Exception {
		Map<Object, Object> normalMap = new LRUMap();
		Map<Object, Object> reverseMap = new LRUMap();
		BidiMap<Object, Object> inverseBidiMap = new DualHashBidiMap();

		DualLinkedHashBidiMap result = new DualLinkedHashBidiMap(normalMap, reverseMap, inverseBidiMap);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the BidiMap<Object, Object> createBidiMap(Map<V,K>,Map<K,V>,BidiMap<K,V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testCreateBidiMap_1()
		throws Exception {
		DualLinkedHashBidiMap fixture = new DualLinkedHashBidiMap();
		fixture.entrySet = new ListOrderedSet();
		fixture.normalMap = new LRUMap();
		fixture.reverseMap = new LRUMap();
		fixture.values = new ListOrderedSet();
		fixture.keySet = new ListOrderedSet();
		fixture.inverseBidiMap = new DualHashBidiMap();
		Map<Object, Object> normalMap = new LRUMap();
		Map<Object, Object> reverseMap = new LRUMap();
		BidiMap<Object, Object> inverseBidiMap = new DualHashBidiMap();

		BidiMap<Object, Object> result = fixture.createBidiMap(normalMap, reverseMap, inverseBidiMap);

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
		new org.junit.runner.JUnitCore().run(DualLinkedHashBidiMapTest.class);
	}
}
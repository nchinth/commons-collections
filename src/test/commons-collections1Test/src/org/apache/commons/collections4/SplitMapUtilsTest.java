package org.apache.commons.collections4;

import java.util.Map;
import org.apache.commons.collections4.map.LRUMap;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SplitMapUtilsTest</code> contains tests for the class <code>{@link SplitMapUtils}</code>.
 *
 * @generatedBy CodePro at 10/23/15 2:02 PM
 * @author Nikhil
 * @version $Revision: 1.0 $
 */
public class SplitMapUtilsTest {
	/**
	 * Run the IterableMap<Object, Object> readableMap(Get<K,V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testReadableMap_1()
		throws Exception {
		Get<Object, Object> get = new LRUMap();

		IterableMap<Object, Object> result = SplitMapUtils.readableMap(get);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the IterableMap<Object, Object> readableMap(Get<K,V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testReadableMap_2()
		throws Exception {
		Get<Object, Object> get = new LRUMap();

		IterableMap<Object, Object> result = SplitMapUtils.readableMap(get);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the IterableMap<Object, Object> readableMap(Get<K,V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testReadableMap_3()
		throws Exception {
		Get<Object, Object> get = new LRUMap();

		IterableMap<Object, Object> result = SplitMapUtils.readableMap(get);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the IterableMap<Object, Object> readableMap(Get<K,V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testReadableMap_4()
		throws Exception {
		Get<Object, Object> get = null;

		IterableMap<Object, Object> result = SplitMapUtils.readableMap(get);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Map<Object, Object> writableMap(Put<K,V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testWritableMap_1()
		throws Exception {
		Put<Object, Object> put = new LRUMap();

		Map<Object, Object> result = SplitMapUtils.writableMap(put);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Map<Object, Object> writableMap(Put<K,V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testWritableMap_2()
		throws Exception {
		Put<Object, Object> put = new LRUMap();

		Map<Object, Object> result = SplitMapUtils.writableMap(put);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Map<Object, Object> writableMap(Put<K,V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testWritableMap_3()
		throws Exception {
		Put<Object, Object> put = null;

		Map<Object, Object> result = SplitMapUtils.writableMap(put);

		// add additional test code here
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(SplitMapUtilsTest.class);
	}
}
package org.apache.commons.collections4.map;

import java.util.Map;
import org.apache.commons.collections4.Factory;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.functors.ChainedTransformer;
import org.apache.commons.collections4.functors.ConstantFactory;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>LazyMapTest</code> contains tests for the class <code>{@link LazyMap}</code>.
 *
 * @generatedBy CodePro at 10/23/15 2:01 PM
 * @author Nikhil
 * @version $Revision: 1.0 $
 */
public class LazyMapTest {
	/**
	 * Run the LazyMap(Map<K,V>,Factory<? extends V>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testLazyMap_1()
		throws Exception {
		Map<Object, Object> map = new LRUMap();
		Factory<? extends Object> factory = new ConstantFactory((Object) null);

		LazyMap result = new LazyMap(map, factory);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the LazyMap(Map<K,V>,Factory<? extends V>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testLazyMap_2()
		throws Exception {
		Map<Object, Object> map = new LRUMap();
		Factory<? extends Object> factory = null;

		LazyMap result = new LazyMap(map, factory);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LazyMap(Map<K,V>,Transformer<? super K,? extends V>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testLazyMap_3()
		throws Exception {
		Map<Object, Object> map = new LRUMap();
		Transformer<? extends Object, ? extends Object> factory = new ChainedTransformer(new Transformer[] {});

		LazyMap result = new LazyMap(map, factory);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the LazyMap(Map<K,V>,Transformer<? super K,? extends V>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testLazyMap_4()
		throws Exception {
		Map<Object, Object> map = new LRUMap();
		Transformer<? extends Object, ? extends Object> factory = null;

		LazyMap result = new LazyMap(map, factory);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object get(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testGet_1()
		throws Exception {
		LazyMap fixture = new LazyMap(new LRUMap(), new ChainedTransformer(new Transformer[] {}));
		fixture.map = new LRUMap();
		Object key = null;

		Object result = fixture.get(key);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object get(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testGet_2()
		throws Exception {
		LazyMap fixture = new LazyMap(new LRUMap(), new ChainedTransformer(new Transformer[] {}));
		fixture.map = new LRUMap();
		Object key = new Object();

		Object result = fixture.get(key);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LazyMap<Object, Object> lazyMap(Map<K,V>,Factory<? extends V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testLazyMap_5()
		throws Exception {
		Map<Object, Object> map = new LRUMap();
		Factory<? extends Object> factory = new ConstantFactory((Object) null);

		LazyMap<Object, Object> result = LazyMap.lazyMap(map, factory);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the LazyMap<Object, Object> lazyMap(Map<K,V>,Transformer<? super K,? extends V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	/*@Test
	public void testLazyMap_6()
		throws Exception {
		Map<Object, Object> map = new LRUMap();
		Transformer<? extends Object, ? extends Object> factory = new ChainedTransformer(new Transformer[] {});

		LazyMap<Object, Object> result = LazyMap.lazyMap(map, factory);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}*/

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
		new org.junit.runner.JUnitCore().run(LazyMapTest.class);
	}
}
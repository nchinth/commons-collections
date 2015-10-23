package org.apache.commons.collections4.map;

import java.util.Map;
import org.apache.commons.collections4.Factory;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.functors.ChainedTransformer;
import org.apache.commons.collections4.functors.ConstantFactory;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DefaultedMapTest</code> contains tests for the class <code>{@link DefaultedMap}</code>.
 *
 * @generatedBy CodePro at 10/23/15 2:18 PM
 * @author Nikhil
 * @version $Revision: 1.0 $
 */
public class DefaultedMapTest {
	/**
	 * Run the DefaultedMap(Transformer<? super K,? extends V>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testDefaultedMap_1()
		throws Exception {
		Transformer<? extends Object, ? extends Object> defaultValueTransformer = new ChainedTransformer(new Transformer[] {});

		DefaultedMap result = new DefaultedMap(defaultValueTransformer);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the DefaultedMap(V) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testDefaultedMap_2()
		throws Exception {

		DefaultedMap result = new DefaultedMap(null);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the DefaultedMap(Map<K,V>,Transformer<? super K,? extends V>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testDefaultedMap_3()
		throws Exception {
		Map<Object, Object> map = new LRUMap();
		Transformer<? extends Object, ? extends Object> defaultValueTransformer = new ChainedTransformer(new Transformer[] {});

		DefaultedMap result = new DefaultedMap(map, defaultValueTransformer);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the DefaultedMap(Map<K,V>,Transformer<? super K,? extends V>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testDefaultedMap_4()
		throws Exception {
		Map<Object, Object> map = new LRUMap();
		Transformer<? extends Object, ? extends Object> defaultValueTransformer = null;

		DefaultedMap result = new DefaultedMap(map, defaultValueTransformer);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DefaultedMap<Object, Object> defaultedMap(Map<K,V>,V) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
/*	@Test
	public void testDefaultedMap_5()
		throws Exception {
		Map<Object, Object> map = new LRUMap();

		DefaultedMap<Object, Object> result = DefaultedMap.defaultedMap(map, null);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}*/

	/**
	 * Run the DefaultedMap<Object, Object> defaultedMap(Map<K,V>,Factory<? extends V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testDefaultedMap_6()
		throws Exception {
		Map<Object, Object> map = new LRUMap();
		Factory<? extends Object> factory = new ConstantFactory((Object) null);

		DefaultedMap<Object, Object> result = DefaultedMap.defaultedMap(map, factory);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the DefaultedMap<Object, Object> defaultedMap(Map<K,V>,Factory<? extends V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testDefaultedMap_7()
		throws Exception {
		Map<Object, Object> map = new LRUMap();
		Factory<? extends Object> factory = null;

		DefaultedMap<Object, Object> result = DefaultedMap.defaultedMap(map, factory);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Map<Object, Object> defaultedMap(Map<K,V>,Transformer<? super K,? extends V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testDefaultedMap_8()
		throws Exception {
		Map<Object, Object> map = new LRUMap();
		Transformer<? extends Object, ? extends Object> transformer = new ChainedTransformer(new Transformer[] {});

		Map<Object, Object> result = DefaultedMap.defaultedMap(map, transformer);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Map<Object, Object> defaultedMap(Map<K,V>,Transformer<? super K,? extends V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testDefaultedMap_9()
		throws Exception {
		Map<Object, Object> map = new LRUMap();
		Transformer<? extends Object, ? extends Object> transformer = null;

		Map<Object, Object> result = DefaultedMap.defaultedMap(map, transformer);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object get(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testGet_1()
		throws Exception {
		DefaultedMap fixture = new DefaultedMap(new LRUMap(), new ChainedTransformer(new Transformer[] {}));
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
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testGet_2()
		throws Exception {
		DefaultedMap fixture = new DefaultedMap(new LRUMap(), new ChainedTransformer(new Transformer[] {}));
		fixture.map = new LRUMap();
		Object key = new Object();

		Object result = fixture.get(key);

		// add additional test code here
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(DefaultedMapTest.class);
	}
}
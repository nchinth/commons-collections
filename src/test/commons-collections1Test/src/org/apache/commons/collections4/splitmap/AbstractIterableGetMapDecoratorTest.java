package org.apache.commons.collections4.splitmap;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.map.LRUMap;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AbstractIterableGetMapDecoratorTest</code> contains tests for the class <code>{@link AbstractIterableGetMapDecorator}</code>.
 *
 * @generatedBy CodePro at 10/23/15 2:01 PM
 * @author Nikhil
 * @version $Revision: 1.0 $
 */
public class AbstractIterableGetMapDecoratorTest {
	/**
	 * Run the AbstractIterableGetMapDecorator() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testAbstractIterableGetMapDecorator_1()
		throws Exception {

		AbstractIterableGetMapDecorator result = new AbstractIterableGetMapDecorator();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AbstractIterableGetMapDecorator(Map<K,V>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testAbstractIterableGetMapDecorator_2()
		throws Exception {
		Map<Object, Object> map = new LRUMap();

		AbstractIterableGetMapDecorator result = new AbstractIterableGetMapDecorator(map);

		// add additional test code here
		assertNotNull(result);
		assertEquals("{}", result.toString());
		assertEquals(true, result.isEmpty());
		assertEquals(0, result.size());
	}

	/**
	 * Run the AbstractIterableGetMapDecorator(Map<K,V>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testAbstractIterableGetMapDecorator_3()
		throws Exception {
		Map<Object, Object> map = null;

		AbstractIterableGetMapDecorator result = new AbstractIterableGetMapDecorator(map);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean containsKey(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testContainsKey_1()
		throws Exception {
		AbstractIterableGetMapDecorator fixture = new AbstractIterableGetMapDecorator(new LRUMap());
		Object key = new Object();

		boolean result = fixture.containsKey(key);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean containsKey(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testContainsKey_2()
		throws Exception {
		AbstractIterableGetMapDecorator fixture = new AbstractIterableGetMapDecorator(new LRUMap());
		Object key = new Object();

		boolean result = fixture.containsKey(key);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean containsValue(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testContainsValue_1()
		throws Exception {
		AbstractIterableGetMapDecorator fixture = new AbstractIterableGetMapDecorator(new LRUMap());
		Object value = new Object();

		boolean result = fixture.containsValue(value);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean containsValue(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testContainsValue_2()
		throws Exception {
		AbstractIterableGetMapDecorator fixture = new AbstractIterableGetMapDecorator(new LRUMap());
		Object value = new Object();

		boolean result = fixture.containsValue(value);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the Map<Object, Object> decorated() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testDecorated_1()
		throws Exception {
		AbstractIterableGetMapDecorator fixture = new AbstractIterableGetMapDecorator(new LRUMap());

		Map<Object, Object> result = fixture.decorated();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Set<java.util.Map.Entry<Object, Object>> entrySet() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testEntrySet_1()
		throws Exception {
		AbstractIterableGetMapDecorator fixture = new AbstractIterableGetMapDecorator(new LRUMap());

		Set<java.util.Map.Entry<Object, Object>> result = fixture.entrySet();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		AbstractIterableGetMapDecorator fixture = new AbstractIterableGetMapDecorator(new LRUMap());
		Object object = new AbstractIterableGetMapDecorator(new LRUMap());

		boolean result = fixture.equals(object);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		AbstractIterableGetMapDecorator fixture = new AbstractIterableGetMapDecorator(new LRUMap());
		Object object = new Object();

		boolean result = fixture.equals(object);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		AbstractIterableGetMapDecorator fixture = new AbstractIterableGetMapDecorator(new LRUMap());
		Object object = new Object();

		boolean result = fixture.equals(object);

		// add additional test code here
		assertEquals(false, result);
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
		AbstractIterableGetMapDecorator fixture = new AbstractIterableGetMapDecorator(new LRUMap());
		Object key = new Object();

		Object result = fixture.get(key);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		AbstractIterableGetMapDecorator fixture = new AbstractIterableGetMapDecorator(new LRUMap());

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the boolean isEmpty() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testIsEmpty_1()
		throws Exception {
		AbstractIterableGetMapDecorator fixture = new AbstractIterableGetMapDecorator(new LRUMap());

		boolean result = fixture.isEmpty();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isEmpty() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testIsEmpty_2()
		throws Exception {
		AbstractIterableGetMapDecorator fixture = new AbstractIterableGetMapDecorator(new LRUMap());

		boolean result = fixture.isEmpty();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the Set<Object> keySet() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testKeySet_1()
		throws Exception {
		AbstractIterableGetMapDecorator fixture = new AbstractIterableGetMapDecorator(new LRUMap());

		Set<Object> result = fixture.keySet();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the MapIterator<Object, Object> mapIterator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testMapIterator_1()
		throws Exception {
		AbstractIterableGetMapDecorator fixture = new AbstractIterableGetMapDecorator(new LRUMap());

		MapIterator<Object, Object> result = fixture.mapIterator();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.hasNext());
	}

	/**
	 * Run the Object remove(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testRemove_1()
		throws Exception {
		AbstractIterableGetMapDecorator fixture = new AbstractIterableGetMapDecorator(new LRUMap());
		Object key = new Object();

		Object result = fixture.remove(key);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the int size() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testSize_1()
		throws Exception {
		AbstractIterableGetMapDecorator fixture = new AbstractIterableGetMapDecorator(new LRUMap());

		int result = fixture.size();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		AbstractIterableGetMapDecorator fixture = new AbstractIterableGetMapDecorator(new LRUMap());

		String result = fixture.toString();

		// add additional test code here
		assertEquals("{}", result);
	}

	/**
	 * Run the Collection<Object> values() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testValues_1()
		throws Exception {
		AbstractIterableGetMapDecorator fixture = new AbstractIterableGetMapDecorator(new LRUMap());

		Collection<Object> result = fixture.values();

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
		new org.junit.runner.JUnitCore().run(AbstractIterableGetMapDecoratorTest.class);
	}
}
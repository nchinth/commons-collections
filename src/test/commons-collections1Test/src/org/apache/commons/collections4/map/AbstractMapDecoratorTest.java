package org.apache.commons.collections4.map;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.apache.commons.collections4.keyvalue.MultiKey;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AbstractMapDecoratorTest</code> contains tests for the class <code>{@link AbstractMapDecorator}</code>.
 *
 * @generatedBy CodePro at 10/23/15 2:02 PM
 * @author Nikhil
 * @version $Revision: 1.0 $
 */
public class AbstractMapDecoratorTest {
	/**
	 * Run the void clear() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testClear_1()
		throws Exception {
		AbstractMapDecorator fixture = new MultiKeyMap(new AbstractHashedMap());

		fixture.clear();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.AbstractHashedMap.clear(AbstractHashedMap.java:363)
		//       at org.apache.commons.collections4.map.AbstractMapDecorator.clear(AbstractMapDecorator.java:78)
	}

	/**
	 * Run the boolean containsKey(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testContainsKey_1()
		throws Exception {
		AbstractMapDecorator fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key = new Object();

		boolean result = fixture.containsKey(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.AbstractHashedMap.containsKey(AbstractHashedMap.java:223)
		//       at org.apache.commons.collections4.map.AbstractMapDecorator.containsKey(AbstractMapDecorator.java:82)
		assertTrue(result);
	}

	/**
	 * Run the boolean containsKey(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testContainsKey_2()
		throws Exception {
		AbstractMapDecorator fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key = new Object();

		boolean result = fixture.containsKey(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.AbstractHashedMap.containsKey(AbstractHashedMap.java:223)
		//       at org.apache.commons.collections4.map.AbstractMapDecorator.containsKey(AbstractMapDecorator.java:82)
		assertTrue(result);
	}

	/**
	 * Run the boolean containsValue(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testContainsValue_1()
		throws Exception {
		AbstractMapDecorator fixture = new MultiKeyMap(new AbstractHashedMap());
		Object value = new Object();

		boolean result = fixture.containsValue(value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.AbstractHashedMap.containsValue(AbstractHashedMap.java:252)
		//       at org.apache.commons.collections4.map.AbstractMapDecorator.containsValue(AbstractMapDecorator.java:86)
		assertTrue(result);
	}

	/**
	 * Run the boolean containsValue(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testContainsValue_2()
		throws Exception {
		AbstractMapDecorator fixture = new MultiKeyMap(new AbstractHashedMap());
		Object value = new Object();

		boolean result = fixture.containsValue(value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.AbstractHashedMap.containsValue(AbstractHashedMap.java:252)
		//       at org.apache.commons.collections4.map.AbstractMapDecorator.containsValue(AbstractMapDecorator.java:86)
		assertTrue(result);
	}

	/**
	 * Run the Map<Object, Object> decorated() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testDecorated_1()
		throws Exception {
		AbstractMapDecorator fixture = new MultiKeyMap(new AbstractHashedMap());

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
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testEntrySet_1()
		throws Exception {
		AbstractMapDecorator fixture = new MultiKeyMap(new AbstractHashedMap());

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
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		ListOrderedMap fixture = new ListOrderedMap();
		fixture.map = new LRUMap();
		ListOrderedMap object = new ListOrderedMap();
		object.map = new LRUMap();

		boolean result = fixture.equals(object);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		ListOrderedMap fixture = new ListOrderedMap();
		fixture.map = new LRUMap();
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
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		ListOrderedMap fixture = new ListOrderedMap();
		fixture.map = new LRUMap();
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
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testGet_1()
		throws Exception {
		AbstractMapDecorator fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key = new Object();

		Object result = fixture.get(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.AbstractHashedMap.get(AbstractHashedMap.java:182)
		//       at org.apache.commons.collections4.map.AbstractMapDecorator.get(AbstractMapDecorator.java:94)
		assertNotNull(result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		ListOrderedMap fixture = new ListOrderedMap();
		fixture.map = new LRUMap();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the boolean isEmpty() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testIsEmpty_1()
		throws Exception {
		AbstractMapDecorator fixture = new MultiKeyMap(new AbstractHashedMap());

		boolean result = fixture.isEmpty();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isEmpty() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testIsEmpty_2()
		throws Exception {
		AbstractMapDecorator fixture = new MultiKeyMap(new AbstractHashedMap());

		boolean result = fixture.isEmpty();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the Set<Object> keySet() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testKeySet_1()
		throws Exception {
		AbstractMapDecorator fixture = new MultiKeyMap(new AbstractHashedMap());

		Set<Object> result = fixture.keySet();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Object put(K,V) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testPut_1()
		throws Exception {
		AbstractMapDecorator fixture = new MultiKeyMap(new AbstractHashedMap());

		Object result = fixture.put(null, null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException: Key must not be null
		//       at org.apache.commons.collections4.map.MultiKeyMap.checkKey(MultiKeyMap.java:818)
		//       at org.apache.commons.collections4.map.MultiKeyMap.put(MultiKeyMap.java:849)
		//       at org.apache.commons.collections4.map.MultiKeyMap.put(MultiKeyMap.java:1)
		assertNotNull(result);
	}

	/**
	 * Run the void putAll(Map<? extends K,? extends V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testPutAll_1()
		throws Exception {
		AbstractMapDecorator fixture = new MultiKeyMap(new AbstractHashedMap());
		Map<? extends Object, ? extends Object> mapToCopy = new LRUMap();

		fixture.putAll(mapToCopy);

		// add additional test code here
	}

	/**
	 * Run the Object remove(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testRemove_1()
		throws Exception {
		ListOrderedMap fixture = new ListOrderedMap();
		fixture.map = new LRUMap();
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
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testSize_1()
		throws Exception {
		ListOrderedMap fixture = new ListOrderedMap();
		fixture.map = new LRUMap();

		int result = fixture.size();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		ListOrderedMap fixture = new ListOrderedMap();
		fixture.map = new LRUMap();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("{}", result);
	}

	/**
	 * Run the Collection<Object> values() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testValues_1()
		throws Exception {
		ListOrderedMap fixture = new ListOrderedMap();
		fixture.map = new LRUMap();

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
		new org.junit.runner.JUnitCore().run(AbstractMapDecoratorTest.class);
	}
}
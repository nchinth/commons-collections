package org.apache.commons.collections4.multimap;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.MultiSet;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.list.GrowthList;
import org.apache.commons.collections4.map.LRUMap;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AbstractMultiValuedMapTest</code> contains tests for the class <code>{@link AbstractMultiValuedMap}</code>.
 *
 * @generatedBy CodePro at 10/23/15 2:02 PM
 * @author Nikhil
 * @version $Revision: 1.0 $
 */
public class AbstractMultiValuedMapTest {
	/**
	 * Run the Map<Object, Collection<Object>> asMap() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testAsMap_1()
		throws Exception {
		AbstractMultiValuedMap fixture = new MultiValuedHashMap();

		Map<Object, Collection<Object>> result = fixture.asMap();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

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
		AbstractMultiValuedMap fixture = new MultiValuedHashMap();

		fixture.clear();

		// add additional test code here
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
		AbstractMultiValuedMap fixture = new MultiValuedHashMap();
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
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testContainsKey_2()
		throws Exception {
		AbstractMultiValuedMap fixture = new MultiValuedHashMap();
		Object key = new Object();

		boolean result = fixture.containsKey(key);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean containsMapping(Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testContainsMapping_1()
		throws Exception {
		AbstractMultiValuedMap fixture = new MultiValuedHashMap();
		Object key = new Object();
		Object value = new Object();

		boolean result = fixture.containsMapping(key, value);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean containsMapping(Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testContainsMapping_2()
		throws Exception {
		AbstractMultiValuedMap fixture = new MultiValuedHashMap();
		Object key = new Object();
		Object value = new Object();

		boolean result = fixture.containsMapping(key, value);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean containsMapping(Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testContainsMapping_3()
		throws Exception {
		AbstractMultiValuedMap fixture = new MultiValuedHashMap();
		Object key = new Object();
		Object value = new Object();

		boolean result = fixture.containsMapping(key, value);

		// add additional test code here
		assertEquals(false, result);
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
		AbstractMultiValuedMap fixture = new MultiValuedHashMap();
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
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testContainsValue_2()
		throws Exception {
		AbstractMultiValuedMap fixture = new MultiValuedHashMap();
		Object value = new Object();

		boolean result = fixture.containsValue(value);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the Collection<Object> createCollection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testCreateCollection_1()
		throws Exception {
		AbstractMultiValuedMap fixture = new MultiValuedHashMap();

		Collection<Object> result = fixture.createCollection();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Collection<java.util.Map.Entry<Object, Object>> entries() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testEntries_1()
		throws Exception {
		AbstractMultiValuedMap fixture = new MultiValuedHashMap();

		Collection<java.util.Map.Entry<Object, Object>> result = fixture.entries();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Collection<java.util.Map.Entry<Object, Object>> entries() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testEntries_2()
		throws Exception {
		AbstractMultiValuedMap fixture = new MultiValuedHashMap();

		Collection<java.util.Map.Entry<Object, Object>> result = fixture.entries();

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
		AbstractMultiValuedMap fixture = new MultiValuedHashMap();
		Object obj = new MultiValuedHashMap();

		boolean result = fixture.equals(obj);

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
		AbstractMultiValuedMap fixture = new MultiValuedHashMap();
		Object obj = new MultiValuedHashMap();

		boolean result = fixture.equals(obj);

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
	public void testEquals_3()
		throws Exception {
		AbstractMultiValuedMap fixture = new MultiValuedHashMap();
		Object obj = new MultiValuedHashMap();

		boolean result = fixture.equals(obj);

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
	public void testEquals_4()
		throws Exception {
		AbstractMultiValuedMap fixture = new MultiValuedHashMap();
		Object obj = new Object();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the Collection<Object> get(K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testGet_1()
		throws Exception {
		AbstractMultiValuedMap fixture = new MultiValuedHashMap();

		Collection<Object> result = fixture.get(null);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Map<Object, Collection<Object>> getMap() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testGetMap_1()
		throws Exception {
		AbstractMultiValuedMap fixture = new MultiValuedHashMap();

		Map<Object, Collection<Object>> result = fixture.getMap();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
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
		AbstractMultiValuedMap fixture = new MultiValuedHashMap();

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
		AbstractMultiValuedMap fixture = new MultiValuedHashMap();

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
		AbstractMultiValuedMap fixture = new MultiValuedHashMap();

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
		AbstractMultiValuedMap fixture = new MultiValuedHashMap();

		Set<Object> result = fixture.keySet();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the MultiSet<Object> keys() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testKeys_1()
		throws Exception {
		AbstractMultiValuedMap fixture = new MultiValuedHashMap();

		MultiSet<Object> result = fixture.keys();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the MultiSet<Object> keys() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testKeys_2()
		throws Exception {
		AbstractMultiValuedMap fixture = new MultiValuedHashMap();

		MultiSet<Object> result = fixture.keys();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the MapIterator<Object, Object> mapIterator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testMapIterator_1()
		throws Exception {
		AbstractMultiValuedMap fixture = new MultiValuedHashMap();

		MapIterator<Object, Object> result = fixture.mapIterator();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.hasNext());
	}

	/**
	 * Run the MapIterator<Object, Object> mapIterator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testMapIterator_2()
		throws Exception {
		AbstractMultiValuedMap fixture = new MultiValuedHashMap();

		MapIterator<Object, Object> result = fixture.mapIterator();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.hasNext());
	}

	/**
	 * Run the boolean put(K,V) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testPut_1()
		throws Exception {
		AbstractMultiValuedMap fixture = new MultiValuedHashMap();

		boolean result = fixture.put(null, null);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean put(K,V) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testPut_2()
		throws Exception {
		AbstractMultiValuedMap fixture = new MultiValuedHashMap();

		boolean result = fixture.put(null, null);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean put(K,V) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testPut_3()
		throws Exception {
		AbstractMultiValuedMap fixture = new MultiValuedHashMap();

		boolean result = fixture.put(null, null);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean put(K,V) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testPut_4()
		throws Exception {
		AbstractMultiValuedMap fixture = new MultiValuedHashMap();

		boolean result = fixture.put(null, null);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean putAll(Map<? extends K,? extends V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testPutAll_1()
		throws Exception {
		AbstractMultiValuedMap fixture = new MultiValuedHashMap();
		Map<? extends Object, ? extends Object> map = new LRUMap();

		boolean result = fixture.putAll(map);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean putAll(Map<? extends K,? extends V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testPutAll_2()
		throws Exception {
		AbstractMultiValuedMap fixture = new MultiValuedHashMap();
		Map<? extends Object, ? extends Object> map = new LRUMap();

		boolean result = fixture.putAll(map);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean putAll(Map<? extends K,? extends V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testPutAll_3()
		throws Exception {
		AbstractMultiValuedMap fixture = new MultiValuedHashMap();
		Map<? extends Object, ? extends Object> map = null;

		boolean result = fixture.putAll(map);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean putAll(MultiValuedMap<? extends K,? extends V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testPutAll_4()
		throws Exception {
		AbstractMultiValuedMap fixture = new MultiValuedHashMap();
		MultiValuedMap<? extends Object, ? extends Object> map = new MultiValuedHashMap();

		boolean result = fixture.putAll(map);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean putAll(MultiValuedMap<? extends K,? extends V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testPutAll_5()
		throws Exception {
		AbstractMultiValuedMap fixture = new MultiValuedHashMap();
		MultiValuedMap<? extends Object, ? extends Object> map = new MultiValuedHashMap();

		boolean result = fixture.putAll(map);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean putAll(MultiValuedMap<? extends K,? extends V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testPutAll_6()
		throws Exception {
		AbstractMultiValuedMap fixture = new MultiValuedHashMap();
		MultiValuedMap<? extends Object, ? extends Object> map = null;

		boolean result = fixture.putAll(map);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean putAll(K,Iterable<? extends V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testPutAll_7()
		throws Exception {
		AbstractMultiValuedMap fixture = new MultiValuedHashMap();
		Iterable<? extends Object> values = new GrowthList();

		boolean result = fixture.putAll(null, values);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean putAll(K,Iterable<? extends V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testPutAll_8()
		throws Exception {
		AbstractMultiValuedMap fixture = new MultiValuedHashMap();
		Iterable<? extends Object> values = new GrowthList();

		boolean result = fixture.putAll(null, values);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean putAll(K,Iterable<? extends V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testPutAll_9()
		throws Exception {
		AbstractMultiValuedMap fixture = new MultiValuedHashMap();
		Iterable<? extends Object> values = new GrowthList();

		boolean result = fixture.putAll(null, values);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean putAll(K,Iterable<? extends V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testPutAll_10()
		throws Exception {
		AbstractMultiValuedMap fixture = new MultiValuedHashMap();
		Iterable<? extends Object> values = new GrowthList();

		boolean result = fixture.putAll(null, values);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean putAll(K,Iterable<? extends V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testPutAll_11()
		throws Exception {
		AbstractMultiValuedMap fixture = new MultiValuedHashMap();
		Iterable<? extends Object> values = new GrowthList();

		boolean result = fixture.putAll(null, values);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean putAll(K,Iterable<? extends V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testPutAll_12()
		throws Exception {
		AbstractMultiValuedMap fixture = new MultiValuedHashMap();
		Iterable<? extends Object> values = new GrowthList();

		boolean result = fixture.putAll(null, values);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean putAll(K,Iterable<? extends V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testPutAll_13()
		throws Exception {
		AbstractMultiValuedMap fixture = new MultiValuedHashMap();
		Iterable<? extends Object> values = null;

		boolean result = fixture.putAll(null, values);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the Collection<Object> remove(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testRemove_1()
		throws Exception {
		AbstractMultiValuedMap fixture = new MultiValuedHashMap();
		Object key = new Object();

		Collection<Object> result = fixture.remove(key);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the boolean removeMapping(Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testRemoveMapping_1()
		throws Exception {
		AbstractMultiValuedMap fixture = new MultiValuedHashMap();
		Object key = new Object();
		Object value = new Object();

		boolean result = fixture.removeMapping(key, value);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean removeMapping(Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testRemoveMapping_2()
		throws Exception {
		AbstractMultiValuedMap fixture = new MultiValuedHashMap();
		Object key = new Object();
		Object value = new Object();

		boolean result = fixture.removeMapping(key, value);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean removeMapping(Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testRemoveMapping_3()
		throws Exception {
		AbstractMultiValuedMap fixture = new MultiValuedHashMap();
		Object key = new Object();
		Object value = new Object();

		boolean result = fixture.removeMapping(key, value);

		// add additional test code here
		assertEquals(false, result);
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
		AbstractMultiValuedMap fixture = new MultiValuedHashMap();

		int result = fixture.size();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int size() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testSize_2()
		throws Exception {
		AbstractMultiValuedMap fixture = new MultiValuedHashMap();

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
		AbstractMultiValuedMap fixture = new MultiValuedHashMap();

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
		AbstractMultiValuedMap fixture = new MultiValuedHashMap();

		Collection<Object> result = fixture.values();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Collection<Object> values() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testValues_2()
		throws Exception {
		AbstractMultiValuedMap fixture = new MultiValuedHashMap();

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
		new org.junit.runner.JUnitCore().run(AbstractMultiValuedMapTest.class);
	}
}
package org.apache.commons.collections4.map;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.commons.collections4.Factory;
import org.apache.commons.collections4.functors.ConstantFactory;
import org.apache.commons.collections4.list.GrowthList;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>MultiValueMapTest</code> contains tests for the class <code>{@link MultiValueMap}</code>.
 *
 * @generatedBy CodePro at 10/23/15 2:02 PM
 * @author Nikhil
 * @version $Revision: 1.0 $
 */
public class MultiValueMapTest {
	/**
	 * Run the MultiValueMap() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testMultiValueMap_1()
		throws Exception {

		MultiValueMap result = new MultiValueMap();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the MultiValueMap(Map<K,? super C>,Factory<C>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testMultiValueMap_2()
		throws Exception {
		Map<Object, ? extends Collection> map = new LRUMap();
		Factory<Collection> collectionFactory = new ConstantFactory((Object) null);

		MultiValueMap result = new MultiValueMap(map, collectionFactory);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the MultiValueMap(Map<K,? super C>,Factory<C>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testMultiValueMap_3()
		throws Exception {
		Map<Object, ? extends Collection> map = new LRUMap();
		Factory<Collection> collectionFactory = null;

		MultiValueMap result = new MultiValueMap(map, collectionFactory);

		// add additional test code here
		assertNotNull(result);
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
		MultiValueMap fixture = new MultiValueMap(new LRUMap(), new ConstantFactory((Object) null));
		fixture.map = new LRUMap();

		fixture.clear();

		// add additional test code here
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
		MultiValueMap fixture = new MultiValueMap(new LRUMap(), new ConstantFactory((Object) null));
		fixture.map = new LRUMap();
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
		MultiValueMap fixture = new MultiValueMap(new LRUMap(), new ConstantFactory((Object) null));
		fixture.map = new LRUMap();
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
	public void testContainsValue_3()
		throws Exception {
		MultiValueMap fixture = new MultiValueMap(new LRUMap(), new ConstantFactory((Object) null));
		fixture.map = new LRUMap();
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
	public void testContainsValue_4()
		throws Exception {
		MultiValueMap fixture = new MultiValueMap(new LRUMap(), new ConstantFactory((Object) null));
		fixture.map = new LRUMap();
		Object value = new Object();

		boolean result = fixture.containsValue(value);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean containsValue(Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testContainsValue_5()
		throws Exception {
		MultiValueMap fixture = new MultiValueMap(new LRUMap(), new ConstantFactory((Object) null));
		fixture.map = new LRUMap();
		Object key = new Object();
		Object value = new Object();

		boolean result = fixture.containsValue(key, value);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean containsValue(Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testContainsValue_6()
		throws Exception {
		MultiValueMap fixture = new MultiValueMap(new LRUMap(), new ConstantFactory((Object) null));
		fixture.map = new LRUMap();
		Object key = new Object();
		Object value = new Object();

		boolean result = fixture.containsValue(key, value);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean containsValue(Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testContainsValue_7()
		throws Exception {
		MultiValueMap fixture = new MultiValueMap(new LRUMap(), new ConstantFactory((Object) null));
		fixture.map = new LRUMap();
		Object key = new Object();
		Object value = new Object();

		boolean result = fixture.containsValue(key, value);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the Collection<Object> createCollection(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testCreateCollection_1()
		throws Exception {
		MultiValueMap fixture = new MultiValueMap(new LRUMap(), new ConstantFactory((Object) null));
		fixture.map = new LRUMap();
		int size = 1;

		Collection<Object> result = fixture.createCollection(size);

		// add additional test code here
		assertEquals(null, result);
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
		MultiValueMap fixture = new MultiValueMap(new LRUMap(), new ConstantFactory((Object) null));
		fixture.map = new LRUMap();

		Set<java.util.Map.Entry<Object, Object>> result = fixture.entrySet();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Collection<Object> getCollection(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testGetCollection_1()
		throws Exception {
		MultiValueMap fixture = new MultiValueMap(new LRUMap(), new ConstantFactory((Object) null));
		fixture.map = new LRUMap();
		Object key = new Object();

		Collection<Object> result = fixture.getCollection(key);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Iterator<java.util.Map.Entry<Object, Object>> iterator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testIterator_1()
		throws Exception {
		MultiValueMap fixture = new MultiValueMap(new LRUMap(), new ConstantFactory((Object) null));
		fixture.map = new LRUMap();

		Iterator<java.util.Map.Entry<Object, Object>> result = fixture.iterator();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.hasNext());
	}

	/**
	 * Run the Iterator<Object> iterator(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testIterator_2()
		throws Exception {
		MultiValueMap fixture = new MultiValueMap(new LRUMap(), new ConstantFactory((Object) null));
		fixture.map = new LRUMap();
		Object key = new Object();

		Iterator<Object> result = fixture.iterator(key);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.hasNext());
	}

	/**
	 * Run the Iterator<Object> iterator(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testIterator_3()
		throws Exception {
		MultiValueMap fixture = new MultiValueMap(new LRUMap(), new ConstantFactory((Object) null));
		fixture.map = new LRUMap();
		Object key = new Object();

		Iterator<Object> result = fixture.iterator(key);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.hasNext());
	}

	/**
	 * Run the MultiValueMap<Object, Object> multiValueMap(Map<K,? super Collection<V>>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
/*	@Test
	public void testMultiValueMap_4()
		throws Exception {
		Map<Object, ? extends Collection<Object>> map = new LRUMap();

		MultiValueMap<Object, Object> result = MultiValueMap.multiValueMap(map);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}
*/
	/**
	 * Run the MultiValueMap<Object, Object> multiValueMap(Map<K,? super C>,Class<C>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
/*	@Test
	public void testMultiValueMap_5()
		throws Exception {
		Map<Object, ? extends Collection> map = new LRUMap();
		Class<Collection> collectionClass = Collection.class;

		MultiValueMap<Object, Object> result = MultiValueMap.multiValueMap(map, collectionClass);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}*/

	/**
	 * Run the MultiValueMap<Object, Object> multiValueMap(Map<K,? super C>,Factory<C>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
/*	@Test
	public void testMultiValueMap_6()
		throws Exception {
		Map<Object, ? extends Collection> map = new LRUMap();
		Factory<Collection> collectionFactory = new ConstantFactory((Object) null);

		MultiValueMap<Object, Object> result = MultiValueMap.multiValueMap(map, collectionFactory);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}*/

	/**
	 * Run the Object put(K,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testPut_1()
		throws Exception {
		MultiValueMap fixture = new MultiValueMap(new LRUMap(), new ConstantFactory((Object) null));
		fixture.map = new LRUMap();
		Object value = null;

		Object result = fixture.put(null, value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiValueMap.put(MultiValueMap.java:266)
		assertNotNull(result);
	}

	/**
	 * Run the Object put(K,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testPut_2()
		throws Exception {
		MultiValueMap fixture = new MultiValueMap(new LRUMap(), new ConstantFactory((Object) null));
		fixture.map = new LRUMap();
		Object value = null;

		Object result = fixture.put(null, value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiValueMap.put(MultiValueMap.java:266)
		assertNotNull(result);
	}

	/**
	 * Run the Object put(K,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testPut_3()
		throws Exception {
		MultiValueMap fixture = new MultiValueMap(new LRUMap(), new ConstantFactory((Object) null));
		fixture.map = new LRUMap();
		Object value = null;

		Object result = fixture.put(null, value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiValueMap.put(MultiValueMap.java:266)
		assertNotNull(result);
	}

	/**
	 * Run the void putAll(Map<? extends K,?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testPutAll_1()
		throws Exception {
		MultiValueMap fixture = new MultiValueMap(new LRUMap(), new ConstantFactory((Object) null));
		fixture.map = new LRUMap();
		Map<? extends Object, Object> map = new LRUMap();

		fixture.putAll(map);

		// add additional test code here
	}

	/**
	 * Run the void putAll(Map<? extends K,?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testPutAll_2()
		throws Exception {
		MultiValueMap fixture = new MultiValueMap(new LRUMap(), new ConstantFactory((Object) null));
		fixture.map = new LRUMap();
		Map<? extends Object, Object> map = new LRUMap();

		fixture.putAll(map);

		// add additional test code here
	}

	/**
	 * Run the void putAll(Map<? extends K,?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testPutAll_3()
		throws Exception {
		MultiValueMap fixture = new MultiValueMap(new LRUMap(), new ConstantFactory((Object) null));
		fixture.map = new LRUMap();
		Map<? extends Object, Object> map = new MultiValueMap();

		fixture.putAll(map);

		// add additional test code here
	}

	/**
	 * Run the void putAll(Map<? extends K,?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testPutAll_4()
		throws Exception {
		MultiValueMap fixture = new MultiValueMap(new LRUMap(), new ConstantFactory((Object) null));
		fixture.map = new LRUMap();
		Map<? extends Object, Object> map = new MultiValueMap();

		fixture.putAll(map);

		// add additional test code here
	}

	/**
	 * Run the boolean putAll(K,Collection<V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testPutAll_5()
		throws Exception {
		MultiValueMap fixture = new MultiValueMap(new LRUMap(), new ConstantFactory((Object) null));
		fixture.map = new LRUMap();
		Collection<Object> values = null;

		boolean result = fixture.putAll(null, values);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean putAll(K,Collection<V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testPutAll_6()
		throws Exception {
		MultiValueMap fixture = new MultiValueMap(new LRUMap(), new ConstantFactory((Object) null));
		fixture.map = new LRUMap();
		Collection<Object> values = new GrowthList();

		boolean result = fixture.putAll(null, values);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean putAll(K,Collection<V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testPutAll_7()
		throws Exception {
		MultiValueMap fixture = new MultiValueMap(new LRUMap(), new ConstantFactory((Object) null));
		fixture.map = new LRUMap();
		Collection<Object> values = new GrowthList();

		boolean result = fixture.putAll(null, values);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean putAll(K,Collection<V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testPutAll_8()
		throws Exception {
		MultiValueMap fixture = new MultiValueMap(new LRUMap(), new ConstantFactory((Object) null));
		fixture.map = new LRUMap();
		Collection<Object> values = new GrowthList();

		boolean result = fixture.putAll(null, values);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean putAll(K,Collection<V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testPutAll_9()
		throws Exception {
		MultiValueMap fixture = new MultiValueMap(new LRUMap(), new ConstantFactory((Object) null));
		fixture.map = new LRUMap();
		Collection<Object> values = new GrowthList();

		boolean result = fixture.putAll(null, values);

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
	public void testRemoveMapping_1()
		throws Exception {
		MultiValueMap fixture = new MultiValueMap(new LRUMap(), new ConstantFactory((Object) null));
		fixture.map = new LRUMap();
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
		MultiValueMap fixture = new MultiValueMap(new LRUMap(), new ConstantFactory((Object) null));
		fixture.map = new LRUMap();
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
		MultiValueMap fixture = new MultiValueMap(new LRUMap(), new ConstantFactory((Object) null));
		fixture.map = new LRUMap();
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
	public void testRemoveMapping_4()
		throws Exception {
		MultiValueMap fixture = new MultiValueMap(new LRUMap(), new ConstantFactory((Object) null));
		fixture.map = new LRUMap();
		Object key = new Object();
		Object value = new Object();

		boolean result = fixture.removeMapping(key, value);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the int size(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testSize_1()
		throws Exception {
		MultiValueMap fixture = new MultiValueMap(new LRUMap(), new ConstantFactory((Object) null));
		fixture.map = new LRUMap();
		Object key = new Object();

		int result = fixture.size(key);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int size(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testSize_2()
		throws Exception {
		MultiValueMap fixture = new MultiValueMap(new LRUMap(), new ConstantFactory((Object) null));
		fixture.map = new LRUMap();
		Object key = new Object();

		int result = fixture.size(key);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int totalSize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testTotalSize_1()
		throws Exception {
		MultiValueMap fixture = new MultiValueMap(new LRUMap(), new ConstantFactory((Object) null));
		fixture.map = new LRUMap();

		int result = fixture.totalSize();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int totalSize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testTotalSize_2()
		throws Exception {
		MultiValueMap fixture = new MultiValueMap(new LRUMap(), new ConstantFactory((Object) null));
		fixture.map = new LRUMap();

		int result = fixture.totalSize();

		// add additional test code here
		assertEquals(0, result);
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
		MultiValueMap fixture = new MultiValueMap(new LRUMap(), new ConstantFactory((Object) null));
		fixture.map = new LRUMap();

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
		MultiValueMap fixture = new MultiValueMap(new LRUMap(), new ConstantFactory((Object) null));
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
		new org.junit.runner.JUnitCore().run(MultiValueMapTest.class);
	}
}
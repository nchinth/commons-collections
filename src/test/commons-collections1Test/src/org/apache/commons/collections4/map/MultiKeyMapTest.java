package org.apache.commons.collections4.map;

import java.util.Map;
import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.keyvalue.MultiKey;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>MultiKeyMapTest</code> contains tests for the class <code>{@link MultiKeyMap}</code>.
 *
 * @generatedBy CodePro at 10/23/15 2:18 PM
 * @author Nikhil
 * @version $Revision: 1.0 $
 */
public class MultiKeyMapTest {
	/**
	 * Run the MultiKeyMap() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testMultiKeyMap_1()
		throws Exception {

		MultiKeyMap result = new MultiKeyMap();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the MultiKeyMap(AbstractHashedMap<MultiKey<? extends K>,V>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testMultiKeyMap_2()
		throws Exception {
		AbstractHashedMap<MultiKey<? extends Object>, Object> map = new AbstractHashedMap();

		MultiKeyMap result = new MultiKeyMap(map);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the void checkKey(MultiKey<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testCheckKey_1()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		MultiKey<Object> key = new MultiKey(new Object[] {});

		fixture.checkKey(key);

		// add additional test code here
	}

	/**
	 * Run the void checkKey(MultiKey<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testCheckKey_2()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		MultiKey<Object> key = null;

		fixture.checkKey(key);

		// add additional test code here
	}

	/**
	 * Run the MultiKeyMap<Object, Object> clone() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testClone_1()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());

		MultiKeyMap<Object, Object> result = fixture.clone();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the MultiKeyMap<Object, Object> clone() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testClone_2()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());

		MultiKeyMap<Object, Object> result = fixture.clone();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the boolean containsKey(Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testContainsKey_1()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();
		Object key2 = new Object();

		boolean result = fixture.containsKey(key1, key2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.containsKey(MultiKeyMap.java:158)
		assertTrue(result);
	}

	/**
	 * Run the boolean containsKey(Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testContainsKey_2()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();
		Object key2 = new Object();

		boolean result = fixture.containsKey(key1, key2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.containsKey(MultiKeyMap.java:158)
		assertTrue(result);
	}

	/**
	 * Run the boolean containsKey(Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testContainsKey_3()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();
		Object key2 = new Object();

		boolean result = fixture.containsKey(key1, key2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.containsKey(MultiKeyMap.java:158)
		assertTrue(result);
	}

	/**
	 * Run the boolean containsKey(Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testContainsKey_4()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();
		Object key2 = new Object();

		boolean result = fixture.containsKey(key1, key2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.containsKey(MultiKeyMap.java:158)
		assertTrue(result);
	}

	/**
	 * Run the boolean containsKey(Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testContainsKey_5()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();
		Object key2 = new Object();
		Object key3 = new Object();

		boolean result = fixture.containsKey(key1, key2, key3);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.containsKey(MultiKeyMap.java:289)
		assertTrue(result);
	}

	/**
	 * Run the boolean containsKey(Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testContainsKey_6()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();
		Object key2 = new Object();
		Object key3 = new Object();

		boolean result = fixture.containsKey(key1, key2, key3);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.containsKey(MultiKeyMap.java:289)
		assertTrue(result);
	}

	/**
	 * Run the boolean containsKey(Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testContainsKey_7()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();
		Object key2 = new Object();
		Object key3 = new Object();

		boolean result = fixture.containsKey(key1, key2, key3);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.containsKey(MultiKeyMap.java:289)
		assertTrue(result);
	}

	/**
	 * Run the boolean containsKey(Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testContainsKey_8()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();
		Object key2 = new Object();
		Object key3 = new Object();

		boolean result = fixture.containsKey(key1, key2, key3);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.containsKey(MultiKeyMap.java:289)
		assertTrue(result);
	}

	/**
	 * Run the boolean containsKey(Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testContainsKey_9()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();
		Object key2 = new Object();
		Object key3 = new Object();
		Object key4 = new Object();

		boolean result = fixture.containsKey(key1, key2, key3, key4);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.containsKey(MultiKeyMap.java:430)
		assertTrue(result);
	}

	/**
	 * Run the boolean containsKey(Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testContainsKey_10()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();
		Object key2 = new Object();
		Object key3 = new Object();
		Object key4 = new Object();

		boolean result = fixture.containsKey(key1, key2, key3, key4);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.containsKey(MultiKeyMap.java:430)
		assertTrue(result);
	}

	/**
	 * Run the boolean containsKey(Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testContainsKey_11()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();
		Object key2 = new Object();
		Object key3 = new Object();
		Object key4 = new Object();

		boolean result = fixture.containsKey(key1, key2, key3, key4);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.containsKey(MultiKeyMap.java:430)
		assertTrue(result);
	}

	/**
	 * Run the boolean containsKey(Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testContainsKey_12()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();
		Object key2 = new Object();
		Object key3 = new Object();
		Object key4 = new Object();

		boolean result = fixture.containsKey(key1, key2, key3, key4);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.containsKey(MultiKeyMap.java:430)
		assertTrue(result);
	}

	/**
	 * Run the boolean containsKey(Object,Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testContainsKey_13()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();
		Object key2 = new Object();
		Object key3 = new Object();
		Object key4 = new Object();
		Object key5 = new Object();

		boolean result = fixture.containsKey(key1, key2, key3, key4, key5);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.containsKey(MultiKeyMap.java:582)
		assertTrue(result);
	}

	/**
	 * Run the boolean containsKey(Object,Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testContainsKey_14()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();
		Object key2 = new Object();
		Object key3 = new Object();
		Object key4 = new Object();
		Object key5 = new Object();

		boolean result = fixture.containsKey(key1, key2, key3, key4, key5);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.containsKey(MultiKeyMap.java:582)
		assertTrue(result);
	}

	/**
	 * Run the boolean containsKey(Object,Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testContainsKey_15()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();
		Object key2 = new Object();
		Object key3 = new Object();
		Object key4 = new Object();
		Object key5 = new Object();

		boolean result = fixture.containsKey(key1, key2, key3, key4, key5);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.containsKey(MultiKeyMap.java:582)
		assertTrue(result);
	}

	/**
	 * Run the boolean containsKey(Object,Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testContainsKey_16()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();
		Object key2 = new Object();
		Object key3 = new Object();
		Object key4 = new Object();
		Object key5 = new Object();

		boolean result = fixture.containsKey(key1, key2, key3, key4, key5);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.containsKey(MultiKeyMap.java:582)
		assertTrue(result);
	}

	/**
	 * Run the AbstractHashedMap<MultiKey<? extends Object>, Object> decorated() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testDecorated_1()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());

		AbstractHashedMap<MultiKey<? extends Object>, Object> result = fixture.decorated();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Object get(Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testGet_1()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();
		Object key2 = new Object();

		Object result = fixture.get(key1, key2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.get(MultiKeyMap.java:138)
		assertNotNull(result);
	}

	/**
	 * Run the Object get(Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testGet_2()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();
		Object key2 = new Object();

		Object result = fixture.get(key1, key2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.get(MultiKeyMap.java:138)
		assertNotNull(result);
	}

	/**
	 * Run the Object get(Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testGet_3()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();
		Object key2 = new Object();

		Object result = fixture.get(key1, key2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.get(MultiKeyMap.java:138)
		assertNotNull(result);
	}

	/**
	 * Run the Object get(Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testGet_4()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();
		Object key2 = new Object();

		Object result = fixture.get(key1, key2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.get(MultiKeyMap.java:138)
		assertNotNull(result);
	}

	/**
	 * Run the Object get(Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testGet_5()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();
		Object key2 = new Object();
		Object key3 = new Object();

		Object result = fixture.get(key1, key2, key3);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.get(MultiKeyMap.java:268)
		assertNotNull(result);
	}

	/**
	 * Run the Object get(Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testGet_6()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();
		Object key2 = new Object();
		Object key3 = new Object();

		Object result = fixture.get(key1, key2, key3);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.get(MultiKeyMap.java:268)
		assertNotNull(result);
	}

	/**
	 * Run the Object get(Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testGet_7()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();
		Object key2 = new Object();
		Object key3 = new Object();

		Object result = fixture.get(key1, key2, key3);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.get(MultiKeyMap.java:268)
		assertNotNull(result);
	}

	/**
	 * Run the Object get(Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testGet_8()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();
		Object key2 = new Object();
		Object key3 = new Object();

		Object result = fixture.get(key1, key2, key3);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.get(MultiKeyMap.java:268)
		assertNotNull(result);
	}

	/**
	 * Run the Object get(Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testGet_9()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();
		Object key2 = new Object();
		Object key3 = new Object();
		Object key4 = new Object();

		Object result = fixture.get(key1, key2, key3, key4);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.get(MultiKeyMap.java:408)
		assertNotNull(result);
	}

	/**
	 * Run the Object get(Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testGet_10()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();
		Object key2 = new Object();
		Object key3 = new Object();
		Object key4 = new Object();

		Object result = fixture.get(key1, key2, key3, key4);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.get(MultiKeyMap.java:408)
		assertNotNull(result);
	}

	/**
	 * Run the Object get(Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testGet_11()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();
		Object key2 = new Object();
		Object key3 = new Object();
		Object key4 = new Object();

		Object result = fixture.get(key1, key2, key3, key4);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.get(MultiKeyMap.java:408)
		assertNotNull(result);
	}

	/**
	 * Run the Object get(Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testGet_12()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();
		Object key2 = new Object();
		Object key3 = new Object();
		Object key4 = new Object();

		Object result = fixture.get(key1, key2, key3, key4);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.get(MultiKeyMap.java:408)
		assertNotNull(result);
	}

	/**
	 * Run the Object get(Object,Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testGet_13()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();
		Object key2 = new Object();
		Object key3 = new Object();
		Object key4 = new Object();
		Object key5 = new Object();

		Object result = fixture.get(key1, key2, key3, key4, key5);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.get(MultiKeyMap.java:558)
		assertNotNull(result);
	}

	/**
	 * Run the Object get(Object,Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testGet_14()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();
		Object key2 = new Object();
		Object key3 = new Object();
		Object key4 = new Object();
		Object key5 = new Object();

		Object result = fixture.get(key1, key2, key3, key4, key5);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.get(MultiKeyMap.java:558)
		assertNotNull(result);
	}

	/**
	 * Run the Object get(Object,Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testGet_15()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();
		Object key2 = new Object();
		Object key3 = new Object();
		Object key4 = new Object();
		Object key5 = new Object();

		Object result = fixture.get(key1, key2, key3, key4, key5);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.get(MultiKeyMap.java:558)
		assertNotNull(result);
	}

	/**
	 * Run the Object get(Object,Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testGet_16()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();
		Object key2 = new Object();
		Object key3 = new Object();
		Object key4 = new Object();
		Object key5 = new Object();

		Object result = fixture.get(key1, key2, key3, key4, key5);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.get(MultiKeyMap.java:558)
		assertNotNull(result);
	}

	/**
	 * Run the int hash(Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testHash_1()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = null;
		Object key2 = new Object();

		int result = fixture.hash(key1, key2);

		// add additional test code here
		assertEquals(1592509374, result);
	}

	/**
	 * Run the int hash(Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testHash_2()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();
		Object key2 = null;

		int result = fixture.hash(key1, key2);

		// add additional test code here
		assertEquals(-609230004, result);
	}

	/**
	 * Run the int hash(Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testHash_3()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = null;
		Object key2 = new Object();
		Object key3 = new Object();

		int result = fixture.hash(key1, key2, key3);

		// add additional test code here
		assertEquals(1847760872, result);
	}

	/**
	 * Run the int hash(Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testHash_4()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();
		Object key2 = null;
		Object key3 = null;

		int result = fixture.hash(key1, key2, key3);

		// add additional test code here
		assertEquals(649875608, result);
	}

	/**
	 * Run the int hash(Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testHash_5()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = null;
		Object key2 = null;
		Object key3 = new Object();
		Object key4 = new Object();

		int result = fixture.hash(key1, key2, key3, key4);

		// add additional test code here
		assertEquals(1825896552, result);
	}

	/**
	 * Run the int hash(Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testHash_6()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();
		Object key2 = new Object();
		Object key3 = null;
		Object key4 = null;

		int result = fixture.hash(key1, key2, key3, key4);

		// add additional test code here
		assertEquals(1849250107, result);
	}

	/**
	 * Run the int hash(Object,Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testHash_7()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = null;
		Object key2 = null;
		Object key3 = new Object();
		Object key4 = new Object();
		Object key5 = new Object();

		int result = fixture.hash(key1, key2, key3, key4, key5);

		// add additional test code here
		assertEquals(-776369123, result);
	}

	/**
	 * Run the int hash(Object,Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testHash_8()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();
		Object key2 = new Object();
		Object key3 = null;
		Object key4 = null;
		Object key5 = null;

		int result = fixture.hash(key1, key2, key3, key4, key5);

		// add additional test code here
		assertEquals(1818870389, result);
	}

	/**
	 * Run the boolean isEqualKey(HashEntry<MultiKey<? extends K>,V>,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testIsEqualKey_1()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		AbstractHashedMap.HashEntry<MultiKey<? extends Object>, Object> entry = new AbstractHashedMap.HashEntry((AbstractHashedMap.HashEntry<Object, Object>) null, 1, new Object(), (Object) null);
		Object key1 = null;
		Object key2 = null;

		boolean result = fixture.isEqualKey(entry, key1, key2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to org.apache.commons.collections4.keyvalue.MultiKey
		//       at org.apache.commons.collections4.map.MultiKeyMap.isEqualKey(MultiKeyMap.java:249)
		assertTrue(result);
	}

	/**
	 * Run the boolean isEqualKey(HashEntry<MultiKey<? extends K>,V>,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testIsEqualKey_2()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		AbstractHashedMap.HashEntry<MultiKey<? extends Object>, Object> entry = new AbstractHashedMap.HashEntry((AbstractHashedMap.HashEntry<Object, Object>) null, 1, new Object(), (Object) null);
		Object key1 = null;
		Object key2 = null;

		boolean result = fixture.isEqualKey(entry, key1, key2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to org.apache.commons.collections4.keyvalue.MultiKey
		//       at org.apache.commons.collections4.map.MultiKeyMap.isEqualKey(MultiKeyMap.java:249)
		assertTrue(result);
	}

	/**
	 * Run the boolean isEqualKey(HashEntry<MultiKey<? extends K>,V>,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testIsEqualKey_3()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		AbstractHashedMap.HashEntry<MultiKey<? extends Object>, Object> entry = new AbstractHashedMap.HashEntry((AbstractHashedMap.HashEntry<Object, Object>) null, 1, new Object(), (Object) null);
		Object key1 = new Object();
		Object key2 = new Object();

		boolean result = fixture.isEqualKey(entry, key1, key2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to org.apache.commons.collections4.keyvalue.MultiKey
		//       at org.apache.commons.collections4.map.MultiKeyMap.isEqualKey(MultiKeyMap.java:249)
		assertTrue(result);
	}

	/**
	 * Run the boolean isEqualKey(HashEntry<MultiKey<? extends K>,V>,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testIsEqualKey_4()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		AbstractHashedMap.HashEntry<MultiKey<? extends Object>, Object> entry = new AbstractHashedMap.HashEntry((AbstractHashedMap.HashEntry<Object, Object>) null, 1, new Object(), (Object) null);
		Object key1 = null;
		Object key2 = new Object();

		boolean result = fixture.isEqualKey(entry, key1, key2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to org.apache.commons.collections4.keyvalue.MultiKey
		//       at org.apache.commons.collections4.map.MultiKeyMap.isEqualKey(MultiKeyMap.java:249)
		assertTrue(result);
	}

	/**
	 * Run the boolean isEqualKey(HashEntry<MultiKey<? extends K>,V>,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testIsEqualKey_5()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		AbstractHashedMap.HashEntry<MultiKey<? extends Object>, Object> entry = new AbstractHashedMap.HashEntry((AbstractHashedMap.HashEntry<Object, Object>) null, 1, new Object(), (Object) null);
		Object key1 = new Object();
		Object key2 = new Object();

		boolean result = fixture.isEqualKey(entry, key1, key2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to org.apache.commons.collections4.keyvalue.MultiKey
		//       at org.apache.commons.collections4.map.MultiKeyMap.isEqualKey(MultiKeyMap.java:249)
		assertTrue(result);
	}

	/**
	 * Run the boolean isEqualKey(HashEntry<MultiKey<? extends K>,V>,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testIsEqualKey_6()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		AbstractHashedMap.HashEntry<MultiKey<? extends Object>, Object> entry = new AbstractHashedMap.HashEntry((AbstractHashedMap.HashEntry<Object, Object>) null, 1, new Object(), (Object) null);
		Object key1 = null;
		Object key2 = null;

		boolean result = fixture.isEqualKey(entry, key1, key2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to org.apache.commons.collections4.keyvalue.MultiKey
		//       at org.apache.commons.collections4.map.MultiKeyMap.isEqualKey(MultiKeyMap.java:249)
		assertTrue(result);
	}

	/**
	 * Run the boolean isEqualKey(HashEntry<MultiKey<? extends K>,V>,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testIsEqualKey_7()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		AbstractHashedMap.HashEntry<MultiKey<? extends Object>, Object> entry = new AbstractHashedMap.HashEntry((AbstractHashedMap.HashEntry<Object, Object>) null, 1, new Object(), (Object) null);
		Object key1 = null;
		Object key2 = new Object();

		boolean result = fixture.isEqualKey(entry, key1, key2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to org.apache.commons.collections4.keyvalue.MultiKey
		//       at org.apache.commons.collections4.map.MultiKeyMap.isEqualKey(MultiKeyMap.java:249)
		assertTrue(result);
	}

	/**
	 * Run the boolean isEqualKey(HashEntry<MultiKey<? extends K>,V>,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testIsEqualKey_8()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		AbstractHashedMap.HashEntry<MultiKey<? extends Object>, Object> entry = new AbstractHashedMap.HashEntry((AbstractHashedMap.HashEntry<Object, Object>) null, 1, new Object(), (Object) null);
		Object key1 = null;
		Object key2 = null;
		Object key3 = null;

		boolean result = fixture.isEqualKey(entry, key1, key2, key3);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to org.apache.commons.collections4.keyvalue.MultiKey
		//       at org.apache.commons.collections4.map.MultiKeyMap.isEqualKey(MultiKeyMap.java:387)
		assertTrue(result);
	}

	/**
	 * Run the boolean isEqualKey(HashEntry<MultiKey<? extends K>,V>,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testIsEqualKey_9()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		AbstractHashedMap.HashEntry<MultiKey<? extends Object>, Object> entry = new AbstractHashedMap.HashEntry((AbstractHashedMap.HashEntry<Object, Object>) null, 1, new Object(), (Object) null);
		Object key1 = null;
		Object key2 = null;
		Object key3 = null;

		boolean result = fixture.isEqualKey(entry, key1, key2, key3);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to org.apache.commons.collections4.keyvalue.MultiKey
		//       at org.apache.commons.collections4.map.MultiKeyMap.isEqualKey(MultiKeyMap.java:387)
		assertTrue(result);
	}

	/**
	 * Run the boolean isEqualKey(HashEntry<MultiKey<? extends K>,V>,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testIsEqualKey_10()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		AbstractHashedMap.HashEntry<MultiKey<? extends Object>, Object> entry = new AbstractHashedMap.HashEntry((AbstractHashedMap.HashEntry<Object, Object>) null, 1, new Object(), (Object) null);
		Object key1 = new Object();
		Object key2 = new Object();
		Object key3 = new Object();

		boolean result = fixture.isEqualKey(entry, key1, key2, key3);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to org.apache.commons.collections4.keyvalue.MultiKey
		//       at org.apache.commons.collections4.map.MultiKeyMap.isEqualKey(MultiKeyMap.java:387)
		assertTrue(result);
	}

	/**
	 * Run the boolean isEqualKey(HashEntry<MultiKey<? extends K>,V>,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testIsEqualKey_11()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		AbstractHashedMap.HashEntry<MultiKey<? extends Object>, Object> entry = new AbstractHashedMap.HashEntry((AbstractHashedMap.HashEntry<Object, Object>) null, 1, new Object(), (Object) null);
		Object key1 = null;
		Object key2 = new Object();
		Object key3 = new Object();

		boolean result = fixture.isEqualKey(entry, key1, key2, key3);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to org.apache.commons.collections4.keyvalue.MultiKey
		//       at org.apache.commons.collections4.map.MultiKeyMap.isEqualKey(MultiKeyMap.java:387)
		assertTrue(result);
	}

	/**
	 * Run the boolean isEqualKey(HashEntry<MultiKey<? extends K>,V>,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testIsEqualKey_12()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		AbstractHashedMap.HashEntry<MultiKey<? extends Object>, Object> entry = new AbstractHashedMap.HashEntry((AbstractHashedMap.HashEntry<Object, Object>) null, 1, new Object(), (Object) null);
		Object key1 = new Object();
		Object key2 = new Object();
		Object key3 = new Object();

		boolean result = fixture.isEqualKey(entry, key1, key2, key3);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to org.apache.commons.collections4.keyvalue.MultiKey
		//       at org.apache.commons.collections4.map.MultiKeyMap.isEqualKey(MultiKeyMap.java:387)
		assertTrue(result);
	}

	/**
	 * Run the boolean isEqualKey(HashEntry<MultiKey<? extends K>,V>,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testIsEqualKey_13()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		AbstractHashedMap.HashEntry<MultiKey<? extends Object>, Object> entry = new AbstractHashedMap.HashEntry((AbstractHashedMap.HashEntry<Object, Object>) null, 1, new Object(), (Object) null);
		Object key1 = null;
		Object key2 = null;
		Object key3 = new Object();

		boolean result = fixture.isEqualKey(entry, key1, key2, key3);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to org.apache.commons.collections4.keyvalue.MultiKey
		//       at org.apache.commons.collections4.map.MultiKeyMap.isEqualKey(MultiKeyMap.java:387)
		assertTrue(result);
	}

	/**
	 * Run the boolean isEqualKey(HashEntry<MultiKey<? extends K>,V>,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testIsEqualKey_14()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		AbstractHashedMap.HashEntry<MultiKey<? extends Object>, Object> entry = new AbstractHashedMap.HashEntry((AbstractHashedMap.HashEntry<Object, Object>) null, 1, new Object(), (Object) null);
		Object key1 = null;
		Object key2 = new Object();
		Object key3 = new Object();

		boolean result = fixture.isEqualKey(entry, key1, key2, key3);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to org.apache.commons.collections4.keyvalue.MultiKey
		//       at org.apache.commons.collections4.map.MultiKeyMap.isEqualKey(MultiKeyMap.java:387)
		assertTrue(result);
	}

	/**
	 * Run the boolean isEqualKey(HashEntry<MultiKey<? extends K>,V>,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testIsEqualKey_15()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		AbstractHashedMap.HashEntry<MultiKey<? extends Object>, Object> entry = new AbstractHashedMap.HashEntry((AbstractHashedMap.HashEntry<Object, Object>) null, 1, new Object(), (Object) null);
		Object key1 = null;
		Object key2 = null;
		Object key3 = null;

		boolean result = fixture.isEqualKey(entry, key1, key2, key3);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to org.apache.commons.collections4.keyvalue.MultiKey
		//       at org.apache.commons.collections4.map.MultiKeyMap.isEqualKey(MultiKeyMap.java:387)
		assertTrue(result);
	}

	/**
	 * Run the boolean isEqualKey(HashEntry<MultiKey<? extends K>,V>,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testIsEqualKey_16()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		AbstractHashedMap.HashEntry<MultiKey<? extends Object>, Object> entry = new AbstractHashedMap.HashEntry((AbstractHashedMap.HashEntry<Object, Object>) null, 1, new Object(), (Object) null);
		Object key1 = null;
		Object key2 = null;
		Object key3 = new Object();

		boolean result = fixture.isEqualKey(entry, key1, key2, key3);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to org.apache.commons.collections4.keyvalue.MultiKey
		//       at org.apache.commons.collections4.map.MultiKeyMap.isEqualKey(MultiKeyMap.java:387)
		assertTrue(result);
	}

	/**
	 * Run the boolean isEqualKey(HashEntry<MultiKey<? extends K>,V>,Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testIsEqualKey_17()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		AbstractHashedMap.HashEntry<MultiKey<? extends Object>, Object> entry = new AbstractHashedMap.HashEntry((AbstractHashedMap.HashEntry<Object, Object>) null, 1, new Object(), (Object) null);
		Object key1 = null;
		Object key2 = null;
		Object key3 = null;
		Object key4 = null;

		boolean result = fixture.isEqualKey(entry, key1, key2, key3, key4);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to org.apache.commons.collections4.keyvalue.MultiKey
		//       at org.apache.commons.collections4.map.MultiKeyMap.isEqualKey(MultiKeyMap.java:535)
		assertTrue(result);
	}

	/**
	 * Run the boolean isEqualKey(HashEntry<MultiKey<? extends K>,V>,Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testIsEqualKey_18()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		AbstractHashedMap.HashEntry<MultiKey<? extends Object>, Object> entry = new AbstractHashedMap.HashEntry((AbstractHashedMap.HashEntry<Object, Object>) null, 1, new Object(), (Object) null);
		Object key1 = null;
		Object key2 = null;
		Object key3 = null;
		Object key4 = null;

		boolean result = fixture.isEqualKey(entry, key1, key2, key3, key4);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to org.apache.commons.collections4.keyvalue.MultiKey
		//       at org.apache.commons.collections4.map.MultiKeyMap.isEqualKey(MultiKeyMap.java:535)
		assertTrue(result);
	}

	/**
	 * Run the boolean isEqualKey(HashEntry<MultiKey<? extends K>,V>,Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testIsEqualKey_19()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		AbstractHashedMap.HashEntry<MultiKey<? extends Object>, Object> entry = new AbstractHashedMap.HashEntry((AbstractHashedMap.HashEntry<Object, Object>) null, 1, new Object(), (Object) null);
		Object key1 = new Object();
		Object key2 = new Object();
		Object key3 = new Object();
		Object key4 = new Object();

		boolean result = fixture.isEqualKey(entry, key1, key2, key3, key4);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to org.apache.commons.collections4.keyvalue.MultiKey
		//       at org.apache.commons.collections4.map.MultiKeyMap.isEqualKey(MultiKeyMap.java:535)
		assertTrue(result);
	}

	/**
	 * Run the boolean isEqualKey(HashEntry<MultiKey<? extends K>,V>,Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testIsEqualKey_20()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		AbstractHashedMap.HashEntry<MultiKey<? extends Object>, Object> entry = new AbstractHashedMap.HashEntry((AbstractHashedMap.HashEntry<Object, Object>) null, 1, new Object(), (Object) null);
		Object key1 = null;
		Object key2 = new Object();
		Object key3 = new Object();
		Object key4 = new Object();

		boolean result = fixture.isEqualKey(entry, key1, key2, key3, key4);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to org.apache.commons.collections4.keyvalue.MultiKey
		//       at org.apache.commons.collections4.map.MultiKeyMap.isEqualKey(MultiKeyMap.java:535)
		assertTrue(result);
	}

	/**
	 * Run the boolean isEqualKey(HashEntry<MultiKey<? extends K>,V>,Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testIsEqualKey_21()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		AbstractHashedMap.HashEntry<MultiKey<? extends Object>, Object> entry = new AbstractHashedMap.HashEntry((AbstractHashedMap.HashEntry<Object, Object>) null, 1, new Object(), (Object) null);
		Object key1 = new Object();
		Object key2 = new Object();
		Object key3 = new Object();
		Object key4 = new Object();

		boolean result = fixture.isEqualKey(entry, key1, key2, key3, key4);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to org.apache.commons.collections4.keyvalue.MultiKey
		//       at org.apache.commons.collections4.map.MultiKeyMap.isEqualKey(MultiKeyMap.java:535)
		assertTrue(result);
	}

	/**
	 * Run the boolean isEqualKey(HashEntry<MultiKey<? extends K>,V>,Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testIsEqualKey_22()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		AbstractHashedMap.HashEntry<MultiKey<? extends Object>, Object> entry = new AbstractHashedMap.HashEntry((AbstractHashedMap.HashEntry<Object, Object>) null, 1, new Object(), (Object) null);
		Object key1 = null;
		Object key2 = null;
		Object key3 = new Object();
		Object key4 = new Object();

		boolean result = fixture.isEqualKey(entry, key1, key2, key3, key4);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to org.apache.commons.collections4.keyvalue.MultiKey
		//       at org.apache.commons.collections4.map.MultiKeyMap.isEqualKey(MultiKeyMap.java:535)
		assertTrue(result);
	}

	/**
	 * Run the boolean isEqualKey(HashEntry<MultiKey<? extends K>,V>,Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testIsEqualKey_23()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		AbstractHashedMap.HashEntry<MultiKey<? extends Object>, Object> entry = new AbstractHashedMap.HashEntry((AbstractHashedMap.HashEntry<Object, Object>) null, 1, new Object(), (Object) null);
		Object key1 = null;
		Object key2 = new Object();
		Object key3 = new Object();
		Object key4 = new Object();

		boolean result = fixture.isEqualKey(entry, key1, key2, key3, key4);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to org.apache.commons.collections4.keyvalue.MultiKey
		//       at org.apache.commons.collections4.map.MultiKeyMap.isEqualKey(MultiKeyMap.java:535)
		assertTrue(result);
	}

	/**
	 * Run the boolean isEqualKey(HashEntry<MultiKey<? extends K>,V>,Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testIsEqualKey_24()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		AbstractHashedMap.HashEntry<MultiKey<? extends Object>, Object> entry = new AbstractHashedMap.HashEntry((AbstractHashedMap.HashEntry<Object, Object>) null, 1, new Object(), (Object) null);
		Object key1 = null;
		Object key2 = null;
		Object key3 = null;
		Object key4 = new Object();

		boolean result = fixture.isEqualKey(entry, key1, key2, key3, key4);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to org.apache.commons.collections4.keyvalue.MultiKey
		//       at org.apache.commons.collections4.map.MultiKeyMap.isEqualKey(MultiKeyMap.java:535)
		assertTrue(result);
	}

	/**
	 * Run the boolean isEqualKey(HashEntry<MultiKey<? extends K>,V>,Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testIsEqualKey_25()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		AbstractHashedMap.HashEntry<MultiKey<? extends Object>, Object> entry = new AbstractHashedMap.HashEntry((AbstractHashedMap.HashEntry<Object, Object>) null, 1, new Object(), (Object) null);
		Object key1 = null;
		Object key2 = null;
		Object key3 = new Object();
		Object key4 = new Object();

		boolean result = fixture.isEqualKey(entry, key1, key2, key3, key4);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to org.apache.commons.collections4.keyvalue.MultiKey
		//       at org.apache.commons.collections4.map.MultiKeyMap.isEqualKey(MultiKeyMap.java:535)
		assertTrue(result);
	}

	/**
	 * Run the boolean isEqualKey(HashEntry<MultiKey<? extends K>,V>,Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testIsEqualKey_26()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		AbstractHashedMap.HashEntry<MultiKey<? extends Object>, Object> entry = new AbstractHashedMap.HashEntry((AbstractHashedMap.HashEntry<Object, Object>) null, 1, new Object(), (Object) null);
		Object key1 = null;
		Object key2 = null;
		Object key3 = null;
		Object key4 = null;

		boolean result = fixture.isEqualKey(entry, key1, key2, key3, key4);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to org.apache.commons.collections4.keyvalue.MultiKey
		//       at org.apache.commons.collections4.map.MultiKeyMap.isEqualKey(MultiKeyMap.java:535)
		assertTrue(result);
	}

	/**
	 * Run the boolean isEqualKey(HashEntry<MultiKey<? extends K>,V>,Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testIsEqualKey_27()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		AbstractHashedMap.HashEntry<MultiKey<? extends Object>, Object> entry = new AbstractHashedMap.HashEntry((AbstractHashedMap.HashEntry<Object, Object>) null, 1, new Object(), (Object) null);
		Object key1 = null;
		Object key2 = null;
		Object key3 = null;
		Object key4 = new Object();

		boolean result = fixture.isEqualKey(entry, key1, key2, key3, key4);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to org.apache.commons.collections4.keyvalue.MultiKey
		//       at org.apache.commons.collections4.map.MultiKeyMap.isEqualKey(MultiKeyMap.java:535)
		assertTrue(result);
	}

	/**
	 * Run the boolean isEqualKey(HashEntry<MultiKey<? extends K>,V>,Object,Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testIsEqualKey_28()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		AbstractHashedMap.HashEntry<MultiKey<? extends Object>, Object> entry = new AbstractHashedMap.HashEntry((AbstractHashedMap.HashEntry<Object, Object>) null, 1, new Object(), (Object) null);
		Object key1 = null;
		Object key2 = null;
		Object key3 = null;
		Object key4 = null;
		Object key5 = null;

		boolean result = fixture.isEqualKey(entry, key1, key2, key3, key4, key5);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to org.apache.commons.collections4.keyvalue.MultiKey
		//       at org.apache.commons.collections4.map.MultiKeyMap.isEqualKey(MultiKeyMap.java:695)
		assertTrue(result);
	}

	/**
	 * Run the boolean isEqualKey(HashEntry<MultiKey<? extends K>,V>,Object,Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testIsEqualKey_29()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		AbstractHashedMap.HashEntry<MultiKey<? extends Object>, Object> entry = new AbstractHashedMap.HashEntry((AbstractHashedMap.HashEntry<Object, Object>) null, 1, new Object(), (Object) null);
		Object key1 = null;
		Object key2 = null;
		Object key3 = null;
		Object key4 = null;
		Object key5 = null;

		boolean result = fixture.isEqualKey(entry, key1, key2, key3, key4, key5);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to org.apache.commons.collections4.keyvalue.MultiKey
		//       at org.apache.commons.collections4.map.MultiKeyMap.isEqualKey(MultiKeyMap.java:695)
		assertTrue(result);
	}

	/**
	 * Run the boolean isEqualKey(HashEntry<MultiKey<? extends K>,V>,Object,Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testIsEqualKey_30()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		AbstractHashedMap.HashEntry<MultiKey<? extends Object>, Object> entry = new AbstractHashedMap.HashEntry((AbstractHashedMap.HashEntry<Object, Object>) null, 1, new Object(), (Object) null);
		Object key1 = new Object();
		Object key2 = new Object();
		Object key3 = new Object();
		Object key4 = new Object();
		Object key5 = new Object();

		boolean result = fixture.isEqualKey(entry, key1, key2, key3, key4, key5);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to org.apache.commons.collections4.keyvalue.MultiKey
		//       at org.apache.commons.collections4.map.MultiKeyMap.isEqualKey(MultiKeyMap.java:695)
		assertTrue(result);
	}

	/**
	 * Run the boolean isEqualKey(HashEntry<MultiKey<? extends K>,V>,Object,Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testIsEqualKey_31()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		AbstractHashedMap.HashEntry<MultiKey<? extends Object>, Object> entry = new AbstractHashedMap.HashEntry((AbstractHashedMap.HashEntry<Object, Object>) null, 1, new Object(), (Object) null);
		Object key1 = null;
		Object key2 = new Object();
		Object key3 = new Object();
		Object key4 = new Object();
		Object key5 = new Object();

		boolean result = fixture.isEqualKey(entry, key1, key2, key3, key4, key5);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to org.apache.commons.collections4.keyvalue.MultiKey
		//       at org.apache.commons.collections4.map.MultiKeyMap.isEqualKey(MultiKeyMap.java:695)
		assertTrue(result);
	}

	/**
	 * Run the boolean isEqualKey(HashEntry<MultiKey<? extends K>,V>,Object,Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testIsEqualKey_32()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		AbstractHashedMap.HashEntry<MultiKey<? extends Object>, Object> entry = new AbstractHashedMap.HashEntry((AbstractHashedMap.HashEntry<Object, Object>) null, 1, new Object(), (Object) null);
		Object key1 = new Object();
		Object key2 = new Object();
		Object key3 = new Object();
		Object key4 = new Object();
		Object key5 = new Object();

		boolean result = fixture.isEqualKey(entry, key1, key2, key3, key4, key5);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to org.apache.commons.collections4.keyvalue.MultiKey
		//       at org.apache.commons.collections4.map.MultiKeyMap.isEqualKey(MultiKeyMap.java:695)
		assertTrue(result);
	}

	/**
	 * Run the boolean isEqualKey(HashEntry<MultiKey<? extends K>,V>,Object,Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testIsEqualKey_33()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		AbstractHashedMap.HashEntry<MultiKey<? extends Object>, Object> entry = new AbstractHashedMap.HashEntry((AbstractHashedMap.HashEntry<Object, Object>) null, 1, new Object(), (Object) null);
		Object key1 = null;
		Object key2 = null;
		Object key3 = new Object();
		Object key4 = new Object();
		Object key5 = new Object();

		boolean result = fixture.isEqualKey(entry, key1, key2, key3, key4, key5);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to org.apache.commons.collections4.keyvalue.MultiKey
		//       at org.apache.commons.collections4.map.MultiKeyMap.isEqualKey(MultiKeyMap.java:695)
		assertTrue(result);
	}

	/**
	 * Run the boolean isEqualKey(HashEntry<MultiKey<? extends K>,V>,Object,Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testIsEqualKey_34()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		AbstractHashedMap.HashEntry<MultiKey<? extends Object>, Object> entry = new AbstractHashedMap.HashEntry((AbstractHashedMap.HashEntry<Object, Object>) null, 1, new Object(), (Object) null);
		Object key1 = null;
		Object key2 = new Object();
		Object key3 = new Object();
		Object key4 = new Object();
		Object key5 = new Object();

		boolean result = fixture.isEqualKey(entry, key1, key2, key3, key4, key5);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to org.apache.commons.collections4.keyvalue.MultiKey
		//       at org.apache.commons.collections4.map.MultiKeyMap.isEqualKey(MultiKeyMap.java:695)
		assertTrue(result);
	}

	/**
	 * Run the boolean isEqualKey(HashEntry<MultiKey<? extends K>,V>,Object,Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testIsEqualKey_35()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		AbstractHashedMap.HashEntry<MultiKey<? extends Object>, Object> entry = new AbstractHashedMap.HashEntry((AbstractHashedMap.HashEntry<Object, Object>) null, 1, new Object(), (Object) null);
		Object key1 = null;
		Object key2 = null;
		Object key3 = null;
		Object key4 = new Object();
		Object key5 = new Object();

		boolean result = fixture.isEqualKey(entry, key1, key2, key3, key4, key5);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to org.apache.commons.collections4.keyvalue.MultiKey
		//       at org.apache.commons.collections4.map.MultiKeyMap.isEqualKey(MultiKeyMap.java:695)
		assertTrue(result);
	}

	/**
	 * Run the boolean isEqualKey(HashEntry<MultiKey<? extends K>,V>,Object,Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testIsEqualKey_36()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		AbstractHashedMap.HashEntry<MultiKey<? extends Object>, Object> entry = new AbstractHashedMap.HashEntry((AbstractHashedMap.HashEntry<Object, Object>) null, 1, new Object(), (Object) null);
		Object key1 = null;
		Object key2 = null;
		Object key3 = new Object();
		Object key4 = new Object();
		Object key5 = new Object();

		boolean result = fixture.isEqualKey(entry, key1, key2, key3, key4, key5);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to org.apache.commons.collections4.keyvalue.MultiKey
		//       at org.apache.commons.collections4.map.MultiKeyMap.isEqualKey(MultiKeyMap.java:695)
		assertTrue(result);
	}

	/**
	 * Run the boolean isEqualKey(HashEntry<MultiKey<? extends K>,V>,Object,Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testIsEqualKey_37()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		AbstractHashedMap.HashEntry<MultiKey<? extends Object>, Object> entry = new AbstractHashedMap.HashEntry((AbstractHashedMap.HashEntry<Object, Object>) null, 1, new Object(), (Object) null);
		Object key1 = null;
		Object key2 = null;
		Object key3 = null;
		Object key4 = null;
		Object key5 = new Object();

		boolean result = fixture.isEqualKey(entry, key1, key2, key3, key4, key5);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to org.apache.commons.collections4.keyvalue.MultiKey
		//       at org.apache.commons.collections4.map.MultiKeyMap.isEqualKey(MultiKeyMap.java:695)
		assertTrue(result);
	}

	/**
	 * Run the boolean isEqualKey(HashEntry<MultiKey<? extends K>,V>,Object,Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testIsEqualKey_38()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		AbstractHashedMap.HashEntry<MultiKey<? extends Object>, Object> entry = new AbstractHashedMap.HashEntry((AbstractHashedMap.HashEntry<Object, Object>) null, 1, new Object(), (Object) null);
		Object key1 = null;
		Object key2 = null;
		Object key3 = null;
		Object key4 = new Object();
		Object key5 = new Object();

		boolean result = fixture.isEqualKey(entry, key1, key2, key3, key4, key5);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to org.apache.commons.collections4.keyvalue.MultiKey
		//       at org.apache.commons.collections4.map.MultiKeyMap.isEqualKey(MultiKeyMap.java:695)
		assertTrue(result);
	}

	/**
	 * Run the boolean isEqualKey(HashEntry<MultiKey<? extends K>,V>,Object,Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testIsEqualKey_39()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		AbstractHashedMap.HashEntry<MultiKey<? extends Object>, Object> entry = new AbstractHashedMap.HashEntry((AbstractHashedMap.HashEntry<Object, Object>) null, 1, new Object(), (Object) null);
		Object key1 = null;
		Object key2 = null;
		Object key3 = null;
		Object key4 = null;
		Object key5 = null;

		boolean result = fixture.isEqualKey(entry, key1, key2, key3, key4, key5);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to org.apache.commons.collections4.keyvalue.MultiKey
		//       at org.apache.commons.collections4.map.MultiKeyMap.isEqualKey(MultiKeyMap.java:695)
		assertTrue(result);
	}

	/**
	 * Run the boolean isEqualKey(HashEntry<MultiKey<? extends K>,V>,Object,Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testIsEqualKey_40()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		AbstractHashedMap.HashEntry<MultiKey<? extends Object>, Object> entry = new AbstractHashedMap.HashEntry((AbstractHashedMap.HashEntry<Object, Object>) null, 1, new Object(), (Object) null);
		Object key1 = null;
		Object key2 = null;
		Object key3 = null;
		Object key4 = null;
		Object key5 = new Object();

		boolean result = fixture.isEqualKey(entry, key1, key2, key3, key4, key5);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to org.apache.commons.collections4.keyvalue.MultiKey
		//       at org.apache.commons.collections4.map.MultiKeyMap.isEqualKey(MultiKeyMap.java:695)
		assertTrue(result);
	}

	/**
	 * Run the MapIterator<MultiKey<? extends Object>, Object> mapIterator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testMapIterator_1()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());

		MapIterator<MultiKey<? extends Object>, Object> result = fixture.mapIterator();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.hasNext());
	}

	/**
	 * Run the MultiKeyMap<Object, Object> multiKeyMap(AbstractHashedMap<MultiKey<? extends K>,V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testMultiKeyMap_3()
		throws Exception {
		AbstractHashedMap<MultiKey<? extends Object>, Object> map = new AbstractHashedMap();

		MultiKeyMap<Object, Object> result = MultiKeyMap.multiKeyMap(map);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the MultiKeyMap<Object, Object> multiKeyMap(AbstractHashedMap<MultiKey<? extends K>,V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testMultiKeyMap_4()
		throws Exception {
		AbstractHashedMap<MultiKey<? extends Object>, Object> map = new AbstractHashedMap();

		MultiKeyMap<Object, Object> result = MultiKeyMap.multiKeyMap(map);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the MultiKeyMap<Object, Object> multiKeyMap(AbstractHashedMap<MultiKey<? extends K>,V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testMultiKeyMap_5()
		throws Exception {
		AbstractHashedMap<MultiKey<? extends Object>, Object> map = null;

		MultiKeyMap<Object, Object> result = MultiKeyMap.multiKeyMap(map);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object put(MultiKey<? extends K>,V) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testPut_1()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		MultiKey<? extends Object> key = new MultiKey(new Object[] {});

		Object result = fixture.put(key, null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.AbstractHashedMap.put(AbstractHashedMap.java:277)
		//       at org.apache.commons.collections4.map.AbstractMapDecorator.put(AbstractMapDecorator.java:106)
		//       at org.apache.commons.collections4.map.MultiKeyMap.put(MultiKeyMap.java:850)
		assertNotNull(result);
	}

	/**
	 * Run the Object put(K,K,V) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testPut_2()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());

		Object result = fixture.put(null, null, null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.put(MultiKeyMap.java:178)
		assertNotNull(result);
	}

	/**
	 * Run the Object put(K,K,V) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testPut_3()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());

		Object result = fixture.put(null, null, null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.put(MultiKeyMap.java:178)
		assertNotNull(result);
	}

	/**
	 * Run the Object put(K,K,V) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testPut_4()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());

		Object result = fixture.put(null, null, null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.put(MultiKeyMap.java:178)
		assertNotNull(result);
	}

	/**
	 * Run the Object put(K,K,V) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testPut_5()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());

		Object result = fixture.put(null, null, null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.put(MultiKeyMap.java:178)
		assertNotNull(result);
	}

	/**
	 * Run the Object put(K,K,K,V) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testPut_6()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());

		Object result = fixture.put(null, null, null, null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.put(MultiKeyMap.java:310)
		assertNotNull(result);
	}

	/**
	 * Run the Object put(K,K,K,V) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testPut_7()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());

		Object result = fixture.put(null, null, null, null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.put(MultiKeyMap.java:310)
		assertNotNull(result);
	}

	/**
	 * Run the Object put(K,K,K,V) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testPut_8()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());

		Object result = fixture.put(null, null, null, null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.put(MultiKeyMap.java:310)
		assertNotNull(result);
	}

	/**
	 * Run the Object put(K,K,K,V) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testPut_9()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());

		Object result = fixture.put(null, null, null, null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.put(MultiKeyMap.java:310)
		assertNotNull(result);
	}

	/**
	 * Run the Object put(K,K,K,K,V) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testPut_10()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());

		Object result = fixture.put(null, null, null, null, null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.put(MultiKeyMap.java:452)
		assertNotNull(result);
	}

	/**
	 * Run the Object put(K,K,K,K,V) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testPut_11()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());

		Object result = fixture.put(null, null, null, null, null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.put(MultiKeyMap.java:452)
		assertNotNull(result);
	}

	/**
	 * Run the Object put(K,K,K,K,V) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testPut_12()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());

		Object result = fixture.put(null, null, null, null, null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.put(MultiKeyMap.java:452)
		assertNotNull(result);
	}

	/**
	 * Run the Object put(K,K,K,K,V) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testPut_13()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());

		Object result = fixture.put(null, null, null, null, null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.put(MultiKeyMap.java:452)
		assertNotNull(result);
	}

	/**
	 * Run the Object put(K,K,K,K,K,V) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testPut_14()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());

		Object result = fixture.put(null, null, null, null, null, null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.put(MultiKeyMap.java:605)
		assertNotNull(result);
	}

	/**
	 * Run the Object put(K,K,K,K,K,V) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testPut_15()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());

		Object result = fixture.put(null, null, null, null, null, null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.put(MultiKeyMap.java:605)
		assertNotNull(result);
	}

	/**
	 * Run the Object put(K,K,K,K,K,V) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testPut_16()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());

		Object result = fixture.put(null, null, null, null, null, null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.put(MultiKeyMap.java:605)
		assertNotNull(result);
	}

	/**
	 * Run the Object put(K,K,K,K,K,V) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testPut_17()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());

		Object result = fixture.put(null, null, null, null, null, null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.put(MultiKeyMap.java:605)
		assertNotNull(result);
	}

	/**
	 * Run the void putAll(Map<? extends MultiKey<? extends K>,? extends V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testPutAll_1()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Map<? extends MultiKey<? extends Object>, ? extends Object> mapToCopy = new LRUMap();

		fixture.putAll(mapToCopy);

		// add additional test code here
	}

	/**
	 * Run the void putAll(Map<? extends MultiKey<? extends K>,? extends V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testPutAll_2()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Map<? extends MultiKey<? extends Object>, ? extends Object> mapToCopy = new LRUMap();

		fixture.putAll(mapToCopy);

		// add additional test code here
	}

	/**
	 * Run the boolean removeAll(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testRemoveAll_1()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = null;

		boolean result = fixture.removeAll(key1);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean removeAll(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testRemoveAll_2()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();

		boolean result = fixture.removeAll(key1);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean removeAll(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testRemoveAll_3()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = null;

		boolean result = fixture.removeAll(key1);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean removeAll(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testRemoveAll_4()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();

		boolean result = fixture.removeAll(key1);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean removeAll(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testRemoveAll_5()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = null;

		boolean result = fixture.removeAll(key1);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean removeAll(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testRemoveAll_6()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();

		boolean result = fixture.removeAll(key1);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean removeAll(Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testRemoveAll_7()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = null;
		Object key2 = null;

		boolean result = fixture.removeAll(key1, key2);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean removeAll(Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testRemoveAll_8()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = null;
		Object key2 = new Object();

		boolean result = fixture.removeAll(key1, key2);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean removeAll(Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testRemoveAll_9()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = null;
		Object key2 = null;

		boolean result = fixture.removeAll(key1, key2);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean removeAll(Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testRemoveAll_10()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();
		Object key2 = new Object();

		boolean result = fixture.removeAll(key1, key2);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean removeAll(Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testRemoveAll_11()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = null;
		Object key2 = new Object();

		boolean result = fixture.removeAll(key1, key2);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean removeAll(Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testRemoveAll_12()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();
		Object key2 = new Object();

		boolean result = fixture.removeAll(key1, key2);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean removeAll(Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testRemoveAll_13()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = null;
		Object key2 = null;

		boolean result = fixture.removeAll(key1, key2);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean removeAll(Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testRemoveAll_14()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();
		Object key2 = new Object();

		boolean result = fixture.removeAll(key1, key2);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean removeAll(Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testRemoveAll_15()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = null;
		Object key2 = null;
		Object key3 = null;

		boolean result = fixture.removeAll(key1, key2, key3);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean removeAll(Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testRemoveAll_16()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = null;
		Object key2 = null;
		Object key3 = new Object();

		boolean result = fixture.removeAll(key1, key2, key3);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean removeAll(Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testRemoveAll_17()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = null;
		Object key2 = null;
		Object key3 = null;

		boolean result = fixture.removeAll(key1, key2, key3);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean removeAll(Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testRemoveAll_18()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();
		Object key2 = new Object();
		Object key3 = new Object();

		boolean result = fixture.removeAll(key1, key2, key3);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean removeAll(Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testRemoveAll_19()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = null;
		Object key2 = new Object();
		Object key3 = new Object();

		boolean result = fixture.removeAll(key1, key2, key3);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean removeAll(Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testRemoveAll_20()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();
		Object key2 = new Object();
		Object key3 = new Object();

		boolean result = fixture.removeAll(key1, key2, key3);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean removeAll(Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testRemoveAll_21()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = null;
		Object key2 = null;
		Object key3 = new Object();

		boolean result = fixture.removeAll(key1, key2, key3);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean removeAll(Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testRemoveAll_22()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = null;
		Object key2 = new Object();
		Object key3 = new Object();

		boolean result = fixture.removeAll(key1, key2, key3);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean removeAll(Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testRemoveAll_23()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = null;
		Object key2 = null;
		Object key3 = null;

		boolean result = fixture.removeAll(key1, key2, key3);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean removeAll(Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testRemoveAll_24()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();
		Object key2 = new Object();
		Object key3 = new Object();

		boolean result = fixture.removeAll(key1, key2, key3);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean removeAll(Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testRemoveAll_25()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = null;
		Object key2 = null;
		Object key3 = null;
		Object key4 = null;

		boolean result = fixture.removeAll(key1, key2, key3, key4);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean removeAll(Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testRemoveAll_26()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = null;
		Object key2 = null;
		Object key3 = null;
		Object key4 = new Object();

		boolean result = fixture.removeAll(key1, key2, key3, key4);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean removeAll(Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testRemoveAll_27()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = null;
		Object key2 = null;
		Object key3 = null;
		Object key4 = null;

		boolean result = fixture.removeAll(key1, key2, key3, key4);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean removeAll(Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testRemoveAll_28()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();
		Object key2 = new Object();
		Object key3 = new Object();
		Object key4 = new Object();

		boolean result = fixture.removeAll(key1, key2, key3, key4);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean removeAll(Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testRemoveAll_29()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = null;
		Object key2 = new Object();
		Object key3 = new Object();
		Object key4 = new Object();

		boolean result = fixture.removeAll(key1, key2, key3, key4);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean removeAll(Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testRemoveAll_30()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();
		Object key2 = new Object();
		Object key3 = new Object();
		Object key4 = new Object();

		boolean result = fixture.removeAll(key1, key2, key3, key4);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean removeAll(Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testRemoveAll_31()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = null;
		Object key2 = null;
		Object key3 = new Object();
		Object key4 = new Object();

		boolean result = fixture.removeAll(key1, key2, key3, key4);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean removeAll(Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testRemoveAll_32()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = null;
		Object key2 = new Object();
		Object key3 = new Object();
		Object key4 = new Object();

		boolean result = fixture.removeAll(key1, key2, key3, key4);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean removeAll(Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testRemoveAll_33()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = null;
		Object key2 = null;
		Object key3 = null;
		Object key4 = new Object();

		boolean result = fixture.removeAll(key1, key2, key3, key4);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean removeAll(Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testRemoveAll_34()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = null;
		Object key2 = null;
		Object key3 = new Object();
		Object key4 = new Object();

		boolean result = fixture.removeAll(key1, key2, key3, key4);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean removeAll(Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testRemoveAll_35()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = null;
		Object key2 = null;
		Object key3 = null;
		Object key4 = null;

		boolean result = fixture.removeAll(key1, key2, key3, key4);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean removeAll(Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testRemoveAll_36()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();
		Object key2 = new Object();
		Object key3 = new Object();
		Object key4 = new Object();

		boolean result = fixture.removeAll(key1, key2, key3, key4);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the Object removeMultiKey(Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testRemoveMultiKey_1()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();
		Object key2 = new Object();

		Object result = fixture.removeMultiKey(key1, key2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.removeMultiKey(MultiKeyMap.java:202)
		assertNotNull(result);
	}

	/**
	 * Run the Object removeMultiKey(Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testRemoveMultiKey_2()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();
		Object key2 = new Object();

		Object result = fixture.removeMultiKey(key1, key2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.removeMultiKey(MultiKeyMap.java:202)
		assertNotNull(result);
	}

	/**
	 * Run the Object removeMultiKey(Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testRemoveMultiKey_3()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();
		Object key2 = new Object();

		Object result = fixture.removeMultiKey(key1, key2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.removeMultiKey(MultiKeyMap.java:202)
		assertNotNull(result);
	}

	/**
	 * Run the Object removeMultiKey(Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testRemoveMultiKey_4()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();
		Object key2 = new Object();

		Object result = fixture.removeMultiKey(key1, key2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.removeMultiKey(MultiKeyMap.java:202)
		assertNotNull(result);
	}

	/**
	 * Run the Object removeMultiKey(Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testRemoveMultiKey_5()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();
		Object key2 = new Object();
		Object key3 = new Object();

		Object result = fixture.removeMultiKey(key1, key2, key3);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.removeMultiKey(MultiKeyMap.java:335)
		assertNotNull(result);
	}

	/**
	 * Run the Object removeMultiKey(Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testRemoveMultiKey_6()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();
		Object key2 = new Object();
		Object key3 = new Object();

		Object result = fixture.removeMultiKey(key1, key2, key3);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.removeMultiKey(MultiKeyMap.java:335)
		assertNotNull(result);
	}

	/**
	 * Run the Object removeMultiKey(Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testRemoveMultiKey_7()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();
		Object key2 = new Object();
		Object key3 = new Object();

		Object result = fixture.removeMultiKey(key1, key2, key3);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.removeMultiKey(MultiKeyMap.java:335)
		assertNotNull(result);
	}

	/**
	 * Run the Object removeMultiKey(Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testRemoveMultiKey_8()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();
		Object key2 = new Object();
		Object key3 = new Object();

		Object result = fixture.removeMultiKey(key1, key2, key3);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.removeMultiKey(MultiKeyMap.java:335)
		assertNotNull(result);
	}

	/**
	 * Run the Object removeMultiKey(Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testRemoveMultiKey_9()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();
		Object key2 = new Object();
		Object key3 = new Object();
		Object key4 = new Object();

		Object result = fixture.removeMultiKey(key1, key2, key3, key4);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.removeMultiKey(MultiKeyMap.java:478)
		assertNotNull(result);
	}

	/**
	 * Run the Object removeMultiKey(Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testRemoveMultiKey_10()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();
		Object key2 = new Object();
		Object key3 = new Object();
		Object key4 = new Object();

		Object result = fixture.removeMultiKey(key1, key2, key3, key4);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.removeMultiKey(MultiKeyMap.java:478)
		assertNotNull(result);
	}

	/**
	 * Run the Object removeMultiKey(Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testRemoveMultiKey_11()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();
		Object key2 = new Object();
		Object key3 = new Object();
		Object key4 = new Object();

		Object result = fixture.removeMultiKey(key1, key2, key3, key4);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.removeMultiKey(MultiKeyMap.java:478)
		assertNotNull(result);
	}

	/**
	 * Run the Object removeMultiKey(Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testRemoveMultiKey_12()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();
		Object key2 = new Object();
		Object key3 = new Object();
		Object key4 = new Object();

		Object result = fixture.removeMultiKey(key1, key2, key3, key4);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.removeMultiKey(MultiKeyMap.java:478)
		assertNotNull(result);
	}

	/**
	 * Run the Object removeMultiKey(Object,Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testRemoveMultiKey_13()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();
		Object key2 = new Object();
		Object key3 = new Object();
		Object key4 = new Object();
		Object key5 = new Object();

		Object result = fixture.removeMultiKey(key1, key2, key3, key4, key5);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.removeMultiKey(MultiKeyMap.java:633)
		assertNotNull(result);
	}

	/**
	 * Run the Object removeMultiKey(Object,Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testRemoveMultiKey_14()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();
		Object key2 = new Object();
		Object key3 = new Object();
		Object key4 = new Object();
		Object key5 = new Object();

		Object result = fixture.removeMultiKey(key1, key2, key3, key4, key5);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.removeMultiKey(MultiKeyMap.java:633)
		assertNotNull(result);
	}

	/**
	 * Run the Object removeMultiKey(Object,Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testRemoveMultiKey_15()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();
		Object key2 = new Object();
		Object key3 = new Object();
		Object key4 = new Object();
		Object key5 = new Object();

		Object result = fixture.removeMultiKey(key1, key2, key3, key4, key5);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.removeMultiKey(MultiKeyMap.java:633)
		assertNotNull(result);
	}

	/**
	 * Run the Object removeMultiKey(Object,Object,Object,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testRemoveMultiKey_16()
		throws Exception {
		MultiKeyMap fixture = new MultiKeyMap(new AbstractHashedMap());
		Object key1 = new Object();
		Object key2 = new Object();
		Object key3 = new Object();
		Object key4 = new Object();
		Object key5 = new Object();

		Object result = fixture.removeMultiKey(key1, key2, key3, key4, key5);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.map.MultiKeyMap.removeMultiKey(MultiKeyMap.java:633)
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
		new org.junit.runner.JUnitCore().run(MultiKeyMapTest.class);
	}
}
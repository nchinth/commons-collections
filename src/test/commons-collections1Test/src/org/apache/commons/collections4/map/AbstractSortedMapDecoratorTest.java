package org.apache.commons.collections4.map;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import org.apache.commons.collections4.OrderedMapIterator;
import org.apache.commons.collections4.trie.PatriciaTrie;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AbstractSortedMapDecoratorTest</code> contains tests for the class <code>{@link AbstractSortedMapDecorator}</code>.
 *
 * @generatedBy CodePro at 10/23/15 2:02 PM
 * @author Nikhil
 * @version $Revision: 1.0 $
 */
public class AbstractSortedMapDecoratorTest {
	/**
	 * Run the Comparator<? extends Object> comparator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testComparator_1()
		throws Exception {
		FixedSizeSortedMap fixture = new FixedSizeSortedMap(new PatriciaTrie());
		fixture.map = new LRUMap();

		Comparator<? extends Object> result = fixture.comparator();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.apache.commons.collections4.map.LRUMap cannot be cast to java.util.SortedMap
		//       at org.apache.commons.collections4.map.AbstractSortedMapDecorator.decorated(AbstractSortedMapDecorator.java:75)
		//       at org.apache.commons.collections4.map.AbstractSortedMapDecorator.comparator(AbstractSortedMapDecorator.java:80)
		assertNotNull(result);
	}

	/**
	 * Run the SortedMap<Object, Object> decorated() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testDecorated_1()
		throws Exception {
		FixedSizeSortedMap fixture = new FixedSizeSortedMap(new PatriciaTrie());
		fixture.map = new LRUMap();

		SortedMap<Object, Object> result = fixture.decorated();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.apache.commons.collections4.map.LRUMap cannot be cast to java.util.SortedMap
		//       at org.apache.commons.collections4.map.AbstractSortedMapDecorator.decorated(AbstractSortedMapDecorator.java:75)
		assertNotNull(result);
	}

	/**
	 * Run the Object firstKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testFirstKey_1()
		throws Exception {
		FixedSizeSortedMap fixture = new FixedSizeSortedMap(new PatriciaTrie());
		fixture.map = new LRUMap();

		Object result = fixture.firstKey();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.apache.commons.collections4.map.LRUMap cannot be cast to java.util.SortedMap
		//       at org.apache.commons.collections4.map.AbstractSortedMapDecorator.decorated(AbstractSortedMapDecorator.java:75)
		//       at org.apache.commons.collections4.map.AbstractSortedMapDecorator.firstKey(AbstractSortedMapDecorator.java:84)
		assertNotNull(result);
	}

	/**
	 * Run the SortedMap<Object, Object> headMap(K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testHeadMap_1()
		throws Exception {
		FixedSizeSortedMap fixture = new FixedSizeSortedMap(new PatriciaTrie());
		fixture.map = new LRUMap();

		SortedMap<Object, Object> result = fixture.headMap(null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.apache.commons.collections4.map.LRUMap cannot be cast to java.util.SortedMap
		//       at org.apache.commons.collections4.map.FixedSizeSortedMap.getSortedMap(FixedSizeSortedMap.java:95)
		//       at org.apache.commons.collections4.map.FixedSizeSortedMap.headMap(FixedSizeSortedMap.java:166)
		assertNotNull(result);
	}

	/**
	 * Run the Object lastKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testLastKey_1()
		throws Exception {
		FixedSizeSortedMap fixture = new FixedSizeSortedMap(new PatriciaTrie());
		fixture.map = new LRUMap();

		Object result = fixture.lastKey();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.apache.commons.collections4.map.LRUMap cannot be cast to java.util.SortedMap
		//       at org.apache.commons.collections4.map.AbstractSortedMapDecorator.decorated(AbstractSortedMapDecorator.java:75)
		//       at org.apache.commons.collections4.map.AbstractSortedMapDecorator.lastKey(AbstractSortedMapDecorator.java:88)
		assertNotNull(result);
	}

	/**
	 * Run the OrderedMapIterator<Object, Object> mapIterator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testMapIterator_1()
		throws Exception {
		FixedSizeSortedMap fixture = new FixedSizeSortedMap(new PatriciaTrie());
		fixture.map = new LRUMap();

		OrderedMapIterator<Object, Object> result = fixture.mapIterator();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.hasPrevious());
		assertEquals(false, result.hasNext());
	}

	/**
	 * Run the Object nextKey(K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testNextKey_1()
		throws Exception {
		FixedSizeSortedMap fixture = new FixedSizeSortedMap(new PatriciaTrie());
		fixture.map = new LRUMap();

		Object result = fixture.nextKey(null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.apache.commons.collections4.map.LRUMap cannot be cast to java.util.SortedMap
		//       at org.apache.commons.collections4.map.FixedSizeSortedMap.getSortedMap(FixedSizeSortedMap.java:95)
		//       at org.apache.commons.collections4.map.FixedSizeSortedMap.tailMap(FixedSizeSortedMap.java:171)
		//       at org.apache.commons.collections4.map.AbstractSortedMapDecorator.nextKey(AbstractSortedMapDecorator.java:109)
		assertNotNull(result);
	}

	/**
	 * Run the Object nextKey(K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testNextKey_2()
		throws Exception {
		FixedSizeSortedMap fixture = new FixedSizeSortedMap(new PatriciaTrie());
		fixture.map = new LRUMap();

		Object result = fixture.nextKey(null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.apache.commons.collections4.map.LRUMap cannot be cast to java.util.SortedMap
		//       at org.apache.commons.collections4.map.FixedSizeSortedMap.getSortedMap(FixedSizeSortedMap.java:95)
		//       at org.apache.commons.collections4.map.FixedSizeSortedMap.tailMap(FixedSizeSortedMap.java:171)
		//       at org.apache.commons.collections4.map.AbstractSortedMapDecorator.nextKey(AbstractSortedMapDecorator.java:109)
		assertNotNull(result);
	}

	/**
	 * Run the Object previousKey(K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testPreviousKey_1()
		throws Exception {
		FixedSizeSortedMap fixture = new FixedSizeSortedMap(new PatriciaTrie());
		fixture.map = new LRUMap();

		Object result = fixture.previousKey(null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.apache.commons.collections4.map.LRUMap cannot be cast to java.util.SortedMap
		//       at org.apache.commons.collections4.map.FixedSizeSortedMap.getSortedMap(FixedSizeSortedMap.java:95)
		//       at org.apache.commons.collections4.map.FixedSizeSortedMap.headMap(FixedSizeSortedMap.java:166)
		//       at org.apache.commons.collections4.map.AbstractSortedMapDecorator.previousKey(AbstractSortedMapDecorator.java:104)
		assertNotNull(result);
	}

	/**
	 * Run the Object previousKey(K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testPreviousKey_2()
		throws Exception {
		FixedSizeSortedMap fixture = new FixedSizeSortedMap(new PatriciaTrie());
		fixture.map = new LRUMap();

		Object result = fixture.previousKey(null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.apache.commons.collections4.map.LRUMap cannot be cast to java.util.SortedMap
		//       at org.apache.commons.collections4.map.FixedSizeSortedMap.getSortedMap(FixedSizeSortedMap.java:95)
		//       at org.apache.commons.collections4.map.FixedSizeSortedMap.headMap(FixedSizeSortedMap.java:166)
		//       at org.apache.commons.collections4.map.AbstractSortedMapDecorator.previousKey(AbstractSortedMapDecorator.java:104)
		assertNotNull(result);
	}

	/**
	 * Run the SortedMap<Object, Object> subMap(K,K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testSubMap_1()
		throws Exception {
		FixedSizeSortedMap fixture = new FixedSizeSortedMap(new PatriciaTrie());
		fixture.map = new LRUMap();

		SortedMap<Object, Object> result = fixture.subMap(null, null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.apache.commons.collections4.map.LRUMap cannot be cast to java.util.SortedMap
		//       at org.apache.commons.collections4.map.FixedSizeSortedMap.getSortedMap(FixedSizeSortedMap.java:95)
		//       at org.apache.commons.collections4.map.FixedSizeSortedMap.subMap(FixedSizeSortedMap.java:161)
		assertNotNull(result);
	}

	/**
	 * Run the SortedMap<Object, Object> tailMap(K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testTailMap_1()
		throws Exception {
		FixedSizeSortedMap fixture = new FixedSizeSortedMap(new PatriciaTrie());
		fixture.map = new LRUMap();

		SortedMap<Object, Object> result = fixture.tailMap(null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.apache.commons.collections4.map.LRUMap cannot be cast to java.util.SortedMap
		//       at org.apache.commons.collections4.map.FixedSizeSortedMap.getSortedMap(FixedSizeSortedMap.java:95)
		//       at org.apache.commons.collections4.map.FixedSizeSortedMap.tailMap(FixedSizeSortedMap.java:171)
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
		new org.junit.runner.JUnitCore().run(AbstractSortedMapDecoratorTest.class);
	}
}
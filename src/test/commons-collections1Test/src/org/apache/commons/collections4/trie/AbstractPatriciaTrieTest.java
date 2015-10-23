package org.apache.commons.collections4.trie;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import org.apache.commons.collections4.OrderedMapIterator;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AbstractPatriciaTrieTest</code> contains tests for the class <code>{@link AbstractPatriciaTrie}</code>.
 *
 * @generatedBy CodePro at 10/23/15 2:01 PM
 * @author Nikhil
 * @version $Revision: 1.0 $
 */
public class AbstractPatriciaTrieTest {
	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> addEntry(TrieEntry<K,V>,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testAddEntry_1()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;
		AbstractPatriciaTrie.TrieEntry<Object, Object> entry = new AbstractPatriciaTrie.TrieEntry((Object) null, (Object) null, 1);
		int lengthInBits = 1;

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.addEntry(entry, lengthInBits);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Entry(key=null [1], value=null, parent=ROOT, left=null [1], right=ROOT, predecessor=null [1])", result.toString());
		assertEquals(true, result.isEmpty());
		assertEquals(true, result.isExternalNode());
		assertEquals(false, result.isInternalNode());
		assertEquals(null, result.getValue());
		assertEquals(null, result.getKey());
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> addEntry(TrieEntry<K,V>,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testAddEntry_2()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;
		AbstractPatriciaTrie.TrieEntry<Object, Object> entry = new AbstractPatriciaTrie.TrieEntry((Object) null, (Object) null, 1);
		int lengthInBits = 1;

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.addEntry(entry, lengthInBits);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Entry(key=null [1], value=null, parent=ROOT, left=null [1], right=ROOT, predecessor=null [1])", result.toString());
		assertEquals(true, result.isEmpty());
		assertEquals(true, result.isExternalNode());
		assertEquals(false, result.isInternalNode());
		assertEquals(null, result.getValue());
		assertEquals(null, result.getKey());
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> addEntry(TrieEntry<K,V>,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testAddEntry_3()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;
		AbstractPatriciaTrie.TrieEntry<Object, Object> entry = new AbstractPatriciaTrie.TrieEntry((Object) null, (Object) null, 1);
		int lengthInBits = 1;

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.addEntry(entry, lengthInBits);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Entry(key=null [1], value=null, parent=ROOT, left=null [1], right=ROOT, predecessor=null [1])", result.toString());
		assertEquals(true, result.isEmpty());
		assertEquals(true, result.isExternalNode());
		assertEquals(false, result.isInternalNode());
		assertEquals(null, result.getValue());
		assertEquals(null, result.getKey());
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> addEntry(TrieEntry<K,V>,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testAddEntry_4()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;
		AbstractPatriciaTrie.TrieEntry<Object, Object> entry = new AbstractPatriciaTrie.TrieEntry((Object) null, (Object) null, 1);
		int lengthInBits = 1;

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.addEntry(entry, lengthInBits);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Entry(key=null [1], value=null, parent=ROOT, left=null [1], right=ROOT, predecessor=null [1])", result.toString());
		assertEquals(true, result.isEmpty());
		assertEquals(true, result.isExternalNode());
		assertEquals(false, result.isInternalNode());
		assertEquals(null, result.getValue());
		assertEquals(null, result.getKey());
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> addEntry(TrieEntry<K,V>,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testAddEntry_5()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;
		AbstractPatriciaTrie.TrieEntry<Object, Object> entry = new AbstractPatriciaTrie.TrieEntry((Object) null, (Object) null, 1);
		int lengthInBits = 1;

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.addEntry(entry, lengthInBits);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Entry(key=null [1], value=null, parent=ROOT, left=null [1], right=ROOT, predecessor=null [1])", result.toString());
		assertEquals(true, result.isEmpty());
		assertEquals(true, result.isExternalNode());
		assertEquals(false, result.isInternalNode());
		assertEquals(null, result.getValue());
		assertEquals(null, result.getKey());
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> addEntry(TrieEntry<K,V>,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testAddEntry_6()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;
		AbstractPatriciaTrie.TrieEntry<Object, Object> entry = new AbstractPatriciaTrie.TrieEntry((Object) null, (Object) null, 1);
		int lengthInBits = 1;

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.addEntry(entry, lengthInBits);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Entry(key=null [1], value=null, parent=ROOT, left=null [1], right=ROOT, predecessor=null [1])", result.toString());
		assertEquals(true, result.isEmpty());
		assertEquals(true, result.isExternalNode());
		assertEquals(false, result.isInternalNode());
		assertEquals(null, result.getValue());
		assertEquals(null, result.getKey());
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> ceilingEntry(K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testCeilingEntry_1()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.ceilingEntry(null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.followLeft(AbstractPatriciaTrie.java:764)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.firstEntry(AbstractPatriciaTrie.java:750)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.ceilingEntry(AbstractPatriciaTrie.java:955)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> ceilingEntry(K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testCeilingEntry_2()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.ceilingEntry(null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.followLeft(AbstractPatriciaTrie.java:764)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.firstEntry(AbstractPatriciaTrie.java:750)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.ceilingEntry(AbstractPatriciaTrie.java:955)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> ceilingEntry(K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testCeilingEntry_3()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.ceilingEntry(null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.followLeft(AbstractPatriciaTrie.java:764)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.firstEntry(AbstractPatriciaTrie.java:750)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.ceilingEntry(AbstractPatriciaTrie.java:955)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> ceilingEntry(K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testCeilingEntry_4()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.ceilingEntry(null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.followLeft(AbstractPatriciaTrie.java:764)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.firstEntry(AbstractPatriciaTrie.java:750)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.ceilingEntry(AbstractPatriciaTrie.java:955)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> ceilingEntry(K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testCeilingEntry_5()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.ceilingEntry(null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.followLeft(AbstractPatriciaTrie.java:764)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.firstEntry(AbstractPatriciaTrie.java:750)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.ceilingEntry(AbstractPatriciaTrie.java:955)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> ceilingEntry(K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testCeilingEntry_6()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.ceilingEntry(null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.followLeft(AbstractPatriciaTrie.java:764)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.firstEntry(AbstractPatriciaTrie.java:750)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.ceilingEntry(AbstractPatriciaTrie.java:955)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> ceilingEntry(K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testCeilingEntry_7()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.ceilingEntry(null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.followLeft(AbstractPatriciaTrie.java:764)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.firstEntry(AbstractPatriciaTrie.java:750)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.ceilingEntry(AbstractPatriciaTrie.java:955)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> ceilingEntry(K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testCeilingEntry_8()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.ceilingEntry(null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.followLeft(AbstractPatriciaTrie.java:764)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.firstEntry(AbstractPatriciaTrie.java:750)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.ceilingEntry(AbstractPatriciaTrie.java:955)
		assertNotNull(result);
	}

	/**
	 * Run the void clear() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testClear_1()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		fixture.clear();

		// add additional test code here
	}

	/**
	 * Run the Comparator<? extends Object> comparator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testComparator_1()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		Comparator<? extends Object> result = fixture.comparator();

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
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;
		Object k = null;

		boolean result = fixture.containsKey(k);

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
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;
		Object k = new Object();

		boolean result = fixture.containsKey(k);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to java.lang.String
		//       at org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer.lengthInBits(StringKeyAnalyzer.java:1)
		//       at org.apache.commons.collections4.trie.AbstractBitwiseTrie.lengthInBits(AbstractBitwiseTrie.java:93)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.containsKey(AbstractPatriciaTrie.java:384)
		//       at org.apache.commons.collections4.trie.PatriciaTrie.containsKey(PatriciaTrie.java:1)
		assertTrue(result);
	}

	/**
	 * Run the boolean containsKey(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testContainsKey_3()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;
		Object k = new Object();

		boolean result = fixture.containsKey(k);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to java.lang.String
		//       at org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer.lengthInBits(StringKeyAnalyzer.java:1)
		//       at org.apache.commons.collections4.trie.AbstractBitwiseTrie.lengthInBits(AbstractBitwiseTrie.java:93)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.containsKey(AbstractPatriciaTrie.java:384)
		//       at org.apache.commons.collections4.trie.PatriciaTrie.containsKey(PatriciaTrie.java:1)
		assertTrue(result);
	}

	/**
	 * Run the boolean containsKey(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testContainsKey_4()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;
		Object k = new Object();

		boolean result = fixture.containsKey(k);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to java.lang.String
		//       at org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer.lengthInBits(StringKeyAnalyzer.java:1)
		//       at org.apache.commons.collections4.trie.AbstractBitwiseTrie.lengthInBits(AbstractBitwiseTrie.java:93)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.containsKey(AbstractPatriciaTrie.java:384)
		//       at org.apache.commons.collections4.trie.PatriciaTrie.containsKey(PatriciaTrie.java:1)
		assertTrue(result);
	}

	/**
	 * Run the void decrementSize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testDecrementSize_1()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		fixture.decrementSize();

		// add additional test code here
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
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		Set<java.util.Map.Entry<Object, Object>> result = fixture.entrySet();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the Set<java.util.Map.Entry<Object, Object>> entrySet() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testEntrySet_2()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		Set<java.util.Map.Entry<Object, Object>> result = fixture.entrySet();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> firstEntry() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testFirstEntry_1()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.firstEntry();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.followLeft(AbstractPatriciaTrie.java:764)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.firstEntry(AbstractPatriciaTrie.java:750)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> firstEntry() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testFirstEntry_2()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.firstEntry();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.followLeft(AbstractPatriciaTrie.java:764)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.firstEntry(AbstractPatriciaTrie.java:750)
		assertNotNull(result);
	}

	/**
	 * Run the Object firstKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testFirstKey_1()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		Object result = fixture.firstKey();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.followLeft(AbstractPatriciaTrie.java:764)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.firstEntry(AbstractPatriciaTrie.java:750)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.firstKey(AbstractPatriciaTrie.java:782)
		//       at org.apache.commons.collections4.trie.PatriciaTrie.firstKey(PatriciaTrie.java:1)
		assertNotNull(result);
	}

	/**
	 * Run the Object firstKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testFirstKey_2()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		Object result = fixture.firstKey();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.followLeft(AbstractPatriciaTrie.java:764)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.firstEntry(AbstractPatriciaTrie.java:750)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.firstKey(AbstractPatriciaTrie.java:782)
		//       at org.apache.commons.collections4.trie.PatriciaTrie.firstKey(PatriciaTrie.java:1)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> floorEntry(K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testFloorEntry_1()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.floorEntry(null);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> floorEntry(K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testFloorEntry_2()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.floorEntry(null);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> floorEntry(K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testFloorEntry_3()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.floorEntry(null);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> floorEntry(K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testFloorEntry_4()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.floorEntry(null);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> floorEntry(K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testFloorEntry_5()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.floorEntry(null);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> floorEntry(K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testFloorEntry_6()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.floorEntry(null);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> floorEntry(K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testFloorEntry_7()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.floorEntry(null);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> floorEntry(K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testFloorEntry_8()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.floorEntry(null);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> followLeft(TrieEntry<K,V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testFollowLeft_1()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;
		AbstractPatriciaTrie.TrieEntry<Object, Object> node = new AbstractPatriciaTrie.TrieEntry((Object) null, (Object) null, 1);

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.followLeft(node);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.followLeft(AbstractPatriciaTrie.java:764)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> followLeft(TrieEntry<K,V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testFollowLeft_2()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;
		AbstractPatriciaTrie.TrieEntry<Object, Object> node = new AbstractPatriciaTrie.TrieEntry((Object) null, (Object) null, 1);

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.followLeft(node);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.followLeft(AbstractPatriciaTrie.java:764)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> followLeft(TrieEntry<K,V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testFollowLeft_3()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;
		AbstractPatriciaTrie.TrieEntry<Object, Object> node = new AbstractPatriciaTrie.TrieEntry((Object) null, (Object) null, 1);

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.followLeft(node);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.followLeft(AbstractPatriciaTrie.java:764)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> followLeft(TrieEntry<K,V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testFollowLeft_4()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;
		AbstractPatriciaTrie.TrieEntry<Object, Object> node = new AbstractPatriciaTrie.TrieEntry((Object) null, (Object) null, 1);

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.followLeft(node);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.followLeft(AbstractPatriciaTrie.java:764)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> followRight(TrieEntry<K,V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testFollowRight_1()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;
		AbstractPatriciaTrie.TrieEntry<Object, Object> node = new AbstractPatriciaTrie.TrieEntry((Object) null, (Object) null, 1);

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.followRight(node);

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
	public void testGet_1()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;
		Object k = new Object();

		Object result = fixture.get(k);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to java.lang.String
		//       at org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer.lengthInBits(StringKeyAnalyzer.java:1)
		//       at org.apache.commons.collections4.trie.AbstractBitwiseTrie.lengthInBits(AbstractBitwiseTrie.java:93)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.getEntry(AbstractPatriciaTrie.java:258)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.get(AbstractPatriciaTrie.java:241)
		//       at org.apache.commons.collections4.trie.PatriciaTrie.get(PatriciaTrie.java:1)
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
	public void testGet_2()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;
		Object k = new Object();

		Object result = fixture.get(k);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to java.lang.String
		//       at org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer.lengthInBits(StringKeyAnalyzer.java:1)
		//       at org.apache.commons.collections4.trie.AbstractBitwiseTrie.lengthInBits(AbstractBitwiseTrie.java:93)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.getEntry(AbstractPatriciaTrie.java:258)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.get(AbstractPatriciaTrie.java:241)
		//       at org.apache.commons.collections4.trie.PatriciaTrie.get(PatriciaTrie.java:1)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> getEntry(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testGetEntry_1()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;
		Object k = new Object();

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.getEntry(k);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to java.lang.String
		//       at org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer.lengthInBits(StringKeyAnalyzer.java:1)
		//       at org.apache.commons.collections4.trie.AbstractBitwiseTrie.lengthInBits(AbstractBitwiseTrie.java:93)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.getEntry(AbstractPatriciaTrie.java:258)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> getEntry(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testGetEntry_2()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;
		Object k = new Object();

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.getEntry(k);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to java.lang.String
		//       at org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer.lengthInBits(StringKeyAnalyzer.java:1)
		//       at org.apache.commons.collections4.trie.AbstractBitwiseTrie.lengthInBits(AbstractBitwiseTrie.java:93)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.getEntry(AbstractPatriciaTrie.java:258)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> getEntry(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testGetEntry_3()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;
		Object k = new Object();

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.getEntry(k);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to java.lang.String
		//       at org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer.lengthInBits(StringKeyAnalyzer.java:1)
		//       at org.apache.commons.collections4.trie.AbstractBitwiseTrie.lengthInBits(AbstractBitwiseTrie.java:93)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.getEntry(AbstractPatriciaTrie.java:258)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> getEntry(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testGetEntry_4()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;
		Object k = new Object();

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.getEntry(k);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to java.lang.String
		//       at org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer.lengthInBits(StringKeyAnalyzer.java:1)
		//       at org.apache.commons.collections4.trie.AbstractBitwiseTrie.lengthInBits(AbstractBitwiseTrie.java:93)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.getEntry(AbstractPatriciaTrie.java:258)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> getNearestEntryForKey(K,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testGetNearestEntryForKey_1()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;
		int lengthInBits = 1;

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.getNearestEntryForKey(null, lengthInBits);

		// add additional test code here
		assertNotNull(result);
		assertEquals("RootEntry(key=null [-1], value=null, parent=null, left=ROOT, right=null, predecessor=ROOT)", result.toString());
		assertEquals(true, result.isEmpty());
		assertEquals(true, result.isExternalNode());
		assertEquals(false, result.isInternalNode());
		assertEquals(null, result.getValue());
		assertEquals(null, result.getKey());
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> getNearestEntryForKey(K,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testGetNearestEntryForKey_2()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;
		int lengthInBits = 1;

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.getNearestEntryForKey(null, lengthInBits);

		// add additional test code here
		assertNotNull(result);
		assertEquals("RootEntry(key=null [-1], value=null, parent=null, left=ROOT, right=null, predecessor=ROOT)", result.toString());
		assertEquals(true, result.isEmpty());
		assertEquals(true, result.isExternalNode());
		assertEquals(false, result.isInternalNode());
		assertEquals(null, result.getValue());
		assertEquals(null, result.getKey());
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> getNearestEntryForKey(K,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testGetNearestEntryForKey_3()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;
		int lengthInBits = 1;

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.getNearestEntryForKey(null, lengthInBits);

		// add additional test code here
		assertNotNull(result);
		assertEquals("RootEntry(key=null [-1], value=null, parent=null, left=ROOT, right=null, predecessor=ROOT)", result.toString());
		assertEquals(true, result.isEmpty());
		assertEquals(true, result.isExternalNode());
		assertEquals(false, result.isInternalNode());
		assertEquals(null, result.getValue());
		assertEquals(null, result.getKey());
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> getNearestEntryForKey(K,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testGetNearestEntryForKey_4()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;
		int lengthInBits = 1;

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.getNearestEntryForKey(null, lengthInBits);

		// add additional test code here
		assertNotNull(result);
		assertEquals("RootEntry(key=null [-1], value=null, parent=null, left=ROOT, right=null, predecessor=ROOT)", result.toString());
		assertEquals(true, result.isEmpty());
		assertEquals(true, result.isExternalNode());
		assertEquals(false, result.isInternalNode());
		assertEquals(null, result.getValue());
		assertEquals(null, result.getKey());
	}

	/**
	 * Run the SortedMap<Object, Object> headMap(K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testHeadMap_1()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		SortedMap<Object, Object> result = fixture.headMap(null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: must have a from or to!
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie$RangeEntryMap.<init>(AbstractPatriciaTrie.java:1850)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie$RangeEntryMap.<init>(AbstractPatriciaTrie.java:1840)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.headMap(AbstractPatriciaTrie.java:862)
		//       at org.apache.commons.collections4.trie.PatriciaTrie.headMap(PatriciaTrie.java:1)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> higherEntry(K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testHigherEntry_1()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.higherEntry(null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.followLeft(AbstractPatriciaTrie.java:764)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.firstEntry(AbstractPatriciaTrie.java:750)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.higherEntry(AbstractPatriciaTrie.java:893)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> higherEntry(K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testHigherEntry_2()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.higherEntry(null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.followLeft(AbstractPatriciaTrie.java:764)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.firstEntry(AbstractPatriciaTrie.java:750)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.higherEntry(AbstractPatriciaTrie.java:893)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> higherEntry(K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testHigherEntry_3()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.higherEntry(null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.followLeft(AbstractPatriciaTrie.java:764)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.firstEntry(AbstractPatriciaTrie.java:750)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.higherEntry(AbstractPatriciaTrie.java:893)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> higherEntry(K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testHigherEntry_4()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.higherEntry(null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.followLeft(AbstractPatriciaTrie.java:764)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.firstEntry(AbstractPatriciaTrie.java:750)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.higherEntry(AbstractPatriciaTrie.java:893)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> higherEntry(K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testHigherEntry_5()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.higherEntry(null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.followLeft(AbstractPatriciaTrie.java:764)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.firstEntry(AbstractPatriciaTrie.java:750)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.higherEntry(AbstractPatriciaTrie.java:893)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> higherEntry(K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testHigherEntry_6()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.higherEntry(null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.followLeft(AbstractPatriciaTrie.java:764)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.firstEntry(AbstractPatriciaTrie.java:750)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.higherEntry(AbstractPatriciaTrie.java:893)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> higherEntry(K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testHigherEntry_7()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.higherEntry(null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.followLeft(AbstractPatriciaTrie.java:764)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.firstEntry(AbstractPatriciaTrie.java:750)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.higherEntry(AbstractPatriciaTrie.java:893)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> higherEntry(K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testHigherEntry_8()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.higherEntry(null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.followLeft(AbstractPatriciaTrie.java:764)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.firstEntry(AbstractPatriciaTrie.java:750)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.higherEntry(AbstractPatriciaTrie.java:893)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> higherEntry(K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testHigherEntry_9()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.higherEntry(null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.followLeft(AbstractPatriciaTrie.java:764)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.firstEntry(AbstractPatriciaTrie.java:750)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.higherEntry(AbstractPatriciaTrie.java:893)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> higherEntry(K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testHigherEntry_10()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.higherEntry(null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.followLeft(AbstractPatriciaTrie.java:764)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.firstEntry(AbstractPatriciaTrie.java:750)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.higherEntry(AbstractPatriciaTrie.java:893)
		assertNotNull(result);
	}

	/**
	 * Run the void incrementSize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testIncrementSize_1()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		fixture.incrementSize();

		// add additional test code here
	}

	/**
	 * Run the boolean isValidUplink(TrieEntry<?,?>,TrieEntry<?,?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testIsValidUplink_1()
		throws Exception {
		AbstractPatriciaTrie.TrieEntry<Object, Object> next = new AbstractPatriciaTrie.TrieEntry((Object) null, (Object) null, 1);
		AbstractPatriciaTrie.TrieEntry<Object, Object> from = new AbstractPatriciaTrie.TrieEntry((Object) null, (Object) null, 1);

		boolean result = AbstractPatriciaTrie.isValidUplink(next, from);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isValidUplink(TrieEntry<?,?>,TrieEntry<?,?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testIsValidUplink_2()
		throws Exception {
		AbstractPatriciaTrie.TrieEntry<Object, Object> next = null;
		AbstractPatriciaTrie.TrieEntry<Object, Object> from = new AbstractPatriciaTrie.TrieEntry((Object) null, (Object) null, 1);

		boolean result = AbstractPatriciaTrie.isValidUplink(next, from);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isValidUplink(TrieEntry<?,?>,TrieEntry<?,?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testIsValidUplink_3()
		throws Exception {
		AbstractPatriciaTrie.TrieEntry<Object, Object> next = new AbstractPatriciaTrie.TrieEntry((Object) null, (Object) null, 1);
		AbstractPatriciaTrie.TrieEntry<Object, Object> from = new AbstractPatriciaTrie.TrieEntry((Object) null, (Object) null, 1);

		boolean result = AbstractPatriciaTrie.isValidUplink(next, from);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isValidUplink(TrieEntry<?,?>,TrieEntry<?,?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testIsValidUplink_4()
		throws Exception {
		AbstractPatriciaTrie.TrieEntry<Object, Object> next = new AbstractPatriciaTrie.TrieEntry((Object) null, (Object) null, 1);
		AbstractPatriciaTrie.TrieEntry<Object, Object> from = new AbstractPatriciaTrie.TrieEntry((Object) null, (Object) null, 1);

		boolean result = AbstractPatriciaTrie.isValidUplink(next, from);

		// add additional test code here
		assertEquals(false, result);
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
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		Set<Object> result = fixture.keySet();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the Set<Object> keySet() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testKeySet_2()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		Set<Object> result = fixture.keySet();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> lastEntry() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testLastEntry_1()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.lastEntry();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object lastKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testLastKey_1()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		Object result = fixture.lastKey();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.NoSuchElementException
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.lastKey(AbstractPatriciaTrie.java:790)
		//       at org.apache.commons.collections4.trie.PatriciaTrie.lastKey(PatriciaTrie.java:1)
		assertNotNull(result);
	}

	/**
	 * Run the Object lastKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test(expected = java.util.NoSuchElementException.class)
	public void testLastKey_2()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		Object result = fixture.lastKey();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> lowerEntry(K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testLowerEntry_1()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.lowerEntry(null);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> lowerEntry(K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testLowerEntry_2()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.lowerEntry(null);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> lowerEntry(K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testLowerEntry_3()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.lowerEntry(null);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> lowerEntry(K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testLowerEntry_4()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.lowerEntry(null);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> lowerEntry(K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testLowerEntry_5()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.lowerEntry(null);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> lowerEntry(K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testLowerEntry_6()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.lowerEntry(null);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the OrderedMapIterator<Object, Object> mapIterator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testMapIterator_1()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		OrderedMapIterator<Object, Object> result = fixture.mapIterator();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.followLeft(AbstractPatriciaTrie.java:764)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.firstEntry(AbstractPatriciaTrie.java:750)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.nextEntry(AbstractPatriciaTrie.java:611)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieIterator.<init>(AbstractPatriciaTrie.java:1535)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieMapIterator.<init>(AbstractPatriciaTrie.java:1594)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieMapIterator.<init>(AbstractPatriciaTrie.java:1594)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.mapIterator(AbstractPatriciaTrie.java:818)
		//       at org.apache.commons.collections4.trie.PatriciaTrie.mapIterator(PatriciaTrie.java:1)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> nextEntry(TrieEntry<K,V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testNextEntry_1()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;
		AbstractPatriciaTrie.TrieEntry<Object, Object> node = null;

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.nextEntry(node);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.followLeft(AbstractPatriciaTrie.java:764)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.firstEntry(AbstractPatriciaTrie.java:750)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.nextEntry(AbstractPatriciaTrie.java:611)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> nextEntry(TrieEntry<K,V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testNextEntry_2()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;
		AbstractPatriciaTrie.TrieEntry<Object, Object> node = new AbstractPatriciaTrie.TrieEntry((Object) null, (Object) null, 1);

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.nextEntry(node);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> nextEntryImpl(TrieEntry<K,V>,TrieEntry<K,V>,TrieEntry<K,V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testNextEntryImpl_1()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;
		AbstractPatriciaTrie.TrieEntry<Object, Object> start = new AbstractPatriciaTrie.TrieEntry((Object) null, (Object) null, 1);
		AbstractPatriciaTrie.TrieEntry<Object, Object> previous = new AbstractPatriciaTrie.TrieEntry((Object) null, (Object) null, 1);
		AbstractPatriciaTrie.TrieEntry<Object, Object> tree = new AbstractPatriciaTrie.TrieEntry((Object) null, (Object) null, 1);

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.nextEntryImpl(start, previous, tree);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> nextEntryInSubtree(TrieEntry<K,V>,TrieEntry<K,V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testNextEntryInSubtree_1()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;
		AbstractPatriciaTrie.TrieEntry<Object, Object> node = null;
		AbstractPatriciaTrie.TrieEntry<Object, Object> parentOfSubtree = new AbstractPatriciaTrie.TrieEntry((Object) null, (Object) null, 1);

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.nextEntryInSubtree(node, parentOfSubtree);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.followLeft(AbstractPatriciaTrie.java:764)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.firstEntry(AbstractPatriciaTrie.java:750)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.nextEntryInSubtree(AbstractPatriciaTrie.java:1228)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> nextEntryInSubtree(TrieEntry<K,V>,TrieEntry<K,V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testNextEntryInSubtree_2()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;
		AbstractPatriciaTrie.TrieEntry<Object, Object> node = new AbstractPatriciaTrie.TrieEntry((Object) null, (Object) null, 1);
		AbstractPatriciaTrie.TrieEntry<Object, Object> parentOfSubtree = new AbstractPatriciaTrie.TrieEntry((Object) null, (Object) null, 1);

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.nextEntryInSubtree(node, parentOfSubtree);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object nextKey(K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testNextKey_1()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		Object result = fixture.nextKey(null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.nextKey(AbstractPatriciaTrie.java:795)
		//       at org.apache.commons.collections4.trie.PatriciaTrie.nextKey(PatriciaTrie.java:1)
		assertNotNull(result);
	}

	/**
	 * Run the Object nextKey(K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testNextKey_2()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		Object result = fixture.nextKey(null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.nextKey(AbstractPatriciaTrie.java:795)
		//       at org.apache.commons.collections4.trie.PatriciaTrie.nextKey(PatriciaTrie.java:1)
		assertNotNull(result);
	}

	/**
	 * Run the Object nextKey(K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testNextKey_3()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		Object result = fixture.nextKey(null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.nextKey(AbstractPatriciaTrie.java:795)
		//       at org.apache.commons.collections4.trie.PatriciaTrie.nextKey(PatriciaTrie.java:1)
		assertNotNull(result);
	}

	/**
	 * Run the Object nextKey(K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testNextKey_4()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		Object result = fixture.nextKey(null);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SortedMap<Object, Object> prefixMap(K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testPrefixMap_1()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		SortedMap<Object, Object> result = fixture.prefixMap(null);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> previousEntry(TrieEntry<K,V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testPreviousEntry_1()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;
		AbstractPatriciaTrie.TrieEntry<Object, Object> start = new AbstractPatriciaTrie.TrieEntry((Object) null, (Object) null, 1);

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.previousEntry(start);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> previousEntry(TrieEntry<K,V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testPreviousEntry_2()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;
		AbstractPatriciaTrie.TrieEntry<Object, Object> start = new AbstractPatriciaTrie.TrieEntry((Object) null, (Object) null, 1);

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.previousEntry(start);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> previousEntry(TrieEntry<K,V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testPreviousEntry_3()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;
		AbstractPatriciaTrie.TrieEntry<Object, Object> start = new AbstractPatriciaTrie.TrieEntry((Object) null, (Object) null, 1);

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.previousEntry(start);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object previousKey(K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testPreviousKey_1()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		Object result = fixture.previousKey(null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.previousKey(AbstractPatriciaTrie.java:807)
		//       at org.apache.commons.collections4.trie.PatriciaTrie.previousKey(PatriciaTrie.java:1)
		assertNotNull(result);
	}

	/**
	 * Run the Object previousKey(K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testPreviousKey_2()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		Object result = fixture.previousKey(null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.previousKey(AbstractPatriciaTrie.java:807)
		//       at org.apache.commons.collections4.trie.PatriciaTrie.previousKey(PatriciaTrie.java:1)
		assertNotNull(result);
	}

	/**
	 * Run the Object previousKey(K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testPreviousKey_3()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		Object result = fixture.previousKey(null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.previousKey(AbstractPatriciaTrie.java:807)
		//       at org.apache.commons.collections4.trie.PatriciaTrie.previousKey(PatriciaTrie.java:1)
		assertNotNull(result);
	}

	/**
	 * Run the Object previousKey(K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testPreviousKey_4()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		Object result = fixture.previousKey(null);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object put(K,V) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testPut_1()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		Object result = fixture.put(null, null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException: Key cannot be null
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.put(AbstractPatriciaTrie.java:131)
		//       at org.apache.commons.collections4.trie.PatriciaTrie.put(PatriciaTrie.java:1)
		assertNotNull(result);
	}

	/**
	 * Run the Object put(K,V) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testPut_2()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		Object result = fixture.put(null, null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException: Key cannot be null
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.put(AbstractPatriciaTrie.java:131)
		//       at org.apache.commons.collections4.trie.PatriciaTrie.put(PatriciaTrie.java:1)
		assertNotNull(result);
	}

	/**
	 * Run the Object put(K,V) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testPut_3()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		Object result = fixture.put(null, null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException: Key cannot be null
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.put(AbstractPatriciaTrie.java:131)
		//       at org.apache.commons.collections4.trie.PatriciaTrie.put(PatriciaTrie.java:1)
		assertNotNull(result);
	}

	/**
	 * Run the Object put(K,V) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testPut_4()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		Object result = fixture.put(null, null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException: Key cannot be null
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.put(AbstractPatriciaTrie.java:131)
		//       at org.apache.commons.collections4.trie.PatriciaTrie.put(PatriciaTrie.java:1)
		assertNotNull(result);
	}

	/**
	 * Run the Object put(K,V) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testPut_5()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		Object result = fixture.put(null, null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException: Key cannot be null
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.put(AbstractPatriciaTrie.java:131)
		//       at org.apache.commons.collections4.trie.PatriciaTrie.put(PatriciaTrie.java:1)
		assertNotNull(result);
	}

	/**
	 * Run the Object put(K,V) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testPut_6()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		Object result = fixture.put(null, null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException: Key cannot be null
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.put(AbstractPatriciaTrie.java:131)
		//       at org.apache.commons.collections4.trie.PatriciaTrie.put(PatriciaTrie.java:1)
		assertNotNull(result);
	}

	/**
	 * Run the Object put(K,V) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testPut_7()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		Object result = fixture.put(null, null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException: Key cannot be null
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.put(AbstractPatriciaTrie.java:131)
		//       at org.apache.commons.collections4.trie.PatriciaTrie.put(PatriciaTrie.java:1)
		assertNotNull(result);
	}

	/**
	 * Run the Object put(K,V) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testPut_8()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		Object result = fixture.put(null, null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException: Key cannot be null
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.put(AbstractPatriciaTrie.java:131)
		//       at org.apache.commons.collections4.trie.PatriciaTrie.put(PatriciaTrie.java:1)
		assertNotNull(result);
	}

	/**
	 * Run the Object put(K,V) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testPut_9()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		Object result = fixture.put(null, null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException: Key cannot be null
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.put(AbstractPatriciaTrie.java:131)
		//       at org.apache.commons.collections4.trie.PatriciaTrie.put(PatriciaTrie.java:1)
		assertNotNull(result);
	}

	/**
	 * Run the Object put(K,V) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testPut_10()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		Object result = fixture.put(null, null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException: Key cannot be null
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.put(AbstractPatriciaTrie.java:131)
		//       at org.apache.commons.collections4.trie.PatriciaTrie.put(PatriciaTrie.java:1)
		assertNotNull(result);
	}

	/**
	 * Run the Object put(K,V) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testPut_11()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		Object result = fixture.put(null, null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException: Key cannot be null
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.put(AbstractPatriciaTrie.java:131)
		//       at org.apache.commons.collections4.trie.PatriciaTrie.put(PatriciaTrie.java:1)
		assertNotNull(result);
	}

	/**
	 * Run the Object put(K,V) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testPut_12()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		Object result = fixture.put(null, null);

		// add additional test code here
		assertNotNull(result);
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
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;
		Object k = null;

		Object result = fixture.remove(k);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object remove(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testRemove_2()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;
		Object k = new Object();

		Object result = fixture.remove(k);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to java.lang.String
		//       at org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer.lengthInBits(StringKeyAnalyzer.java:1)
		//       at org.apache.commons.collections4.trie.AbstractBitwiseTrie.lengthInBits(AbstractBitwiseTrie.java:93)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.remove(AbstractPatriciaTrie.java:425)
		//       at org.apache.commons.collections4.trie.PatriciaTrie.remove(PatriciaTrie.java:1)
		assertNotNull(result);
	}

	/**
	 * Run the Object remove(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testRemove_3()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;
		Object k = new Object();

		Object result = fixture.remove(k);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to java.lang.String
		//       at org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer.lengthInBits(StringKeyAnalyzer.java:1)
		//       at org.apache.commons.collections4.trie.AbstractBitwiseTrie.lengthInBits(AbstractBitwiseTrie.java:93)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.remove(AbstractPatriciaTrie.java:425)
		//       at org.apache.commons.collections4.trie.PatriciaTrie.remove(PatriciaTrie.java:1)
		assertNotNull(result);
	}

	/**
	 * Run the Object remove(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testRemove_4()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;
		Object k = new Object();

		Object result = fixture.remove(k);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to java.lang.String
		//       at org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer.lengthInBits(StringKeyAnalyzer.java:1)
		//       at org.apache.commons.collections4.trie.AbstractBitwiseTrie.lengthInBits(AbstractBitwiseTrie.java:93)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.remove(AbstractPatriciaTrie.java:425)
		//       at org.apache.commons.collections4.trie.PatriciaTrie.remove(PatriciaTrie.java:1)
		assertNotNull(result);
	}

	/**
	 * Run the Object remove(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testRemove_5()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;
		Object k = new Object();

		Object result = fixture.remove(k);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to java.lang.String
		//       at org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer.lengthInBits(StringKeyAnalyzer.java:1)
		//       at org.apache.commons.collections4.trie.AbstractBitwiseTrie.lengthInBits(AbstractBitwiseTrie.java:93)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.remove(AbstractPatriciaTrie.java:425)
		//       at org.apache.commons.collections4.trie.PatriciaTrie.remove(PatriciaTrie.java:1)
		assertNotNull(result);
	}

	/**
	 * Run the Object remove(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testRemove_6()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;
		Object k = new Object();

		Object result = fixture.remove(k);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to java.lang.String
		//       at org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer.lengthInBits(StringKeyAnalyzer.java:1)
		//       at org.apache.commons.collections4.trie.AbstractBitwiseTrie.lengthInBits(AbstractBitwiseTrie.java:93)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.remove(AbstractPatriciaTrie.java:425)
		//       at org.apache.commons.collections4.trie.PatriciaTrie.remove(PatriciaTrie.java:1)
		assertNotNull(result);
	}

	/**
	 * Run the Object remove(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testRemove_7()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;
		Object k = new Object();

		Object result = fixture.remove(k);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to java.lang.String
		//       at org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer.lengthInBits(StringKeyAnalyzer.java:1)
		//       at org.apache.commons.collections4.trie.AbstractBitwiseTrie.lengthInBits(AbstractBitwiseTrie.java:93)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.remove(AbstractPatriciaTrie.java:425)
		//       at org.apache.commons.collections4.trie.PatriciaTrie.remove(PatriciaTrie.java:1)
		assertNotNull(result);
	}

	/**
	 * Run the Object removeEntry(TrieEntry<K,V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testRemoveEntry_1()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;
		AbstractPatriciaTrie.TrieEntry<Object, Object> h = new AbstractPatriciaTrie.TrieEntry((Object) null, (Object) null, 1);

		Object result = fixture.removeEntry(h);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.removeExternalEntry(AbstractPatriciaTrie.java:508)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.removeEntry(AbstractPatriciaTrie.java:484)
		assertNotNull(result);
	}

	/**
	 * Run the Object removeEntry(TrieEntry<K,V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testRemoveEntry_2()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;
		AbstractPatriciaTrie.TrieEntry<Object, Object> h = new AbstractPatriciaTrie.TrieEntry((Object) null, (Object) null, 1);

		Object result = fixture.removeEntry(h);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.removeExternalEntry(AbstractPatriciaTrie.java:508)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.removeEntry(AbstractPatriciaTrie.java:484)
		assertNotNull(result);
	}

	/**
	 * Run the Object removeEntry(TrieEntry<K,V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testRemoveEntry_3()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;
		AbstractPatriciaTrie.TrieEntry<Object, Object> h = new AbstractPatriciaTrie.TrieEntry((Object) null, (Object) null, 1);

		Object result = fixture.removeEntry(h);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.removeExternalEntry(AbstractPatriciaTrie.java:508)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.removeEntry(AbstractPatriciaTrie.java:484)
		assertNotNull(result);
	}

	/**
	 * Run the java.util.Map.Entry<Object, Object> select(K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testSelect_1()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		java.util.Map.Entry<Object, Object> result = fixture.select(null);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the java.util.Map.Entry<Object, Object> select(K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testSelect_2()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		java.util.Map.Entry<Object, Object> result = fixture.select(null);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object selectKey(K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testSelectKey_1()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		Object result = fixture.selectKey(null);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object selectKey(K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testSelectKey_2()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		Object result = fixture.selectKey(null);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object selectValue(K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testSelectValue_1()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		Object result = fixture.selectValue(null);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object selectValue(K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testSelectValue_2()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		Object result = fixture.selectValue(null);

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
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		int result = fixture.size();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the SortedMap<Object, Object> subMap(K,K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testSubMap_1()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		SortedMap<Object, Object> result = fixture.subMap(null, null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: must have a from or to!
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie$RangeEntryMap.<init>(AbstractPatriciaTrie.java:1850)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie$RangeEntryMap.<init>(AbstractPatriciaTrie.java:1840)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.subMap(AbstractPatriciaTrie.java:866)
		//       at org.apache.commons.collections4.trie.PatriciaTrie.subMap(PatriciaTrie.java:1)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> subtree(K,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testSubtree_1()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;
		int offsetInBits = 1;
		int lengthInBits = 1;

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.subtree(null, offsetInBits, lengthInBits);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> subtree(K,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testSubtree_2()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;
		int offsetInBits = 1;
		int lengthInBits = 1;

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.subtree(null, offsetInBits, lengthInBits);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> subtree(K,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testSubtree_3()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;
		int offsetInBits = 1;
		int lengthInBits = 1;

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.subtree(null, offsetInBits, lengthInBits);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> subtree(K,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testSubtree_4()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;
		int offsetInBits = 1;
		int lengthInBits = 1;

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.subtree(null, offsetInBits, lengthInBits);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> subtree(K,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testSubtree_5()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;
		int offsetInBits = 1;
		int lengthInBits = 1;

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.subtree(null, offsetInBits, lengthInBits);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the AbstractPatriciaTrie.TrieEntry<Object, Object> subtree(K,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testSubtree_6()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;
		int offsetInBits = 1;
		int lengthInBits = 1;

		AbstractPatriciaTrie.TrieEntry<Object, Object> result = fixture.subtree(null, offsetInBits, lengthInBits);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the SortedMap<Object, Object> tailMap(K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testTailMap_1()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		SortedMap<Object, Object> result = fixture.tailMap(null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: must have a from or to!
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie$RangeEntryMap.<init>(AbstractPatriciaTrie.java:1850)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie$RangeEntryMap.<init>(AbstractPatriciaTrie.java:1840)
		//       at org.apache.commons.collections4.trie.AbstractPatriciaTrie.tailMap(AbstractPatriciaTrie.java:870)
		//       at org.apache.commons.collections4.trie.PatriciaTrie.tailMap(PatriciaTrie.java:1)
		assertNotNull(result);
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
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		Collection<Object> result = fixture.values();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the Collection<Object> values() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testValues_2()
		throws Exception {
		PatriciaTrie fixture = new PatriciaTrie();
		fixture.incrementSize();
		fixture.modCount = 1;

		Collection<Object> result = fixture.values();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
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
		new org.junit.runner.JUnitCore().run(AbstractPatriciaTrieTest.class);
	}
}
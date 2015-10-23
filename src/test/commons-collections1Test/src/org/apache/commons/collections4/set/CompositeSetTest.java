package org.apache.commons.collections4.set;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.commons.collections4.list.GrowthList;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>CompositeSetTest</code> contains tests for the class <code>{@link CompositeSet}</code>.
 *
 * @generatedBy CodePro at 10/23/15 2:02 PM
 * @author Nikhil
 * @version $Revision: 1.0 $
 */
public class CompositeSetTest {
	/**
	 * Run the CompositeSet() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testCompositeSet_1()
		throws Exception {

		CompositeSet result = new CompositeSet();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the CompositeSet(Set<E>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testCompositeSet_2()
		throws Exception {
		Set<Object> set = new ListOrderedSet();

		CompositeSet result = new CompositeSet(set);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the CompositeSet(Set<E>[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testCompositeSet_3()
		throws Exception {

		CompositeSet result = new CompositeSet();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the boolean add(E) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testAdd_1()
		throws Exception {
		CompositeSet fixture = new CompositeSet();
		fixture.setMutator(null);
		fixture.addComposited(new ListOrderedSet());

		boolean result = fixture.add(null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedOperationException: add() is not supported on CompositeSet without a SetMutator strategy
		//       at org.apache.commons.collections4.set.CompositeSet.add(CompositeSet.java:214)
		assertTrue(result);
	}

	/**
	 * Run the boolean add(E) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testAdd_2()
		throws Exception {
		CompositeSet fixture = new CompositeSet();
		fixture.setMutator(null);
		fixture.addComposited(new ListOrderedSet());

		boolean result = fixture.add(null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedOperationException: add() is not supported on CompositeSet without a SetMutator strategy
		//       at org.apache.commons.collections4.set.CompositeSet.add(CompositeSet.java:214)
		assertTrue(result);
	}

	/**
	 * Run the boolean add(E) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test(expected = java.lang.UnsupportedOperationException.class)
	public void testAdd_3()
		throws Exception {
		CompositeSet fixture = new CompositeSet();
		fixture.setMutator(null);
		fixture.addComposited(new ListOrderedSet());

		boolean result = fixture.add(null);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean addAll(Collection<? extends E>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testAddAll_1()
		throws Exception {
		CompositeSet fixture = new CompositeSet();
		fixture.setMutator(null);
		fixture.addComposited(new ListOrderedSet());
		Collection<? extends Object> coll = new GrowthList();

		boolean result = fixture.addAll(coll);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedOperationException: addAll() is not supported on CompositeSet without a SetMutator strategy
		//       at org.apache.commons.collections4.set.CompositeSet.addAll(CompositeSet.java:267)
		assertTrue(result);
	}

	/**
	 * Run the boolean addAll(Collection<? extends E>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testAddAll_2()
		throws Exception {
		CompositeSet fixture = new CompositeSet();
		fixture.setMutator(null);
		fixture.addComposited(new ListOrderedSet());
		Collection<? extends Object> coll = new GrowthList();

		boolean result = fixture.addAll(coll);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedOperationException: addAll() is not supported on CompositeSet without a SetMutator strategy
		//       at org.apache.commons.collections4.set.CompositeSet.addAll(CompositeSet.java:267)
		assertTrue(result);
	}

	/**
	 * Run the boolean addAll(Collection<? extends E>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test(expected = java.lang.UnsupportedOperationException.class)
	public void testAddAll_3()
		throws Exception {
		CompositeSet fixture = new CompositeSet();
		fixture.setMutator(null);
		fixture.addComposited(new ListOrderedSet());
		Collection<? extends Object> coll = new GrowthList();

		boolean result = fixture.addAll(coll);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the void addComposited(Set<E>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testAddComposited_1()
		throws Exception {
		CompositeSet fixture = new CompositeSet();
		fixture.setMutator(null);
		fixture.addComposited(new ListOrderedSet());
		Set<Object> set = new ListOrderedSet();

		fixture.addComposited(set);

		// add additional test code here
	}

	/**
	 * Run the void addComposited(Set<E>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testAddComposited_2()
		throws Exception {
		CompositeSet fixture = new CompositeSet();
		fixture.setMutator(null);
		fixture.addComposited(new ListOrderedSet());
		Set<Object> set = new ListOrderedSet();

		fixture.addComposited(set);

		// add additional test code here
	}

	/**
	 * Run the void addComposited(Set<E>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testAddComposited_3()
		throws Exception {
		CompositeSet fixture = new CompositeSet();
		fixture.setMutator(null);
		fixture.addComposited(new ListOrderedSet());
		Set<Object> set = new ListOrderedSet();

		fixture.addComposited(set);

		// add additional test code here
	}

	/**
	 * Run the void addComposited(Set<E>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testAddComposited_4()
		throws Exception {
		CompositeSet fixture = new CompositeSet();
		fixture.setMutator(null);
		fixture.addComposited(new ListOrderedSet());
		Set<Object> set = new ListOrderedSet();

		fixture.addComposited(set);

		// add additional test code here
	}

	/**
	 * Run the void addComposited(Set<E>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testAddComposited_5()
		throws Exception {
		CompositeSet fixture = new CompositeSet();
		fixture.setMutator(null);
		fixture.addComposited(new ListOrderedSet());
		Set<Object> set = new ListOrderedSet();

		fixture.addComposited(set);

		// add additional test code here
	}

	/**
	 * Run the void addComposited(Set<E>[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testAddComposited_6()
		throws Exception {
		CompositeSet fixture = new CompositeSet();
		fixture.setMutator(null);
		fixture.addComposited(new ListOrderedSet());

		fixture.addComposited();

		// add additional test code here
	}

	/**
	 * Run the void addComposited(Set<E>[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testAddComposited_7()
		throws Exception {
		CompositeSet fixture = new CompositeSet();
		fixture.setMutator(null);
		fixture.addComposited(new ListOrderedSet());

		fixture.addComposited();

		// add additional test code here
	}

	/**
	 * Run the void addComposited(Set<E>,Set<E>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testAddComposited_8()
		throws Exception {
		CompositeSet fixture = new CompositeSet();
		fixture.setMutator(null);
		fixture.addComposited(new ListOrderedSet());
		Set<Object> set1 = new ListOrderedSet();
		Set<Object> set2 = new ListOrderedSet();

		fixture.addComposited(set1, set2);

		// add additional test code here
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
		CompositeSet fixture = new CompositeSet();
		fixture.setMutator(null);
		fixture.addComposited(new ListOrderedSet());

		fixture.clear();

		// add additional test code here
	}

	/**
	 * Run the void clear() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testClear_2()
		throws Exception {
		CompositeSet fixture = new CompositeSet();
		fixture.setMutator(null);
		fixture.addComposited(new ListOrderedSet());

		fixture.clear();

		// add additional test code here
	}

	/**
	 * Run the boolean contains(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testContains_1()
		throws Exception {
		CompositeSet fixture = new CompositeSet();
		fixture.setMutator(null);
		fixture.addComposited(new ListOrderedSet());
		Object obj = new Object();

		boolean result = fixture.contains(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean contains(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testContains_2()
		throws Exception {
		CompositeSet fixture = new CompositeSet();
		fixture.setMutator(null);
		fixture.addComposited(new ListOrderedSet());
		Object obj = new Object();

		boolean result = fixture.contains(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean contains(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testContains_3()
		throws Exception {
		CompositeSet fixture = new CompositeSet();
		fixture.setMutator(null);
		fixture.addComposited(new ListOrderedSet());
		Object obj = new Object();

		boolean result = fixture.contains(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean containsAll(Collection<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testContainsAll_1()
		throws Exception {
		CompositeSet fixture = new CompositeSet();
		fixture.setMutator(null);
		fixture.addComposited(new ListOrderedSet());
		Collection<Object> coll = new GrowthList();

		boolean result = fixture.containsAll(coll);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean containsAll(Collection<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testContainsAll_2()
		throws Exception {
		CompositeSet fixture = new CompositeSet();
		fixture.setMutator(null);
		fixture.addComposited(new ListOrderedSet());
		Collection<Object> coll = new GrowthList();

		boolean result = fixture.containsAll(coll);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean containsAll(Collection<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testContainsAll_3()
		throws Exception {
		CompositeSet fixture = new CompositeSet();
		fixture.setMutator(null);
		fixture.addComposited(new ListOrderedSet());
		Collection<Object> coll = new GrowthList();

		boolean result = fixture.containsAll(coll);

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
	public void testEquals_1()
		throws Exception {
		CompositeSet fixture = new CompositeSet();
		fixture.setMutator(null);
		fixture.addComposited(new ListOrderedSet());
		Object obj = new ListOrderedSet();

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
		CompositeSet fixture = new CompositeSet();
		fixture.setMutator(null);
		fixture.addComposited(new ListOrderedSet());
		Object obj = new ListOrderedSet();

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
		CompositeSet fixture = new CompositeSet();
		fixture.setMutator(null);
		fixture.addComposited(new ListOrderedSet());
		Object obj = new ListOrderedSet();

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
		CompositeSet fixture = new CompositeSet();
		fixture.setMutator(null);
		fixture.addComposited(new ListOrderedSet());
		Object obj = new Object();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the CompositeSet.SetMutator<Object> getMutator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testGetMutator_1()
		throws Exception {
		CompositeSet fixture = new CompositeSet();
		fixture.setMutator(null);
		fixture.addComposited(new ListOrderedSet());

		CompositeSet.SetMutator<Object> result = fixture.getMutator();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<Set<Object>> getSets() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testGetSets_1()
		throws Exception {
		CompositeSet fixture = new CompositeSet();
		fixture.setMutator(null);
		fixture.addComposited(new ListOrderedSet());

		List<Set<Object>> result = fixture.getSets();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
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
		CompositeSet fixture = new CompositeSet();
		fixture.setMutator(null);
		fixture.addComposited(new ListOrderedSet());

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testHashCode_2()
		throws Exception {
		CompositeSet fixture = new CompositeSet();
		fixture.setMutator(null);
		fixture.addComposited(new ListOrderedSet());

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testHashCode_3()
		throws Exception {
		CompositeSet fixture = new CompositeSet();
		fixture.setMutator(null);
		fixture.addComposited(new ListOrderedSet());

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
		CompositeSet fixture = new CompositeSet();
		fixture.setMutator(null);
		fixture.addComposited(new ListOrderedSet());

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
		CompositeSet fixture = new CompositeSet();
		fixture.setMutator(null);
		fixture.addComposited(new ListOrderedSet());

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
	public void testIsEmpty_3()
		throws Exception {
		CompositeSet fixture = new CompositeSet();
		fixture.setMutator(null);
		fixture.addComposited(new ListOrderedSet());

		boolean result = fixture.isEmpty();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the Iterator<Object> iterator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testIterator_1()
		throws Exception {
		CompositeSet fixture = new CompositeSet();
		fixture.setMutator(null);

		Iterator<Object> result = fixture.iterator();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.hasNext());
	}

	/**
	 * Run the Iterator<Object> iterator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testIterator_2()
		throws Exception {
		CompositeSet fixture = new CompositeSet();
		fixture.setMutator(null);
		fixture.addComposited(new ListOrderedSet());

		Iterator<Object> result = fixture.iterator();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.hasNext());
	}

	/**
	 * Run the Iterator<Object> iterator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testIterator_3()
		throws Exception {
		CompositeSet fixture = new CompositeSet();
		fixture.setMutator(null);
		fixture.addComposited(new ListOrderedSet());

		Iterator<Object> result = fixture.iterator();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.hasNext());
	}

	/**
	 * Run the boolean remove(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testRemove_1()
		throws Exception {
		CompositeSet fixture = new CompositeSet();
		fixture.setMutator(null);
		fixture.addComposited(new ListOrderedSet());
		Object obj = new Object();

		boolean result = fixture.remove(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean remove(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testRemove_2()
		throws Exception {
		CompositeSet fixture = new CompositeSet();
		fixture.setMutator(null);
		fixture.addComposited(new ListOrderedSet());
		Object obj = new Object();

		boolean result = fixture.remove(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean remove(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testRemove_3()
		throws Exception {
		CompositeSet fixture = new CompositeSet();
		fixture.setMutator(null);
		fixture.addComposited(new ListOrderedSet());
		Object obj = new Object();

		boolean result = fixture.remove(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean remove(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testRemove_4()
		throws Exception {
		CompositeSet fixture = new CompositeSet();
		fixture.setMutator(null);
		fixture.addComposited(new ListOrderedSet());
		Object obj = new Object();

		boolean result = fixture.remove(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean removeAll(Collection<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testRemoveAll_1()
		throws Exception {
		CompositeSet fixture = new CompositeSet();
		fixture.setMutator(null);
		fixture.addComposited(new ListOrderedSet());
		Collection<Object> coll = new GrowthList();

		boolean result = fixture.removeAll(coll);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean removeAll(Collection<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testRemoveAll_2()
		throws Exception {
		CompositeSet fixture = new CompositeSet();
		fixture.setMutator(null);
		fixture.addComposited(new ListOrderedSet());
		Collection<Object> coll = new GrowthList();

		boolean result = fixture.removeAll(coll);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean removeAll(Collection<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testRemoveAll_3()
		throws Exception {
		CompositeSet fixture = new CompositeSet();
		fixture.setMutator(null);
		fixture.addComposited(new ListOrderedSet());
		Collection<Object> coll = new GrowthList();

		boolean result = fixture.removeAll(coll);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void removeComposited(Set<E>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testRemoveComposited_1()
		throws Exception {
		CompositeSet fixture = new CompositeSet();
		fixture.setMutator(null);
		fixture.addComposited(new ListOrderedSet());
		Set<Object> set = new ListOrderedSet();

		fixture.removeComposited(set);

		// add additional test code here
	}

	/**
	 * Run the boolean retainAll(Collection<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testRetainAll_1()
		throws Exception {
		CompositeSet fixture = new CompositeSet();
		fixture.setMutator(null);
		fixture.addComposited(new ListOrderedSet());
		Collection<Object> coll = new GrowthList();

		boolean result = fixture.retainAll(coll);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean retainAll(Collection<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testRetainAll_2()
		throws Exception {
		CompositeSet fixture = new CompositeSet();
		fixture.setMutator(null);
		fixture.addComposited(new ListOrderedSet());
		Collection<Object> coll = new GrowthList();

		boolean result = fixture.retainAll(coll);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void setMutator(SetMutator<E>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testSetMutator_1()
		throws Exception {
		CompositeSet fixture = new CompositeSet();
		fixture.setMutator(null);
		fixture.addComposited(new ListOrderedSet());
		CompositeSet.SetMutator<Object> mutator = null;

		fixture.setMutator(mutator);

		// add additional test code here
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
		CompositeSet fixture = new CompositeSet();
		fixture.setMutator(null);
		fixture.addComposited(new ListOrderedSet());

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
		CompositeSet fixture = new CompositeSet();
		fixture.setMutator(null);
		fixture.addComposited(new ListOrderedSet());

		int result = fixture.size();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the Object[] toArray() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testToArray_1()
		throws Exception {
		CompositeSet fixture = new CompositeSet();
		fixture.setMutator(null);
		fixture.addComposited(new ListOrderedSet());

		Object[] result = fixture.toArray();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the Object[] toArray() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testToArray_2()
		throws Exception {
		CompositeSet fixture = new CompositeSet();
		fixture.setMutator(null);
		fixture.addComposited(new ListOrderedSet());

		Object[] result = fixture.toArray();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the Object[] toArray(T[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testToArray_3()
		throws Exception {
		CompositeSet fixture = new CompositeSet();
		fixture.setMutator(null);
		fixture.addComposited(new ListOrderedSet());

		Object[] result = fixture.toArray(new Object[] {});

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the Object[] toArray(T[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testToArray_4()
		throws Exception {
		CompositeSet fixture = new CompositeSet();
		fixture.setMutator(null);
		fixture.addComposited(new ListOrderedSet());

		Object[] result = fixture.toArray(new Object[] {null});

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.length);
		assertEquals(null, result[0]);
	}

	/**
	 * Run the Object[] toArray(T[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testToArray_5()
		throws Exception {
		CompositeSet fixture = new CompositeSet();
		fixture.setMutator(null);
		fixture.addComposited(new ListOrderedSet());

		Object[] result = fixture.toArray(new Object[] {});

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the Object[] toArray(T[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testToArray_6()
		throws Exception {
		CompositeSet fixture = new CompositeSet();
		fixture.setMutator(null);
		fixture.addComposited(new ListOrderedSet());

		Object[] result = fixture.toArray(new Object[] {});

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the Set<Object> toSet() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testToSet_1()
		throws Exception {
		CompositeSet fixture = new CompositeSet();
		fixture.setMutator(null);
		fixture.addComposited(new ListOrderedSet());

		Set<Object> result = fixture.toSet();

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
		new org.junit.runner.JUnitCore().run(CompositeSetTest.class);
	}
}
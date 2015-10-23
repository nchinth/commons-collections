package org.apache.commons.collections4.bag;

import java.util.Collection;
import java.util.Comparator;
import java.util.SortedMap;
import org.apache.commons.collections4.comparators.BooleanComparator;
import org.apache.commons.collections4.list.GrowthList;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TreeBagTest</code> contains tests for the class <code>{@link TreeBag}</code>.
 *
 * @generatedBy CodePro at 10/23/15 2:02 PM
 * @author Nikhil
 * @version $Revision: 1.0 $
 */
public class TreeBagTest {
	/**
	 * Run the TreeBag() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testTreeBag_1()
		throws Exception {

		TreeBag result = new TreeBag();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the TreeBag(Collection<? extends E>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testTreeBag_2()
		throws Exception {
		Collection<? extends Object> coll = new GrowthList();

		TreeBag result = new TreeBag(coll);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the TreeBag(Comparator<? super E>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testTreeBag_3()
		throws Exception {
		Comparator<? extends Object> comparator = new BooleanComparator();

		TreeBag result = new TreeBag(comparator);

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
		TreeBag fixture = new TreeBag();
		fixture.remove(new Object(), 1);

		boolean result = fixture.add(null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to java.lang.Comparable
		//       at java.util.TreeMap.getEntry(Unknown Source)
		//       at java.util.TreeMap.get(Unknown Source)
		//       at org.apache.commons.collections4.bag.AbstractMapBag.remove(AbstractMapBag.java:332)
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
		TreeBag fixture = new TreeBag();
		fixture.remove(new Object(), 1);

		boolean result = fixture.add(null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to java.lang.Comparable
		//       at java.util.TreeMap.getEntry(Unknown Source)
		//       at java.util.TreeMap.get(Unknown Source)
		//       at org.apache.commons.collections4.bag.AbstractMapBag.remove(AbstractMapBag.java:332)
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
	public void testAdd_3()
		throws Exception {
		TreeBag fixture = new TreeBag();
		fixture.remove(new Object(), 1);

		boolean result = fixture.add(null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to java.lang.Comparable
		//       at java.util.TreeMap.getEntry(Unknown Source)
		//       at java.util.TreeMap.get(Unknown Source)
		//       at org.apache.commons.collections4.bag.AbstractMapBag.remove(AbstractMapBag.java:332)
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
	public void testAdd_4()
		throws Exception {
		TreeBag fixture = new TreeBag();
		fixture.remove(new Object(), 1);

		boolean result = fixture.add(null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to java.lang.Comparable
		//       at java.util.TreeMap.getEntry(Unknown Source)
		//       at java.util.TreeMap.get(Unknown Source)
		//       at org.apache.commons.collections4.bag.AbstractMapBag.remove(AbstractMapBag.java:332)
		assertTrue(result);
	}

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
		TreeBag fixture = new TreeBag();
		fixture.remove(new Object(), 1);

		Comparator<? extends Object> result = fixture.comparator();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to java.lang.Comparable
		//       at java.util.TreeMap.getEntry(Unknown Source)
		//       at java.util.TreeMap.get(Unknown Source)
		//       at org.apache.commons.collections4.bag.AbstractMapBag.remove(AbstractMapBag.java:332)
		assertNotNull(result);
	}

	/**
	 * Run the Object first() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testFirst_1()
		throws Exception {
		TreeBag fixture = new TreeBag();
		fixture.remove(new Object(), 1);

		Object result = fixture.first();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to java.lang.Comparable
		//       at java.util.TreeMap.getEntry(Unknown Source)
		//       at java.util.TreeMap.get(Unknown Source)
		//       at org.apache.commons.collections4.bag.AbstractMapBag.remove(AbstractMapBag.java:332)
		assertNotNull(result);
	}

	/**
	 * Run the SortedMap<Object, AbstractMapBag.MutableInteger> getMap() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testGetMap_1()
		throws Exception {
		TreeBag fixture = new TreeBag();
		fixture.remove(new Object(), 1);

		SortedMap<Object, AbstractMapBag.MutableInteger> result = fixture.getMap();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to java.lang.Comparable
		//       at java.util.TreeMap.getEntry(Unknown Source)
		//       at java.util.TreeMap.get(Unknown Source)
		//       at org.apache.commons.collections4.bag.AbstractMapBag.remove(AbstractMapBag.java:332)
		assertNotNull(result);
	}

	/**
	 * Run the Object last() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testLast_1()
		throws Exception {
		TreeBag fixture = new TreeBag();
		fixture.remove(new Object(), 1);

		Object result = fixture.last();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to java.lang.Comparable
		//       at java.util.TreeMap.getEntry(Unknown Source)
		//       at java.util.TreeMap.get(Unknown Source)
		//       at org.apache.commons.collections4.bag.AbstractMapBag.remove(AbstractMapBag.java:332)
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
		new org.junit.runner.JUnitCore().run(TreeBagTest.class);
	}
}
package org.apache.commons.collections4.list;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AbstractListDecoratorTest</code> contains tests for the class <code>{@link AbstractListDecorator}</code>.
 *
 * @generatedBy CodePro at 10/23/15 2:01 PM
 * @author Nikhil
 * @version $Revision: 1.0 $
 */
public class AbstractListDecoratorTest {
	/**
	 * Run the void add(int,E) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testAdd_1()
		throws Exception {
		AbstractListDecorator fixture = new GrowthList();
		int index = 1;

		fixture.add(index, null);

		// add additional test code here
	}

	/**
	 * Run the boolean addAll(int,Collection<? extends E>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testAddAll_1()
		throws Exception {
		AbstractListDecorator fixture = new GrowthList();
		int index = 1;
		Collection<? extends Object> coll = new GrowthList();

		boolean result = fixture.addAll(index, coll);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean addAll(int,Collection<? extends E>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testAddAll_2()
		throws Exception {
		AbstractListDecorator fixture = new GrowthList();
		int index = 1;
		Collection<? extends Object> coll = new GrowthList();

		boolean result = fixture.addAll(index, coll);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the List<Object> decorated() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testDecorated_1()
		throws Exception {
		AbstractListDecorator fixture = new GrowthList();

		List<Object> result = fixture.decorated();

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
		AbstractListDecorator fixture = new GrowthList();
		Object object = new GrowthList();

		boolean result = fixture.equals(object);

		// add additional test code here
		assertEquals(true, result);
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
		AbstractListDecorator fixture = new GrowthList();
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
		AbstractListDecorator fixture = new GrowthList();
		Object object = new Object();

		boolean result = fixture.equals(object);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the Object get(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testGet_1()
		throws Exception {
		AbstractListDecorator fixture = new GrowthList();
		int index = 1;

		Object result = fixture.get(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 1, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at org.apache.commons.collections4.list.AbstractListDecorator.get(AbstractListDecorator.java:89)
		assertNotNull(result);
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
		AbstractListDecorator fixture = new GrowthList();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int indexOf(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testIndexOf_1()
		throws Exception {
		AbstractListDecorator fixture = new GrowthList();
		Object object = new Object();

		int result = fixture.indexOf(object);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int lastIndexOf(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testLastIndexOf_1()
		throws Exception {
		AbstractListDecorator fixture = new GrowthList();
		Object object = new Object();

		int result = fixture.lastIndexOf(object);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the ListIterator<Object> listIterator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testListIterator_1()
		throws Exception {
		AbstractListDecorator fixture = new GrowthList();

		ListIterator<Object> result = fixture.listIterator();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.hasNext());
		assertEquals(false, result.hasPrevious());
		assertEquals(0, result.nextIndex());
		assertEquals(-1, result.previousIndex());
	}

	/**
	 * Run the ListIterator<Object> listIterator(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testListIterator_2()
		throws Exception {
		AbstractListDecorator fixture = new GrowthList();
		int index = 1;

		ListIterator<Object> result = fixture.listIterator(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 1
		//       at java.util.ArrayList.listIterator(Unknown Source)
		//       at org.apache.commons.collections4.list.AbstractListDecorator.listIterator(AbstractListDecorator.java:105)
		assertNotNull(result);
	}

	/**
	 * Run the Object remove(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testRemove_1()
		throws Exception {
		AbstractListDecorator fixture = new GrowthList();
		int index = 1;

		Object result = fixture.remove(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 1, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.remove(Unknown Source)
		//       at org.apache.commons.collections4.list.AbstractListDecorator.remove(AbstractListDecorator.java:109)
		assertNotNull(result);
	}

	/**
	 * Run the Object set(int,E) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testSet_1()
		throws Exception {
		AbstractListDecorator fixture = new GrowthList();
		int index = 1;

		Object result = fixture.set(index, null);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<Object> subList(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testSubList_1()
		throws Exception {
		AbstractListDecorator fixture = new GrowthList();
		int fromIndex = 1;
		int toIndex = 1;

		List<Object> result = fixture.subList(fromIndex, toIndex);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: toIndex = 1
		//       at java.util.ArrayList.subListRangeCheck(Unknown Source)
		//       at java.util.ArrayList.subList(Unknown Source)
		//       at org.apache.commons.collections4.list.AbstractListDecorator.subList(AbstractListDecorator.java:117)
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(AbstractListDecoratorTest.class);
	}
}
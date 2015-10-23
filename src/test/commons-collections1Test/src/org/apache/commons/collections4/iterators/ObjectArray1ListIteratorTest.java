package org.apache.commons.collections4.iterators;

import java.util.NoSuchElementException;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ObjectArrayListIteratorTest</code> contains tests for the class <code>{@link ObjectArrayListIterator}</code>.
 *
 * @generatedBy CodePro at 10/23/15 2:01 PM
 * @author Nikhil
 * @version $Revision: 1.0 $
 */
public class ObjectArray1ListIteratorTest {
	/**
	 * Run the ObjectArrayListIterator(E[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testObjectArrayListIterator_1()
		throws Exception {

		ObjectArrayListIterator result = new ObjectArrayListIterator();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.hasPrevious());
		assertEquals(0, result.nextIndex());
		assertEquals(-1, result.previousIndex());
		assertEquals(false, result.hasNext());
		assertEquals(0, result.getEndIndex());
		assertEquals(0, result.getStartIndex());
	}

	/**
	 * Run the ObjectArrayListIterator(E[],int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testObjectArrayListIterator_2()
		throws Exception {
		int start = 1;

		ObjectArrayListIterator result = new ObjectArrayListIterator(new Object[] {}, start);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: Start index must not be greater than the array length
		//       at org.apache.commons.collections4.iterators.ObjectArrayIterator.<init>(ObjectArrayIterator.java:91)
		//       at org.apache.commons.collections4.iterators.ObjectArrayIterator.<init>(ObjectArrayIterator.java:68)
		//       at org.apache.commons.collections4.iterators.ObjectArrayListIterator.<init>(ObjectArrayListIterator.java:72)
		assertNotNull(result);
	}

	/**
	 * Run the ObjectArrayListIterator(E[],int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testObjectArrayListIterator_3()
		throws Exception {
		int start = 1;
		int end = 1;

		ObjectArrayListIterator result = new ObjectArrayListIterator(new Object[] {}, start, end);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: End index must not be greater than the array length
		//       at org.apache.commons.collections4.iterators.ObjectArrayIterator.<init>(ObjectArrayIterator.java:88)
		//       at org.apache.commons.collections4.iterators.ObjectArrayListIterator.<init>(ObjectArrayListIterator.java:87)
		assertNotNull(result);
	}

	/**
	 * Run the void add(E) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test(expected = java.lang.UnsupportedOperationException.class)
	public void testAdd_1()
		throws Exception {
		ObjectArrayListIterator fixture = new ObjectArrayListIterator(new Object[] {});
		fixture.index = 1;

		fixture.add(null);

		// add additional test code here
	}

	/**
	 * Run the boolean hasPrevious() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testHasPrevious_1()
		throws Exception {
		ObjectArrayListIterator fixture = new ObjectArrayListIterator(new Object[] {});
		fixture.index = 1;

		boolean result = fixture.hasPrevious();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean hasPrevious() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testHasPrevious_2()
		throws Exception {
		ObjectArrayListIterator fixture = new ObjectArrayListIterator(new Object[] {});
		fixture.index = 1;

		boolean result = fixture.hasPrevious();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the Object next() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testNext_1()
		throws Exception {
		ObjectArrayListIterator fixture = new ObjectArrayListIterator(new Object[] {});
		fixture.index = 1;

		Object result = fixture.next();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.NoSuchElementException
		//       at org.apache.commons.collections4.iterators.ObjectArrayListIterator.next(ObjectArrayListIterator.java:125)
		assertNotNull(result);
	}

	/**
	 * Run the Object next() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test(expected = java.util.NoSuchElementException.class)
	public void testNext_2()
		throws Exception {
		ObjectArrayListIterator fixture = new ObjectArrayListIterator(new Object[] {});
		fixture.index = 1;

		Object result = fixture.next();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int nextIndex() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testNextIndex_1()
		throws Exception {
		ObjectArrayListIterator fixture = new ObjectArrayListIterator(new Object[] {});
		fixture.index = 1;

		int result = fixture.nextIndex();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the Object previous() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testPrevious_1()
		throws Exception {
		ObjectArrayListIterator fixture = new ObjectArrayListIterator(new Object[] {});
		fixture.index = 1;

		Object result = fixture.previous();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at org.apache.commons.collections4.iterators.ObjectArrayListIterator.previous(ObjectArrayListIterator.java:113)
		assertNotNull(result);
	}

	/**
	 * Run the Object previous() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testPrevious_2()
		throws Exception {
		ObjectArrayListIterator fixture = new ObjectArrayListIterator(new Object[] {});
		fixture.index = 1;

		Object result = fixture.previous();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at org.apache.commons.collections4.iterators.ObjectArrayListIterator.previous(ObjectArrayListIterator.java:113)
		assertNotNull(result);
	}

	/**
	 * Run the int previousIndex() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testPreviousIndex_1()
		throws Exception {
		ObjectArrayListIterator fixture = new ObjectArrayListIterator(new Object[] {});
		fixture.index = 1;

		int result = fixture.previousIndex();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the void reset() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testReset_1()
		throws Exception {
		ObjectArrayListIterator fixture = new ObjectArrayListIterator(new Object[] {});
		fixture.index = 1;

		fixture.reset();

		// add additional test code here
	}

	/**
	 * Run the void set(E) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testSet_1()
		throws Exception {
		ObjectArrayListIterator fixture = new ObjectArrayListIterator(new Object[] {});
		fixture.index = 1;

		fixture.set(null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: must call next() or previous() before a call to set()
		//       at org.apache.commons.collections4.iterators.ObjectArrayListIterator.set(ObjectArrayListIterator.java:179)
	}

	/**
	 * Run the void set(E) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testSet_2()
		throws Exception {
		ObjectArrayListIterator fixture = new ObjectArrayListIterator(new Object[] {});
		fixture.index = 1;

		fixture.set(null);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(ObjectArray1ListIteratorTest.class);
	}
}
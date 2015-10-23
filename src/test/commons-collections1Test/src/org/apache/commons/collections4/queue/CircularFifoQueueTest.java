package org.apache.commons.collections4.queue;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.apache.commons.collections4.list.GrowthList;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>CircularFifoQueueTest</code> contains tests for the class <code>{@link CircularFifoQueue}</code>.
 *
 * @generatedBy CodePro at 10/23/15 2:18 PM
 * @author Nikhil
 * @version $Revision: 1.0 $
 */
public class CircularFifoQueueTest {
	/**
	 * Run the CircularFifoQueue() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testCircularFifoQueue_1()
		throws Exception {

		CircularFifoQueue result = new CircularFifoQueue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the CircularFifoQueue(int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testCircularFifoQueue_2()
		throws Exception {
		int size = 1;

		CircularFifoQueue result = new CircularFifoQueue(size);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the CircularFifoQueue(int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testCircularFifoQueue_3()
		throws Exception {
		int size = 0;

		CircularFifoQueue result = new CircularFifoQueue(size);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CircularFifoQueue(Collection<? extends E>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testCircularFifoQueue_4()
		throws Exception {
		Collection<? extends Object> coll = new GrowthList();

		CircularFifoQueue result = new CircularFifoQueue(coll);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: The size must be greater than 0
		//       at org.apache.commons.collections4.queue.CircularFifoQueue.<init>(CircularFifoQueue.java:92)
		//       at org.apache.commons.collections4.queue.CircularFifoQueue.<init>(CircularFifoQueue.java:106)
		assertNotNull(result);
	}

	/**
	 * Run the boolean add(E) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testAdd_1()
		throws Exception {
		CircularFifoQueue fixture = new CircularFifoQueue();

		boolean result = fixture.add(null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException: Attempted to add null object to queue
		//       at org.apache.commons.collections4.queue.CircularFifoQueue.add(CircularFifoQueue.java:234)
		assertTrue(result);
	}

	/**
	 * Run the boolean add(E) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testAdd_2()
		throws Exception {
		CircularFifoQueue fixture = new CircularFifoQueue();

		boolean result = fixture.add(null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException: Attempted to add null object to queue
		//       at org.apache.commons.collections4.queue.CircularFifoQueue.add(CircularFifoQueue.java:234)
		assertTrue(result);
	}

	/**
	 * Run the boolean add(E) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testAdd_3()
		throws Exception {
		CircularFifoQueue fixture = new CircularFifoQueue();

		boolean result = fixture.add(null);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the void clear() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testClear_1()
		throws Exception {
		CircularFifoQueue fixture = new CircularFifoQueue();

		fixture.clear();

		// add additional test code here
	}

	/**
	 * Run the Object element() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testElement_1()
		throws Exception {
		CircularFifoQueue fixture = new CircularFifoQueue();

		Object result = fixture.element();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.NoSuchElementException: queue is empty
		//       at org.apache.commons.collections4.queue.CircularFifoQueue.element(CircularFifoQueue.java:296)
		assertNotNull(result);
	}

	/**
	 * Run the Object element() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test(expected = java.util.NoSuchElementException.class)
	public void testElement_2()
		throws Exception {
		CircularFifoQueue fixture = new CircularFifoQueue();

		Object result = fixture.element();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object get(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testGet_1()
		throws Exception {
		CircularFifoQueue fixture = new CircularFifoQueue();
		int index = 1;

		Object result = fixture.get(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.NoSuchElementException: The specified index (1) is outside the available range [0, 0)
		//       at org.apache.commons.collections4.queue.CircularFifoQueue.get(CircularFifoQueue.java:264)
		assertNotNull(result);
	}

	/**
	 * Run the Object get(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test(expected = java.util.NoSuchElementException.class)
	public void testGet_2()
		throws Exception {
		CircularFifoQueue fixture = new CircularFifoQueue();
		int index = -1;

		Object result = fixture.get(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object get(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test(expected = java.util.NoSuchElementException.class)
	public void testGet_3()
		throws Exception {
		CircularFifoQueue fixture = new CircularFifoQueue();
		int index = 1;

		Object result = fixture.get(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean isAtFullCapacity() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testIsAtFullCapacity_1()
		throws Exception {
		CircularFifoQueue fixture = new CircularFifoQueue();

		boolean result = fixture.isAtFullCapacity();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isAtFullCapacity() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testIsAtFullCapacity_2()
		throws Exception {
		CircularFifoQueue fixture = new CircularFifoQueue();

		boolean result = fixture.isAtFullCapacity();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isEmpty() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testIsEmpty_1()
		throws Exception {
		CircularFifoQueue fixture = new CircularFifoQueue();

		boolean result = fixture.isEmpty();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isEmpty() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testIsEmpty_2()
		throws Exception {
		CircularFifoQueue fixture = new CircularFifoQueue();

		boolean result = fixture.isEmpty();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isFull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testIsFull_1()
		throws Exception {
		CircularFifoQueue fixture = new CircularFifoQueue();

		boolean result = fixture.isFull();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the Iterator<Object> iterator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testIterator_1()
		throws Exception {
		CircularFifoQueue fixture = new CircularFifoQueue();

		Iterator<Object> result = fixture.iterator();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.hasNext());
	}

	/**
	 * Run the int maxSize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testMaxSize_1()
		throws Exception {
		CircularFifoQueue fixture = new CircularFifoQueue();

		int result = fixture.maxSize();

		// add additional test code here
		assertEquals(32, result);
	}

	/**
	 * Run the boolean offer(E) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testOffer_1()
		throws Exception {
		CircularFifoQueue fixture = new CircularFifoQueue();

		boolean result = fixture.offer(null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException: Attempted to add null object to queue
		//       at org.apache.commons.collections4.queue.CircularFifoQueue.add(CircularFifoQueue.java:234)
		//       at org.apache.commons.collections4.queue.CircularFifoQueue.offer(CircularFifoQueue.java:284)
		assertTrue(result);
	}

	/**
	 * Run the boolean offer(E) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testOffer_2()
		throws Exception {
		CircularFifoQueue fixture = new CircularFifoQueue();

		boolean result = fixture.offer(null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException: Attempted to add null object to queue
		//       at org.apache.commons.collections4.queue.CircularFifoQueue.add(CircularFifoQueue.java:234)
		//       at org.apache.commons.collections4.queue.CircularFifoQueue.offer(CircularFifoQueue.java:284)
		assertTrue(result);
	}

	/**
	 * Run the Object peek() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testPeek_1()
		throws Exception {
		CircularFifoQueue fixture = new CircularFifoQueue();

		Object result = fixture.peek();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object peek() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testPeek_2()
		throws Exception {
		CircularFifoQueue fixture = new CircularFifoQueue();

		Object result = fixture.peek();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object poll() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testPoll_1()
		throws Exception {
		CircularFifoQueue fixture = new CircularFifoQueue();

		Object result = fixture.poll();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object poll() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testPoll_2()
		throws Exception {
		CircularFifoQueue fixture = new CircularFifoQueue();

		Object result = fixture.poll();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object remove() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testRemove_1()
		throws Exception {
		CircularFifoQueue fixture = new CircularFifoQueue();

		Object result = fixture.remove();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.NoSuchElementException: queue is empty
		//       at org.apache.commons.collections4.queue.CircularFifoQueue.remove(CircularFifoQueue.java:310)
		assertNotNull(result);
	}

	/**
	 * Run the Object remove() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testRemove_2()
		throws Exception {
		CircularFifoQueue fixture = new CircularFifoQueue();

		Object result = fixture.remove();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.NoSuchElementException: queue is empty
		//       at org.apache.commons.collections4.queue.CircularFifoQueue.remove(CircularFifoQueue.java:310)
		assertNotNull(result);
	}

	/**
	 * Run the Object remove() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testRemove_3()
		throws Exception {
		CircularFifoQueue fixture = new CircularFifoQueue();

		Object result = fixture.remove();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.NoSuchElementException: queue is empty
		//       at org.apache.commons.collections4.queue.CircularFifoQueue.remove(CircularFifoQueue.java:310)
		assertNotNull(result);
	}

	/**
	 * Run the Object remove() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test(expected = java.util.NoSuchElementException.class)
	public void testRemove_4()
		throws Exception {
		CircularFifoQueue fixture = new CircularFifoQueue();

		Object result = fixture.remove();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int size() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testSize_1()
		throws Exception {
		CircularFifoQueue fixture = new CircularFifoQueue();

		int result = fixture.size();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int size() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testSize_2()
		throws Exception {
		CircularFifoQueue fixture = new CircularFifoQueue();

		int result = fixture.size();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int size() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testSize_3()
		throws Exception {
		CircularFifoQueue fixture = new CircularFifoQueue();

		int result = fixture.size();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int size() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testSize_4()
		throws Exception {
		CircularFifoQueue fixture = new CircularFifoQueue();

		int result = fixture.size();

		// add additional test code here
		assertEquals(0, result);
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
		new org.junit.runner.JUnitCore().run(CircularFifoQueueTest.class);
	}
}
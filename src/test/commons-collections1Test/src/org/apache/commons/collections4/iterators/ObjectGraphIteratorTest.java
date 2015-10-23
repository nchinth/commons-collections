package org.apache.commons.collections4.iterators;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.functors.ChainedTransformer;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ObjectGraphIteratorTest</code> contains tests for the class <code>{@link ObjectGraphIterator}</code>.
 *
 * @generatedBy CodePro at 10/23/15 2:02 PM
 * @author Nikhil
 * @version $Revision: 1.0 $
 */
public class ObjectGraphIteratorTest {
	/**
	 * Run the ObjectGraphIterator(Iterator<? extends E>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testObjectGraphIterator_1()
		throws Exception {
		Iterator<? extends Object> rootIterator = new CollatingIterator();

		ObjectGraphIterator result = new ObjectGraphIterator(rootIterator);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.hasNext());
	}

	/**
	 * Run the ObjectGraphIterator(E,Transformer<? super E,? extends E>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testObjectGraphIterator_2()
		throws Exception {
		Transformer<? extends Object, ? extends Object> transformer = new ChainedTransformer(new Transformer[] {});

		ObjectGraphIterator result = new ObjectGraphIterator(null, transformer);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.hasNext());
	}

	/**
	 * Run the ObjectGraphIterator(E,Transformer<? super E,? extends E>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testObjectGraphIterator_3()
		throws Exception {
		Transformer<? extends Object, ? extends Object> transformer = new ChainedTransformer(new Transformer[] {});

		ObjectGraphIterator result = new ObjectGraphIterator(null, transformer);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.hasNext());
	}

	/**
	 * Run the void findNext(E) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testFindNext_1()
		throws Exception {
		ObjectGraphIterator fixture = new ObjectGraphIterator(new CollatingIterator());

		fixture.findNext(null);

		// add additional test code here
	}

	/**
	 * Run the void findNext(E) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testFindNext_2()
		throws Exception {
		ObjectGraphIterator fixture = new ObjectGraphIterator(new CollatingIterator());

		fixture.findNext(null);

		// add additional test code here
	}

	/**
	 * Run the void findNextByIterator(Iterator<? extends E>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testFindNextByIterator_1()
		throws Exception {
		ObjectGraphIterator fixture = new ObjectGraphIterator(new CollatingIterator());
		Iterator<? extends Object> iterator = new CollatingIterator();

		fixture.findNextByIterator(iterator);

		// add additional test code here
	}

	/**
	 * Run the void findNextByIterator(Iterator<? extends E>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testFindNextByIterator_2()
		throws Exception {
		ObjectGraphIterator fixture = new ObjectGraphIterator((Iterator<? extends Object>) null);
		Iterator<? extends Object> iterator = new CollatingIterator();

		fixture.findNextByIterator(iterator);

		// add additional test code here
	}

	/**
	 * Run the void findNextByIterator(Iterator<? extends E>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testFindNextByIterator_3()
		throws Exception {
		ObjectGraphIterator fixture = new ObjectGraphIterator(new CollatingIterator());
		Iterator<? extends Object> iterator = new CollatingIterator();

		fixture.findNextByIterator(iterator);

		// add additional test code here
	}

	/**
	 * Run the void findNextByIterator(Iterator<? extends E>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testFindNextByIterator_4()
		throws Exception {
		ObjectGraphIterator fixture = new ObjectGraphIterator(new CollatingIterator());
		Iterator<? extends Object> iterator = new CollatingIterator();

		fixture.findNextByIterator(iterator);

		// add additional test code here
	}

	/**
	 * Run the void findNextByIterator(Iterator<? extends E>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testFindNextByIterator_5()
		throws Exception {
		ObjectGraphIterator fixture = new ObjectGraphIterator((Iterator<? extends Object>) null);
		Iterator<? extends Object> iterator = new CollatingIterator();

		fixture.findNextByIterator(iterator);

		// add additional test code here
	}

	/**
	 * Run the void findNextByIterator(Iterator<? extends E>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testFindNextByIterator_6()
		throws Exception {
		ObjectGraphIterator fixture = new ObjectGraphIterator(new CollatingIterator());
		Iterator<? extends Object> iterator = new CollatingIterator();

		fixture.findNextByIterator(iterator);

		// add additional test code here
	}

	/**
	 * Run the boolean hasNext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testHasNext_1()
		throws Exception {
		ObjectGraphIterator fixture = new ObjectGraphIterator(new CollatingIterator());

		boolean result = fixture.hasNext();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasNext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testHasNext_2()
		throws Exception {
		ObjectGraphIterator fixture = new ObjectGraphIterator(new CollatingIterator());

		boolean result = fixture.hasNext();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the Object next() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testNext_1()
		throws Exception {
		ObjectGraphIterator fixture = new ObjectGraphIterator(new CollatingIterator());

		Object result = fixture.next();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.NoSuchElementException: No more elements in the iteration
		//       at org.apache.commons.collections4.iterators.ObjectGraphIterator.next(ObjectGraphIterator.java:222)
		assertNotNull(result);
	}

	/**
	 * Run the Object next() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test(expected = java.util.NoSuchElementException.class)
	public void testNext_2()
		throws Exception {
		ObjectGraphIterator fixture = new ObjectGraphIterator(new CollatingIterator());

		Object result = fixture.next();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void remove() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testRemove_1()
		throws Exception {
		ObjectGraphIterator fixture = new ObjectGraphIterator(new CollatingIterator());

		fixture.remove();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Iterator remove() cannot be called at this time
		//       at org.apache.commons.collections4.iterators.ObjectGraphIterator.remove(ObjectGraphIterator.java:246)
	}

	/**
	 * Run the void remove() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testRemove_2()
		throws Exception {
		ObjectGraphIterator fixture = new ObjectGraphIterator(new CollatingIterator());

		fixture.remove();

		// add additional test code here
	}

	/**
	 * Run the void updateCurrentIterator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testUpdateCurrentIterator_1()
		throws Exception {
		ObjectGraphIterator fixture = new ObjectGraphIterator(new CollatingIterator());

		fixture.updateCurrentIterator();

		// add additional test code here
	}

	/**
	 * Run the void updateCurrentIterator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testUpdateCurrentIterator_2()
		throws Exception {
		ObjectGraphIterator fixture = new ObjectGraphIterator(new CollatingIterator());

		fixture.updateCurrentIterator();

		// add additional test code here
	}

	/**
	 * Run the void updateCurrentIterator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testUpdateCurrentIterator_3()
		throws Exception {
		ObjectGraphIterator fixture = new ObjectGraphIterator((Iterator<? extends Object>) null);

		fixture.updateCurrentIterator();

		// add additional test code here
	}

	/**
	 * Run the void updateCurrentIterator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testUpdateCurrentIterator_4()
		throws Exception {
		ObjectGraphIterator fixture = new ObjectGraphIterator((Iterator<? extends Object>) null);

		fixture.updateCurrentIterator();

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(ObjectGraphIteratorTest.class);
	}
}
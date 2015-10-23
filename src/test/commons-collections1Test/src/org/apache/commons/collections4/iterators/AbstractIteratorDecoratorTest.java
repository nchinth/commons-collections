package org.apache.commons.collections4.iterators;

import java.util.Iterator;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AbstractIteratorDecoratorTest</code> contains tests for the class <code>{@link AbstractIteratorDecorator}</code>.
 *
 * @generatedBy CodePro at 10/23/15 2:02 PM
 * @author Nikhil
 * @version $Revision: 1.0 $
 */
public class AbstractIteratorDecoratorTest {
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
		AbstractIteratorDecorator fixture = new SkippingIterator(new CollatingIterator(), 1L);

		Object result = fixture.next();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.NoSuchElementException
		//       at org.apache.commons.collections4.iterators.CollatingIterator.next(CollatingIterator.java:243)
		//       at org.apache.commons.collections4.iterators.AbstractIteratorDecorator.next(AbstractIteratorDecorator.java:44)
		//       at org.apache.commons.collections4.iterators.SkippingIterator.next(SkippingIterator.java:75)
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
		new org.junit.runner.JUnitCore().run(AbstractIteratorDecoratorTest.class);
	}
}
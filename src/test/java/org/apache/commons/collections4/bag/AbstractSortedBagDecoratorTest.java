package org.apache.commons.collections4.bag;

import java.util.Comparator;
import org.apache.commons.collections4.SortedBag;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AbstractSortedBagDecoratorTest</code> contains tests for the class <code>{@link AbstractSortedBagDecorator}</code>.
 *
 * @generatedBy CodePro at 10/23/15 2:02 PM
 * @author Nikhil
 * @version $Revision: 1.0 $
 */
public class AbstractSortedBagDecoratorTest {
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
		AbstractSortedBagDecorator fixture = new CollectionSortedBag(new TreeBag());

		Comparator<? extends Object> result = fixture.comparator();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the SortedBag<Object> decorated() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testDecorated_1()
		throws Exception {
		AbstractSortedBagDecorator fixture = new CollectionSortedBag(new TreeBag());

		SortedBag<Object> result = fixture.decorated();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
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
		AbstractSortedBagDecorator fixture = new CollectionSortedBag(new TreeBag());

		Object result = fixture.first();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.NoSuchElementException
		//       at java.util.TreeMap.key(Unknown Source)
		//       at java.util.TreeMap.firstKey(Unknown Source)
		//       at org.apache.commons.collections4.bag.TreeBag.first(TreeBag.java:102)
		//       at org.apache.commons.collections4.bag.AbstractSortedBagDecorator.first(AbstractSortedBagDecorator.java:69)
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
		AbstractSortedBagDecorator fixture = new CollectionSortedBag(new TreeBag());

		Object result = fixture.last();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.NoSuchElementException
		//       at java.util.TreeMap.key(Unknown Source)
		//       at java.util.TreeMap.lastKey(Unknown Source)
		//       at org.apache.commons.collections4.bag.TreeBag.last(TreeBag.java:107)
		//       at org.apache.commons.collections4.bag.AbstractSortedBagDecorator.last(AbstractSortedBagDecorator.java:74)
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
		new org.junit.runner.JUnitCore().run(AbstractSortedBagDecoratorTest.class);
	}
}
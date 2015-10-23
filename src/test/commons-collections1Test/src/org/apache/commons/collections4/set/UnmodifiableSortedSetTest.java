package org.apache.commons.collections4.set;

import java.util.Collection;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.functors.ChainedTransformer;
import org.apache.commons.collections4.functors.UniquePredicate;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>UnmodifiableSortedSetTest</code> contains tests for the class <code>{@link UnmodifiableSortedSet}</code>.
 *
 * @generatedBy CodePro at 10/23/15 2:01 PM
 * @author Nikhil
 * @version $Revision: 1.0 $
 */
public class UnmodifiableSortedSetTest {
	/**
	 * Run the SortedSet<Object> unmodifiableSortedSet(SortedSet<E>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testUnmodifiableSortedSet_1()
		throws Exception {
		SortedSet<Object> set = new PredicatedSortedSet(new PredicatedNavigableSet(new TransformedNavigableSet((NavigableSet<Object>) null, new ChainedTransformer(new Transformer[] {})), new UniquePredicate()), new UniquePredicate());

		SortedSet<Object> result = UnmodifiableSortedSet.unmodifiableSortedSet(set);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException: Collection must not be null.
		//       at org.apache.commons.collections4.collection.AbstractCollectionDecorator.<init>(AbstractCollectionDecorator.java:80)
		//       at org.apache.commons.collections4.collection.TransformedCollection.<init>(TransformedCollection.java:109)
		//       at org.apache.commons.collections4.set.TransformedSet.<init>(TransformedSet.java:101)
		//       at org.apache.commons.collections4.set.TransformedSortedSet.<init>(TransformedSortedSet.java:103)
		//       at org.apache.commons.collections4.set.TransformedNavigableSet.<init>(TransformedNavigableSet.java:100)
		assertNotNull(result);
	}

	/**
	 * Run the SortedSet<Object> unmodifiableSortedSet(SortedSet<E>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testUnmodifiableSortedSet_2()
		throws Exception {
		SortedSet<Object> set = new PredicatedSortedSet(new PredicatedNavigableSet(new TransformedNavigableSet((NavigableSet<Object>) null, new ChainedTransformer(new Transformer[] {})), new UniquePredicate()), new UniquePredicate());

		SortedSet<Object> result = UnmodifiableSortedSet.unmodifiableSortedSet(set);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException: Collection must not be null.
		//       at org.apache.commons.collections4.collection.AbstractCollectionDecorator.<init>(AbstractCollectionDecorator.java:80)
		//       at org.apache.commons.collections4.collection.TransformedCollection.<init>(TransformedCollection.java:109)
		//       at org.apache.commons.collections4.set.TransformedSet.<init>(TransformedSet.java:101)
		//       at org.apache.commons.collections4.set.TransformedSortedSet.<init>(TransformedSortedSet.java:103)
		//       at org.apache.commons.collections4.set.TransformedNavigableSet.<init>(TransformedNavigableSet.java:100)
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
		new org.junit.runner.JUnitCore().run(UnmodifiableSortedSetTest.class);
	}
}
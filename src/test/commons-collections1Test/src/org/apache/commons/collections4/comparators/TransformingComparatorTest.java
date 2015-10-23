package org.apache.commons.collections4.comparators;

import java.util.Comparator;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.functors.ChainedTransformer;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TransformingComparatorTest</code> contains tests for the class <code>{@link TransformingComparator}</code>.
 *
 * @generatedBy CodePro at 10/23/15 2:02 PM
 * @author Nikhil
 * @version $Revision: 1.0 $
 */
public class TransformingComparatorTest {
	/**
	 * Run the TransformingComparator(Transformer<? super I,? extends O>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testTransformingComparator_1()
		throws Exception {
		Transformer<? extends Object, ? extends Object> transformer = new ChainedTransformer(new Transformer[] {});

		TransformingComparator result = new TransformingComparator(transformer);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the TransformingComparator(Transformer<? super I,? extends O>,Comparator<O>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
/*	@Test
	public void testTransformingComparator_2()
		throws Exception {
		Transformer<? extends Object, ? extends Object> transformer = new ChainedTransformer(new Transformer[] {});
		Comparator<Object> decorated = new BooleanComparator();

		TransformingComparator result = new TransformingComparator(transformer, decorated);

		// add additional test code here
		assertNotNull(result);
	}*/

	/**
	 * Run the int compare(I,I) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testCompare_1()
		throws Exception {
		TransformingComparator fixture = new TransformingComparator(new ChainedTransformer(new Transformer[] {}), new BooleanComparator());

		int result = fixture.compare(null, null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.commons.collections4.comparators.BooleanComparator.compare(BooleanComparator.java:139)
		//       at org.apache.commons.collections4.comparators.BooleanComparator.compare(BooleanComparator.java:1)
		//       at org.apache.commons.collections4.comparators.TransformingComparator.compare(TransformingComparator.java:84)
		assertEquals(0, result);
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
		TransformingComparator fixture = new TransformingComparator(new ChainedTransformer(new Transformer[] {}), new BooleanComparator());
		Object object = new TransformingComparator(new ChainedTransformer(new Transformer[] {}), new BooleanComparator());

		boolean result = fixture.equals(object);

		// add additional test code here
		assertEquals(false, result);
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
		TransformingComparator fixture = new TransformingComparator(new ChainedTransformer(new Transformer[] {}), new BooleanComparator());
		Object object = null;

		boolean result = fixture.equals(object);

		// add additional test code here
		assertEquals(false, result);
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
		TransformingComparator fixture = new TransformingComparator(new ChainedTransformer(new Transformer[] {}), new BooleanComparator());
		Object object = new Object();

		boolean result = fixture.equals(object);

		// add additional test code here
		assertEquals(false, result);
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
		new org.junit.runner.JUnitCore().run(TransformingComparatorTest.class);
	}
}
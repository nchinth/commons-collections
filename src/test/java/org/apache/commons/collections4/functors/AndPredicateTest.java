package org.apache.commons.collections4.functors;

import org.apache.commons.collections4.Predicate;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AndPredicateTest</code> contains tests for the class <code>{@link AndPredicate}</code>.
 *
 * @generatedBy CodePro at 10/23/15 2:01 PM
 * @author Nikhil
 * @version $Revision: 1.0 $
 */
public class AndPredicateTest {
	/**
	 * Run the AndPredicate(Predicate<? super T>,Predicate<? super T>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testAndPredicate_1()
		throws Exception {
		Predicate<? extends Object> predicate1 = new UniquePredicate();
		Predicate<? extends Object> predicate2 = new UniquePredicate();

		AndPredicate result = new AndPredicate(predicate1, predicate2);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Predicate<Object> andPredicate(Predicate<? super T>,Predicate<? super T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	/*@Test
	public void testAndPredicate_2()
		throws Exception {
		Predicate<? extends Object> predicate1 = new UniquePredicate();
		Predicate<? extends Object> predicate2 = new UniquePredicate();

		Predicate<Object> result = AndPredicate.andPredicate(predicate1, predicate2);

		// add additional test code here
		assertNotNull(result);
	}
*/
	/**
	 * Run the Predicate<Object> andPredicate(Predicate<? super T>,Predicate<? super T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	/*@Test(expected = java.lang.NullPointerException.class)
	public void testAndPredicate_3()
		throws Exception {
		Predicate<? extends Object> predicate1 = null;
		Predicate<? extends Object> predicate2 = new UniquePredicate();

		Predicate<Object> result = AndPredicate.andPredicate(predicate1, predicate2);

		// add additional test code here
		assertNotNull(result);
	}*/

	/**
	 * Run the Predicate<Object> andPredicate(Predicate<? super T>,Predicate<? super T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
/*	@Test(expected = java.lang.NullPointerException.class)
	public void testAndPredicate_4()
		throws Exception {
		Predicate<? extends Object> predicate1 = new UniquePredicate();
		Predicate<? extends Object> predicate2 = null;

		Predicate<Object> result = AndPredicate.andPredicate(predicate1, predicate2);

		// add additional test code here
		assertNotNull(result);
	}
*/
	/**
	 * Run the boolean evaluate(T) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testEvaluate_1()
		throws Exception {
		AndPredicate fixture = new AndPredicate(new UniquePredicate(), new UniquePredicate());

		boolean result = fixture.evaluate(null);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean evaluate(T) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testEvaluate_2()
		throws Exception {
		AndPredicate fixture = new AndPredicate(new UniquePredicate(), new UniquePredicate());

		boolean result = fixture.evaluate(null);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean evaluate(T) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testEvaluate_3()
		throws Exception {
		AndPredicate fixture = new AndPredicate(new UniquePredicate(), new UniquePredicate());

		boolean result = fixture.evaluate(null);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the Predicate<? extends Object>[] getPredicates() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testGetPredicates_1()
		throws Exception {
		AndPredicate fixture = new AndPredicate(new UniquePredicate(), new UniquePredicate());

		Predicate<? extends Object>[] result = fixture.getPredicates();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.length);
		assertNotNull(result[0]);
		assertNotNull(result[1]);
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
		new org.junit.runner.JUnitCore().run(AndPredicateTest.class);
	}
}
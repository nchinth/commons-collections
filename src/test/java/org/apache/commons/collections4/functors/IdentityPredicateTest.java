package org.apache.commons.collections4.functors;

import org.apache.commons.collections4.Predicate;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>IdentityPredicateTest</code> contains tests for the class <code>{@link IdentityPredicate}</code>.
 *
 * @generatedBy CodePro at 10/23/15 2:02 PM
 * @author Nikhil
 * @version $Revision: 1.0 $
 */
public class IdentityPredicateTest {
	/**
	 * Run the IdentityPredicate(T) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testIdentityPredicate_1()
		throws Exception {

		IdentityPredicate result = new IdentityPredicate(null);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getValue());
	}

	/**
	 * Run the boolean evaluate(T) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testEvaluate_1()
		throws Exception {
		IdentityPredicate fixture = new IdentityPredicate((Object) null);

		boolean result = fixture.evaluate(null);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean evaluate(T) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testEvaluate_2()
		throws Exception {
		IdentityPredicate fixture = new IdentityPredicate((Object) null);

		boolean result = fixture.evaluate(null);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the Object getValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testGetValue_1()
		throws Exception {
		IdentityPredicate fixture = new IdentityPredicate((Object) null);

		Object result = fixture.getValue();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Predicate<Object> identityPredicate(T) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testIdentityPredicate_2()
		throws Exception {

		Predicate<Object> result = IdentityPredicate.identityPredicate(null);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Predicate<Object> identityPredicate(T) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testIdentityPredicate_3()
		throws Exception {

		Predicate<Object> result = IdentityPredicate.identityPredicate(null);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(IdentityPredicateTest.class);
	}
}
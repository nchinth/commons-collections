package org.apache.commons.collections4.functors;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DefaultEquatorTest</code> contains tests for the class <code>{@link DefaultEquator}</code>.
 *
 * @generatedBy CodePro at 10/23/15 2:01 PM
 * @author Nikhil
 * @version $Revision: 1.0 $
 */
public class DefaultEquatorTest {
	/**
	 * Run the DefaultEquator<Object> defaultEquator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testDefaultEquator_1()
		throws Exception {

		DefaultEquator<Object> result = DefaultEquator.defaultEquator();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean equate(T,T) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testEquate_1()
		throws Exception {
		DefaultEquator fixture = DefaultEquator.defaultEquator();

		boolean result = fixture.equate(null, null);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equate(T,T) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testEquate_2()
		throws Exception {
		DefaultEquator fixture = DefaultEquator.defaultEquator();

		boolean result = fixture.equate(null, null);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equate(T,T) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testEquate_3()
		throws Exception {
		DefaultEquator fixture = DefaultEquator.defaultEquator();

		boolean result = fixture.equate(null, null);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equate(T,T) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testEquate_4()
		throws Exception {
		DefaultEquator fixture = DefaultEquator.defaultEquator();

		boolean result = fixture.equate(null, null);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the int hash(T) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testHash_1()
		throws Exception {
		DefaultEquator fixture = DefaultEquator.defaultEquator();

		int result = fixture.hash(null);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int hash(T) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testHash_2()
		throws Exception {
		DefaultEquator fixture = DefaultEquator.defaultEquator();

		int result = fixture.hash(null);

		// add additional test code here
		assertEquals(-1, result);
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
		new org.junit.runner.JUnitCore().run(DefaultEquatorTest.class);
	}
}
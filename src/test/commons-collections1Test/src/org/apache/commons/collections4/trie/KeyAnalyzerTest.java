package org.apache.commons.collections4.trie;

import org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>KeyAnalyzerTest</code> contains tests for the class <code>{@link KeyAnalyzer}</code>.
 *
 * @generatedBy CodePro at 10/23/15 2:01 PM
 * @author Nikhil
 * @version $Revision: 1.0 $
 */
public class KeyAnalyzerTest {
	/**
	 * Run the int compare(K,K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testCompare_1()
		throws Exception {
		KeyAnalyzer fixture = new StringKeyAnalyzer();

		int result = fixture.compare(null, null);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int compare(K,K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testCompare_2()
		throws Exception {
		KeyAnalyzer fixture = new StringKeyAnalyzer();

		int result = fixture.compare(null, null);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int compare(K,K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testCompare_3()
		throws Exception {
		KeyAnalyzer fixture = new StringKeyAnalyzer();

		int result = fixture.compare(null, null);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int compare(K,K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testCompare_4()
		throws Exception {
		KeyAnalyzer fixture = new StringKeyAnalyzer();

		int result = fixture.compare(null, null);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the boolean isEqualBitKey(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testIsEqualBitKey_1()
		throws Exception {
		int bitIndex = -2;

		boolean result = KeyAnalyzer.isEqualBitKey(bitIndex);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isEqualBitKey(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testIsEqualBitKey_2()
		throws Exception {
		int bitIndex = 1;

		boolean result = KeyAnalyzer.isEqualBitKey(bitIndex);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isNullBitKey(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testIsNullBitKey_1()
		throws Exception {
		int bitIndex = -1;

		boolean result = KeyAnalyzer.isNullBitKey(bitIndex);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isNullBitKey(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testIsNullBitKey_2()
		throws Exception {
		int bitIndex = 1;

		boolean result = KeyAnalyzer.isNullBitKey(bitIndex);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isOutOfBoundsIndex(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testIsOutOfBoundsIndex_1()
		throws Exception {
		int bitIndex = -3;

		boolean result = KeyAnalyzer.isOutOfBoundsIndex(bitIndex);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isOutOfBoundsIndex(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testIsOutOfBoundsIndex_2()
		throws Exception {
		int bitIndex = 1;

		boolean result = KeyAnalyzer.isOutOfBoundsIndex(bitIndex);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isValidBitIndex(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testIsValidBitIndex_1()
		throws Exception {
		int bitIndex = 1;

		boolean result = KeyAnalyzer.isValidBitIndex(bitIndex);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isValidBitIndex(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testIsValidBitIndex_2()
		throws Exception {
		int bitIndex = -1;

		boolean result = KeyAnalyzer.isValidBitIndex(bitIndex);

		// add additional test code here
		assertEquals(false, result);
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
		new org.junit.runner.JUnitCore().run(KeyAnalyzerTest.class);
	}
}
package org.apache.commons.collections4.trie.analyzer;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>StringKeyAnalyzerTest</code> contains tests for the class <code>{@link StringKeyAnalyzer}</code>.
 *
 * @generatedBy CodePro at 10/23/15 2:02 PM
 * @author Nikhil
 * @version $Revision: 1.0 $
 */
public class StringKeyAnalyzerTest {
	/**
	 * Run the StringKeyAnalyzer() constructor test.
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testStringKeyAnalyzer_1()
		throws Exception {
		StringKeyAnalyzer result = new StringKeyAnalyzer();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the int bitsPerElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testBitsPerElement_1()
		throws Exception {
		StringKeyAnalyzer fixture = new StringKeyAnalyzer();

		int result = fixture.bitsPerElement();

		// add additional test code here
		assertEquals(16, result);
	}

	/**
	 * Run the boolean isBitSet(String,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testIsBitSet_1()
		throws Exception {
		StringKeyAnalyzer fixture = new StringKeyAnalyzer();
		String key = null;
		int bitIndex = 1;
		int lengthInBits = 1;

		boolean result = fixture.isBitSet(key, bitIndex, lengthInBits);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isBitSet(String,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testIsBitSet_2()
		throws Exception {
		StringKeyAnalyzer fixture = new StringKeyAnalyzer();
		String key = "";
		int bitIndex = 1;
		int lengthInBits = 1;

		boolean result = fixture.isBitSet(key, bitIndex, lengthInBits);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isBitSet(String,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testIsBitSet_3()
		throws Exception {
		StringKeyAnalyzer fixture = new StringKeyAnalyzer();
		String key = "aa";
		int bitIndex = 1;
		int lengthInBits = 1;

		boolean result = fixture.isBitSet(key, bitIndex, lengthInBits);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isBitSet(String,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testIsBitSet_4()
		throws Exception {
		StringKeyAnalyzer fixture = new StringKeyAnalyzer();
		String key = "aa";
		int bitIndex = 1;
		int lengthInBits = 1;

		boolean result = fixture.isBitSet(key, bitIndex, lengthInBits);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isPrefix(String,int,int,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testIsPrefix_1()
		throws Exception {
		StringKeyAnalyzer fixture = new StringKeyAnalyzer();
		String prefix = "";
		int offsetInBits = 1;
		int lengthInBits = 1;
		String key = "";

		boolean result = fixture.isPrefix(prefix, offsetInBits, lengthInBits, key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Cannot determine prefix outside of Character boundaries
		//       at org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer.isPrefix(StringKeyAnalyzer.java:129)
		assertTrue(result);
	}

	/**
	 * Run the boolean isPrefix(String,int,int,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testIsPrefix_2()
		throws Exception {
		StringKeyAnalyzer fixture = new StringKeyAnalyzer();
		String prefix = "";
		int offsetInBits = 1;
		int lengthInBits = 1;
		String key = "";

		boolean result = fixture.isPrefix(prefix, offsetInBits, lengthInBits, key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Cannot determine prefix outside of Character boundaries
		//       at org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer.isPrefix(StringKeyAnalyzer.java:129)
		assertTrue(result);
	}

	/**
	 * Run the boolean isPrefix(String,int,int,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testIsPrefix_3()
		throws Exception {
		StringKeyAnalyzer fixture = new StringKeyAnalyzer();
		String prefix = "";
		int offsetInBits = 1;
		int lengthInBits = 1;
		String key = "";

		boolean result = fixture.isPrefix(prefix, offsetInBits, lengthInBits, key);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isPrefix(String,int,int,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testIsPrefix_4()
		throws Exception {
		StringKeyAnalyzer fixture = new StringKeyAnalyzer();
		String prefix = "";
		int offsetInBits = 1;
		int lengthInBits = 1;
		String key = "";

		boolean result = fixture.isPrefix(prefix, offsetInBits, lengthInBits, key);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the int lengthInBits(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testLengthInBits_1()
		throws Exception {
		StringKeyAnalyzer fixture = new StringKeyAnalyzer();
		String key = null;

		int result = fixture.lengthInBits(key);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int lengthInBits(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testLengthInBits_2()
		throws Exception {
		StringKeyAnalyzer fixture = new StringKeyAnalyzer();
		String key = "";

		int result = fixture.lengthInBits(key);

		// add additional test code here
		assertEquals(0, result);
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
		new org.junit.runner.JUnitCore().run(StringKeyAnalyzerTest.class);
	}
}
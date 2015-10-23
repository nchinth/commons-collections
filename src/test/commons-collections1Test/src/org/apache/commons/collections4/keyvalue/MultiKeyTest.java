package org.apache.commons.collections4.keyvalue;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>MultiKeyTest</code> contains tests for the class <code>{@link MultiKey}</code>.
 *
 * @generatedBy CodePro at 10/23/15 2:01 PM
 * @author Nikhil
 * @version $Revision: 1.0 $
 */
public class MultiKeyTest {
	/**
	 * Run the MultiKey(K[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testMultiKey_1()
		throws Exception {

		MultiKey result = new MultiKey(new Object[] {});

		// add additional test code here
		assertNotNull(result);
		assertEquals("MultiKey[]", result.toString());
		assertEquals(0, result.size());
	}

	/**
	 * Run the MultiKey(K,K) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testMultiKey_2()
		throws Exception {

		MultiKey result = new MultiKey(null, null);

		// add additional test code here
		assertNotNull(result);
		assertEquals("MultiKey[null, null]", result.toString());
		assertEquals(2, result.size());
	}

	/**
	 * Run the MultiKey(K[],boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testMultiKey_3()
		throws Exception {
		boolean makeClone = true;

		MultiKey result = new MultiKey(new Object[] {}, makeClone);

		// add additional test code here
		assertNotNull(result);
		assertEquals("MultiKey[]", result.toString());
		assertEquals(0, result.size());
	}

	/**
	 * Run the MultiKey(K[],boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testMultiKey_4()
		throws Exception {
		boolean makeClone = false;

		MultiKey result = new MultiKey(new Object[] {}, makeClone);

		// add additional test code here
		assertNotNull(result);
		assertEquals("MultiKey[]", result.toString());
		assertEquals(0, result.size());
	}

	/**
	 * Run the MultiKey(K[],boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testMultiKey_5()
		throws Exception {
		boolean makeClone = true;

		MultiKey result = new MultiKey(new Object[] {}, makeClone);

		// add additional test code here
		assertNotNull(result);
		assertEquals("MultiKey[]", result.toString());
		assertEquals(0, result.size());
	}

	/**
	 * Run the MultiKey(K,K,K) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testMultiKey_6()
		throws Exception {

		MultiKey result = new MultiKey(null, null, null);

		// add additional test code here
		assertNotNull(result);
		assertEquals("MultiKey[null, null, null]", result.toString());
		assertEquals(3, result.size());
	}

	/**
	 * Run the MultiKey(K,K,K,K) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testMultiKey_7()
		throws Exception {

		MultiKey result = new MultiKey(null, null, null, null);

		// add additional test code here
		assertNotNull(result);
		assertEquals("MultiKey[null, null, null, null]", result.toString());
		assertEquals(4, result.size());
	}

	/**
	 * Run the MultiKey(K,K,K,K,K) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testMultiKey_8()
		throws Exception {

		MultiKey result = new MultiKey(null, null, null, null, null);

		// add additional test code here
		assertNotNull(result);
		assertEquals("MultiKey[null, null, null, null, null]", result.toString());
		assertEquals(5, result.size());
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		MultiKey fixture = new MultiKey(new Object[] {});
		Object other = new MultiKey(new Object[] {});

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		MultiKey fixture = new MultiKey(new Object[] {});
		Object other = new MultiKey(new Object[] {});

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		MultiKey fixture = new MultiKey(new Object[] {});
		Object other = new MultiKey(new Object[] {});

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testEquals_4()
		throws Exception {
		MultiKey fixture = new MultiKey(new Object[] {});
		Object other = new Object();

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the Object getKey(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testGetKey_1()
		throws Exception {
		MultiKey fixture = new MultiKey(new Object[] {});
		int index = 1;

		Object result = fixture.getKey(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at org.apache.commons.collections4.keyvalue.MultiKey.getKey(MultiKey.java:196)
		assertNotNull(result);
	}

	/**
	 * Run the Object[] getKeys() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testGetKeys_1()
		throws Exception {
		MultiKey fixture = new MultiKey(new Object[] {});

		Object[] result = fixture.getKeys();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		MultiKey fixture = new MultiKey(new Object[] {});

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the Object readResolve() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testReadResolve_1()
		throws Exception {
		MultiKey fixture = new MultiKey(new Object[] {});

		Object result = fixture.readResolve();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int size() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testSize_1()
		throws Exception {
		MultiKey fixture = new MultiKey(new Object[] {});

		int result = fixture.size();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		MultiKey fixture = new MultiKey(new Object[] {});

		String result = fixture.toString();

		// add additional test code here
		assertEquals("MultiKey[]", result);
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
		new org.junit.runner.JUnitCore().run(MultiKeyTest.class);
	}
}
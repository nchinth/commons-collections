package org.apache.commons.collections4.keyvalue;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AbstractKeyValueTest</code> contains tests for the class <code>{@link AbstractKeyValue}</code>.
 *
 * @generatedBy CodePro at 10/23/15 2:02 PM
 * @author Nikhil
 * @version $Revision: 1.0 $
 */
public class AbstractKeyValueTest {
	/**
	 * Run the Object getKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testGetKey_1()
		throws Exception {
		AbstractKeyValue fixture = new DefaultKeyValue();

		Object result = fixture.getKey();

		// add additional test code here
		assertEquals(null, result);
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
		AbstractKeyValue fixture = new DefaultKeyValue();

		Object result = fixture.getValue();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object setKey(K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testSetKey_1()
		throws Exception {
		AbstractKeyValue fixture = new DefaultKeyValue();

		Object result = fixture.setKey(null);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object setValue(V) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testSetValue_1()
		throws Exception {
		AbstractKeyValue fixture = new DefaultKeyValue();

		Object result = fixture.setValue(null);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		AbstractKeyValue fixture = new DefaultKeyValue();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("null=null", result);
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
		new org.junit.runner.JUnitCore().run(AbstractKeyValueTest.class);
	}
}
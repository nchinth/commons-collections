package org.apache.commons.collections4.keyvalue;

import java.util.Map;
import org.apache.commons.collections4.KeyValue;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>UnmodifiableMapEntryTest</code> contains tests for the class <code>{@link UnmodifiableMapEntry}</code>.
 *
 * @generatedBy CodePro at 10/23/15 2:01 PM
 * @author Nikhil
 * @version $Revision: 1.0 $
 */
public class UnmodifiableMapEntryTest {
	/**
	 * Run the UnmodifiableMapEntry(Entry<? extends K,? extends V>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testUnmodifiableMapEntry_1()
		throws Exception {
		java.util.Map.Entry<? extends Object, ? extends Object> entry = new DefaultMapEntry(new DefaultKeyValue());

		UnmodifiableMapEntry result = new UnmodifiableMapEntry(entry);

		// add additional test code here
		assertNotNull(result);
		assertEquals("null=null", result.toString());
		assertEquals(null, result.getValue());
		assertEquals(null, result.getKey());
	}

	/**
	 * Run the UnmodifiableMapEntry(KeyValue<? extends K,? extends V>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testUnmodifiableMapEntry_2()
		throws Exception {
		KeyValue<? extends Object, ? extends Object> pair = new DefaultKeyValue();

		UnmodifiableMapEntry result = new UnmodifiableMapEntry(pair);

		// add additional test code here
		assertNotNull(result);
		assertEquals("null=null", result.toString());
		assertEquals(null, result.getValue());
		assertEquals(null, result.getKey());
	}

	/**
	 * Run the UnmodifiableMapEntry(K,V) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testUnmodifiableMapEntry_3()
		throws Exception {

		UnmodifiableMapEntry result = new UnmodifiableMapEntry(null, null);

		// add additional test code here
		assertNotNull(result);
		assertEquals("null=null", result.toString());
		assertEquals(null, result.getValue());
		assertEquals(null, result.getKey());
	}

	/**
	 * Run the Object setValue(V) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test(expected = java.lang.UnsupportedOperationException.class)
	public void testSetValue_1()
		throws Exception {
		UnmodifiableMapEntry fixture = new UnmodifiableMapEntry(new DefaultKeyValue());

		Object result = fixture.setValue(null);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(UnmodifiableMapEntryTest.class);
	}
}
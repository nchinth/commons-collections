package org.apache.commons.collections4.keyvalue;

import java.util.Map;
import org.apache.commons.collections4.KeyValue;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DefaultMapEntryTest</code> contains tests for the class <code>{@link DefaultMapEntry}</code>.
 *
 * @generatedBy CodePro at 10/23/15 2:01 PM
 * @author Nikhil
 * @version $Revision: 1.0 $
 */
public class DefaultMapEntryTest {
	/**
	 * Run the DefaultMapEntry(Entry<? extends K,? extends V>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testDefaultMapEntry_1()
		throws Exception {
		java.util.Map.Entry<? extends Object, ? extends Object> entry = new DefaultMapEntry(new DefaultKeyValue());

		DefaultMapEntry result = new DefaultMapEntry(entry);

		// add additional test code here
		assertNotNull(result);
		assertEquals("null=null", result.toString());
		assertEquals(null, result.getValue());
		assertEquals(null, result.getKey());
	}

	/**
	 * Run the DefaultMapEntry(KeyValue<? extends K,? extends V>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testDefaultMapEntry_2()
		throws Exception {
		KeyValue<? extends Object, ? extends Object> pair = new DefaultKeyValue();

		DefaultMapEntry result = new DefaultMapEntry(pair);

		// add additional test code here
		assertNotNull(result);
		assertEquals("null=null", result.toString());
		assertEquals(null, result.getValue());
		assertEquals(null, result.getKey());
	}

	/**
	 * Run the DefaultMapEntry(K,V) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testDefaultMapEntry_3()
		throws Exception {

		DefaultMapEntry result = new DefaultMapEntry(null, null);

		// add additional test code here
		assertNotNull(result);
		assertEquals("null=null", result.toString());
		assertEquals(null, result.getValue());
		assertEquals(null, result.getKey());
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
		new org.junit.runner.JUnitCore().run(DefaultMapEntryTest.class);
	}
}
package org.apache.commons.collections4.functors;

import org.apache.commons.collections4.Transformer;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ConstantTransformerTest</code> contains tests for the class <code>{@link ConstantTransformer}</code>.
 *
 * @generatedBy CodePro at 10/23/15 2:18 PM
 * @author Nikhil
 * @version $Revision: 1.0 $
 */
public class ConstantTransformerTest {
	/**
	 * Run the ConstantTransformer(O) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testConstantTransformer_1()
		throws Exception {

		ConstantTransformer result = new ConstantTransformer(null);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getConstant());
	}

	/**
	 * Run the Transformer<Object, Object> constantTransformer(O) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testConstantTransformer_2()
		throws Exception {

		Transformer<Object, Object> result = ConstantTransformer.constantTransformer(null);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Transformer<Object, Object> constantTransformer(O) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testConstantTransformer_3()
		throws Exception {

		Transformer<Object, Object> result = ConstantTransformer.constantTransformer(null);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		ConstantTransformer fixture = new ConstantTransformer((Object) null);
		Object obj = new ConstantTransformer((Object) null);

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		ConstantTransformer fixture = new ConstantTransformer((Object) null);
		Object obj = new Object();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		ConstantTransformer fixture = new ConstantTransformer((Object) null);
		Object obj = new ConstantTransformer((Object) null);

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testEquals_4()
		throws Exception {
		ConstantTransformer fixture = new ConstantTransformer((Object) null);
		Object obj = new ConstantTransformer((Object) null);

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testEquals_5()
		throws Exception {
		ConstantTransformer fixture = new ConstantTransformer((Object) null);
		Object obj = new ConstantTransformer((Object) null);

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testEquals_6()
		throws Exception {
		ConstantTransformer fixture = new ConstantTransformer((Object) null);
		Object obj = new ConstantTransformer((Object) null);

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the Object getConstant() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testGetConstant_1()
		throws Exception {
		ConstantTransformer fixture = new ConstantTransformer((Object) null);

		Object result = fixture.getConstant();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		ConstantTransformer fixture = new ConstantTransformer((Object) null);

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(-144463148, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testHashCode_2()
		throws Exception {
		ConstantTransformer fixture = new ConstantTransformer((Object) null);

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(-144463148, result);
	}

	/**
	 * Run the Transformer<Object, Object> nullTransformer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testNullTransformer_1()
		throws Exception {

		Transformer<Object, Object> result = ConstantTransformer.nullTransformer();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object transform(I) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testTransform_1()
		throws Exception {
		ConstantTransformer fixture = new ConstantTransformer((Object) null);

		Object result = fixture.transform(null);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
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
	 * @generatedBy CodePro at 10/23/15 2:18 PM
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
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ConstantTransformerTest.class);
	}
}
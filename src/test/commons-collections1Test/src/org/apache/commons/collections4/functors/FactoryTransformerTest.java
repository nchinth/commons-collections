package org.apache.commons.collections4.functors;

import org.apache.commons.collections4.Factory;
import org.apache.commons.collections4.Transformer;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>FactoryTransformerTest</code> contains tests for the class <code>{@link FactoryTransformer}</code>.
 *
 * @generatedBy CodePro at 10/23/15 2:01 PM
 * @author Nikhil
 * @version $Revision: 1.0 $
 */
public class FactoryTransformerTest {
	/**
	 * Run the FactoryTransformer(Factory<? extends O>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testFactoryTransformer_1()
		throws Exception {
		Factory<? extends Object> factory = new ConstantFactory((Object) null);

		FactoryTransformer result = new FactoryTransformer(factory);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Transformer<Object, Object> factoryTransformer(Factory<? extends O>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testFactoryTransformer_2()
		throws Exception {
		Factory<? extends Object> factory = new ConstantFactory((Object) null);

		Transformer<Object, Object> result = FactoryTransformer.factoryTransformer(factory);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Transformer<Object, Object> factoryTransformer(Factory<? extends O>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testFactoryTransformer_3()
		throws Exception {
		Factory<? extends Object> factory = null;

		Transformer<Object, Object> result = FactoryTransformer.factoryTransformer(factory);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Factory<? extends Object> getFactory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testGetFactory_1()
		throws Exception {
		FactoryTransformer fixture = new FactoryTransformer(new ConstantFactory((Object) null));

		Factory<? extends Object> result = fixture.getFactory();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.create());
	}

	/**
	 * Run the Object transform(I) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testTransform_1()
		throws Exception {
		FactoryTransformer fixture = new FactoryTransformer(new ConstantFactory((Object) null));

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
		new org.junit.runner.JUnitCore().run(FactoryTransformerTest.class);
	}
}
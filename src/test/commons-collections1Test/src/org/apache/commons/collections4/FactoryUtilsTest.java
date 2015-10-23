package org.apache.commons.collections4;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>FactoryUtilsTest</code> contains tests for the class <code>{@link FactoryUtils}</code>.
 *
 * @generatedBy CodePro at 10/23/15 2:02 PM
 * @author Nikhil
 * @version $Revision: 1.0 $
 */
public class FactoryUtilsTest {
	/**
	 * Run the Factory<Object> constantFactory(T) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testConstantFactory_1()
		throws Exception {

		Factory<Object> result = FactoryUtils.constantFactory(null);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.create());
	}

	/**
	 * Run the Factory<Object> exceptionFactory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testExceptionFactory_1()
		throws Exception {

		Factory<Object> result = FactoryUtils.exceptionFactory();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Factory<Object> instantiateFactory(Class<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testInstantiateFactory_1()
		throws Exception {
		Class<Object> classToInstantiate = Object.class;

		Factory<Object> result = FactoryUtils.instantiateFactory(classToInstantiate);

		// add additional test code here
		assertNotNull(result);
		assertEquals(new Object(), result.create());
	}

	/**
	 * Run the Factory<Object> instantiateFactory(Class<T>,Class<?>[],Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testInstantiateFactory_2()
		throws Exception {
		Class<Object> classToInstantiate = Object.class;
		Class<Object>[] paramTypes = new Class[] {};
		Object[] args = new Object[] {};

		Factory<Object> result = FactoryUtils.instantiateFactory(classToInstantiate, paramTypes, args);

		// add additional test code here
		assertNotNull(result);
		assertEquals(new Object(), result.create());
	}

	/**
	 * Run the Factory<Object> nullFactory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testNullFactory_1()
		throws Exception {

		Factory<Object> result = FactoryUtils.nullFactory();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.create());
	}

	/**
	 * Run the Factory<Object> prototypeFactory(T) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testPrototypeFactory_1()
		throws Exception {

		Factory<Object> result = FactoryUtils.prototypeFactory(null);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.create());
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
		new org.junit.runner.JUnitCore().run(FactoryUtilsTest.class);
	}
}
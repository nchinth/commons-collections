package org.apache.commons.collections4.functors;

import java.util.Collection;
import org.apache.commons.collections4.Closure;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.list.GrowthList;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>FunctorUtilsTest</code> contains tests for the class <code>{@link FunctorUtils}</code>.
 *
 * @generatedBy CodePro at 10/23/15 2:02 PM
 * @author Nikhil
 * @version $Revision: 1.0 $
 */
public class FunctorUtilsTest {/*
	*//**
	 * Run the Closure<Object> coerce(Closure<? super T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 *//*
	@Test
	public void testCoerce_1()
		throws Exception {
		Closure<? extends Object> closure = new ChainedClosure(new Closure[] {});

		Closure<Object> result = FunctorUtils.coerce(closure);

		// add additional test code here
		assertNotNull(result);
	}

	*//**
	 * Run the Predicate<Object> coerce(Predicate<? super T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 *//*
	@Test
	public void testCoerce_2()
		throws Exception {
		Predicate<? extends Object> predicate = new UniquePredicate();

		Predicate<Object> result = FunctorUtils.coerce(predicate);

		// add additional test code here
		assertNotNull(result);
	}

	*//**
	 * Run the Transformer<Object, Object> coerce(Transformer<? super I,? extends O>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 *//*
	@Test
	public void testCoerce_3()
		throws Exception {
		Transformer<? extends Object, ? extends Object> transformer = new ChainedTransformer(new Transformer[] {});

		Transformer<Object, Object> result = FunctorUtils.coerce(transformer);

		// add additional test code here
		assertNotNull(result);
	}

	*//**
	 * Run the Closure<Object>[] copy(Closure<? super E>[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 *//*
	@Test
	public void testCopy_1()
		throws Exception {

		Closure<Object>[] result = FunctorUtils.copy();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	*//**
	 * Run the Closure<Object>[] copy(Closure<? super E>[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 *//*
	@Test
	public void testCopy_2()
		throws Exception {

		Closure<Object>[] result = FunctorUtils.copy();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	*//**
	 * Run the Predicate<Object>[] copy(Predicate<? super T>[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 *//*
	@Test
	public void testCopy_3()
		throws Exception {

		Predicate<Object>[] result = FunctorUtils.copy();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	*//**
	 * Run the Predicate<Object>[] copy(Predicate<? super T>[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 *//*
	@Test
	public void testCopy_4()
		throws Exception {

		Predicate<Object>[] result = FunctorUtils.copy();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	*//**
	 * Run the Transformer<Object, Object>[] copy(Transformer<? super I,? extends O>[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 *//*
	@Test
	public void testCopy_5()
		throws Exception {

		Transformer<Object, Object>[] result = FunctorUtils.copy();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	*//**
	 * Run the Transformer<Object, Object>[] copy(Transformer<? super I,? extends O>[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 *//*
	@Test
	public void testCopy_6()
		throws Exception {

		Transformer<Object, Object>[] result = FunctorUtils.copy();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	*//**
	 * Run the Predicate<? extends Object>[] validate(Collection<? extends Predicate<? super T>>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 *//*
	@Test
	public void testValidate_1()
		throws Exception {
		Collection<? extends Predicate<? extends Object>> predicates = new GrowthList();

		Predicate<? extends Object>[] result = FunctorUtils.validate(predicates);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	*//**
	 * Run the Predicate<? extends Object>[] validate(Collection<? extends Predicate<? super T>>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 *//*
	@Test
	public void testValidate_2()
		throws Exception {
		Collection<? extends Predicate<? extends Object>> predicates = new GrowthList();

		Predicate<? extends Object>[] result = FunctorUtils.validate(predicates);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	*//**
	 * Run the Predicate<? extends Object>[] validate(Collection<? extends Predicate<? super T>>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 *//*
	@Test
	public void testValidate_3()
		throws Exception {
		Collection<? extends Predicate<? extends Object>> predicates = new GrowthList();

		Predicate<? extends Object>[] result = FunctorUtils.validate(predicates);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	*//**
	 * Run the Predicate<? extends Object>[] validate(Collection<? extends Predicate<? super T>>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 *//*
	@Test(expected = java.lang.NullPointerException.class)
	public void testValidate_4()
		throws Exception {
		Collection<? extends Predicate<? extends Object>> predicates = null;

		Predicate<? extends Object>[] result = FunctorUtils.validate(predicates);

		// add additional test code here
		assertNotNull(result);
	}

	*//**
	 * Run the void validate(Closure<?>[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 *//*
	@Test
	public void testValidate_5()
		throws Exception {

		FunctorUtils.validate();

		// add additional test code here
	}

	*//**
	 * Run the void validate(Closure<?>[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 *//*
	@Test
	public void testValidate_6()
		throws Exception {

		FunctorUtils.validate();

		// add additional test code here
	}

	*//**
	 * Run the void validate(Closure<?>[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 *//*
	@Test
	public void testValidate_7()
		throws Exception {

		FunctorUtils.validate();

		// add additional test code here
	}

	*//**
	 * Run the void validate(Closure<?>[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 *//*
	@Test(expected = java.lang.NullPointerException.class)
	public void testValidate_8()
		throws Exception {
		Closure<Object> closure1 = null;

		FunctorUtils.validate(closure1);

		// add additional test code here
	}

	*//**
	 * Run the void validate(Predicate<?>[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 *//*
	@Test
	public void testValidate_9()
		throws Exception {

		FunctorUtils.validate();

		// add additional test code here
	}

	*//**
	 * Run the void validate(Predicate<?>[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 *//*
	@Test
	public void testValidate_10()
		throws Exception {

		FunctorUtils.validate();

		// add additional test code here
	}

	*//**
	 * Run the void validate(Predicate<?>[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 *//*
	@Test
	public void testValidate_11()
		throws Exception {

		FunctorUtils.validate();

		// add additional test code here
	}

	*//**
	 * Run the void validate(Predicate<?>[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 *//*
	@Test(expected = java.lang.NullPointerException.class)
	public void testValidate_12()
		throws Exception {
		Predicate<Object> predicate1 = null;

		FunctorUtils.validate(predicate1);

		// add additional test code here
	}

	*//**
	 * Run the void validate(Transformer<?,?>[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 *//*
	@Test
	public void testValidate_13()
		throws Exception {

		FunctorUtils.validate();

		// add additional test code here
	}

	*//**
	 * Run the void validate(Transformer<?,?>[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 *//*
	@Test
	public void testValidate_14()
		throws Exception {

		FunctorUtils.validate();

		// add additional test code here
	}

	*//**
	 * Run the void validate(Transformer<?,?>[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 *//*
	@Test
	public void testValidate_15()
		throws Exception {

		FunctorUtils.validate();

		// add additional test code here
	}

	*//**
	 * Run the void validate(Transformer<?,?>[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 *//*
	@Test(expected = java.lang.NullPointerException.class)
	public void testValidate_16()
		throws Exception {
		Transformer<Object, Object> transformer1 = null;

		FunctorUtils.validate(transformer1);

		// add additional test code here
	}

	*//**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 *//*
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	*//**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 *//*
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	*//**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 *//*
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(FunctorUtilsTest.class);
	}
*/}
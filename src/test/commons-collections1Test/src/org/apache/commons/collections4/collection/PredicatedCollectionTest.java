package org.apache.commons.collections4.collection;

import java.util.Collection;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.functors.UniquePredicate;
import org.apache.commons.collections4.list.GrowthList;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>PredicatedCollectionTest</code> contains tests for the class <code>{@link PredicatedCollection}</code>.
 *
 * @generatedBy CodePro at 10/23/15 2:02 PM
 * @author Nikhil
 * @version $Revision: 1.0 $
 */
public class PredicatedCollectionTest {
	/**
	 * Run the PredicatedCollection(Collection<E>,Predicate<? super E>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testPredicatedCollection_1()
		throws Exception {
		Collection<Object> coll = new GrowthList();
		Predicate<? extends Object> predicate = new UniquePredicate();

		PredicatedCollection result = new PredicatedCollection(coll, predicate);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the PredicatedCollection(Collection<E>,Predicate<? super E>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testPredicatedCollection_2()
		throws Exception {
		Collection<Object> coll = new GrowthList();
		Predicate<? extends Object> predicate = new UniquePredicate();

		PredicatedCollection result = new PredicatedCollection(coll, predicate);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the PredicatedCollection(Collection<E>,Predicate<? super E>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testPredicatedCollection_3()
		throws Exception {
		Collection<Object> coll = new GrowthList();
		Predicate<? extends Object> predicate = null;

		PredicatedCollection result = new PredicatedCollection(coll, predicate);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean add(E) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testAdd_1()
		throws Exception {
		PredicatedCollection fixture = new PredicatedCollection(new GrowthList(), new UniquePredicate());

		boolean result = fixture.add(null);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean add(E) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testAdd_2()
		throws Exception {
		PredicatedCollection fixture = new PredicatedCollection(new GrowthList(), new UniquePredicate());

		boolean result = fixture.add(null);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean addAll(Collection<? extends E>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testAddAll_1()
		throws Exception {
		PredicatedCollection fixture = new PredicatedCollection(new GrowthList(), new UniquePredicate());
		Collection<? extends Object> coll = new GrowthList();

		boolean result = fixture.addAll(coll);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean addAll(Collection<? extends E>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testAddAll_2()
		throws Exception {
		PredicatedCollection fixture = new PredicatedCollection(new GrowthList(), new UniquePredicate());
		Collection<? extends Object> coll = new GrowthList();

		boolean result = fixture.addAll(coll);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the PredicatedCollection.Builder<Object> builder(Predicate<? super E>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	//@Test
	public void testBuilder_1()
		throws Exception {
		Predicate<? extends Object> predicate = new UniquePredicate();

		//PredicatedCollection.Builder<Object> result = PredicatedCollection.builder(predicate);

		// add additional test code here
		//assertNotNull(result);
	}

	/**
	 * Run the PredicatedCollection.Builder<Object> notNullBuilder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testNotNullBuilder_1()
		throws Exception {

		PredicatedCollection.Builder<Object> result = PredicatedCollection.notNullBuilder();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the PredicatedCollection<Object> predicatedCollection(Collection<T>,Predicate<? super T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	//@Test
/*	public void testPredicatedCollection_4()
		throws Exception {
		Collection<Object> coll = new GrowthList();
		Predicate<? extends Object> predicate = new UniquePredicate();

		PredicatedCollection<Object> result = PredicatedCollection.predicatedCollection(coll, predicate);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}*/

	/**
	 * Run the void validate(E) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testValidate_1()
		throws Exception {
		PredicatedCollection fixture = new PredicatedCollection(new GrowthList(), new UniquePredicate());

		fixture.validate(null);

		// add additional test code here
	}

	/**
	 * Run the void validate(E) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:02 PM
	 */
	@Test
	public void testValidate_2()
		throws Exception {
		PredicatedCollection fixture = new PredicatedCollection(new GrowthList(), new UniquePredicate());

		fixture.validate(null);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(PredicatedCollectionTest.class);
	}
}
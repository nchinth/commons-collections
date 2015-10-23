package org.apache.commons.collections4.sequence;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>InsertCommandTest</code> contains tests for the class <code>{@link InsertCommand}</code>.
 *
 * @generatedBy CodePro at 10/23/15 2:01 PM
 * @author Nikhil
 * @version $Revision: 1.0 $
 */
public class InsertCommandTest {
	/**
	 * Run the InsertCommand(T) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testInsertCommand_1()
		throws Exception {

		InsertCommand result = new InsertCommand(null);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void accept(CommandVisitor<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testAccept_1()
		throws Exception {
		InsertCommand fixture = new InsertCommand((Object) null);
		CommandVisitor<Object> visitor = new ReplacementsFinder((ReplacementsHandler<Object>) null);

		fixture.accept(visitor);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(InsertCommandTest.class);
	}
}
package org.apache.commons.collections4.sequence;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>EditScriptTest</code> contains tests for the class <code>{@link EditScript}</code>.
 *
 * @generatedBy CodePro at 10/23/15 2:01 PM
 * @author Nikhil
 * @version $Revision: 1.0 $
 */
public class EditScriptTest {
	/**
	 * Run the EditScript() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testEditScript_1()
		throws Exception {

		EditScript result = new EditScript();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getModifications());
		assertEquals(0, result.getLCSLength());
	}

	/**
	 * Run the void append(DeleteCommand<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testAppend_1()
		throws Exception {
		EditScript fixture = new EditScript();
		fixture.append(new KeepCommand((Object) null));
		fixture.append(new KeepCommand((Object) null));
		fixture.append(new InsertCommand((Object) null));
		DeleteCommand<Object> command = new DeleteCommand((Object) null);

		fixture.append(command);

		// add additional test code here
	}

	/**
	 * Run the void append(InsertCommand<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testAppend_2()
		throws Exception {
		EditScript fixture = new EditScript();
		fixture.append(new KeepCommand((Object) null));
		fixture.append(new KeepCommand((Object) null));
		fixture.append(new InsertCommand((Object) null));
		InsertCommand<Object> command = new InsertCommand((Object) null);

		fixture.append(command);

		// add additional test code here
	}

	/**
	 * Run the void append(KeepCommand<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testAppend_3()
		throws Exception {
		EditScript fixture = new EditScript();
		fixture.append(new KeepCommand((Object) null));
		fixture.append(new KeepCommand((Object) null));
		fixture.append(new InsertCommand((Object) null));
		KeepCommand<Object> command = new KeepCommand((Object) null);

		fixture.append(command);

		// add additional test code here
	}

	/**
	 * Run the int getLCSLength() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testGetLCSLength_1()
		throws Exception {
		EditScript fixture = new EditScript();
		fixture.append(new KeepCommand((Object) null));
		fixture.append(new KeepCommand((Object) null));
		fixture.append(new InsertCommand((Object) null));

		int result = fixture.getLCSLength();

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the int getModifications() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testGetModifications_1()
		throws Exception {
		EditScript fixture = new EditScript();
		fixture.append(new KeepCommand((Object) null));
		fixture.append(new KeepCommand((Object) null));
		fixture.append(new InsertCommand((Object) null));

		int result = fixture.getModifications();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the void visit(CommandVisitor<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testVisit_1()
		throws Exception {
		EditScript fixture = new EditScript();
		fixture.append(new KeepCommand((Object) null));
		fixture.append(new KeepCommand((Object) null));
		fixture.append(new InsertCommand((Object) null));
		CommandVisitor<Object> visitor = new ReplacementsFinder((ReplacementsHandler<Object>) null);

		fixture.visit(visitor);

		// add additional test code here
	}

	/**
	 * Run the void visit(CommandVisitor<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testVisit_2()
		throws Exception {
		EditScript fixture = new EditScript();
		fixture.append(new KeepCommand((Object) null));
		fixture.append(new KeepCommand((Object) null));
		fixture.append(new InsertCommand((Object) null));
		CommandVisitor<Object> visitor = new ReplacementsFinder((ReplacementsHandler<Object>) null);

		fixture.visit(visitor);

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
		new org.junit.runner.JUnitCore().run(EditScriptTest.class);
	}
}
package org.apache.commons.collections4.iterators;

import java.util.NoSuchElementException;
import javax.imageio.metadata.IIOMetadataNode;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * The class <code>NodeListIteratorTest</code> contains tests for the class <code>{@link NodeListIterator}</code>.
 *
 * @generatedBy CodePro at 10/23/15 2:18 PM
 * @author Nikhil
 * @version $Revision: 1.0 $
 */
public class NodeListIteratorTest {
	/**
	 * Run the NodeListIterator(Node) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testNodeListIterator_1()
		throws Exception {
		Node node = new IIOMetadataNode();

		NodeListIterator result = new NodeListIterator(node);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.hasNext());
	}

	/**
	 * Run the NodeListIterator(Node) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testNodeListIterator_2()
		throws Exception {
		Node node = null;

		NodeListIterator result = new NodeListIterator(node);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the NodeListIterator(NodeList) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test
	public void testNodeListIterator_3()
		throws Exception {
		NodeList nodeList = new IIOMetadataNode();

		NodeListIterator result = new NodeListIterator(nodeList);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.hasNext());
	}

	/**
	 * Run the NodeListIterator(NodeList) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testNodeListIterator_4()
		throws Exception {
		NodeList nodeList = null;

		NodeListIterator result = new NodeListIterator(nodeList);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean hasNext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
//	@Test
/*	public void testHasNext_1()
		throws Exception {
		NodeListIterator fixture = new NodeListIterator(new IIOMetadataNode());

		boolean result = fixture.hasNext();

		// add additional test code here
		assertEquals(false, result);
	}
*/
	/**
	 * Run the Node next() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
/*	@Test
	public void testNext_1()
		throws Exception {
		NodeListIterator fixture = new NodeListIterator(new IIOMetadataNode());

		Node result = fixture.next();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.NoSuchElementException: underlying nodeList has no more elements
		//       at org.apache.commons.collections4.iterators.NodeListIterator.next(NodeListIterator.java:77)
		assertNotNull(result);
	}*/

	/**
	 * Run the Node next() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	/*@Test(expected = java.util.NoSuchElementException.class)
	public void testNext_2()
		throws Exception {
		NodeListIterator fixture = new NodeListIterator(new IIOMetadataNode());

		Node result = fixture.next();

		// add additional test code here
		assertNotNull(result);
	}
*/
	/**
	 * Run the void remove() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:18 PM
	 */
	/*@Test(expected = java.lang.UnsupportedOperationException.class)
	public void testRemove_1()
		throws Exception {
		NodeListIterator fixture = new NodeListIterator(new IIOMetadataNode());

		fixture.remove();

		// add additional test code here
	}*/

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
		new org.junit.runner.JUnitCore().run(NodeListIteratorTest.class);
	}
}
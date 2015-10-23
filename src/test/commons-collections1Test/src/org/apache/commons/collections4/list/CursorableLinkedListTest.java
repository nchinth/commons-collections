package org.apache.commons.collections4.list;

import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>CursorableLinkedListTest</code> contains tests for the class <code>{@link CursorableLinkedList}</code>.
 *
 * @generatedBy CodePro at 10/23/15 2:01 PM
 * @author Nikhil
 * @version $Revision: 1.0 $
 */
public class CursorableLinkedListTest {
	/**
	 * Run the CursorableLinkedList() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testCursorableLinkedList_1()
		throws Exception {

		CursorableLinkedList result = new CursorableLinkedList();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the CursorableLinkedList(Collection<? extends E>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testCursorableLinkedList_2()
		throws Exception {
		Collection<? extends Object> coll = new GrowthList();

		CursorableLinkedList result = new CursorableLinkedList(coll);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the void addNode(Node<E>,Node<E>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testAddNode_1()
		throws Exception {
		CursorableLinkedList fixture = new CursorableLinkedList();
		fixture.size = 1;
		fixture.header = new AbstractLinkedList.Node();
		fixture.modCount = 1;
		AbstractLinkedList.Node<Object> nodeToInsert = new AbstractLinkedList.Node();
		AbstractLinkedList.Node<Object> insertBeforeNode = new AbstractLinkedList.Node();

		fixture.addNode(nodeToInsert, insertBeforeNode);

		// add additional test code here
	}

	/**
	 * Run the void broadcastNodeChanged(Node<E>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testBroadcastNodeChanged_1()
		throws Exception {
		CursorableLinkedList fixture = new CursorableLinkedList();
		fixture.size = 1;
		fixture.header = new AbstractLinkedList.Node();
		fixture.modCount = 1;
		AbstractLinkedList.Node<Object> node = new AbstractLinkedList.Node();

		fixture.broadcastNodeChanged(node);

		// add additional test code here
	}

	/**
	 * Run the void broadcastNodeChanged(Node<E>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testBroadcastNodeChanged_2()
		throws Exception {
		CursorableLinkedList fixture = new CursorableLinkedList();
		fixture.size = 1;
		fixture.header = new AbstractLinkedList.Node();
		fixture.modCount = 1;
		AbstractLinkedList.Node<Object> node = new AbstractLinkedList.Node();

		fixture.broadcastNodeChanged(node);

		// add additional test code here
	}

	/**
	 * Run the void broadcastNodeChanged(Node<E>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testBroadcastNodeChanged_3()
		throws Exception {
		CursorableLinkedList fixture = new CursorableLinkedList();
		fixture.size = 1;
		fixture.header = new AbstractLinkedList.Node();
		fixture.modCount = 1;
		AbstractLinkedList.Node<Object> node = new AbstractLinkedList.Node();

		fixture.broadcastNodeChanged(node);

		// add additional test code here
	}

	/**
	 * Run the void broadcastNodeInserted(Node<E>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testBroadcastNodeInserted_1()
		throws Exception {
		CursorableLinkedList fixture = new CursorableLinkedList();
		fixture.size = 1;
		fixture.header = new AbstractLinkedList.Node();
		fixture.modCount = 1;
		AbstractLinkedList.Node<Object> node = new AbstractLinkedList.Node();

		fixture.broadcastNodeInserted(node);

		// add additional test code here
	}

	/**
	 * Run the void broadcastNodeInserted(Node<E>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testBroadcastNodeInserted_2()
		throws Exception {
		CursorableLinkedList fixture = new CursorableLinkedList();
		fixture.size = 1;
		fixture.header = new AbstractLinkedList.Node();
		fixture.modCount = 1;
		AbstractLinkedList.Node<Object> node = new AbstractLinkedList.Node();

		fixture.broadcastNodeInserted(node);

		// add additional test code here
	}

	/**
	 * Run the void broadcastNodeInserted(Node<E>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testBroadcastNodeInserted_3()
		throws Exception {
		CursorableLinkedList fixture = new CursorableLinkedList();
		fixture.size = 1;
		fixture.header = new AbstractLinkedList.Node();
		fixture.modCount = 1;
		AbstractLinkedList.Node<Object> node = new AbstractLinkedList.Node();

		fixture.broadcastNodeInserted(node);

		// add additional test code here
	}

	/**
	 * Run the void broadcastNodeRemoved(Node<E>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testBroadcastNodeRemoved_1()
		throws Exception {
		CursorableLinkedList fixture = new CursorableLinkedList();
		fixture.size = 1;
		fixture.header = new AbstractLinkedList.Node();
		fixture.modCount = 1;
		AbstractLinkedList.Node<Object> node = new AbstractLinkedList.Node();

		fixture.broadcastNodeRemoved(node);

		// add additional test code here
	}

	/**
	 * Run the void broadcastNodeRemoved(Node<E>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testBroadcastNodeRemoved_2()
		throws Exception {
		CursorableLinkedList fixture = new CursorableLinkedList();
		fixture.size = 1;
		fixture.header = new AbstractLinkedList.Node();
		fixture.modCount = 1;
		AbstractLinkedList.Node<Object> node = new AbstractLinkedList.Node();

		fixture.broadcastNodeRemoved(node);

		// add additional test code here
	}

	/**
	 * Run the void broadcastNodeRemoved(Node<E>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testBroadcastNodeRemoved_3()
		throws Exception {
		CursorableLinkedList fixture = new CursorableLinkedList();
		fixture.size = 1;
		fixture.header = new AbstractLinkedList.Node();
		fixture.modCount = 1;
		AbstractLinkedList.Node<Object> node = new AbstractLinkedList.Node();

		fixture.broadcastNodeRemoved(node);

		// add additional test code here
	}

	/**
	 * Run the ListIterator<Object> createSubListListIterator(LinkedSubList<E>,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testCreateSubListListIterator_1()
		throws Exception {
		CursorableLinkedList fixture = new CursorableLinkedList();
		fixture.size = 1;
		fixture.header = new AbstractLinkedList.Node();
		fixture.modCount = 1;
		AbstractLinkedList.LinkedSubList<Object> subList = new AbstractLinkedList.LinkedSubList(new CursorableLinkedList(), 1, 1);
		int fromIndex = 1;

		ListIterator<Object> result = fixture.createSubListListIterator(subList, fromIndex);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: toIndex = 1
		//       at org.apache.commons.collections4.list.AbstractLinkedList$LinkedSubList.<init>(AbstractLinkedList.java:953)
		assertNotNull(result);
	}

	/**
	 * Run the CursorableLinkedList.Cursor<Object> cursor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testCursor_1()
		throws Exception {
		CursorableLinkedList fixture = new CursorableLinkedList();
		fixture.size = 1;
		fixture.header = new AbstractLinkedList.Node();
		fixture.modCount = 1;

		CursorableLinkedList.Cursor<Object> result = fixture.cursor();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.hasNext());
		assertEquals(false, result.hasPrevious());
		assertEquals(0, result.nextIndex());
		assertEquals(-1, result.previousIndex());
	}

	/**
	 * Run the CursorableLinkedList.Cursor<Object> cursor(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testCursor_2()
		throws Exception {
		CursorableLinkedList fixture = new CursorableLinkedList();
		fixture.size = 1;
		fixture.header = new AbstractLinkedList.Node();
		fixture.modCount = 1;
		int fromIndex = 1;

		CursorableLinkedList.Cursor<Object> result = fixture.cursor(fromIndex);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.hasNext());
		assertEquals(false, result.hasPrevious());
		assertEquals(1, result.nextIndex());
		assertEquals(0, result.previousIndex());
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testInit_1()
		throws Exception {
		CursorableLinkedList fixture = new CursorableLinkedList();
		fixture.size = 1;
		fixture.header = new AbstractLinkedList.Node();
		fixture.modCount = 1;

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the Iterator<Object> iterator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testIterator_1()
		throws Exception {
		CursorableLinkedList fixture = new CursorableLinkedList();
		fixture.size = 1;
		fixture.header = new AbstractLinkedList.Node();
		fixture.modCount = 1;

		Iterator<Object> result = fixture.iterator();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.hasNext());
	}

	/**
	 * Run the ListIterator<Object> listIterator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testListIterator_1()
		throws Exception {
		CursorableLinkedList fixture = new CursorableLinkedList();
		fixture.size = 1;
		fixture.header = new AbstractLinkedList.Node();
		fixture.modCount = 1;

		ListIterator<Object> result = fixture.listIterator();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.hasNext());
		assertEquals(false, result.hasPrevious());
		assertEquals(0, result.nextIndex());
		assertEquals(-1, result.previousIndex());
	}

	/**
	 * Run the ListIterator<Object> listIterator(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testListIterator_2()
		throws Exception {
		CursorableLinkedList fixture = new CursorableLinkedList();
		fixture.size = 1;
		fixture.header = new AbstractLinkedList.Node();
		fixture.modCount = 1;
		int fromIndex = 1;

		ListIterator<Object> result = fixture.listIterator(fromIndex);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.hasNext());
		assertEquals(false, result.hasPrevious());
		assertEquals(1, result.nextIndex());
		assertEquals(0, result.previousIndex());
	}

	/**
	 * Run the void registerCursor(Cursor<E>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testRegisterCursor_1()
		throws Exception {
		CursorableLinkedList fixture = new CursorableLinkedList();
		fixture.size = 1;
		fixture.header = new AbstractLinkedList.Node();
		fixture.modCount = 1;
		CursorableLinkedList.Cursor<Object> cursor = new CursorableLinkedList.Cursor(new CursorableLinkedList(), 1);

		fixture.registerCursor(cursor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Couldn't get the node: index (1) greater than the size of the list (0).
		//       at org.apache.commons.collections4.list.AbstractLinkedList.getNode(AbstractLinkedList.java:547)
		//       at org.apache.commons.collections4.list.AbstractLinkedList$LinkedListIterator.<init>(AbstractLinkedList.java:788)
		//       at org.apache.commons.collections4.list.CursorableLinkedList$Cursor.<init>(CursorableLinkedList.java:415)
	}

	/**
	 * Run the void registerCursor(Cursor<E>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testRegisterCursor_2()
		throws Exception {
		CursorableLinkedList fixture = new CursorableLinkedList();
		fixture.size = 1;
		fixture.header = new AbstractLinkedList.Node();
		fixture.modCount = 1;
		CursorableLinkedList.Cursor<Object> cursor = new CursorableLinkedList.Cursor(new CursorableLinkedList(), 1);

		fixture.registerCursor(cursor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Couldn't get the node: index (1) greater than the size of the list (0).
		//       at org.apache.commons.collections4.list.AbstractLinkedList.getNode(AbstractLinkedList.java:547)
		//       at org.apache.commons.collections4.list.AbstractLinkedList$LinkedListIterator.<init>(AbstractLinkedList.java:788)
		//       at org.apache.commons.collections4.list.CursorableLinkedList$Cursor.<init>(CursorableLinkedList.java:415)
	}

	/**
	 * Run the void registerCursor(Cursor<E>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testRegisterCursor_3()
		throws Exception {
		CursorableLinkedList fixture = new CursorableLinkedList();
		fixture.size = 1;
		fixture.header = new AbstractLinkedList.Node();
		fixture.modCount = 1;
		CursorableLinkedList.Cursor<Object> cursor = new CursorableLinkedList.Cursor(new CursorableLinkedList(), 1);

		fixture.registerCursor(cursor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Couldn't get the node: index (1) greater than the size of the list (0).
		//       at org.apache.commons.collections4.list.AbstractLinkedList.getNode(AbstractLinkedList.java:547)
		//       at org.apache.commons.collections4.list.AbstractLinkedList$LinkedListIterator.<init>(AbstractLinkedList.java:788)
		//       at org.apache.commons.collections4.list.CursorableLinkedList$Cursor.<init>(CursorableLinkedList.java:415)
	}

	/**
	 * Run the void removeAllNodes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testRemoveAllNodes_1()
		throws Exception {
		CursorableLinkedList fixture = new CursorableLinkedList();
		fixture.size = 1;
		fixture.header = new AbstractLinkedList.Node();
		fixture.modCount = 1;

		fixture.removeAllNodes();

		// add additional test code here
	}

	/**
	 * Run the void removeAllNodes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testRemoveAllNodes_2()
		throws Exception {
		CursorableLinkedList fixture = new CursorableLinkedList();
		fixture.size = 1;
		fixture.header = new AbstractLinkedList.Node();
		fixture.modCount = 1;

		fixture.removeAllNodes();

		// add additional test code here
	}

	/**
	 * Run the void removeAllNodes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testRemoveAllNodes_3()
		throws Exception {
		CursorableLinkedList fixture = new CursorableLinkedList();
		fixture.size = 1;
		fixture.header = new AbstractLinkedList.Node();
		fixture.modCount = 1;

		fixture.removeAllNodes();

		// add additional test code here
	}

	/**
	 * Run the void removeNode(Node<E>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testRemoveNode_1()
		throws Exception {
		CursorableLinkedList fixture = new CursorableLinkedList();
		fixture.size = 1;
		fixture.header = new AbstractLinkedList.Node();
		fixture.modCount = 1;
		AbstractLinkedList.Node<Object> node = new AbstractLinkedList.Node();

		fixture.removeNode(node);

		// add additional test code here
	}

	/**
	 * Run the void unregisterCursor(Cursor<E>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testUnregisterCursor_1()
		throws Exception {
		CursorableLinkedList fixture = new CursorableLinkedList();
		fixture.size = 1;
		fixture.header = new AbstractLinkedList.Node();
		fixture.modCount = 1;
		CursorableLinkedList.Cursor<Object> cursor = new CursorableLinkedList.Cursor(new CursorableLinkedList(), 1);

		fixture.unregisterCursor(cursor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Couldn't get the node: index (1) greater than the size of the list (0).
		//       at org.apache.commons.collections4.list.AbstractLinkedList.getNode(AbstractLinkedList.java:547)
		//       at org.apache.commons.collections4.list.AbstractLinkedList$LinkedListIterator.<init>(AbstractLinkedList.java:788)
		//       at org.apache.commons.collections4.list.CursorableLinkedList$Cursor.<init>(CursorableLinkedList.java:415)
	}

	/**
	 * Run the void unregisterCursor(Cursor<E>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testUnregisterCursor_2()
		throws Exception {
		CursorableLinkedList fixture = new CursorableLinkedList();
		fixture.size = 1;
		fixture.header = new AbstractLinkedList.Node();
		fixture.modCount = 1;
		CursorableLinkedList.Cursor<Object> cursor = new CursorableLinkedList.Cursor(new CursorableLinkedList(), 1);

		fixture.unregisterCursor(cursor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Couldn't get the node: index (1) greater than the size of the list (0).
		//       at org.apache.commons.collections4.list.AbstractLinkedList.getNode(AbstractLinkedList.java:547)
		//       at org.apache.commons.collections4.list.AbstractLinkedList$LinkedListIterator.<init>(AbstractLinkedList.java:788)
		//       at org.apache.commons.collections4.list.CursorableLinkedList$Cursor.<init>(CursorableLinkedList.java:415)
	}

	/**
	 * Run the void unregisterCursor(Cursor<E>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testUnregisterCursor_3()
		throws Exception {
		CursorableLinkedList fixture = new CursorableLinkedList();
		fixture.size = 1;
		fixture.header = new AbstractLinkedList.Node();
		fixture.modCount = 1;
		CursorableLinkedList.Cursor<Object> cursor = new CursorableLinkedList.Cursor(new CursorableLinkedList(), 1);

		fixture.unregisterCursor(cursor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Couldn't get the node: index (1) greater than the size of the list (0).
		//       at org.apache.commons.collections4.list.AbstractLinkedList.getNode(AbstractLinkedList.java:547)
		//       at org.apache.commons.collections4.list.AbstractLinkedList$LinkedListIterator.<init>(AbstractLinkedList.java:788)
		//       at org.apache.commons.collections4.list.CursorableLinkedList$Cursor.<init>(CursorableLinkedList.java:415)
	}

	/**
	 * Run the void unregisterCursor(Cursor<E>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testUnregisterCursor_4()
		throws Exception {
		CursorableLinkedList fixture = new CursorableLinkedList();
		fixture.size = 1;
		fixture.header = new AbstractLinkedList.Node();
		fixture.modCount = 1;
		CursorableLinkedList.Cursor<Object> cursor = new CursorableLinkedList.Cursor(new CursorableLinkedList(), 1);

		fixture.unregisterCursor(cursor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Couldn't get the node: index (1) greater than the size of the list (0).
		//       at org.apache.commons.collections4.list.AbstractLinkedList.getNode(AbstractLinkedList.java:547)
		//       at org.apache.commons.collections4.list.AbstractLinkedList$LinkedListIterator.<init>(AbstractLinkedList.java:788)
		//       at org.apache.commons.collections4.list.CursorableLinkedList$Cursor.<init>(CursorableLinkedList.java:415)
	}

	/**
	 * Run the void updateNode(Node<E>,E) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/23/15 2:01 PM
	 */
	@Test
	public void testUpdateNode_1()
		throws Exception {
		CursorableLinkedList fixture = new CursorableLinkedList();
		fixture.size = 1;
		fixture.header = new AbstractLinkedList.Node();
		fixture.modCount = 1;
		AbstractLinkedList.Node<Object> node = new AbstractLinkedList.Node();

		fixture.updateNode(node, null);

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
		new org.junit.runner.JUnitCore().run(CursorableLinkedListTest.class);
	}
}
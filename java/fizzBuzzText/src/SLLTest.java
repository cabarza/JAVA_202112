import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class SLLTest {

	public SLL sll;
    @Before
    public void setUp() throws Exception {
        sll = new SLL();
    }
    @Test
    public void testHeadForNull() {
        assertNull(sll.head);
    }
    
    @Test
    public void testHeadForNode() {
        sll.add(8);
        assertNotNull(sll.head);
    }
    
    @Test
    public void testHeadNextVal() {
        sll.add(5);
        sll.add(10);
        assertTrue(sll.head.next.value == 10);
    }
    
    @Test
    public void testHeadNextNextVal() {
        sll.add(5);
        sll.add(10);
        sll.add(35);
        assertTrue(sll.head.next.next.value == 35);
    }
    
    @Test
    public void testHeadAfterRemove() {
        sll.add(10);
//        sll.removeFront();
        // write test first, then write code to pass the test.
    }

}

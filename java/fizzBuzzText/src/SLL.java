
public class SLL {
	
	public SLL head;
	public SLL next;
	public int value;
	
	public void add(int i) {
		if(head == null) {
			head = new SLL();
			head.value = i;
		} else {
			add(head, i);
		}
	}
	
	public void add(SLL nodo, int i) {
		if(nodo.next ==null) {
			nodo.next = new SLL();
			nodo.next.value = i;
		} else {
			add(nodo.next, i);
		}
	}

}

import DataStructure.ListNode;

/**
 * Created by Flim on 2015/12/6.
 */
public class DelNodeInLL {
    public void deleteNode(ListNode node) {
        if (node == null)
            return;
        node.val = node.next.val;
        node.next = node.next.next;
    }
}

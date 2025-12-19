/**
 * Node class for a singly linked list.
 */
public class Node {
    int value;
    Node next;

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }


    public static void main(String args[]) {
        Node n1 = new Node(1, null);
        Node n2 = new Node(2, n1);
        Node n3 = new Node(3, n2);

        Node n4 = Node.in_place_reverse(n3);
        print_list(n4);
        assert(n4 == n1);
    }


    /**
     * Print ist like this: [1,2,3]
     */
    public static void print_list(Node n) {
        String res = "[";
        for(;n != null; n = n.next) {
            res += String.valueOf(n.value);
            if(n.next != null)
                res += ",";
        }
        res = res + "]";
        System.out.println(res);
    }

    /**
     * in-place list reversal
     */
    public static Node in_place_reverse(Node n) {
        if(n == null) return null;
        if(n.next == null) return n;
        Node res = null;
        while(n != null) {
            Node next = n.next;
            n.next = res;
            res = n;
            n = next;
        }
        return res;
    }


}

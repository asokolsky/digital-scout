# README

I used https://www.jdoodle.com/online-java-compiler to play with this code.

## Problem Statement

Given the class Node:

```java
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

        print_list(n3);
        Node n4 = Node.in_place_reverse(n3);
        print_list(n4);
        assert(n4 == n1);
    }


    /**
     * Print ist like this: [1,2,3]
     */
    public static void print_list(Node n) {

    }

    /**
     * in-place list reversal
     */
    public static Node in_place_reverse(Node n) {

    }


}
```

implement:

* `print_list`
* `in_place_reverse`

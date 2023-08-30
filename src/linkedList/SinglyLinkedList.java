package linkedList;

public class SinglyLinkedList<T extends Comparable> {

    private Node head;
    private Node tail;

    private class Node {

        private T data;
        private Node next;

        public Node(T data) {
            this.data = data;
        }

    }

    /**
     * Insert new node at the start of linked list
     *
     * @param data (data of new node)
     */
    public void insertAtStart(T data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    /**
     * Insert new node at the end of linked list
     *
     * @param data (data of new node)
     */
    public void insertAtEnd(T data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    /**
     * Insert new node at specific position of linked list
     *
     * @param pos (position of new node)
     * @param data (data of new node)
     */
    public void insert(int pos, T data) {

        int length = calcLength(head);

        if (pos < 1 || pos >= length) {
            System.out.println("Cannot add nodes at this position");
        } else {

            Node newNode = new Node(data);
            Node tempNode = head;

            while (pos-- > 1) {
                tempNode = tempNode.next;
            }

            newNode.next = tempNode.next;
            tempNode.next = newNode;
        }
    }

    /**
     * Delete first node from linked list
     */
    public void deleteAtStart() {

        if (head == null) {
            System.out.println("List is empty! Cannot delete nodes");
            return;
        }

        System.out.println("Deleted: " + head.data);
        head = head.next;
    }

    /**
     * Delete last node from linked list
     */
    public void deleteAtEnd() {

        if (head == null || head.next == null) {
            deleteAtStart();
            return;
        }

        Node tempNode = head;
        Node prevNode = null;

        while (tempNode.next != null) {
            prevNode = tempNode;
            tempNode = tempNode.next;
        }

        System.out.println("Deleted: " + tempNode.data);
        prevNode.next = null;
        tail = prevNode;
        tempNode = null;
    }

    /**
     * Delete node at specific position of linked list
     *
     * @param pos (position to delete)
     */
    public void delete(int pos) {

        int length = calcLength(head);

        if (pos < 0 || pos >= length) {
            System.out.println("Cannot delete nodes at this position");
        } else {

            if (pos == 0) {
                deleteAtStart();
                return;
            }
            if (pos == length) {
                deleteAtEnd();
                return;
            }

            Node tempNode = head;
            Node prevNode = null;

            while (pos-- > 0) {
                prevNode = tempNode;
                tempNode = tempNode.next;
            }

            if (tempNode != null) {
                System.out.println("Deleted: " + tempNode.data);
                prevNode.next = tempNode.next;
            }
            tempNode = prevNode = null;
        }

    }

    /**
     * Sort linked list by bubble sort algorithm
     */
    public void bubbleSort() {

        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        Node currentNode = null, newHeadNode = null, moveNode = null, prevNode = null;

        while (head != null) {

            prevNode = null;
            currentNode = head;
            moveNode = head;

            while (currentNode != null) {
                // currentNode.next.data.compareTo(moveNode.data) == -1 -> sort descending
                if ((currentNode.next != null) && (currentNode.next.data.compareTo(moveNode.data) == 1)) {
                    moveNode = currentNode.next;
                    prevNode = currentNode;
                }

                currentNode = currentNode.next;
            }

            if (moveNode == head) {
                head = head.next;
            }
            if (prevNode != null) {
                prevNode.next = moveNode.next;
            }
            moveNode.next = newHeadNode;
            newHeadNode = moveNode;
        }
        head = newHeadNode;
    }

    /**
     * Delete duplicates from a sorted linked list (list MUST be sorted!)
     */
    public void deleteDuplicates() {

        Node tempNode_one = head;

        while (tempNode_one != null) {
            Node tempNode_two = tempNode_one;

            while (tempNode_two != null && tempNode_two.data.compareTo(tempNode_one.data) == 0) {
                tempNode_two = tempNode_two.next;
            }

            tempNode_one.next = tempNode_two;
            tempNode_one = tempNode_one.next;
        }
        tempNode_one = null;
    }

    /**
     * Find the maximum value node in the list
     *
     * @return maximum value
     */
    public T getMaxValue() {

        T result = null;

        try {

            Node tempNode = head;
            T maxValue = tempNode.data;

            if (head != null) {
                if (tempNode.next == null) {
                    result = maxValue;
                }

                while (tempNode != null) {
                    if (tempNode.data.compareTo(maxValue) == 1) {
                        maxValue = tempNode.data;
                        result = maxValue;
                    }
                    tempNode = tempNode.next;
                }
            }

            tempNode = null;
        } catch (NullPointerException nullPointerException) {
            System.out.print("List is empty! ");
        }

        return result;
    }

    /**
     * Find the minimum value node in the list
     *
     * @return minimum value
     */
    public T getMinValue() {

        T result = null;

        try {

            Node tempNode = head;
            T minValue = tempNode.data;

            if (head != null) {

                if (tempNode.next == null) {
                    result = minValue;
                }
                while (tempNode != null) {
                    if (tempNode.data.compareTo(minValue) == -1) {
                        minValue = tempNode.data;
                        result = minValue;
                    }
                    tempNode = tempNode.next;
                }
            }

            tempNode = null;
        } catch (NullPointerException nullPointerException) {
            System.out.print("List is empty! ");
        }

        return result;
    }

    /**
     * Get data of a node
     *
     * @param pos (position of the node)
     */
    public void getNodeData(int pos) {

        Node tempNode = head;

        try {
            for (int i = 0; i < pos; i++) {
                tempNode = tempNode.next;
            }
            System.out.println("Position " + pos + ", node data: " + tempNode.data);

        } catch (NullPointerException nullPointerException) {
            System.out.println("Position " + pos + " it's not available");
        }

        tempNode = null;
    }

    /**
     * Display linked list
     */
    public void print() {

        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        Node tempNode = head;

        while (tempNode != null) {
            System.out.print(tempNode.data + " -> ");
            tempNode = tempNode.next;
        }
        System.out.println("END");
        tempNode = null;
    }

    /**
     * Calculate length of the linked list
     *
     * @param node (reference node)
     * @return linked list length
     */
    private int calcLength(Node node) {

        int length = 0;

        while (node != null) {
            node = node.next;
            length++;
        }

        return length;
    }

}

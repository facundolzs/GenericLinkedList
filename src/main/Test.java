package main;

import linkedList.SinglyLinkedList;

public class Test {

    public static void main(String[] args) {

        SinglyLinkedList<Double> list = new SinglyLinkedList();

        System.out.println("Maximum value in list: " + list.getMaxValue());
        System.out.println("Minimum value in list: " + list.getMinValue());

        System.out.println("\n<<Get node in position one>>");
        list.getNodeData(1);

        System.out.println("\n<<List after adding four nodes at the beginning>>");
        list.insertAtStart(-11.7);
        list.insertAtStart(99.5);
        list.insertAtStart(60.0);
        list.insertAtStart(-3.7);
        list.print();

        System.out.println("\n<<List after adding three nodes at the end>>");
        list.insertAtEnd(36.9);
        list.insertAtEnd(71.0);
        list.insertAtEnd(-3.7);
        list.print();

        System.out.println("\nMaximum value in list: " + list.getMaxValue());
        System.out.println("Minimum value in list: " + list.getMinValue());

        System.out.println("\n<<List after adding a node (99.5) at position three>>");
        list.insert(3, 99.5);
        list.print();

        System.out.println("\n<<List after adding a node (33.0) at position two>>");
        list.insert(2, 33.0);
        list.print();

        System.out.println("\n<<List after adding a node (15.99) at position nine>>");
        list.insert(9, 15.99);
        list.print();

        System.out.println("\n<<List after adding a node (71.0) at position one>>");
        list.insert(1, 71.0);
        list.print();

        System.out.println("\n<<List after adding a node (-3.7) at position five>>");
        list.insert(5, -3.7);
        list.print();

        System.out.println("\n<<List after adding a node (-29.0) at position two>>");
        list.insert(2, -29.0);
        list.print();

        System.out.println("\nMaximum value in list: " + list.getMaxValue());
        System.out.println("Minimum value in list: " + list.getMinValue());

        System.out.println("\n<<List after adding a node (99.5) at position three>>");
        list.insert(3, 99.5);
        list.print();

        System.out.println("\n<<List after adding a node (33.6) at position two>>");
        list.insert(2, 33.6);
        list.print();

        System.out.println("\n<<List after adding a node (15.75) at position nine>>");
        list.insert(9, 15.75);
        list.print();

        System.out.println("\n<<List after adding a node (71.0) at position one>>");
        list.insert(1, 71.0);
        list.print();

        System.out.println("\n<<List after adding a node (-3.7) at position five>>");
        list.insert(5, -3.7);
        list.print();

        System.out.println("\n<<List after adding a node (-29.3) at position two>>");
        list.insert(2, -29.3);
        list.print();

        System.out.println("\nMaximum value in list: " + list.getMaxValue());
        System.out.println("Minimum value in list: " + list.getMinValue());

        System.out.println("\n<<List after sorting>>");
        list.bubbleSort();
        list.print();

        System.out.println("\n<<List after removing repeated nodes>>");
        list.deleteDuplicates();
        list.print();

        System.out.println("\n<<List after deleting the first node>>");
        list.deleteAtStart();
        list.print();

        System.out.println("\n<<List after deleting the last node>>");
        list.deleteAtEnd();
        list.print();

        System.out.println("\n<<List after deleting node at position zero>>");
        list.delete(0);
        list.print();

        System.out.println("\n<<List after deleting node at position five>>");
        list.delete(5);
        list.print();

        System.out.println("\n<<List after deleting node at position fourteen>>");
        list.delete(14);
        list.print();

        System.out.println("\n<<List after deleting node at position one>>");
        list.delete(1);
        list.print();

        System.out.println("\n<<Get node in position two>>");
        list.getNodeData(2);

        System.out.println("\n<<Get node in position four>>");
        list.getNodeData(4);

        System.out.println("\n<<Get node in position ten>>");
        list.getNodeData(10);

        System.out.println("\n<<Get node in position zero>>");
        list.getNodeData(0);

    }

}

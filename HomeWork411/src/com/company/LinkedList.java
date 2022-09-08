package com.company;

public class LinkedList {
    private Node head;

    public void add(int v) {

        if (this.head == null) {
            this.head = new Node(v);
            return;
        }
        Node last = this.head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = new Node(v);
    }

    public void print()   {

        Node last = this.head;
        while (last != null) {
            System.out.print(last.value + "   ");

            last = last.next;
        }
        System.out.println();
    }

    public void remoove(int index)  {

        Node last = this.head;
        Node prevNode = null;
        for (int i = 1; last != null; i++) {

            if (index == 1) {
                head = head.next;
                System.out.println("����");
                print();
                break;
            }
            if (index == i) {
                prevNode.next = last.next;
                System.out.println("����");
                print();
                break;
            }
            prevNode = last;
            last = last.next;
        }
        System.out.println();

    }

    public int get(int ind) {
        if (this.head == null) {
            System.out.println("������ ����");
        }
        Node last = this.head;
        Node isc= this.head;
        for (int i=2;last!=null;i++){
            last = last.next;
            if(ind==i){
                isc=last;
            }
        }

        return isc.value;
    }
}

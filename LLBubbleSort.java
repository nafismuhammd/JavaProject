/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uap;

/**
 *
 * @author MNafis
 */

import java.lang.*;
public class LLBubbleSort {

    Node head, tail;
    Queue q;
    int size = 0;

    public void addLast(String newData) {

        Node baru = new Node(newData);

        if (head == null) {
            head = baru;
            tail = baru;

        } else {

            tail.next = baru;
            baru.prev = tail;
            tail = baru;

        }
        size++;
    }

    public void Swap(Node nod1, Node nod2) {

        String temp = nod1.data;
        nod1.data = nod2.data;
        nod2.data = temp;

    }

    public void BubbleSort() {

        Node node = head;

        boolean swapped;
        do {
            swapped = false;
            node = head;
            for (int x = 0; x < size-1 ; x++) {

                if (node.data.compareTo(node.next.data)>0) {
                    Swap(node, node.next);
                    swapped = true;
                }
                node = node.next;
            }    
        } while (swapped == true);
        
    }
    
    public void cetak(String s) {
        System.out.println(s);
        Node pointer = head;
        while (pointer != null) {
            System.out.println(pointer.no+"    "+pointer.data);
            pointer = pointer.next;
        }
        System.out.println("\n");
    }
    
    public void cek(String s) {
        Node pointer = head;
        while (pointer != null) {
            if (pointer.no.equals(s)) {
                System.out.println(pointer.no+"    "+pointer.data+ " Sudah absen");
                q.enqueue(pointer.data);
            }
            
            pointer = pointer.next;
        }
        System.out.println("\n");
    }
    
}
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
public class Node {
    String data;
    String no;
    Node next, prev;

    Node(String data) {
        this.data = data;
        this.no = String.format("%d",(System.currentTimeMillis()));
        this.next = null;
        this.prev = null;
    }

}

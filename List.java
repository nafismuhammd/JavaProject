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
public class List {
    private Node nodeAwal;
    private Node nodeAkhir;
    private String nama;
    public List() {
        this("list");
    }
    public List(String namaList) {
        nama = namaList;
        nodeAwal = nodeAkhir = null;
    }
    public void sisipDiAwal(String n,double dt) {
        Node baru = new Node(n);
        baru.data = n;
        if (nodeAwal == null) {
            baru.prev = baru;
            baru.next = nodeAkhir;
            nodeAwal = baru;
            nodeAkhir = baru;
        } else {
            baru.next = nodeAwal;
            nodeAwal.prev = baru;
            nodeAwal = baru;
        }
    }
    public void sisipDiAkhir(String n) {
        Node baru = new Node(n);
        baru.data = n;
        if (kosong()) {
            baru.prev = nodeAwal;
            baru.next = nodeAkhir;
            nodeAkhir = baru;
            nodeAwal = baru;
        } else {
            baru.prev = nodeAkhir;
            nodeAkhir.next = baru;
            nodeAkhir = baru;
        }
    }
    public Object hapusDrDepan() {
        Object itemDihapus = null;
        if (!kosong()) {
            itemDihapus = nodeAwal.data;
            if (nodeAwal == nodeAkhir) {
                nodeAwal = nodeAkhir = null;
            } else {
                nodeAwal = nodeAwal.next;
            }
        }
        return itemDihapus;
    }
    public boolean kosong() {
        return nodeAwal == null;
    }
    public void cetak() {
        if (kosong()) {
            System.out.printf("Kosong %s\n", nama);
            return;
        }
        System.out.printf("Isi %s adalah : ", nama);
        Node kini = nodeAwal;
        while (kini != null) {
            System.out.printf("%s ", kini.data);
            kini = kini.next;
        }
        System.out.println("\n");
    }
}

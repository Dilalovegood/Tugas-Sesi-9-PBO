
package sesi9;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Collection {
  public static void main(String[] args) {
    // Membuat objek ArrayList untuk menyimpan data string
    ArrayList<String> arrayList = new ArrayList<>();

    // Menambahkan beberapa elemen ke ArrayList
    arrayList.add("Tomorrow");
    arrayList.add("x");
    arrayList.add("Together");

    // Menampilkan elemen ArrayList menggunakan loop for
    for (String str : arrayList) {
      System.out.println(str);
    }

    // Membuat objek ArrayDeque untuk menyimpan data integer
    ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

    // Menambahkan beberapa elemen ke ArrayDeque
    arrayDeque.add(4);
    arrayDeque.add(6);
    arrayDeque.add(8);

    // Menampilkan elemen ArrayDeque menggunakan iterator
    for (int num : arrayDeque) {
      System.out.println(num);
    }
  }
}

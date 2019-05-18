package br.com.fiap.collections;

import java.util.HashSet;

public class HashSetSample {
    public static void main(String[] args) {
        System.out.println("HashSetSample");
        System.out.println();

        String item1 = "Item 1", item2 = "Item 2";

        HashSet<String> itensHashSet = new HashSet<>();
        itensHashSet.add(item1);
        itensHashSet.add(item2);
        itensHashSet.add("Item 3");
        itensHashSet.add("Item 4");

        System.out.println("Size:" + itensHashSet.size());
        System.out.println("itensHashSet" + itensHashSet);
        System.out.println("Contains: " + itensHashSet.contains(item1));
        System.out.println("Contains: " +itensHashSet.contains("Item 3"));
        for (String item : itensHashSet ) {
            System.out.println("Foreach item: " +item);
        }
    }
}

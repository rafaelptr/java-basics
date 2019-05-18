package br.com.fiap.lambda;

import java.util.ArrayList;

public class LambdaSample {
    public static void main(String[] args) {

        //
//       Runnable r = new Runnable(){
//            @Override
//            public void run() {
//                for (int i = 0 ; i < 20; i++){
//                    System.out.println(i);
//                }
//            }
//        };
        // as lambda
        Runnable r = () -> {
            for (int i = 0 ; i < 20; i++){
                System.out.println(i);
            }
        };
       new Thread(r).start();


        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Teste");
        arrayList.add("este");
        arrayList.add("ste");
        arrayList.add("te");
        arrayList.add("e");

        arrayList.forEach(s -> {
            System.out.println(s.charAt(0));
        });

        for (String s : arrayList) {
            System.out.println(s.charAt(0));
        }
    }
}

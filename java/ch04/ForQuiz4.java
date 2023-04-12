package com.green.java.ch04;

public class ForQuiz4 {
    public static void main(String[] args) {

        //    *
        //   **
        //  ***
        // ****
        //*****

        //내가 풀은
        int star = 5;
//        for(int i = 0; i <star; i++) {
//            for(int z = i; z <star; z++){
//                System.out.printf(" ");
//            }
//            for(int j = 0; j<=i; j++){
//                System.out.printf("*");
//            }
//            System.out.println();
//        }


        //선생님코드
//        int star = 6;
//        for(int i = 1; i <star; i++) {
//            for(int z = star; i<z; z--){
//                System.out.printf(" ");
//            }
//            for(int z = 0; z<i; z++){
//                System.out.printf("*");
//            }
//            System.out.println();
//        }



//        for(int i = 0; i <star; i++) {
//            String s = "";
//            for(int j = 0; j<=i; j++){
//                s += "*";
//            }
//            System.out.printf("%5s", s);
//            System.out.println();
//        }

        
        //for문 두개로
        for(int i = star; i >0; i--) {
            for (int z = 1; z <= star; z++) {
                if (z < i) {
                    System.out.print("_");
                } else {
                    System.out.printf("*");
                }
            }
            System.out.println();
        }



    }
}

package com.green.java.ch05;

    /*
    p.207
    */




public class ArrayEx12 {
    public static void main(String[] args) {
        String[] names = {"Kim", "Park", "Yi"};


        for (int i = 0; i < names.length; i++) {
            System.out.printf("names[%d]: %s\n", i, names[i]);
        }

        names[0] = "Yu";
        int i=0;
        for (String nm : names) { //nm에 들어가는건 0번방 names가 nm으로 들어감 내려가고 다시 올라와서 반복
                
            System.out.printf("names[%d]: %s\n", i++, nm);
        }
        // 컬렉션...? 값을 여러개 담을수 있는 존재, 그중 순서가 있는 존재는 foreach문 사용가능
        // 값만 사용해야할때 사용
    }
}


/*


 */



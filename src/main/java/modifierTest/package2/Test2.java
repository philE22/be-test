package modifierTest.package2;

//import modifierTest.package1.Parents;

import modifierTest.package1.Parents;

class Child extends modifierTest.package1.Parents {
    public void printEach() {
//        System.out.println(a);
//        System.out.println(b);
        System.out.println(c); // 다른 패키지의 하위 클래스
        System.out.println(d);
    }
}


public class Test2 {
    public static void main(String[] args) {
        Parents p = new Parents();
//        System.out.println(p.a);
//        System.out.println(p.b);
//        System.out.println(p.c);
        System.out.println(p.d);
    }
}

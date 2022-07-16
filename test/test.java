/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author B.M.D.C.Bandara
 */
//class A{
//    private static int counter;
//    public static int getCounter(){ return counter++;}
//    private static int innerCounter;
//    public static int getInnerCounter(){ return innerCounter++;}
//    private String name;
//    A(){ name = "A"+getCounter();
//        System.out.println(name);};
//    class B{
//        private String name;
//        B(){
//            name = "B"+getInnerCounter();
//            //System.out.println(counter);
//            System.out.println(A.this.name + name);
//            //System.out.println(counter);
//        }
//    }
//    void m1(){ new A().new B();}
//    void m2(){ new A.B();}
//    void m3(){ new B();}
//    
//    public static void main(String[] args) {
//        A a = new A();
//        a.m1();
//        a.m2();
//        a.m3();
//    }
//    /*
//C1D0
//C0D1
//C0D2
//    */
//}

enum Rank{
    SOLDIER,SERGENT,CAPTAIN;
}
class A{
    public static void main(String[] args) {
        Rank a = Rank.SERGENT;
        
        switch(a){
            case SOLDIER:
                System.out.println("Soldier Hi!");
                break;
            case SERGENT:
                System.out.println("Sergent Hi!");
                break;
            case CAPTAIN:
                System.out.println("Captain Hi!");
                break;
        }
    }
}
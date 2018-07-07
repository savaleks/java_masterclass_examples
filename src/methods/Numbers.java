package methods;

class Numbers {

   public static int a = 7;
   public int b = 4;

    public static void main(String[] args) {
        final Numbers a1 = new Numbers();
        final Numbers a2 = new Numbers();
        // turi buti uzrasyta Numbers.a = 3;
        a1.a = 3;//irasem reiksme i klases kintamaji (static field);
        a2.b = 6;
        System.out.println(a1.b);
        System.out.println(a2.a);
        System.out.println(a2.b);
    }
}
/*output:
4
3
6
*/
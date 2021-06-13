public class Variables {

    /**
     * This is documentation
     * @param args
     */

    public static void main(String[] args) {

        /*
        This is use of variables
        */

        int a;
        int b = 2;
        int c = 15;
        a = 1;
        a = 2;

        System.out.println(a + b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(c % 10);
        System.out.println(c % 2);


        double d = 125; //Double.MAX_VALUE
        float f = 1234; //Float.MAX_VALUE
        long l = 121434; //Long.MAX_VALUE
        short s = 123; //Short.MAX_VALUE
        byte h = 12; //Byte.MAX_VALUE

        System.out.println(d);
        System.out.println(f);
        System.out.println(l);
        System.out.println(s);

        System.out.println(-a);

        System.out.println(a++);
        System.out.println(a);

        // a = 3;
        int t = a--;            // --a , a--
        System.out.println(t);  //   2 , 3
        System.out.println(a);  //   2 , 2

        a++;

        System.out.println(a);

        a += 5; // a -= b + c;

        System.out.println(a);

        int r = (a + 3) * 4;
        System.out.println(r);

        a = +a;

    }
}

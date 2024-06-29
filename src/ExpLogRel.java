public class ExpLogRel {
    public static void main(String[] args) {
        System.out.println("EXPRESSOES LOGICAS:");
        boolean a = true;
        boolean b = false;
        boolean c = a && b;
        boolean d = a || b;
        boolean e = !a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a && b = " + c);
        System.out.println("a || b = " + d);
        System.out.println("!a = " + e);

        System.out.println("EXPRESSOES RELACIONAIS:");
        int g = 10;
        int h = 20;
        boolean i = g == h;
        boolean j = g != h;
        boolean k = g < h;
        boolean l = g > h;

        System.out.println("g = " + g);
        System.out.println("h = " + h);
        System.out.println("g == h? = " + i);
        System.out.println("g != h? = " + j);
        System.out.println("g < h? " + k);
        System.out.println("g > h? " + l);



    }
}

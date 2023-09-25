package StringBuilder;

public class TestStringBuilder {

    public static void main(String[] args) {
        String s1 = "Auto";
        System.out.println(s1);
        s1 = s1 + " BMW ";
        System.out.println(s1);

        StringBuilder sb1 = new StringBuilder("Auto");
        System.out.println(sb1);
        sb1.append(" BMW ");
        System.out.println(sb1);
        s1 = s1 + " BMW ";
        System.out.println(s1);
        sb1.append(" BMW ");
        System.out.println(sb1);
        sb1.append(" m5 ");
        System.out.println(sb1);
        sb1.append(" 25 ");
        System.out.println(sb1);
        System.out.println("capacity = " + sb1.capacity());
        System.out.println("length = " + sb1.length());

        StringBuffer sBuf = new StringBuffer("\n Auto");
        System.out.println(sBuf);

        sBuf.append(" WolksVagen Golf");
        System.out.println(sBuf);

        sBuf.append(" 33");
        System.out.println(sBuf);

        System.out.println("capacity = " + sBuf.capacity());
        System.out.println("length = " + sBuf.length());

        sBuf.insert(5, "GT");
        System.out.println(sBuf);

        char[] charBf;
        sBuf.getChars(5, 10, charBf, 0);
        System.out.println(charBf);


        String s2 = "Hello";
        System.out.println(s2);
        s2 = s2 + " World! ";
        System.out.println(s2);






    }
}

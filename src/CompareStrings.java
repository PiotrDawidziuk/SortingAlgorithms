public class CompareStrings {

    public static void main(String[] args) {

        String a = "aaaaa";
        String b = "bbbbb";


        int c = a.compareTo(b);
        int d = b.compareTo(a);
        int e = a.compareTo(a);

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

    }

}

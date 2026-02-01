public class Main{
    public static void main(String[] args){
        Time t = new Time(21, 32, 24);
        System.out.println(t.toUniversal());

        Time t2 = new Time(12, 43, 12);
        t.add(t2);

        System.out.println(t.toUniversal());
    }
}
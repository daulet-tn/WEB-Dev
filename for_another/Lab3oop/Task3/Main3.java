public class Main3 {
    public static void main(String[] args) {
        SimpleCollection<String> col = new SimpleCollection<>();

        col.add("Tea");
        col.add("Coffee");

        System.out.println(col.contains("Tea"));
        System.out.println(col.size());
        System.out.println(col.isEmpty());
    }
}
public class Main5 {
    public static void main(String[] args) {
        Sweet[] sweets = {
            new Sweet("Cake", 100),
            new Sweet("Candy", 50)
        };

        Sort.bubbleSort(sweets);

        for(Sweet s : sweets) {
            System.out.println(s);
        }
    }
}
public class Triangle{

    private int width;

    public Triangle(int width){
        this.width = width;
    }

    public String Starttriangle(){

        String result ="";

        for (int i = 1; i <= width + 1; i++){
            for (int j = 1; j < i; j++){
                result += "[*]";
            }
            result += "\n";
        }

        return result;
    }

}
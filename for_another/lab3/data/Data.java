public class Data{
    private int count;
    private double max;
    private double sum;
    
    public Data(){
        count = 0;
        max = 0;
        sum = 0;
    }

    public void add(double value){
        if(count ==0){
            max = value;
        }
        else if(value > max){
            max = value;
        }
        sum += value;
        count ++;
    }

    public double getAverage(){
        if(count == 0){
            return 0;
        }
        return sum / count;
    }

    public double getMax(){
        return max;
    }

}
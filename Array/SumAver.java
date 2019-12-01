/**
 * SumAver
 * Sum and Averrage of Array
 */
public class SumAver {

    public static void main(String[] args) {
        int[] num = new int[]{1,23,23,212,21,63,54,87};
        int sum = 0;
        for(int i : num){
        sum += i;
        }
        
        double aver = sum / num.length;
        System.out.printf("Suma: %d && Media: %s", sum,aver);
    }
    
}
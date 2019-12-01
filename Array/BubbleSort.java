/**
 * BubbleSort
 */
public class BubbleSort {

    void bubble(int array[]){
        int n = array.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if(array[j] > array[j+1]){
                    int swap = array[j];
                    array[j] = array[j+1];
                    array[j+1] = swap;
                }
                

            }
        }
    }
    void print(int array[]){
        int n = array.length;
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BubbleSort ref = new BubbleSort();
        int[] array = new int[]{12,12,-12,1,45,754,23,57,347,34237,87,2342};
        ref.bubble(array);
        System.out.println("Tabloul sortat");
        ref.print(array);
    }
    
}
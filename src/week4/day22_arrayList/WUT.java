package week4.day22_arrayList;

public class WUT {
    public static void main(String[] args) {

        int[][] array = {{100, 20, 300},{10,1000,50},{-200,400,0}};
        
        int max = array[0][0];
        int min = array[0][0];
        

        for (int[] each : array) {
            for (int i : each) {
                if (max < i){
                    max = i;
                } 
                if (min > i){
                    min = i;
                }
            }
        }

        System.out.println("min = " + min);
        System.out.println("max = " + max);

    }
}

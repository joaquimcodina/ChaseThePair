import java.util.Arrays;

public class Min {
    public static int[] init(Integer setA[], Integer setB[], int toChase){

        int min[] = new int[2];

        //Sort ascending lists
        Arrays.sort(setA);
        Arrays.sort(setB);

        for (int i = 0; i < setA.length; i++){
            if(setA[i] <= toChase){
                min[0] = setA[i];
            }
        }

        for (int i = 0; i < setB.length; i++){
            if(setB[i] <= toChase){
                min[1] = setB[i];
            }
        }
        return min;
    }
}
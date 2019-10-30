import java.util.Arrays;
import java.util.Collections;

public class Max {
    public static int[] init(Integer setA[], Integer setB[], int toChase){

        int max[] = new int[2];

        //Sort descending lists
        Arrays.sort(setA, Collections.reverseOrder());
        Arrays.sort(setB, Collections.reverseOrder());

        for (int i = 0; i < setA.length; i++){
            if(setA[i] >= toChase){
                max[0] = setA[i];
            }
        }

        for (int i = 0; i < setB.length; i++){
            if(setB[i] >= toChase){
                max[1] = setB[i];
            }
        }

        if(toChase >= setA[0]){
            max[0] = setA[0];
        }

        if(toChase >= setB[0]){
            max[1] = setB[0];
        }

        return max;
    }
}
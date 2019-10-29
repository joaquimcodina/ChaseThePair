public class Result {
    public static int[] init(int min[], int max[], int toChase){

        int result[] = new int[2];

        int resA1 = toChase - min[0];
        int resA2 = toChase - min[1];
        int resB1 = max[0] - toChase;
        int resB2 = max[1] - toChase;

        if(resA1 <= resB1){
            result[0] = min[0];
        } else {
            result[0] = max[0];
        }

        if(resA2 <= resB2){
            result[1] = min[1];
        } else {
            result[1] = max[1];
        }
        return result;
    }
}
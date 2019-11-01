public class Result {
    public static int[] init(int min[], int max[], int toChase){

        int result[] = new int[2];

        if((toChase - min[0]) <= (max[0] - toChase)){
            result[0] = min[0];
        } else {
            result[0] = max[0];
        }

        if((toChase - min[1]) <= (max[1] - toChase)){
            result[1] = min[1];
        } else {
            result[1] = max[1];
        }
        return result;
    }
}
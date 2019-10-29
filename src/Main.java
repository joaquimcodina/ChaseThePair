import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        //Initialize toChase and arrays
        int toChase = 38;
        Integer setA[] = {81,87,47,59,81,18,25,40,56,0};
        Integer setB[] = {94,11,62,89,28,74,11,45,37,6};

        int min[] = Min.init(setA, setB, toChase);
        int max[] = Max.init(setA, setB, toChase);
        int result[] = Result.init(min, max, toChase);

    }
}
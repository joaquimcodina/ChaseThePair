import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        //Initialize toChase and arrays
        int toChase = 231;
        Integer setA[] = {1,23,45,66,84,113,145,178,205,210,221,250,264,300};
        Integer setB[] = {5,31,40,52,73,103,126,162,195,214,225,241,256,267};

        //Read file and get sets
        File logs = new File("logs.txt");
        GetSets.runExe(logs);
        setA = GetSets.getSetA(setA, logs);
        setB = GetSets.getSetB(setB, logs);
        toChase = GetSets.getRandomNumber(logs, toChase);
        logs.delete();

        //Execute operations
        long start = System.currentTimeMillis();
        int max[] = Max.init(setA, setB, toChase);
        int min[] = Min.init(setA, setB, toChase);
        int result[] = Result.init(min, max, toChase);
        long end = System.currentTimeMillis();

        //Print result
        System.out.println("Number to chase: " + toChase+"\n" +
                "SetA: " + Arrays.toString(setA)+"\n" +
                "SetB: " + Arrays.toString(setB)+"\n" +
                "Result: " + Arrays.toString(result)+"\n" +
                "Time: "+(end - start)/1000.0+"s");
    }
}
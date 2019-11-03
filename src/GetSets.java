import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GetSets {

    public static void runExe(File logs) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);

        if(!logs.exists()){
            Process process = new ProcessBuilder("resources/setsGenerator-linux-amd64").start();
            InputStream is = process.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String line, n;

            OutputStream os = process.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);

            while ((line = br.readLine()) != null) {
                try {
                    if(!line.contains("Number to chase (as example)")){
                        System.out.println(line);
                    }
                    if(line.contains("Insert Sets size: (recommended: 10M)")){
                        n=sc.nextLine();
                        bw.write(n);
                        bw.newLine();
                        bw.flush();
                    }
                    if(line.contains("Would you want to export Sets used in this run? (N/y)")){
                        n=sc.nextLine();
                        bw.write(n);
                        bw.newLine();
                        bw.flush();
                        break;
                    }

                } catch (IOException ex) {
                    Logger.getLogger(GetSets.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            Thread.sleep(1000);
            bw.close();
            br.close();
        }
    }

    public static int getRandomNumber(File logs, int toChase) throws IOException {

        if(logs.exists()){
            //Read file logs.txt
            BufferedReader objReader;
            String currentLine;
            objReader = new BufferedReader(new FileReader(logs));
            while ((currentLine = objReader.readLine()) != null) {
                String numbers = currentLine;
                String[] aux = numbers.split("A|,|-|B|\\[|\\]");

                Integer[] auxInt = new Integer[aux.length];
                int n = 0;
                for (int i = 0; i < aux.length; i++) {
                    if (!aux[i].isEmpty() && !aux[i].equals("") && aux[i] != null) {
                        auxInt[n++] = Integer.parseInt(aux[i]);
                    }
                }

                //get set and get random value
                Integer set[] = new Integer[n];
                for (int i = 0; i < set.length; i++) {
                    set[i] = auxInt[i];
                }
                Arrays.sort(set); //sort set
                toChase = (int)((Math.random() * (set[set.length-1] - set[0])) + set[0]);
            }
        }
        return toChase;
    }

    public static Integer[] getSetA(Integer set[], File logs) throws IOException {

        if(logs.exists()){
            //Read file logs.txt
            BufferedReader objReader;
            String currentLine;
            objReader = new BufferedReader(new FileReader(logs));
            while ((currentLine = objReader.readLine()) != null) {
                String numbers = currentLine;
                String[] aux = numbers.split("A|,|-|B|\\[|\\]");

                Integer[] auxInt = new Integer[aux.length];
                int n = 0;
                for (int i = 0; i < aux.length; i++) {
                    if (!aux[i].isEmpty() && !aux[i].equals("") && aux[i] != null) {
                        auxInt[n++] = Integer.parseInt(aux[i]);
                    }
                }

                //get SetA
                set = new Integer[n/2];
                for (int i = 0; i < set.length; i++) {
                    set[i] = auxInt[i];
                }
            }
        }
        return set;
    }

    public static Integer[] getSetB(Integer set[], File logs) throws IOException {

        if(logs.exists()){
            //Read file logs.txt
            BufferedReader objReader;
            String currentLine;
            objReader = new BufferedReader(new FileReader(logs));
            while ((currentLine = objReader.readLine()) != null) {
                String numbers = currentLine;
                String[] aux = numbers.split("A|,|-|B|\\[|\\]");

                Integer[] auxInt = new Integer[aux.length];
                int n = 0;
                for (int i = 0; i < aux.length; i++) {
                    if (!aux[i].isEmpty() && !aux[i].equals("") && aux[i] != null) {
                        auxInt[n++] = Integer.parseInt(aux[i]);
                    }
                }

                //get SetB
                set = new Integer[n/2];
                for (int i = 0; i < set.length; i++) {
                    set[i] = auxInt[(set.length) + i];
                }
            }
        }
        return set;
    }
}
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        File myFileInput = new File("C:\\Myself\\Aritmetic operation\\src\\input.txt");
        File myFileOutput = new File("C:\\Myself\\Aritmetic operation\\src\\output.txt");
        FileReader fr = new FileReader(myFileInput);
        FileWriter fw = new FileWriter(myFileOutput);
        String s1 = "";
        String s2 = "";
        char a;
        int b;

        while ((a = (char) (fr.read())) != 32) {

            s1 = s1 + a;
        }
        System.out.println(s1);

//If i == -1, end the loop / stop reading, because it reached the end of file.

        for (;;) {

            if ((b = ((fr.read()))) == -1) {
                break;
            }
            s2 = s2 + (char) b;
        }
        System.out.println(s2);
        Long l = Long.parseLong(s1) + Long.parseLong(s2);
        System.out.println(l);
        fw.write(l.toString());
        fr.close();
        fw.close();
    }

}

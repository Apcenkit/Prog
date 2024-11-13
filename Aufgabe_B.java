import java.util.Scanner;

public class Aufgabe_B {
    public static void main(String[] args){

        //Addition of the separator
        String separator = args[0];

        Scanner input = new Scanner(System.in);

        String result = "";

        int i = 0;
        //A loop that cycles 'i' values from 0 to 2. Each cycle, an input as well as the separator will be added to 'result'
        while(i < 3){

            String line = input.nextLine().toLowerCase();

            result += line;
            //Ensures that a third separator does not get added after the third line
            if(i != 2){

                result += separator;

            }

            i++;
        }
        //closing the scanner
        input.close();

        System.out.println(result);

    }
}
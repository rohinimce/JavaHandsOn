package stringPrograms;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Reference {
    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // read the name from the input
        String line = br.readLine();

        // print the name
        System.out.println("Hello "+ line);

    }

    public static void addArray (){

        int[] numArray = new int[4]; // Define an array of integers of size 4.
        Scanner s = new Scanner(System.in);
        int i;
        for(i=0; i<4; i++){
            numArray[i] = s.nextInt(); // Get the input
        }

        int sum = 0;
        // Write the logic to add these integers here:

        for(int j=0;j<4;j++){
            sum=sum+numArray[j];
        }


        System.out.print(sum); // Print the sum
        s.close();
    }
}

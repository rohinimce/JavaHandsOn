package javaProgram;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmailAddress {

    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\Rohini Rajendran\\Desktop\\Resume\\RohiniRajendran_11_03_2021.docx";

        PrintWriter pw
                = new PrintWriter("C:\\Users\\Rohini Rajendran\\Desktop\\output.txt");

        BufferedReader br
                = new BufferedReader(
                new FileReader(filePath));


//File file= new File(filePath);
        //   String str="fhehkertkerjt erkwejrlk erkjwkrjwlek rohinimce@gmail.com";
        Pattern p
                = Pattern.compile(
                "[a-zA-Z0-9]"
                        + "[a-zA-Z0-9_.]"
                        + "*@[a-zA-Z0-9]"
                        + "+([.][a-zA-Z]+)+");

        String line = br.readLine();

        while (line != null) {

            Matcher m = p.matcher(line);

            // If any match
            while (m.find()) {

                // write the email id
                // to output.txt file
                pw.println(m.group());
            }

            // Goto next line in input.txt file
            line = br.readLine();
        }

        pw.flush();
    }  }
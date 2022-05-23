//https://howtodoinjava.com/java/io/java-read-file-to-string-examples/

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class MarkdownParse {

    public static ArrayList<String> getLinks(Scanner myReader) {
        boolean next = true;
        String line = myReader.nextLine();
        ArrayList<String> result = new ArrayList<>();
        
        while (next) {
            int currentIndex = 0;
            while(currentIndex < line.length()) {
                int openBracket = line.indexOf("[", currentIndex);
                int closeBracket = line.indexOf("]", openBracket);
                if(line.charAt(closeBracket + 1) != new Character('(')) {  
                    break;
                }
                else {
                    int openParen = closeBracket + 1;
                    int closeParen = line.indexOf(")", openParen);
                    result.add(line.substring(openParen + 1, closeParen));
                    currentIndex = closeParen + 1; 
                }  
                break;
                
            }
            next = myReader.hasNext();
            if (!next) {
                break;
            }
            line = myReader.nextLine();
        }
        return result;
    }


    public static void main(String[] args) throws IOException {
        String fileName = "/Users/emilyguo/Desktop/CSE15L/report 4/ednafiles/report4-test1.md";
        File file = new File(fileName);
        Scanner myReader = new Scanner(file);
        ArrayList<String> links = MarkdownParse.getLinks(myReader);
        ArrayList<String> result = new ArrayList<>();

        for (int i =0; i < 2; i ++) {
            System.out.println(links.get(i));
        }
    }
}

import static org.junit.Assert.*;
import org.junit.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class MarkdownParseTest {

    @Test
    public void testMarkdownTest1() throws IOException {

        String fileName = "/Users/emilyguo/Desktop/CSE15L/report 4/ednafiles/report4-test1.md";
        File file = new File(fileName);
        Scanner myReader = new Scanner(file);
        ArrayList<String> links = MarkdownParse.getLinks(myReader);
        ArrayList<String> result = new ArrayList<>();
        result.add("`google.com");
        result.add("google.com");
        result.add("ucsd.edu");
        
        assertEquals(result, links);
    }

    @Test
    public void testMarkdownTest2() throws IOException {

        String fileName = "/Users/emilyguo/Desktop/CSE15L/report 4/ednafiles/report4-test2.md";
        File file = new File(fileName);
        Scanner myReader = new Scanner(file);
        ArrayList<String> links = MarkdownParse.getLinks(myReader);
        ArrayList<String> result = new ArrayList<>();
        result.add("a.com");
        result.add("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule");
        result.add("https://cse.ucsd.edu/");
        
        assertEquals(result, links);
    }

    

    

}


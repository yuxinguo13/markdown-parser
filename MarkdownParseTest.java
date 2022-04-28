import static org.junit.Assert.*;
import org.junit.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class MarkdownParseTest {

    @Test
    public void testMarkdownTest() throws IOException {

        String fileName = "test-file.md";
        File file = new File(fileName);
        Scanner myReader = new Scanner(file);
        ArrayList<String> links = MarkdownParse.getLinks(myReader);
        ArrayList<String> result = new ArrayList<>();
        result.add("https://something.com");
        result.add("some-thing.html");
        assertEquals(result, links);
    }

    

}


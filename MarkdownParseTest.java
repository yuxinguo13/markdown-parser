import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;


public class MarkdownParseTest {

    @Test
    public void testMarkdownTest() throws IOException {

        Path fileName = Path.of("test-file3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> result = new ArrayList<>();
        result.add("https://github.com/yuxinguo13");
        result.add("https://ucsd.edu");
        assertEquals(result, links);
    }

}


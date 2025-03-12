package hexlet.code;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;




public class CreatingFiles {

    public static ArrayList<Object> getData(String content1, String content2) throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        ArrayList<Object> array = new ArrayList<>();

        Path writheFilePath1 = Paths.get("/home/notsleeps/java-project-71/app/src/main/java/hexlet/code/file1.json");
        Path writheFilePath2 = Paths.get("/home/notsleeps/java-project-71/app/src/main/java/hexlet/code/file2.json");

        try {
            Path createdFilePath1 = Files.createFile(writheFilePath1);
            Path createdFilePath2 = Files.createFile(writheFilePath2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Files.write(writheFilePath1, content1.getBytes());
        Files.write(writheFilePath2, content2.getBytes());

        File file1 = new File("file1.json");
        File file2 = new File("file2.json");

        Map data1 = mapper.readValue(file1, Map.class);
        Map data2 = mapper.readValue(file2, Map.class);

        array.add(data1);
        array.add(data2);



         return array;
    }


    public static void main(String[] args) throws Exception {

        String text1 = """
            {
              "host": "hexlet.io",
              "timeout": 50,
              "proxy": "123.234.53.22",
              "follow": false
            }""";

        String text2 = """
            {
               "timeout": 20,
               "verbose": true,
               "host": "hexlet.io"
            }""";

    getData(text1, text2);

    }
}

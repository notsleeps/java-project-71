package hexlet.code;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import lombok.Setter;

import java.io.File;
import java.io.IOException;

@Getter
@Setter
public class ParsingFiles {

    private String host;
    private int timeout;
    private String proxy;
    private boolean follow;
    private boolean verbose;

    ObjectMapper objectMapper = new ObjectMapper();

    File file = new File("file1.json");

    ParsingFiles parsingFiles = objectMapper.readValue(file, ParsingFiles.class);


    public ParsingFiles() throws IOException {
    }
}

package hexlet.code;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

@Command(
name = "gendiFF",
description = "Compares two configuration files and shows a difference.",
mixinStandardHelpOptions = true,
version = "gendiff 1.0"
)

public class App implements Runnable  {
    @Override
    public void run() {
    }

    @Option(names = {"-f", "--format"},
            description = "output format [default: stylish]",
            defaultValue = "stylish",
            paramLabel = "format"
    )
    private String format;

    @Parameters(index = "0", description ="path to first file", paramLabel = "filepath1")
    private String filepath1;

    @Parameters(index = "0", description ="path to second file", paramLabel = "filepath2" )
    private String filepath2;


    public static void main(String[] args) {
       // System.out.println("Hello World!");
        int exitCode = new CommandLine(new App()).execute(args);
        System.exit(exitCode);
    }
}

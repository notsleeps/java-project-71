package hexlet.code;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

@Command(
name = "gendiff",
description =  "testing picocli",
mixinStandardHelpOptions = true,
version = "gendiff 1.0"
)

public class App implements Runnable  {
    @Override
    public void run() {
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int exitCode = new CommandLine(new App()).execute(args);
        System.exit(exitCode);
    }
}

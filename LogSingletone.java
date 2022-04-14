import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class LogSingletone<filePath> {
    private LogSingletone() {}
    static String filePath = "log.txt";

    public static void writetofile(String text) throws IOException {
        Files.writeString(Paths.get(filePath), text, StandardOpenOption.APPEND);
    }


}

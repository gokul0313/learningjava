import java.io.File;
import org.tomlj.Toml;
import org.tomlj.TomlParseResult;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class tomlread{
    public static void readtoml()throws IOException{

       String content= Files.readString(Paths.get("fundgible.toml"));

       Toml.parse(content);


    }
}
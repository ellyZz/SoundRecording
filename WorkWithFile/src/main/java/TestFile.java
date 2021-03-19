import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collection;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.TrueFileFilter;

public class TestFile {
    public static void main(String[] args) {
        File mainPath = new File("C://test");
        if (!mainPath.exists()) {
            try {
                Files.createDirectories(Paths.get("C://test/Amon Amarth"));
                Files.createDirectories(Paths.get("C://test/Amon Amarth/2004 - Fate Of Norns"));
                Files.createDirectories(Paths.get("C://test/Amon Amarth/2016 - Jomsviking"));
                Files.createDirectories(Paths.get("C://test/Amon Amarth/2019 - Berserker"));
                Files.createFile(Paths.get("C://test/Amon Amarth/2004 - Fate Of Norns/01 - An Ancient Sign Of Coming Storm.mp3"));
                Files.createFile(Paths.get("C://test/Amon Amarth/2004 - Fate Of Norns/02 - Where Death Seems To Dwell.mp3"));
                Files.createFile(Paths.get("C://test/Amon Amarth/2004 - Fate Of Norns/03 - The Fate Of Norns.mp3"));
                Files.createFile(Paths.get("C://test/Amon Amarth/2016 - Jomsviking/01 First Kill.mp3"));
                Files.createFile(Paths.get("C://test/Amon Amarth/2016 - Jomsviking/02 Wanderer.mp3"));
                Files.createFile(Paths.get("C://test/Amon Amarth/2016 - Jomsviking/03 On A Sea Of Blood.mp3"));
                Files.createFile(Paths.get("C://test/Amon Amarth/2019 - Berserker/01 Fafner's Gold.mp3"));
                Files.createFile(Paths.get("C://test/Amon Amarth/2019 - Berserker/02 Crack the Sky.mp3"));
                Files.createFile(Paths.get("C://test/Amon Amarth/2019 - Berserker/03 Mjölner, Hammer of Thor.mp3"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            File path = new File("C://test");
            File saveToFile = new File("C://test/Structure.txt");
            Collection<File> files = FileUtils.listFilesAndDirs(path, TrueFileFilter.TRUE, TrueFileFilter.TRUE);
            for (File file : files) {
                System.out.println(file);
            }
            try {
                FileUtils.writeLines(saveToFile, files);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else System.out.println("Remove folder 'test' from disk C");
    }
}

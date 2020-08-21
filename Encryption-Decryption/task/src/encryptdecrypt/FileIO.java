package encryptdecrypt;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class FileIO implements DataIO {

    @Override
    public void write(String str, String path) {
        try (FileWriter fw = new FileWriter(path)) {
            fw.write(str);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public String read(String str, String path) {
        try (Scanner sc = new Scanner(new File(path))) {
            return sc.nextLine();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            return "-1";
        }
    }
}

package Controllers;

import Models.Services;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;

public class WriterFile {

     void writerFile(String linkFile, Object services) {
        FileWriter wf;
        BufferedWriter bw = null;
        try {
            wf = new FileWriter(linkFile,true);
            bw = new BufferedWriter(wf);
            bw.write(services + "\n");
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

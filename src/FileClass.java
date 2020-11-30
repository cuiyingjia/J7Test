import jdk.internal.util.xml.impl.Input;

import java.io.*;
public class FileClass {
    public static void main(String[] args) throws IOException {
        String f="file1.java";
        File f1 = new File(f);

        InputStream iout = new FileInputStream(f1);
//        RandomAccessFile rf = new RandomAccessFile(f1);
//        FileOutputStream iout = new FileOutputStream(f1);
//        Reader iout = new FileReader(f1);
//        InputStream iout = new Input(f1);
    }
}

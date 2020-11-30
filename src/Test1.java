import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test1 {
//    public static void main(String[] args) {
//        int x = 0;
//        if(x > 0)
//            System.out.println("One");
//            System.out.println("Two");
//    }
//public static void main(String[] args) {
//    int y = 127;
//    switch (y){
//        default:
//            System.out.println("129 ");
//        case 127 :
//            System.out.println("127 ");
//        case 128:
//            System.out.println("128 ");
//    }
//}
    static int calc(int x){
        if ( x == 0)
            return 1;
        else
            return x * calc(x-1);
    }
public static void main(String[] args) {
//    System.out.println(calc(5));
//    meth(args);
    }

public  void meth(String[] arg ){
    System.out.println(arg);
    System.out.println(arg[1]);
}
public void writeFile(){
    Path inputFile = Paths.get("");
    Path outputFile = Paths.get("");

//    BufferedReader reader = Files.newBufferedReader(inputFile, Charset.defaultCharset());
//    BufferedWriter writer = Files.newBufferedWriter(outputFile,Charset.defaultCharset());

}

}

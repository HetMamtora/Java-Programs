package bufferedstreamseg;
import java.io.*;

public class BufferedStreamsEg {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        FileReader fis=new FileReader("Test1.txt");
        BufferedReader bis=new BufferedReader(fis);
        
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.mark(10);
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.reset();
        
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        
        System.out.println("String "+bis.readLine());
    }
    
}

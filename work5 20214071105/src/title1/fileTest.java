package title1;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class fileTest {
    public static void main(String[] args) throws IOException{
        File file = new File("c:\\windows");
        long timeIn=1970_01_01L;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        File[] names=file.listFiles();
        for (File f: names){
            long time=f.lastModified();
            long newTime=timeIn+time;
            Date date = new Date(newTime);
            String timeString= sdf.format(date);
            System.out.print(timeString);
            System.out.print("    ");
            if (f.isDirectory()){
                System.out.print("<DIR>");
            }
            System.out.print("    ");
            long size=f.length();
            String s= String.valueOf(size);
            if (s.equals("0")){
                s=" ";
            }
            System.out.print("    ");
            System.out.print(s);
            System.out.print("    ");
            System.out.println(f.getCanonicalPath());
        }
    }
}

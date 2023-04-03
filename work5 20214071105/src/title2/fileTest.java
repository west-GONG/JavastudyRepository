package title2;

import java.io.File;

public class fileTest {
    // 删除文件夹
    private static void deleteDirectory(File file) {
        if (file.isFile()) {
            file.delete();
        } else {
            String[] childFilePaths = file.list();
            for (String childFilePath : childFilePaths) {
                File childFile = new File(file.getAbsolutePath() + "/" + childFilePath);
                deleteDirectory(childFile);
            }
            file.delete();
        }
    }

    public static void main(String[] args) {
        File del_file = new File("D:/Test/ibs" + "/temp/");
        deleteDirectory(del_file);
    }

}

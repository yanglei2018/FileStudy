package demo01;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Recurison {
    public static void main(String[] args) {
        File dir = new File("D:\\apache-groovy-sdk-3.0.1");
        List<File> allFileName = getAllFileName(dir);

    }

    /**
     * 递归访问文件夹，获取所有文件夹和文件名称
     * @param dir
     */
    public static List<File> getAllFileName(File dir){
        List<File> fileName =new ArrayList<>();
        fileName.add(dir);

        File[] files = dir.listFiles();
        for (File file : files) {
            if(file.isDirectory()){
                getAllFileName(file);
                fileName.add(file);

            }
            else {
                fileName.add(file);
            }
        }
        for (int i = 0; i < fileName.size(); i++) {
            System.out.println(fileName.get(i).toString());
        }
        return fileName;
    }
}

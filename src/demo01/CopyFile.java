package demo01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
通过输入输出流复制文件
 */
public class CopyFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fis =new FileInputStream("E://123.txt");
        FileOutputStream fos = new FileOutputStream("D://123.txt");

        int len = 0;
        while ((len = fis.read())!=-1){//判断文件是否到末尾
            fos.write(len);
        }
        fis.close();
        fos.close();
    }
}

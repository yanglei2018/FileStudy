package demo01;

import java.io.File;

/**
 * java.io.File类 java 把电脑中的文件和文件夹封装成了一个File类
 * 创建一个文件/夹
 * 删除一个文件/夹
 * 获取一个文件/夹
 * 判断文件是否存在
 * 遍历文件/夹
 * 获取文件大小
 * File类无关操作系统
 *
 */
public class Demo01File {
    public static void main(String[] args) {
        String separator = File.separator;
        System.out.println(separator);//文件名称分隔符

        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);//路径分隔符
    }
}

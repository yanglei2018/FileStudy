package demo01;

import java.io.File;

/*
    遍历目录
    public String[] list(); 返回一个String数组，获取目录中所有的文件和文件夹名称
 */
public class Demo03 {
    public static void main(String[] args) {
        show01();

        show02();
    }

    private static void show02() {
        File f1 = new File("E:");
        File[] files = f1.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }

    private static void show01() {
        File f1 = new File("E:");//返回String数组
        String[] list = f1.list();
        for (String f : list) {
            System.out.println(f);
        }
    }
}

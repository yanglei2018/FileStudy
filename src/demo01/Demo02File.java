package demo01;

import java.io.File;

/*
    绝对路径：完整的路径，以盘符开始
    相对路径：简化的路径，
    注意：
    1.路径不区分大小写
 */
public class Demo02File {
    public static void main(String[] args) {
        /*
        File类的构造方法
         */
        show01();
        show02("E://","123.txt");
    }

    private static void show02(String parent, String child) {
        File f3 = new File(parent,child);
        System.out.println(f3);
    }


    private static void show01() {
        /*
         File(String pathname)
         */
        File f1 = new File("E:\\123.txt");
        System.out.println(f1);//重写了toString方法

        File f2 = new File("E:\\");
        System.out.println(f2);

        /*
        File(String parent, String child)
         */

    }
}

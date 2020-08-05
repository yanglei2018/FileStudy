package socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
    TCP通信的客户端：向服务器发送请求，给服务器发送数据，读取服务器返回的数据
    表示客户端的类：java.net.Socket
    套接字：包含了IP地址和端口号的网络单位
    构造方法:socket(String host, int port)
    实现步骤：
        1. 创建一个客户端对象Socket
        2. 使用Socket对象的方法getOutputStream()获取网络字节输出流对象
        3. 使用网络字节输出流对象的write方法给服务器发送数据。
        4. 使用getInputStream()方法获取网络字节输入流；
        5. 读取服务器会写的数据
 */
public class TCP_Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",8888);//创建Socket对象
        OutputStream os = socket.getOutputStream();//创建输出流
        os.write("hello, server".getBytes());//写入数据

        InputStream inputStream = socket.getInputStream(); //创建输入对象
        /*
            打印输出
         */
        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);
        System.out.println(new String(bytes,0,len));

        socket.close();//释放资源
    }
}

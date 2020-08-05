package socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
    服务器端：
    服务器的类：java.net.ServerSocket
    构造方法：
        ServerSocket(int port)
    服务器必须知道哪个客户端请求的服务器，可以使用accept方法获取到请求的客户端对象

    实现步骤：
    1.创建服务器对象
    2.使用accept方法，获取到请求的socket对象
    3. 获取到网络字节输入流
    4. 使用read方法进行读取客户端发送的数据
    5. 获取网络字节输出流
    6. 使用write方法给客户端会写数据
    7.释放资源
 */
public class TCP_Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);//创建服务端对象
        Socket accept = serverSocket.accept();//获取客户端对象
        InputStream inputStream = accept.getInputStream();//获取输入流
        byte[] bytes = new byte[1024];//打印接受到的数据
        int len = inputStream.read(bytes);
        System.out.println(new String(bytes,0,len));

        OutputStream outputStream = accept.getOutputStream();//创建输出流
        outputStream.write("thanks".getBytes());//给输出流赋值

        serverSocket.close();//释放资源
        accept.close();
    }

}

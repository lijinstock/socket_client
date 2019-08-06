/**
 * decription:
 *
 * @author:Administrator
 * @date:2019/8/6 19:12
 */

package com.li.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.1.3",8888);

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

        String line = null;

        while((line = br.readLine())!= null){
            System.out.println(line);
        }
        br.close();
        s.close();
    }

}

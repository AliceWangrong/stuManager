package com.utils;

import java.io.*;

public class ReadTxt {
    public StringBuffer reasd(File file) throws IOException {
        System.out.println("ReadTxt");
        StringBuffer texts =new StringBuffer();
        System.out.println(file.getPath());
        InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "GBK");//加上编码转换
        BufferedReader read = new BufferedReader(isr);
        String line = null;
        while ((line = read.readLine()) != null) {
            texts.append(line+"<br>");
        }
        read.close();
        return texts;
    }
    public static void main(String aggs[]) throws IOException {
        ReadTxt textParser=new ReadTxt();
        File file=new File("C:\\Users\\Lenovo\\IdeaProjects\\stuManager\\target\\stuManager\\upload\\1561964338142867\\src\\com\\itheima\\po\\Customer.java");
        System.out.println(textParser.reasd(file));
    }
}

package com.utils;

import java.io.File;

public class ReadDepthFile {
    Tree tree=new Tree();                 //创建全局构造树
    int m=0;                              //定位文件深度
    int row=0;                            //定位文件广度
    File[] fileList=null;                 //存储每层文件
    File[] nextfileList=null;             //下层将要遍历文件
    File[] Temporary=null;                //临时文件
    public Tree FileRowList(File file){           //先遍历文件每一行并进行存
        // C:\\Users\\Lenovo\\IdeaProjects\\stuManager\\target\\stuManager\\upload\\1561794121749667\\");

        /*
        * 1，获取遍历文件目录  File file
        * 2,创建一个File[] fileList用于存储每一层文件列表
        * 3，再创建一个File[] fileList用于存储下一层文件列表，当本层文件遍历完成后遍历下一层
        * 4，遍历本层文件时，调用FileDepthList()，将下一层文件遍历并加入构建树
        *            需传递父结点Key值，父节点路径，深度m，宽度row，以便定位结点值
        * */
        if(m==0&&row==0){
            nextfileList=FileDepthList(file,null,null,m);
            fileList=nextfileList;
            nextfileList=null;
        }
        row=0;
        for(;fileList!=null;m++){
            for(int i=0;i<fileList.length;i++){
                if(fileList[i]==null){
                    continue;
                }
                if (fileList[i].isDirectory()) {
                    File file1=new File(fileList[i].getPath());
                    Temporary=FileDepthList(file1,"Key" + String.valueOf(m) + "_" + i,fileList[i].getPath(),m+1);
                    nextfileList=FileJoint(nextfileList,Temporary);
                }
            }
            fileList=nextfileList;
            nextfileList=null;
            row=0;
        }
        return tree;
    }
    private File[] FileDepthList(File file,String Key,String path,int m_now){         //将每一个文件夹下一层文件遍历，放在构造树里面,并返回父文件夹夹下层文件列表
        File[] fileList = file.listFiles();
        for (int i = 0; i < fileList.length; i++) {
                String fileName = fileList[i].getName();
                //将结点加入构建树
                Tree treenow=new Tree();
                String Ofpath=path+"\\"+fileName;
                //System.out.println(Ofpath);
                int point=Ofpath.indexOf("upload");
                //System.out.println(point);
                if (point==-1){
                    treenow.setPath(Ofpath);
                    System.out.println(Ofpath);
                }
                else{
                    Ofpath=Ofpath.substring(point,Ofpath.length());
                    treenow.setPath(Ofpath);
                    //System.out.println(Ofpath);
                }
                treenow.setFatherKey(Key);
                treenow.setName(fileName);
                tree.add("Key" + String.valueOf(m_now) + "_" + row,treenow);
                row++;
        }
        return fileList;
    }
    public File[] FileJoint(File[] fileone,File[] filetwo){
        if(fileone==null){
             return filetwo;
        }
        if(filetwo==null){
            return fileone;
        }
        if(fileone!=null&&filetwo!=null){
            int count=fileone.length+filetwo.length;
            //now=new File[800];
            File now[]=new File[count];
            for(int i=0;i<count;i++){
                if(i<fileone.length){
                    now[i]=fileone[i];
                }
                if(i>=fileone.length){
                    now[i]=filetwo[i-fileone.length];
                }
            }
            return now;
        }
        return null;
    }
}

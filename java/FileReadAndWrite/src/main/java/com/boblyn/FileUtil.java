package com.boblyn;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FileUtil {
    private static String FILE_PATH = "/java/FileReadAndWrite/test.txt";
    static {
        FILE_PATH = System.getProperty("user.dir") + "/java/FileReadAndWrite/test.txt";
    }

    public static boolean createFile(){
        File file = new File(FILE_PATH);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }else{
                file.delete();
                file.createNewFile();
            }
        }catch (IOException e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static boolean writeByRandomAccessFileClass(){
        if(createFile()){
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(FILE_PATH, "rw");
                byte[] ipBytes="IP=127.0.0.1".getBytes();
                byte[] lineByte = "\n".getBytes();
                byte[] portBytes="Port=8080".getBytes();
                randomAccessFile.write(ipBytes);
                randomAccessFile.write(lineByte);
                randomAccessFile.write(portBytes);
                randomAccessFile.close();
            }catch (FileNotFoundException e){
                e.printStackTrace();
                return false;
            }catch (IOException e){
                e.printStackTrace();
                return false;
            }

        }
        return true;
    }

    public static void ReadByRandomAccessFileClass(){
        try{
            RandomAccessFile randomAccessFile = new RandomAccessFile(FILE_PATH, "r");
            randomAccessFile.seek(0);
            byte[]  buff=new byte[1024];
            int hasRead=0;
            while((hasRead=randomAccessFile.read(buff))>0){
                System.out.println(new String(buff,0,hasRead));
            }
            randomAccessFile.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ReadByRandomAccessFileClass();
    }
}

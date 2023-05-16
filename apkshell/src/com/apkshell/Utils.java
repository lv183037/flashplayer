package com.apkshell;

import java.io.File;

public class Utils {
	
	public static int bytesToInt(byte[] src) {
		int value = 0;	
		value = (src[0] & 0xFF) | ((src[1] & 0xFF)<<8) | ((src[2] & 0xFF)<<16) | ((src[3] & 0xFF)<<24);
		return value;
	}
	

    public static String intIP2StringIP(int ip) {
        return (ip & 0xFF) + "." +((ip >> 8) & 0xFF) + "." +((ip >> 16) & 0xFF) + "." +(ip >> 24 & 0xFF);
    }
	
 
	public static byte[] intToBytes( int value ) 
	{ 
		byte[] src = new byte[4];
		src[3] =  (byte) ((value>>24) & 0xFF);
		src[2] =  (byte) ((value>>16) & 0xFF);
		src[1] =  (byte) ((value>>8) & 0xFF);  
		src[0] =  (byte) (value & 0xFF);				
		return src; 
	}
	
	
	public static void deleteDir(File directory){
        //��ȡĿ¼�������ļ���Ŀ¼
        File files[] = directory.listFiles();
        for (File file : files) {
            if(file.isDirectory()){
                deleteDir(file);
            }else {
                file.delete();
                System.out.println(file.getName()+"�����ļ���ɾ��");
            }
        }
        //���հѸ�Ŀ¼Ҳɾ��
        directory.delete();
        System.out.println(directory.getName()+"����Ŀ¼��ɾ��");
    }
	

}

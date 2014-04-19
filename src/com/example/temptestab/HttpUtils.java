package com.example.temptestab;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;

import android.util.Log;
import android.widget.Toast;

public class HttpUtils {
	/*
     * Function  :   ����Post���󵽷�����
     * Param     :   params���������ݣ�encode�����ʽ
     * Author    :   ����԰-���ɵ�Ȼ
     */
    public static String submitPostData(Map<String, String> params, String encode) {
        
        byte[] data = getRequestData(params, encode).toString().getBytes();//���������
        try {            
        	
        	URL url = new URL("http://115.29.141.148/testab/user/login"); 
            HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
            httpURLConnection.setConnectTimeout(3000);       //�������ӳ�ʱʱ��
            httpURLConnection.setDoInput(true);                  //�����������Ա�ӷ�������ȡ����
            httpURLConnection.setDoOutput(true);                 //����������Ա���������ύ����
            httpURLConnection.setRequestMethod("POST");    //������Post��ʽ�ύ����
            httpURLConnection.setUseCaches(false);               //ʹ��Post��ʽ����ʹ�û���
            //������������������ı�����
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

            //����������ĳ���
            httpURLConnection.setRequestProperty("Content-Length", String.valueOf(data.length));
            //�����������������д������
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(data);
            
            int response = httpURLConnection.getResponseCode();            //��÷���������Ӧ��
            String temp=null;
            temp=String.valueOf(response);
            if(response == HttpURLConnection.HTTP_OK) {
                InputStream inptStream = httpURLConnection.getInputStream();
                return dealResponseResult(inptStream);                     //�������������Ӧ���
            }
            else 
            	return temp;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
    
    /*
    2      * Function  :   ��װ��������Ϣ
    3      * Param     :   params���������ݣ�encode�����ʽ
    4      * Author    :   ����԰-���ɵ�Ȼ
    5      */
       public static StringBuffer getRequestData(Map<String, String> params, String encode) {
          StringBuffer stringBuffer = new StringBuffer();        //�洢��װ�õ���������Ϣ
            try {
                for(Map.Entry<String, String> entry : params.entrySet()) {
                   stringBuffer.append(entry.getKey()).append("=").append(URLEncoder.encode(entry.getValue(), encode)).append("&");
                }
             stringBuffer.deleteCharAt(stringBuffer.length() - 1);    //ɾ������һ��"&"
            } catch (Exception e) {
                e.printStackTrace();
           }
            String temp=String.valueOf(stringBuffer);
            Log.i("getRequestData", temp);
           return stringBuffer;
           
       }
       
       
       /*
       2      * Function  :   �������������Ӧ�������������ת�����ַ�����
       3      * Param     :   inputStream����������Ӧ������
       4      * Author    :   ����԰-���ɵ�Ȼ
       5      */
           public static String dealResponseResult(InputStream inputStream) {
                String resultData = null;      //�洢������
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] data = new byte[1024];
              int len = 0;
               try {
                   while((len = inputStream.read(data)) != -1) {
                      byteArrayOutputStream.write(data, 0, len);
                   }
               } catch (IOException e) {
              }
              resultData = new String(byteArrayOutputStream.toByteArray());    
               return resultData;
           }

}

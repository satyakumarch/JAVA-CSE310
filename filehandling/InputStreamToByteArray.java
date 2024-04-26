// Write a program in java that read the content a file and convert into a byte array. your program should perform the following 
// instruction.
// 1).Open an input stream to read data from a file.
// 2).Read the data from the input stream in chunk ans store it in a byte array.
// 3).Print the length of the resulting byte array to the console.

import java.io.*;
public class InputStreamToByteArray{
    public static void main(String[] args){
        try{
            System.out.println("Enter the file name:");
            BufferReader reader=new BufferReader(new InputStreamReader(System.in));
            String str=reader.readLine();
            File file =new File(str);
            FileInputStream FileInputStream=new FileInputStream(file);
            ByteArrayOutputStream byteArrayOutputStream =new ByteArrayOutputStream();


            byte[] buffer=new byte[1024];
            int bytesRead;
            while((bytesRead=fileInputStream.read(buffer))!=-1){
                byteArrayOutputStream.write(buffer,0,bytesRead);
            }
           byte[] byteArray=byteArrayOutputStream.toByteArray();
           System.out.println("Byte array length: "+byteArray.length);
           fileInputStream.close();
        }catch(Exception e){
            System.out.println("Error reading file: "+e.getMessage());
        }
    }
}
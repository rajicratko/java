package assignment4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Scanner;
public class Assignment4 {
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter one of the commands (LIST , INFO, CREATEDIR, RENAME, COPY, MOVE, DELETE:");
        switch (sc.nextLine()){
        case "LIST":{
            }
        break;
        case "INFO":{
            File f=new File(sc.nextLine());
            if(f.exists())
               System.out.println("File name: "+f.getName()+" "+"Address: "+f.getAbsolutePath()+"size: "+f.length()
               +"Date: "+LocalDateTime.ofInstant(Instant.ofEpochMilli
               (f.lastModified()),ZoneId.systemDefault()));
            } 
        break;
        case "CREATEDIR":{
            File f= new File(sc.nextLine());
            if(!f.exists())
                f.mkdir();
                System.out.println("folder successful create");
            }
        break;
        case "RENAME":{
                File oldf = new File(sc.next());	
                File newf = new File(sc.next());	
                if(!oldf.exists()) 
                return;
                if(newf.exists())    
                return;
                    oldf.renameTo(newf);
                    System.out.println("successful rename");
            }
        break;
            
        case "COPY":{
                File af = new File(sc.next());	
                File bf = new File(sc.next());	
            try(FileInputStream in = new FileInputStream(af);
                FileOutputStream out = new FileOutputStream(bf))
            {
            byte[] bs = new byte[1024];
            int l;
            while((l = in.read(bs)) > 0)    out.write(bs, 0, l);
            }
            catch(IOException e) { System.out.println(e); }
            }
        break;
        case "MOVE":{
            File sf = new File(sc.nextLine());	
            File df = new File(sc.nextLine());	
            try(FileInputStream in = new FileInputStream(sf);
            FileOutputStream out = new FileOutputStream(df))
            {
            byte[] bs = new byte[1024];
            int l;
            while((l = in.read(bs)) > 0)    out.write(bs, 0, l);
            }
            catch(IOException e) { System.out.println(e); }
            sf.delete();
            }
        break;
        case "DELETE":{
            File f=new File (sc.nextLine());
            if (f.exists())
            f.delete();
            else
            System.out.println("file not found");
        }
        break;
        default:
            System.out.println("wrong command");
        }
    }   
}

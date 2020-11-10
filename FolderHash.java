import java.security.MessageDigest;
import java.io.InputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
//添加一行，用于测试

class FolderHash{
    public static void SHA1Checksum(InputStream is, MessageDigest complete) throws Exception{
        byte[] buffer = new byte[1024];
        int numRead=0;
        do{
            numRead = is.read(buffer);
            if(numRead > 0){
                complete.update(buffer,0,numRead);
            }
        }while(numRead != -1);
        is.close();
    }

    public static Comparator<File> comparatorFile =new Comparator <File>(){
        public int compare(File p1,File p2){
            if (p1.getName().compareTo(p2.getName())<0)
                return 1;
            else if (p1.getName().compareTo(p2.getName())>0)
                return -1;
            else
                return 0;
        }
    };

    public static void dfs(String path, MessageDigest complete){
        File dir = new File(path);
        File[] fs = dir.listFiles();
        Arrays.sort(fs,comparatorFile);
        for(int i=0;i<fs.length;i++){
            if(fs[i].isFile()){
                try{
                    SHA1Checksum(new FileInputStream(fs[i]), complete);
                } catch(Exception e) {
                    e.printStackTrace();
                }
            }              
            if(fs[i].isDirectory()){
                dfs(path+File.separator+fs[i].getName(), complete);
            }
        }
    }

    public static void main(String[] args){
        System.out.println("请输入一个文件夹的绝对路径：");
        Scanner sc = new Scanner(System.in); 
        String path = sc.nextLine();
        sc.close();

        try{
            MessageDigest complete = MessageDigest.getInstance("SHA-1");
            dfs(path, complete);
            byte[] sha1 = complete.digest();
            String result = "";
            for(int i=0;i<sha1.length;i++){
                result += Integer.toString(sha1[i]&0xFF,16);
            }
            System.out.println(result);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
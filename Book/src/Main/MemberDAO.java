package Main;





import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.*;

public class MemberDAO {
    private String filename_char = "Member.csv";
    private String pathStr = "D:\\OOP";

    public MemberDAO() {
        File file = new File(pathStr + "\\" + filename_char);
        if (file.exists()) {

        } else {
            File folder = new File(pathStr);
            folder.mkdirs();
            try {
                file.createNewFile();
            } catch (IOException ex) {
            }

        }
        File file2 = new File(pathStr + "\\" + filename_char);

        if (file2.exists()) {

        } else {
            File folder = new File(pathStr);
            folder.mkdirs();
            try {
                file2.createNewFile();
            } catch (IOException ex) {
            }
        }

    }


    public void saveMemberListAsChar(ArrayList<Member> listBook){
       File file_char = new File(pathStr + "//" + filename_char);
       
         FileWriter fw = null;
        BufferedWriter bw = null;
        try {
             fw = new FileWriter(file_char);
             bw = new BufferedWriter(fw);
             for(int i = 0; i < listBook.size(); i++){
                 String a = listBook.get(i).GetMemberAsString();
                 bw.write(a);
                 bw.newLine();
                 bw.flush();
             }

        } catch (IOException ex) {
           
        }
    }
    public ArrayList<Member> readMemberAsListChar(){
        ArrayList<Member> list = new ArrayList<Member>();
        File fileChar = new File(pathStr + "//" + filename_char);
        try{
            FileReader fr = new FileReader(fileChar);
            BufferedReader br = new BufferedReader(fr);
            String line;
            
            while ((line = br.readLine()) != null){
                String[] elem = line.split(",");
                Member bk = new Member(elem[0], elem[1], elem[2], elem[3]);
                list.add(bk);
            }
            br.close();
            return list;
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        return list;
    }
}

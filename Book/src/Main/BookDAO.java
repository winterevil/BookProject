package Main;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.io.*;
import java.util.*;

/**
 *
 * @author Admin
 */
public class BookDAO {

    private String pathStr = "D:\\OOP";
    private String fileName_Char = "BookData.csv";

    public BookDAO() {
        File folder = new File(pathStr);
        File file = new File(pathStr + "\\" + fileName_Char);

        if (!folder.exists()) {
            folder.mkdirs();
        }
        
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException ex) {
            }
        }
    }

    public void saveBookListAsChar(ArrayList<Book> listBook) {
        File file_char = new File(pathStr + "\\" + fileName_Char);

        try {
            FileWriter fw = new FileWriter(file_char);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < listBook.size(); i++) {
                String a = listBook.get(i).getBookAsString();
                bw.write(a);
                bw.newLine();
                bw.flush();
            }
        } catch (IOException ex) {
        }
    }

    public ArrayList<Book> readBookListAsChar() {
        ArrayList<Book> list = new ArrayList<Book>();

        File file_char = new File(pathStr + "\\" + fileName_Char);
        try {
            FileReader fr = new FileReader(file_char);
            BufferedReader br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null) {
                String[] elem = line.split(",");
                Book bk = new Book(elem[0], elem[1], elem[2], elem[3], elem[4]);
                list.add(bk);
            }
            return list;
        } catch (IOException ex) {
        }
        return list;
    }
}

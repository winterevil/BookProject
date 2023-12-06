package Main;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
import java.io.*;

/**
 *
 * @author Admin
 */
public class BookManager {

    private ArrayList<Book> listBook;
    private BookDAO bkD;
    private Book bk;

    public BookManager() {
        listBook = new ArrayList<Book>();
        bkD = new BookDAO();
        bk = new Book();
    }

    public ArrayList<Book> getListBook() {
        return listBook;
    }

    public Book findBookByID(String id) {
        for (int i = 0; i < listBook.size(); i++) {
            if (listBook.get(i).getID().equals(id)) {
                return listBook.get(i);
            }
        }
        return null;
    }

    public boolean addBook(Book bk) {
        Book temp = findBookByID(bk.getID());
        if (temp == null) {
            listBook.add(bk);
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Book> findBookByTitle(String title) {
        ArrayList<Book> res = new ArrayList<Book>();

        for (int i = 0; i < listBook.size(); i++) {
            Book temp = listBook.get(i);
            if (temp.getTitle().contains(title)) {
                res.add(temp);
            }
        }

        return res;
    }

    public ArrayList<Book> findBookByCategory(String cate) {
        ArrayList<Book> res = new ArrayList<Book>();

        for (int i = 0; i < listBook.size(); i++) {
            Book temp = listBook.get(i);
            if (temp.getCategory().contains(cate)) {
                res.add(temp);
            }
        }

        return res;
    }

    public ArrayList<Book> findBookByAuthor(String au) {
        ArrayList<Book> res = new ArrayList<Book>();

        for (int i = 0; i < listBook.size(); i++) {
            Book temp = listBook.get(i);
            if (temp.getAuthor().contains(au)) {
                res.add(temp);
            }
        }

        return res;
    }

    public boolean deleteBook(String id) {
        Book temp = findBookByID(id);
        if (temp != null) {
            listBook.remove(temp);
            return true;
        }
        return false;

    }

    public boolean editBook(Book bk, String id) {
        for (int i = 0; i < listBook.size(); i++) {
            if (listBook.get(i).getID().equals(id)) {
                listBook.set(i, bk);
                return true;
            }
        }
        return false;
    }

    public String displayListBook() {
        String str = "";
        for (int i = 0; i < listBook.size(); i++) {
            str += listBook.get(i).getBookAsString();
            str += "\n";
        }

        return str;
    }

    public void updateBook(Book bk) {
        for (int i = 0; i < listBook.size(); i++) {
            if (listBook.get(i).getID().equals(bk.getID()));
            listBook.get(i).setTitle(bk.getTitle());
            listBook.get(i).setCategory(bk.getCategory());
            listBook.get(i).setAuthor(bk.getAuthor());
            listBook.get(i).setDate(bk.getDate());
        }
    }

    public void restoreData() {
        listBook = bkD.readBookListAsChar();
    }

    public void backupData() {
        bkD.saveBookListAsChar(listBook);
    }

    public void setListBook(ArrayList<Book> t) {
        listBook = t;
    }

    public boolean checkForBackup() {
        ArrayList<Book> old = bkD.readBookListAsChar();
        if (listBook == null) {
            return true;
        }
        if (listBook.size() > old.size() || listBook.size() < old.size()) {
            return false;
        } else {
            for (int i = 0; i < listBook.size(); i++) {
                String t = listBook.get(i).getBookAsString();
                String o = old.get(i).getBookAsString();
                if (!t.equals(o)) {
                    return false;
                }
            }
        }

        return true;
    }
}

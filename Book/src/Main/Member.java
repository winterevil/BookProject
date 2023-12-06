package Main;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Member {
    private String ID;
    private String name, book, numDate;

    public Member() {

    }

    public Member(String id, String name, String book, String numDate) {
       this.ID = id;
       this.name = name;
       this.book = book;
       this.numDate = numDate;
    }

    public void setId(String id) {
        this.ID = id;
    }

    public String getName() {
        return name;
    }

    public String getBook() {
        return book;
    }

    public String getNumDate() {
        return numDate;
    }

    public String getID() {
        return ID;
    }

    public String GetMemberAsString() {
        String str = ID;
        str = str + "," + name;
        str = str + "," + book;
        str = str + "," + numDate;
        return str;
    }
}


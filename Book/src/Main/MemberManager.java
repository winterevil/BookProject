package Main;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class MemberManager {

    private ArrayList<Member> listMember;
    private MemberDAO mbD;
    private BookManager bkM;
    private Member mb;

    public MemberManager() {
        listMember = new ArrayList<Member>();
        mbD = new MemberDAO();
        bkM = new BookManager();
        mb = new Member();
    }

    public int checkNumberOfBook(String Id) {
        int count = 0;
        for (int i = 0; i < listMember.size(); i++) {
            if (listMember.get(i).getID().equals(Id)) {
                count++;
            }
        }
        return count;
    }

    public ArrayList<Member> getListMember() {
        return listMember;
    }

    public ArrayList<Member> SearchMemberbyBook(String book) {
        ArrayList<Member> result = new ArrayList<Member>();

        for (int i = 0; i < listMember.size(); i++) {

            if (listMember.get(i).getBook().contains(book)) {
                result.add(listMember.get(i));
            }

        }
        return result;
    }

    public ArrayList<Member> SearchMemberbyName(String name) {
        ArrayList<Member> result = new ArrayList<Member>();

        for (int i = 0; i < listMember.size(); i++) {
            if (listMember.get(i).getName().contains(name)) {
                result.add(listMember.get(i));
            }
        }
        return result;
    }

    public Member findMemberbyID(String Id) {
        for (int i = 0; i < listMember.size(); i++) {
            if (listMember.get(i).getID().equals(Id)) {
                return listMember.get(i);
            }
        }
        return null;
    }

    public boolean DeleteMember(String Id) {
        Member tempMb = findMemberbyID(Id);
        if (tempMb != null) {
            listMember.remove(tempMb);
            return true;
        }
        return false;
    }

    public String DisplayAllMember() {
        String str = "";
        for (int i = 0; i < listMember.size(); i++) {
            str += listMember.get(i).GetMemberAsString();
        }
        return str;
    }

    public void backupMember() {
        mbD.saveMemberListAsChar(listMember);
    }

    public void restoreData() {
        listMember = (ArrayList<Member>) mbD.readMemberAsListChar();
    }

    public void setListMember(ArrayList<Member> t) {
        listMember = t;
    }

    public String checkBook(String title) {
        bkM.restoreData();
        ArrayList<Book> listBook = bkM.getListBook();
        for (int i = 0; i < listBook.size(); i++) {
            if (title.equalsIgnoreCase(listBook.get(i).getTitle())) {
                return listBook.get(i).getTitle();
            }
        }
        return null;
    }

    public boolean addMember(Member mb) {
        int count = checkNumberOfBook(mb.getID());
        String book = checkBook(mb.getBook());
        if (book.equalsIgnoreCase(mb.getBook())) {
            if (count < 3) {
                listMember.add(mb);
                return true;
            }
        }
        return false;
    }
    
    public boolean checkForBackup(){
        ArrayList<Member> old = mbD.readMemberAsListChar();
        if (listMember == null) {
            return true;
        }
        if (listMember.size() > old.size() || listMember.size() < old.size()) {
            return false;
        } else {
            for (int i = 0; i < listMember.size(); i++) {
                String t = listMember.get(i).GetMemberAsString();
                String o = old.get(i).GetMemberAsString();
                if (!t.equals(o)) {
                    return false;
                }
            }
        }
        return true;
    }

}

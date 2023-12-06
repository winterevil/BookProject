package Main;

public class Book {

    private String title, id, category, date, author;

    public Book() {

    }

    public Book(String id, String t, String cat, String au, String date) {
        title = t;
        this.id = id;
        category = cat;
        this.date = date;
        author = au;
    }

    public String getTitle() {
        return title;
    }

    public String getID() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public String getDate() {
        return date;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String t) {
        title = t;
    }

    public void setID(String id) {
        this.id = id;
    }

    public void setCategory(String cate) {
        category = cate;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setAuthor(String au) {
        author = au;
    }

    public String getBookAsString() {
        String str = id;
        str += "," + title;
        str += "," + category;
        str += "," + author;
        str += "," + date;

        return str;
    }
}

package lk.ChanukaNimsara.OOPCW;

public interface LibraryManager {

    public void add_Book(Book BOOK);
    public void add_Dvd(Dvd DVD);
    public void borrow_Book(Reader READER, LibraryItem LibraryItem);
    public void return_Book(LibraryItem LibraryItem);
    public void delete_Book(LibraryItem LibraryItem);
    public void displayItem();



}
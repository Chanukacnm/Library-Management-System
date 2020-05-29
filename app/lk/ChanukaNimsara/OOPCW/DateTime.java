package lk.ChanukaNimsara.OOPCW;

public class DateTime {

    private LibraryItem LibraryItm;
    private int Day;
    private int Month;
    private int Year;
    private int Hour;
    private int Minute;

    public DateTime(LibraryItem library_Itm, int day, int month, int year, int hour, int minute) {
        super();
        this.LibraryItm = library_Itm;
        this.Day = day;
        this.Month = month;
        this.Year = year;
        this.Hour = hour;
        this.Minute = minute;
    }

    public LibraryItem getLibraryItm() {
        return LibraryItm;
    }

    public void setLibraryItm(LibraryItem libraryItm) {
        LibraryItm = libraryItm;
    }

    public int getDay() {
        return Day;
    }

    public void setDay(int day) {
        Day = day;
    }

    public int getMonth() {
        return Month;
    }

    public void setMonth(int month) {
        Month = month;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public int getHour() {
        return Hour;
    }

    public void setHour(int hour) {
        Hour = hour;
    }

    public int getMinute() {
        return Minute;
    }

    public void setMinute(int minute) {
        Minute = minute;
    }
    @Override
    public String toString() {
        return "DateTime{" +
                "LibraryItm=" + LibraryItm +
                ", Day=" + Day +
                ", Month=" + Month +
                ", Year=" + Year +
                ", Hour=" + Hour +
                ", Minute=" + Minute +
                '}';
    }


}

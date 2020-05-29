package lk.ChanukaNimsara.OOPCW;

public class Reader {

    private int readrID;
    private String readrName;
    private int readrMobileNo;
    private String readrEmail;

    public Reader(int readrID, String readrName, int readrMobileNo, String readrEmail) {
        super();
        this.readrID = readrID;
        this.readrName = readrName;
        this.readrMobileNo = readrMobileNo;
        this.readrEmail = readrEmail;
    }


    public int getReadrID() {
        return readrID;
    }

    public String getReadrName() {
        return readrName;
    }

    public int getReadrMobileNo() {
        return readrMobileNo;
    }

    public String getReadrEmail() {
        return readrEmail;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "Reader ID=" + readrID +
                ", Reader Name='" + readrName + '\'' +
                ", Reader Mobile No=" + readrMobileNo +
                ", Reader E-mail='" + readrEmail + '\'' +
                '}';
    }

}

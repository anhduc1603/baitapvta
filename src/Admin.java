public class Admin extends User{
    private byte expInYear;

    public Admin(int id, String fullName, String email, String password, byte expInYear) {
        super(id, fullName, email, password);
        this.expInYear = expInYear;
    }



    public Admin(byte expInYear) {
        this.expInYear = expInYear;
    }

    public byte getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(byte expInYear) {
        this.expInYear = expInYear;
    }
}

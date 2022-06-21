package KhachSan;

public class QuanLyPhong {
//    Số ngày thuê, loại phòng, thông tin cá nhân của những người thuê phòng.

    private int soNgayThue;
    private Room room;
    private Person person;

    public QuanLyPhong() {
    }

    public QuanLyPhong(int soNgayThue, Room room, Person person) {
        this.soNgayThue = soNgayThue;
        this.room = room;
        this.person = person;
    }

    public int getSoNgayThue() {
        return soNgayThue;
    }

    public void setSoNgayThue(int soNgayThue) {
        this.soNgayThue = soNgayThue;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "QuanLyPhong{" +
                "soNgayThue=" + soNgayThue +
                ", room=" + room +
                ", person=" + person +
                '}';
    }
}

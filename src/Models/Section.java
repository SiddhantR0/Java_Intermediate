package Models;

public class Section {
    String Room_Number;
    String Name;

    public String getRoom_Number() {
        return Room_Number;
    }

    public void setRoom_Number(String room_Number) {
        Room_Number = room_Number;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCollege() {
        return College;
    }

    public void setCollege(String college) {
        College = college;
    }

    String College = "Deerwalk";
}

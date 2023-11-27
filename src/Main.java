import Models.Section;
import Models.Student;

public class Main {
    public static void main(String[] args) {
        Student st = new Student();
        System.out.println(st);
        Student su = new Student();
        System.out.println(su);
        System.out.println(st.getAge());
        System.out.println(su.getName());


        Section de = new Section();
        System.out.println(de.getName());
        System.out.println(de.getRoom_Number());
        System.out.println(de.getCollege());
        de.setName("Siddhant Regmi");
        System.out.println(de.getName());
        de.setRoom_Number("12345");
        de.setName("Ram");
        de.setCollege("Chelsea");
        System.out.println(de.getName());
        System.out.println(de.getRoom_Number());
        System.out.println(de.getCollege());


        Section si = new Section();
        System.out.println(si.getName());
        System.out.println(si.getRoom_Number());
        System.out.println(si.getCollege());
        si.setCollege("Chelsea International Academy");
        si.setName("Siddhant Regmi");
        si.setRoom_Number("12345");
        System.out.println(si.getName());
        System.out.println(si.getRoom_Number());
        System.out.println(si.getCollege());
    }

}
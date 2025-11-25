
package teacherData;

public class RegularTeacher extends Teacher {

    public RegularTeacher(int id, String name, String contact, String subject, String classroom) {
        super(id, name, contact, subject, classroom);
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " | Type: Regular";
    }
}


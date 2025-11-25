package teacherData;

public class SubstituteTeacher extends Teacher {

    public SubstituteTeacher(int id, String name, String contact, String subject, String classroom) {
        super(id, name, contact, subject, classroom);
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " | Type: Substitute";
    }
}


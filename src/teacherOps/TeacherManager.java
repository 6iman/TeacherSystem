package teacherOps;

import teacherData.Teacher;
import java.util.ArrayList;
import java.util.List;

public class TeacherManager {
    private List<Teacher> teachers = new ArrayList<>();

    public void addTeacher(Teacher t) { teachers.add(t); System.out.println("Added!"); }

    public void listTeachers() {
        if(teachers.isEmpty()) System.out.println("No teachers.");
        else teachers.forEach(t -> System.out.println(t.getInfo()));
    }

    public Teacher searchTeacher(int id) {
        return teachers.stream().filter(t -> t.getId() == id).findFirst().orElse(null);
    }

    public void updateTeacher(int id, String name, String contact, String subject, String classroom) {
        Teacher t = searchTeacher(id);
        if(t != null){ t.setName(name); t.setContact(contact); t.setSubject(subject); t.setClassroom(classroom); System.out.println("Updated!"); }
        else System.out.println("Not found.");
    }

    public void deleteTeacher(int id) {
        Teacher t = searchTeacher(id);
        if(t != null){ teachers.remove(t); System.out.println("Deleted!"); }
        else System.out.println("Not found.");
    }
}

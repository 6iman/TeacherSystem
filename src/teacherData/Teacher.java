package teacherData;

public class Teacher {
    private int id;
    private String name;
    private String contact;
    private String subject;
    private String classroom;

    public Teacher(int id, String name, String contact, String subject, String classroom) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.subject = subject;
        this.classroom = classroom;
        
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public String getSubject() {
        return subject;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

   

    // Polymorphic method
    public String getInfo() {
        return id + " | " + name + " | " + contact + " | " + subject + " | " + classroom;
    }
}

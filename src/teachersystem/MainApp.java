package teachersystem;

import teacherOps.TeacherManager;
import teacherData.*;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     TeacherManager manager = new TeacherManager();

        
while(true){
    
    System.out.println("******************************");
    System.out.println("*        TEACHER SYSTEM       *");
    System.out.println("******************************\n");

    System.out.println("* 1. Add Regular Teacher      *");
    System.out.println("* 2. Add Substitute Teacher   *");
    System.out.println("* 3. Update Teacher           *");
    System.out.println("* 4. Delete Teacher           *");
    System.out.println("* 5. Search Teacher           *");
    System.out.println("* 6. List All Teachers        *");
    System.out.println("* 0. Exit                     *");
    System.out.println("******************************");
    System.out.print("Choice: ");

   int choice = sc.nextInt(); sc.nextLine();
     switch(choice){
        case 1: case 2:
        System.out.print("ID: "); int id=sc.nextInt(); sc.nextLine();
        System.out.print("Name: "); String n=sc.nextLine();
        System.out.print("Contact: "); String c=sc.nextLine();
        System.out.print("Subject: "); String s=sc.nextLine();
        System.out.print("Classroom: "); String cl=sc.nextLine();
         manager.addTeacher(choice==1? new RegularTeacher(id,n,c,s,cl) : new SubstituteTeacher(id,n,c,s,cl));
         break;
        case 3:
        System.out.print("ID to update: "); int u=sc.nextInt(); sc.nextLine();
        System.out.print("Name: "); String nu=sc.nextLine();
        System.out.print("Contact: "); String cu=sc.nextLine();
        System.out.print("Subject: "); String su=sc.nextLine();
        System.out.print("Classroom: "); String clu=sc.nextLine();
          manager.updateTeacher(u,nu,cu,su,clu); break;
         case 4:
        System.out.print("ID to delete: "); int d=sc.nextInt(); sc.nextLine(); manager.deleteTeacher(d); break;
         case 5:
        System.out.print("ID to search: "); int f=sc.nextInt(); sc.nextLine();
             Teacher t = manager.searchTeacher(f); System.out.println(t!=null?t.getInfo():"Not found."); break;
         case 6: manager.listTeachers(); break;
         case 0: System.exit(0);
         default: System.out.println("Invalid"); break;
            }
        }
    }
}
           
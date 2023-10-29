

import Model.StudentModel;
import Model.TeacherModel;
import View.UserView;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        TeacherModel teacher = new TeacherModel("Ксения Александровна", 35, "001");
        StudentModel student1 = new StudentModel("Михаил Романович", 18, "k009");
        StudentModel student2 = new StudentModel("Ольга Ивановна", 20, "k007");
        UserView userView = new UserView();
        userView.saveGroup(new TeacherModel(teacher.getTeacherId()),
                (List.of(new StudentModel(student1.getStudentId()), new StudentModel(student2.getStudentId()))), "group1");
        userView.getGroup("group1");
//        userView.getGroup("group2");
    }
}

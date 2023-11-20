package Student;

import java.lang.reflect.Field;

public class School {

    @StudentInfo(name = "Tom", surname = "Smith", age = 15)
    private Student student1;

    @StudentInfo(name = "Mary", surname = "Jennings", age = 17)
    private Student student2;

    public School() {
        initializeStudents();
    }

    private void initializeStudents() {
        Field[] fields = this.getClass().getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(StudentInfo.class)) {
                StudentInfo studentInfo = field.getAnnotation(StudentInfo.class);
                Student student = new Student();
                student.setName(studentInfo.name());
                student.setSurname(studentInfo.surname());
                student.setAge(studentInfo.age());

                try {
                    field.setAccessible(true);
                    field.set(this, student);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

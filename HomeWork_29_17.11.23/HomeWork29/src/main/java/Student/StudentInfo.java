package Student;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)

public class StudentInfo {

    String name() {
        return null;
    }

    String surname() {
        return null;
    }

    int age() {
        return 0;
    }
}

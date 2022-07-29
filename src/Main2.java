import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        List<Student> list= Arrays.asList( new Student(1,"Abbas",100),
                new Student(3,"Sukhdev",200) ,
                new Student(4,"Yash",300),
                new Student(5,"Mayank",840),
        new Student(7,"Luka",900));



      List<Student> l=  list.
                stream()
                .filter(item -> item.marks<850)
                .collect(Collectors.toList());
        System.out.println(l);
    }
}

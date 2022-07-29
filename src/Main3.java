import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main3 {

    public static void main(String[] args) {
        List<Student> list= Arrays.asList( new Student(1,"Abbas",100),
                new Student(3,"Sukhdev",200) ,
                new Student(4,"Yash",300),
                new Student(5,"Mayank",840),
                new Student(7,"Luka",900));
        Collections.sort(list,(a,b) -> a.roll>b.roll ? 1 : -1);

        list.stream().map( (idd) ->new Employee(idd.roll, idd.name,idd.marks*1000) ).
                forEach(item -> System.out.println(item));
    }
}

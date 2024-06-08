import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentMain {
    public static void main(String[] args){
        Student s1 = new Student("Іван", 19, 9.4);
        Student s2 = new Student("Артем", 23, 7.8);
        Student s3 = new Student("Антон", 20, 8.1);
        Student s4 = new Student("Максим", 21, 10.3);
        Student s5 = new Student("Богдан", 22, 7.2);
        List<Student> StudentList = List.of(s1, s2, s3, s4, s5);
// перше завдання
        StudentList.stream()
                .filter(student -> student.getAge() >= 22)
                .collect(Collectors.toList())
                .forEach(System.out::println);
// друге завдання
        StudentList.stream()
                .map(student -> student.getName())
                .forEach(System.out::println);
// третє завдання
        int sum = StudentList.stream()
                .map(student -> student.getAge())
                .reduce(0, (acc, cur) -> acc + cur);
        System.out.println(sum);
    }
}

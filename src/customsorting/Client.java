package customsorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

public class Client {
    public static void main(String[] args) throws ArithmeticException{
        // Objective
        // To create multiple entry for Student class
        // Sort them on every attribute
        // Use of Comparable(compareTo) and Comparator(compare)

        Student s1 = new Student(1, "aaaaaa", 55.08, new Date(12/05/2007));
        Student s2 = new Student(2, "kkkkkk", 515.08, new Date(12/05/2012));
        Student s3 = new Student(3, "ttttttttt", 5.08, new Date(12/05/2003));
        Student s4 = new Student(4, "ccc", 12.08, new Date(12/05/2024));

        List<Student> students = new ArrayList<>();
        students.addAll(List.of(
                new Student(1, "aaaaaa", 55.08, new Date(12/05/2007)),
                new Student(2, "kkkkkk", 515.08, new Date(12/05/2012)),
                new Student(3, "ttttttttt", 5.08, new Date(12/05/2003)),
                new Student(4, "ccc", 12.08, new Date(12/05/2024)),
                new Student(4, "bbbbbbbbbbbb", 12.08, new Date(12/05/2024))
        ));
        Collections.sort(students, new StudentComparatorByPSP());

        List<Integer> l10 = List.of(1, 2, 3, 4, 5, 6, 100, 52, 24);
        Stream<Integer> s10 = l10.stream();

        int maxValueOutput = s10.reduce(Integer.MIN_VALUE, (maxValue, currentValue) ->{
            return Math.max(maxValue, currentValue);
        });

        System.out.println(maxValueOutput);


        throw new ArithmeticException();


    }
}

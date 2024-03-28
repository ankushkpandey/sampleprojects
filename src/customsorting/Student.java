package customsorting;

import java.util.Date;

public class Student implements Comparable<Student> {
    public int id;
    public String name;
    public double psp;
    public Date dob;

    public Student(int id, String name, double psp, Date dob) {
        this.id = id;
        this.name = name;
        this.psp = psp;
        this.dob = dob;
    }


    @Override
    public int compareTo(Student other) { //let natural ordering be name

        if(this.name.equals(other.name)){
            return 0;
        }
        if(this.name.compareTo(other.name) < 0){
            return -1;
        }
        return 1;
    }
}

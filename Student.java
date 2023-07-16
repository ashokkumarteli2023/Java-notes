import java.util.Objects;

// public class Student implements Comparable<Student>{
public class Student {
    String name;
    int rollNo;

    public Student(String name, int rollNo)
    {
        this.name=name;
        this.rollNo=rollNo;
    }

    @Override
    public String toString()
    {
        return "Student{" +
        "name='" + name + '\'' +    //  `\` = escape character 
        //to represent special characters such as newlines, tabs, or quotes.
        ", rollNo=" + rollNo +
        '}';
    }

     
    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }

    //still equals bhi define krna hogha

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo;
    }

    // @Override
    // public int compareTo(Student that) {
    //     // TODO Auto-generated method stub
    //     // throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    //     return this.rollNo - that.rollNo;  //if return >0 -> current student is bigger
    // }
}

package club.banyuan;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ClassStudent {

  Set<Student> students = new LinkedHashSet<>();

  public void addStudent(Set<Student> student) {
    students.addAll(student);
  }

  public void traverse() {
    for (Student next : students) {
      System.out.print(next);
    }
    System.out.println();
  }

  public static void traverse(List<Student> students) {
    for (Student next : students) {
      System.out.print(next);
    }
    System.out.println();
  }

  public List<Student> ascendingOrderId() {
    Set<Student> student = new TreeSet<>(Comparator.comparingInt(Student::getId));
    student.addAll(students);
    return new ArrayList<>(student);
  }

  public List<Student> descendingOrderAge() {
    Set<Student> student = new TreeSet<>((o1, o2) -> o2.getAge() - o1.getAge());
    student.addAll(students);
    return new ArrayList<>(student);
  }

  @Override
  public String toString() {
    return students + "\n";
  }

  public static void main(String[] args) {

    ClassStudent classStudent = new ClassStudent();
    Set<Student> studentSet = new LinkedHashSet<>();

    studentSet.add(new Student(1, "小金", 11));
    studentSet.add(new Student(3, "小木", 12));
    studentSet.add(new Student(2, "小水", 13));
    studentSet.add(new Student(5, "小火", 15));
    studentSet.add(new Student(4, "小土", 14));

    classStudent.addStudent(studentSet);

    classStudent.traverse();

    traverse(classStudent.ascendingOrderId());

    traverse(classStudent.descendingOrderAge());
  }
}
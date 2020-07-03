package club.banyuan.test;

import club.banyuan.ClassStudent;
import club.banyuan.Student;
import java.util.LinkedHashSet;
import java.util.Set;
import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

  @Test
  public void testAddStudent() {

    ClassStudent classStudent = new ClassStudent();
    Set<Student> studentSet = new LinkedHashSet<>();

    studentSet.add(new Student(1, "小金", 11));
    studentSet.add(new Student(1, "小金1", 11));
    studentSet.add(new Student(3, "小木", 12));
    studentSet.add(new Student(2, "小水", 13));

    classStudent.addStudent(studentSet);

    Assert.assertEquals(3,studentSet.size());

  }

  @Test
  public void testSort() {
    ClassStudent classStudent = new ClassStudent();
    Set<Student> studentSet = new LinkedHashSet<>();

    studentSet.add(new Student(1, "小金", 11));
    studentSet.add(new Student(3, "小木", 12));
    studentSet.add(new Student(2, "小水", 13));
    studentSet.add(new Student(5, "小火", 15));
    studentSet.add(new Student(4, "小土", 14));

    classStudent.addStudent(studentSet);

    Assert.assertEquals(1,classStudent.ascendingOrderId().get(0).getId());

    Assert.assertEquals(15,classStudent.descendingOrderAge().get(0).getAge());
  }



}

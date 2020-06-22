package club.banyuan;

public class Main {

  public static void main(String[] args) {
    ElementarySchoolStudents elementarySchoolStudents = new ElementarySchoolStudents("小学生");
    MiddleSchoolStudent middleSchoolStudent = new MiddleSchoolStudent("初中生");
    HighSchoolStudent highSchoolStudent = new HighSchoolStudent("高中生");

    elementarySchoolStudents.Study();
    middleSchoolStudent.Study();
    highSchoolStudent.Study();
  }
}

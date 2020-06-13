package club.banyuan.company;

import javax.xml.namespace.QName;

public class Company {

  private Employee[] employeeArr = new Employee[100];
  private int employeeTotal = 0;

  /**
   * 添加员工
   *
   * @param employee
   */
  public void add(Employee employee) {
    if (employee == null) {
      System.out.println("不合法");
      return;
    }
    employeeArr[employeeTotal++] = employee;
  }

  /**
   * 通过名字删除员工
   *
   * @param name
   * @return
   */
  public Employee remove(String name) {
    int index = -1;

    for (int i = 0; i < employeeTotal; i++) {
      if (employeeArr[i].getName().equals(name)) {
        index = i;
        break;
      }
    }

    if (index == -1) {
      return null;
    }

    Employee rlt = employeeArr[index];

    employeeArr[index] = employeeArr[employeeTotal - 1];
    employeeArr[employeeTotal--] = null;

    return rlt;

  }

//  public void printEmployeeSalary(String name) {
//    for (int i = 0; i < employeeTotal; i++) {
//      if (employeeArr[i].getName().equals(name)) {
//        System.out.println(name + "员工工资" + employeeArr[i].getSalary());
//      }
//    }
//  }

  /**
   *打印所有员工工资和
   */
  public void printTotalSalary() {
    int totalSalary = 0;
    for (int i = 0; i < employeeTotal; i++) {
      totalSalary = totalSalary + employeeArr[i].getSalary();
    }
    System.out.println("所有员工工资和为：" + totalSalary);
  }

  /**
   * 通过名字打印员工工资
   */
  public void printAll() {
    System.out.println("=============");
    for (int i = 0; i < employeeTotal; i++) {
      Employee employee = employeeArr[i];
      System.out.println(employee.getName() + ":" + employee.getSalary());
    }

  }
}

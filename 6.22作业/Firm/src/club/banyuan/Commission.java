package club.banyuan;

public class Commission extends Hourly {

  private double totalSales;
  private double commissionRate;

  public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate,
      double commissionRate) {
    super(eName, eAddress, ePhone, socSecNumber, rate);
    this.commissionRate = commissionRate;
    totalSales = 0;
  }

  public void addSales(double totalSales) {
    this.totalSales += totalSales;
  }

  public double pay() {
    double payment = super.pay() + totalSales;
    totalSales = 0;
    return totalSales;
  }

  public String toString() {
    String result = super.toString();
    result += "\n总销售额: " + totalSales;
    return result;
  }
}

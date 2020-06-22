package club.banyuan;

public class ReadyMadeCake extends Cake {

  private double quantity;

  public ReadyMadeCake(int n, double r, double quantity) {
    super(n, r);
    this.quantity = quantity;
  }

  public double getQuantity() {
    return quantity;
  }

  public void setQuantity(double quantity) {
    this.quantity = quantity;
  }

  @Override
  public double calcPrice() {
    return price * quantity;
  }
}

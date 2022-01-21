import javax.swing.JOptionPane;

public class calc {
  public static double calcularPotencia(double valor1, double valor2) {
    return Math.pow(valor1, valor2);
  }

  public static void main(String[] args) {
    double base = Double.parseDouble(JOptionPane.showInputDialog("Informe a base"));
    double exp = Double.parseDouble(JOptionPane.showInputDialog("Informe a expoente"));
    // utilizacaodoresultadoadicionadoa10
    JOptionPane.showMessageDialog(null,
        "resultado:" + (int) base + "^" + (int) exp + ":" + (int) (calcularPotencia(base, exp) + 10));
  }
}
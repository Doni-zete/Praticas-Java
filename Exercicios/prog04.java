
import javax.swing.*;

public class prog04 {
  public static void main(String[] args) {
    int dia = 0, mes = 0, ano = 0;

    dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o dia (ex:31): "));
    mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o mes (ex:12): "));
    ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ano (ex:2017): "));

    JOptionPane.showMessageDialog(null, dia + "/" + mes + "/" + ano);
  }

}

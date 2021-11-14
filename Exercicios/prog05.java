import javax.swing.*;

public class prog05 {
  public static void main(String[] args) {
    String texto = "Analise e Desenvolvimento de Sistemas - FTC";
    String texto2 = texto.replace("FTC","FATEC");
    String msg="";

    msg = "Tamanho:"+ texto.length()+"\n"+
    "Maiusculo:" + texto.toUpperCase()+ "\n"+
    "Posicao de  'Sistemas':"+ texto.indexOf("Sistemas")+ "\n"+
    "Nova string:"+texto2;
    JOptionPane.showMessageDialog(null, msg.concat("\n\nFim da mensagem"));
  }

}

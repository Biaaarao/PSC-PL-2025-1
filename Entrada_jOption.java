import javax.swing.JOptionPane;

public class Entrada_jOption {

public static void main(String[]args){
    String nome = JOptionPane.showInputDialog("digite seu nome");
    String idade = JOptionPane.showInputDialog("digite a sua idade");

    double altura = Double.parseDouble(JOptionPane.showInputDialog("digite sua altura"));

    int idadeStr = Integer.parseInt(idade);

    JOptionPane.showConfirmDialog(null, nome + idadeStr + altura);


}
    
}

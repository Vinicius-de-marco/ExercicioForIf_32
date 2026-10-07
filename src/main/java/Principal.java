
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        int soma = 0;
        int menor = 0;
        int maior = 0;
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite uma quantidade de numeros inteiros: "));
        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + i + "° numero: "));
            soma = soma + num;
            if (i == 1) {
                menor = num;
                maior = num;
            } else {
                if (num < menor) {
                    menor = num;
                }
                if (num > maior) {
                    maior = num;
                }
            }
        }
        double media = (double) soma /n;
        System.out.println("Menor valor: " +menor);
        System.out.println("maior valor: " +maior);
        System.out.println("Média valor: " +media);
    }
}

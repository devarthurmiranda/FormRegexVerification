import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Client {

    public static Boolean testar(String cadeia, String regex){
        Pattern pattern = Pattern.compile(regex);
        boolean match = pattern.matcher(cadeia).matches();
        return match;
    }

    public static void main(String[] args) {
        Boolean aceitacao = false;
        while (!aceitacao) {
            String nome = JOptionPane.showInputDialog("Digite o nome.");
            String regexNome = "\\p{Upper}{1}\\p{Lower}{1,39}";
            if(testar(nome, regexNome)){
                System.out.println("Formato de nome aceito!");
                String cpf = JOptionPane.showInputDialog("Digite o cpf.");
                String regexCpf = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}";
                if (testar(cpf, regexCpf)) {
                    System.out.println("Formato de cpf aceito!");
                    String senha = JOptionPane.showInputDialog("Digite o senha.");
                    String regexSenha = "[0-9]{1}[\\w]{2,8}[a-zA-Z]{1}";
                    if (testar(senha, regexSenha)) {
                        System.out.println("Formato de senha aceito!");
                        String telefone = JOptionPane.showInputDialog("Digite o telefone.");
                        String regexTelefone = "\\+\\d{3}\\(\\d{2}\\)\\d{4,5}-\\d{4}";
                        if (testar(telefone, regexTelefone)) {
                            System.out.println("Formato de telefone aceito!");
                            System.out.println("Formulario Aceito!");
                            aceitacao = true;
                        }
                    }
                }
            }
        }
    }
}

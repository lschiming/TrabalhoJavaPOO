package fatec.poo.view;

/**
 *
 * @author sartori
 */
public class Helper {

    public boolean isCpfValid(String cpf) {
        int soma = 0, digito = 0, h = 11;
        
        if (cpf.length() != 11) {
            return false;
        }

        for (int i = 0; i < 9; i++) {
            soma += (i + 1) * Character.getNumericValue(cpf.charAt(i));
        }

        digito = soma % 11;

        if (
                (digito != 10) && (digito != Character.getNumericValue(cpf.charAt(9)))
                || (digito == 10) && (Character.getNumericValue(cpf.charAt(9)) != 0)
            ) {
                return false;
        }

        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += h * Character.getNumericValue(cpf.charAt(i));
            h--;
        }
        
        soma = soma * 10;
        digito = soma % 11;

        if (
                (digito != 10) && (digito != Character.getNumericValue(cpf.charAt(10)))
                || (digito == 10) && (Character.getNumericValue(cpf.charAt(10)) != 0)
            ) {
            return false;
        }

        return true;
    }

}

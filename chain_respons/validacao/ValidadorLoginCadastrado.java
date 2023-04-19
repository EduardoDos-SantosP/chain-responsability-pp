package chain_respons.validacao;

import chain_respons.Usuario;

public class ValidadorLoginCadastrado extends Validador {
    @Override
    public boolean valide(Usuario usuario) {
        for (String login : loginsCadastrados)
            if (login.equals(usuario.getLogin()))
                return true;
        return false;
    }
}

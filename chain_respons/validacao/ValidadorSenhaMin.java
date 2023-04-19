package chain_respons.validacao;

import chain_respons.Usuario;

public class ValidadorSenhaMin extends Validador {
    @Override
    public boolean valide(Usuario usuario) {
        return usuario.getSenha().length() >= 8;
    }
}

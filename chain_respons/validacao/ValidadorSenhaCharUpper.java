package chain_respons.validacao;

import chain_respons.Usuario;

public class ValidadorSenhaCharUpper extends Validador {
    @Override
    public boolean valide(Usuario usuario) {
        return usuario.getSenha().matches(".*[A-Z].*");
    }
}

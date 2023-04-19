package chain_respons.validacao;

import chain_respons.Usuario;

public class ValidadorSenhaCharNum extends Validador {
    @Override
    public boolean valide(Usuario usuario) {
        return usuario.getSenha().matches(".*[0-9].*");
    }
}

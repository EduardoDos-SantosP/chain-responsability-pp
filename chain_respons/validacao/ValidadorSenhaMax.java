package chain_respons.validacao;

import chain_respons.Usuario;

public class ValidadorSenhaMax extends Validador {
    @Override
    public boolean valide(Usuario usuario) {
        return usuario.getSenha().length() <= 16;
    }
}

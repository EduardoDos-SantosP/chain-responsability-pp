package chain_respons.validacao;

import chain_respons.Usuario;

public class ValidadorSenhaCharEspecial extends Validador {
    @Override
    public boolean valide(Usuario usuario) {
        return usuario.getSenha().matches(".*[@#$%&*!?].*");
    }
}

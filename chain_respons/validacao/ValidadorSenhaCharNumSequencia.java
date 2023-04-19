package chain_respons.validacao;

import chain_respons.Usuario;

public class ValidadorSenhaCharNumSequencia extends Validador {
    @Override
    public boolean valide(Usuario usuario) {
        return !usuario.getSenha().matches(".*\\d{3,}.*");
    }
}

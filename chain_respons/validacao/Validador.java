package chain_respons.validacao;

import java.util.ArrayList;

import chain_respons.Usuario;

public abstract class Validador {
    protected Validador proximo;
    protected ArrayList<String> loginsCadastrados = new ArrayList<>();

    public void enfileirar(Validador proximoValidador) {
        if (this.proximo == null)
            this.proximo = proximoValidador;
        else
            this.proximo.enfileirar(proximoValidador);
    }

    public void desenfileirar() {
        proximo = null;
    }

    public boolean valideTodos(Usuario usuario) {
        var validador = this;
        while (validador != null) {
            if (validador.valide(usuario))
                validador = validador.proximo;
            else return false;
        }
        return true;
    }

    protected abstract boolean valide(Usuario usuario);

    public ArrayList<String> getLoginsCadastrados() {
        return this.loginsCadastrados;
    }
}
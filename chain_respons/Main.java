package chain_respons;

import chain_respons.validacao.*;

public class Main {
    public static void main(String[] args) {
        var usuario = new Usuario("edu", "Aa$12xxx");

        Validador v1 = new ValidadorLoginCadastrado();
        v1.getLoginsCadastrados().add(usuario.getLogin());

        v1.enfileirar(new ValidadorSenhaCharUpper());
        v1.enfileirar(new ValidadorSenhaCharLower());
        v1.enfileirar(new ValidadorSenhaCharEspecial());
        v1.enfileirar(new ValidadorSenhaCharNum());
        v1.enfileirar(new ValidadorSenhaCharNumSequencia());
        v1.enfileirar(new ValidadorSenhaMin());
        v1.enfileirar(new ValidadorSenhaMax());

        var r = v1.valideTodos(usuario);
        System.out.println(r ? "Válido" : "Inválido");
    }
}

package bertholucci.organize.clone.config;

import com.google.firebase.auth.FirebaseAuth;

public class ConfiguracaoFirebase {
    //precisa ser statico pra sempre acessar a mesma instancia
    private static FirebaseAuth autenticacao;

    //retorna instancia do firebase auth
    public static FirebaseAuth getFirebaseAutenticacao() {

        if(autenticacao == null){
            autenticacao = FirebaseAuth.getInstance();
        }

        return autenticacao;
    }
}

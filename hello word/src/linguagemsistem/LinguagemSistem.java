package linguagemsistem;

import java.util.Locale;

public class LinguagemSistem {
    public static void main(String[] args) {
        Locale local=Locale.getDefault();
        System.out.println("o idioma do sistema é :");
        System.out.println(local.getDisplayLanguage());
    }
}

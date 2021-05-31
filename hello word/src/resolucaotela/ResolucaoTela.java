package resolucaotela;

import java.awt.*;
import java.util.Locale;

public class ResolucaoTela {
    public static void main(String[] args) {
        Toolkit tk= Toolkit.getDefaultToolkit();
        Dimension d=tk.getScreenSize();
        System.out.println("a resolução do sistema é:"+d.width+"X"+d.height);

    }
}

package com.mycompany.resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTela {

    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        int largura = d.width;
        int altura = d.height;
        
        System.out.println("Resolução da tela: "+largura +"x" +altura);
    }
}

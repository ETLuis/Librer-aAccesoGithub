import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;

import javax.swing.*;
import java.io.IOException;

public class Repositorio {

    public void CrearRepositorio(){


        GitHub builder = null;
        try {

            //Pido el token
            String token = JOptionPane.showInputDialog("Introduce el token de GitHub: ");

            //Creo Builder
            builder = new GitHubBuilder()
                    .withOAuthToken(token)
                    .build();

        } catch (IOException e) {
            e.printStackTrace();
        }

        GHRepository repositorio = null;
        try {
            //Pido que introduzca el nombre del repositorio
            String nomRe = JOptionPane.showInputDialog("Introduce el nombre del repositorio: ");
            //Creo el repositorio
            repositorio = builder.createRepository(nomRe, "Descripción del repositorio", "https://www.kohsuke.org/", true);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


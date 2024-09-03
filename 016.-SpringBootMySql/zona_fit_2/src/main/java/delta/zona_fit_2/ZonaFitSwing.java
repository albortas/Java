package delta.zona_fit_2;

import com.formdev.flatlaf.FlatDarculaLaf;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import javax.swing.*;

//@SpringBootApplication
public class ZonaFitSwing {
    public static void main(String[] args) {
        //Configuramos el modo oscuro
        FlatDarculaLaf.setup();
        //Instanciar la fabrica de Spring
        ConfigurableApplicationContext contextoSpring =
                new SpringApplicationBuilder(ZonaFitSwing.class)
                        .headless(false)
                        .web(WebApplicationType.NONE)
                        .run(args);
        //Crear un objeto de Swing
        SwingUtilities.invokeLater(() ->{
            delta.zona_fit_2.gui.ZonaFitForma zonaFitForma = contextoSpring.getBean(delta.zona_fit_2.gui.ZonaFitForma.class);
            zonaFitForma.setVisible(true);
        });
    }
}

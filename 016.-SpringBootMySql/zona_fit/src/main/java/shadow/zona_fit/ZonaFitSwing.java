package shadow.zona_fit;

import com.formdev.flatlaf.FlatDarculaLaf;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import shadow.zona_fit.gui.ZonaFitForma;

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
            ZonaFitForma zonaFitForma = contextoSpring.getBean(ZonaFitForma.class);
            zonaFitForma.setVisible(true);
        });
    }
}

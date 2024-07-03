import java.text.DecimalFormat;

public class E8_RedondeoTruncado {
    public static void main(String[] args) {
        //Redondeo y truncado
        var numero = 8.5;
        // round -> Igual o mayor .%
        // redondeo al valor superior entero
        var redondeo = Math.round(numero);
        System.out.println("Valor " + numero + " redondeo " + redondeo);

        //trunc -> No existe un metodo directo
        //Utilizaremos la clase DecimalFormat
        //var patron = "#.#";
        var patron = "#"; //Le quitamos la parte del punto decimal
        var decimalFormat = new DecimalFormat(patron);
        var truncado = decimalFormat.format(numero);
        System.out.println("Valor " + numero + " truncado " + truncado);
    }
}

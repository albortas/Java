package aritmetica;
public class Aritmetica {

    //Atributos
    private int operando1, operando2;

    //Constructor
    public Aritmetica(int operando1, int operando2){
        this.operando1 = operando1;
        this.operando2 = operando2;
        //System.out.println("Operador this: " + this);
    }
    //Constructor vacio (Sobrecarga de constructores)
    public Aritmetica(){

    }

    //Metodos
    public void sumar(){
        int resultado = this.operando1 + this.operando2;
        System.out.println("Resultado de la suma: " + resultado);
    }

    public void restar(){
        int resultado = this.operando1 - this.operando2;
        System.out.println("Resultado de la resta: " + resultado);
    }
    //Metodos get y set
    public int getOperando1(){
        return this.operando1;
    }

    public int getOperando2(){
        return this.operando2;
    }

    public void setOperando1(int operando1){
        this.operando1 = operando1;
    }
    
    public void setOperando2(int operando2){
        this.operando2 = operando2;
    }
    

}

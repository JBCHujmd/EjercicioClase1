import java.util.Scanner;

public class Ejercicio1 {

    static Operaciones ops = new Operaciones();
    public static void main(String[] args) {
        ops.numScan();
        ops.validNum();
        System.out.print("Los resultados son:\n");
        ops.printNum();
        ops.resNum();
    }
}
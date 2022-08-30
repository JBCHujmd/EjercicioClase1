import java.util.Scanner;

public class Operaciones {
    private int num1 = 0;
    private int num2 = 0;
    private int num3 = 0;
    private int numMa = 0;
    private int numMe = 0;
    private int sumMa = 0;
    private int resMe = 0;
    private Scanner sc = new Scanner(System.in);

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public int getNumMe() {
        return numMe;
    }

    public void setNumMe(int numMe) {
        this.numMe = numMe;
    }

    public int getNumMa() {
        return numMa;
    }

    public void setnumMa(int numMa) {
        this.numMa = numMa;
    }

    public int getSumMa() {
        return sumMa;
    }

    public void setSumMa(int sumMa) {
        this.sumMa = sumMa;
    }

    public int getResMe() {
        return resMe;
    }

    public void setResMe(int resMe) {
        this.resMe = resMe;
    }

    public void numScan() {
        System.out.print("Introduzca el primer numero: ");
        num1 = sc.nextInt();
        System.out.print("Introduzca el segundo numero: ");
        num2 = sc.nextInt();
        System.out.print("Introduzca el tercer numero: ");
        num3 = sc.nextInt();
    }

    public void validNum() {
        if ((num1 % 5 == 0) && (num2 % 5 == 0) && (num3 % 5 == 0) && (num1 != num2) && (num2 != num3)
                && (num1 != num3)) {
            System.out.println("\t");
            System.out.println("Numeros introducidos correctamente");
        } else {
            System.out.println("ERROR: Todos los numeros deben ser diferentes y multiplos de 5");
            System.exit(0);
        }
    }

    public void printNum() {
        System.out.println("Numero 1: " + num1);
        System.out.println("Numero 1: " + num2);
        System.out.println("Numero 1: " + num3);
    }

    public void resNum() {
        // condicion numero mayor
        if (num1 > num2 && num1 > num3) {
            numMa = num1;
        } else {
            if (num2 > num1 && num2 > num3) {
                numMa = num2;
            } else {
                if (num3 > num2 && num3 > num1) {
                    numMa = num3;
                }
            }
        }
        // condicion numero menor
        if (num1 < num2 && num1 < num3) {
            numMe = num1;
        } else {
            if (num2 < num1 && num2 < num3) {
                numMe = num2;
            } else {
                if (num3 < num2 && num3 < num1) {
                    numMe = num3;
                }
            }
        }
        // condicion suma numero mayor
        if (numMe > 10) {
            sumMa = numMa + 10;
            System.out.println("Mayor: " + sumMa);
        } else {
            System.out.println("Mayor: " + numMa);
        }
        // condicion resta numero menor
        if (numMa < 50) {
            resMe = numMe - 5;
            System.out.println("Menor: " + resMe);
        } else {
            System.out.println("Menor: " + numMe);
        }
    }
}
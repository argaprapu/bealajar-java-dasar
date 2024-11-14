import java.util.Scanner;

public class Calculator {
    public static void calc (int a, int b, String op){
        if(op.equals("+")) {
            System.out.println(a+b);
        } else if (op.equals("-")) {
            System.out.println(a-b);
        } else if (op.equals("x")) {
            System.out.println(a*b);
        } else if (op.equals(":")) {
            System.out.println(a/b);
        } else if (op.equals("%")) {
            System.out.println(a%b);
        }else {
            System.out.println("input tidak valid");
        }
    }
    public static void main(String[]args){
        //Kalkulator yg bisa menerima input int a, int b, char operator
        //while, lanjut y tidak t
                Scanner scanner1 = new Scanner(System.in);
                boolean kondisi = true;
                while (kondisi) {
                        System.out.println("Masukkan a: ");
                int a = Integer.parseInt(scanner1.nextLine());
                        System.out.println("Masukkan b: ");
                int b = Integer.parseInt(scanner1.nextLine());

                System.out.println("Masukkan Operator Perhitungan:");
                String op = scanner1.nextLine();
                System.out.println("Hasilnya adalah.......");

                calc(a, b, op);

                    System.out.println("Lanjut boy?");
                String tanya = scanner1.nextLine();

                    if(tanya.equals("ya")) {
                        kondisi = true;
                    }else {
                        kondisi = false;
                    }
                }
        scanner1.close();
         }
    }


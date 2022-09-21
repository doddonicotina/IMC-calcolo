import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); 
                System.out.println("CALCOLO IMC");
                System.out.println("Inserire peso: ");
                float weight = scanner.nextFloat();

                scanner.nextLine();

                System.out.println("Inserire altezza in metri: ");
                float height = scanner.nextFloat();

                scanner.nextLine();

                float IMC = weight/height*height;
                String status;
                if (IMC < 16){
                        status = "anoressico/a";
                }else if (IMC >= 16 && IMC < 19){
                        status = "anoressico/a";
                }else if (IMC >= 19 && IMC < 24){
                        status = "normopeso/a";
                }else if (IMC >25 && IMC <30){
                        status = "sovrappeso/a";
                }else{
                        status = "obeso"/a;
                }
    
                System.out.println("sei "+status);
        }

    
}

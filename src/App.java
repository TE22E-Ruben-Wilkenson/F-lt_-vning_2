import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner tan = new Scanner(System.in);
        
        // program 1
        int[] fält = new int[4];


        // skapa array
        for(int i = 0; i < fält.length; i++){
            System.out.print("Skriv in tal: ");
            fält[i] = tan.nextInt();
        }

        // skriv ut
        for(int i = 0; i < fält.length; i++){
            System.out.println(fält[i]);
        }

        // skapa kopia
        int[] fält_kopia = fält.clone();

        // byt plats
        for(int a = 0, b = fält.length; a < fält.length;){
            fält_kopia[a] = fält[b - 1]; 
            a += 1; 
            b -= 1;
        }

        // skriv ut
        System.out.println("Ombytt");
        for(int i = 0; i < fält_kopia.length; i++){
            System.out.println(fält_kopia[i]);
        }
        
        // program 2
        String[] facit = {"hej", "på", "dig"};
        String temp;

        System.out.print("Prompt:   ");
        temp = tan.nextLine();

        if(temp.equals("hej") || temp.equals("på") || temp.equals("dig")){
            System.out.println("Korrekt");
        }

        else{
            System.out.println("Fel");
        }
        
    }
}

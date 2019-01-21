import java.util.Scanner;

class TestaTamagochi{

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Tamagochi t = new Tamagochi();


                System.out.println("Defina os niveis de energia, fome e limpeza!");
                t.energia = scan.nextInt();
                t.fome = scan.nextInt();
                t.limpeza = scan.nextInt();
                

                t.energiaInicial = t.energia;
                t.limpezaInicial = t.limpeza;
                t.fomeInicial = t.fome;

                t.energia(t.energia);
                t.fome(t.fome);
                t.limpeza(t.limpeza);
                t.mostrar();


                do{
                        System.out.println();
                        System.out.println("Comandos | brincar / comer / tomar banho / dormir / fim |:");
                        t.comando = scan.nextLine();
                        t.comandos(t.comando);
                        t.mostrar();   
            
                }while(!t.comando.equals("fim"));
	}
}
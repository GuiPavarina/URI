package basico;

import java.util.Scanner;

public class Exec1080 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int maior = num;
		int posicao = 1;
		
		for(int i = 2 ; i <=100 ; i++){
			num = scn.nextInt();
			if(num > maior){
				maior = num;
				posicao = i;
			}
		}
		System.out.println(maior);
		System.out.println(posicao);
		scn.close();
		
	}

}

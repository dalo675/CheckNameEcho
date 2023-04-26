package checknameecho;

import java.util.Scanner;

public class CheckNameEcho {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        String nom1, nom2, nomRestant, cognom, noms, nomResultant, nomComplet;

        // Demanem a l'usuari que introdueixi el seu com complet
        System.out.println("Enter your name: ");
        nomComplet = lector.nextLine().trim();
        
        // Busquem si l'usuari ha introduït els cognoms
        if (nomComplet.indexOf(" ") > -1) {
            
            // Separem el 1r nom i la resta (podria haver un segon nom, i el cognom)
            nom1 = nomComplet.substring(0, nomComplet.indexOf(" "));
            nomRestant = nomComplet.substring(nomComplet.indexOf(" ") + 1);
            
            if (nomRestant.indexOf(" ") > -1) {
                //Si ha introduït un segom nom, el separem del seu cognom
                nom2 = nomRestant.substring(0, nomRestant.indexOf(" "));
                cognom = nomRestant.substring(nomRestant.indexOf(" ") + 1);
                noms = nom1.concat(" " + nom2);
                nomResultant = noms.concat(" " + cognom.toUpperCase());
                System.out.println(nomResultant);
                
            } else {
                //Si no hi ha un 2n nom, concatenem el nom i el cognom per mostrar en pantalla
                nomResultant = nom1.concat(" " + nomRestant.toUpperCase());
                System.out.println(nomResultant);
            }
        } else {
            // Si no ha introduït cap cognom ni el segon nom, llavors només mostrem el seu nom
            System.out.println(nomComplet);
        }
        lector.close();
    }
}

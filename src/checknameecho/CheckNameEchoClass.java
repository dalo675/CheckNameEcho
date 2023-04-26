package checknameecho;

public class CheckNameEchoClass {

    public String CheckNameEcho(String nomComplet) {

        String nom1, nom2, nomRestant, cognom, noms, nomResultant;

        nomComplet = nomComplet.trim();
        
        // Busquem si l'usuari ha introduït els cognoms
        if (nomComplet.indexOf(" ") > - 1) {

            // Separem el 1r nom i la resta (podria haver un segon nom, i el cognom)
            nom1 = nomComplet.substring(0, nomComplet.indexOf(" "));
            nomRestant = nomComplet.substring(nomComplet.indexOf(" ") + 1);

            if (nomRestant.indexOf(" ") > -1) {

                //Si ha introduït un segom nom, el separem del seu cognom
                nom2 = nomRestant.substring(0, nomRestant.indexOf(" "));
                cognom = nomRestant.substring(nomRestant.indexOf(" ") + 1);
                noms = nom1.concat(" " + nom2);
                nomResultant = noms.concat(" " + cognom.toUpperCase());
                //retornem el nom resultant
                return nomResultant;

            } else {
                nomResultant = nom1.concat(" " + nomRestant.toUpperCase());
                //retornem el nom resultant
                return nomResultant;
            }

        } else {
            //retornem el nom complet
            return nomComplet;
        }
    }
}
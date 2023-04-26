package checknameecho;

import org.junit.Test;
import static org.junit.Assert.*;

public class CheckNameEchoClassTest {
    
    CheckNameEchoClass checker = new CheckNameEchoClass();

    //Li passem com a paràmetre un nom sol, deuria retornar aquest nom en minuscules
    @Test
    public void testNombreUnic() {
        String nomComplet = checker.CheckNameEcho("Daniel");
        assertEquals("Daniel", nomComplet);
    }

    //Li passem com a paràmetre un nom i un cognom, duria retornar el cognom
    //en majúscules
    @Test
    public void testNombreDoble() {
        String nomComplet = checker.CheckNameEcho("Daniel Lopez");
        assertEquals("Daniel LOPEZ", nomComplet);
    }

    //Li passem com a paràmetre un nom, un segon nom i un cognom, deuria 
    //retornar únicament el cognom en majúscules
    @Test
    public void testNombreTriple() {
        String nomComplet = checker.CheckNameEcho("Daniel Ignacio Lopez");
        assertEquals("Daniel Ignacio LOPEZ", nomComplet);
    }
    
    //Li passem com a paràmetre un nom, un segon nom, un primer cognom i un SEGON
    //cognom, deuria retornar els dos cognoms en majúscules
    @Test
    public void testNombreQuadruple() {
        String nomComplet = checker.CheckNameEcho("Daniel Ignacio Lopez Rodriguez");
        assertEquals("Daniel Ignacio LOPEZ RODRIGUEZ", nomComplet);
    }
}
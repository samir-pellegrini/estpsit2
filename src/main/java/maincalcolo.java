
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samir pellegrini
 */
public class maincalcolo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date data= new Date(10,6,2020);
        calcolodata d1= new calcolodata (data);
        
       d1.calcolodata();
       
       System.out.println("la data successiva è" + d1.calcolodata());
       d1.giorno();
       System.out.println("il giorno è"+d1.giorno());
    }
    
    
}

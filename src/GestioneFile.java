package gestionefile;

/**
 *
 * @author MC
 * @version 12/01/23
 */
public class GestioneFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input =new Scanner();
        //1)LETTURA
        Lettore lettore = new Lettore("user.json");
        lettore.start();
        System.out.println("Enter Username");
        String username = input.nextLine();        
        
        //3) SCRITTURA
        Scrittore scrittore = new Scrittore("output.csv");
        Thread threadScrittore = new Thread(scrittore);
        threadScrittore.start();
    }
    
}

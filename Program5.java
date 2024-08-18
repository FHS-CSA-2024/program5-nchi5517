

//import stuff here?
import java.math.RoundingMode;
import java.text.DecimalFormat;
//Your code here
public class Program5{
     private static final DecimalFormat df = new DecimalFormat("0.0");
    public static void main(String[] args){
    int royalMiles = 286;
    int koopakingMiles = 412;
    int pipeframeMiles = 361;
    int badwagonMiles = 161; 
    int royalGallons = 9;
    int koopakingGallons = 40;
    int pipeframeGallons = 18;
    int badwagonGallons = 11;
    double royalAverage = 0.0;
    double koopakingAverage = 0.0;
    double pipeframeAverage = 0.0;
    double badwagonAverage = 0.0;
    royalAverage =(double) royalMiles/royalGallons;
    koopakingAverage =(double) koopakingMiles/koopakingGallons;
    pipeframeAverage =(double) pipeframeMiles/pipeframeGallons;
    badwagonAverage =(double) badwagonMiles/badwagonGallons;
    
    System.out.println("Mushroom Cup Rix Racer Average Miles/Per Gallon: ");
     df.setRoundingMode(RoundingMode.UP);
    System.out.println("Royal averaged "+ df.format(royalAverage)+" m/g");
     df.setRoundingMode(RoundingMode.UP);
    System.out.println("Koopa King averaged "+ df.format(koopakingAverage)+" m/g");
     df.setRoundingMode(RoundingMode.UP);
    System.out.println("Pipe Frame averaged "+ df.format(pipeframeAverage)+" m/g");
     df.setRoundingMode(RoundingMode.DOWN);
    System.out.println("Badwagon averaged "+ df.format(badwagonAverage)+" m/g");
    
    

    



 }
}
//Paste console output below:
/*


*/

    

    



 }
}
//Paste console output below:
/*


*/

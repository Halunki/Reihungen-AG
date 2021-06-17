
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Balkendiagramm_Zufall.
 * Beschreibung: 
 *
 * @author Thomas Schaller, Simon Gebert 
 * @version 05.02.2020
 */
public class Balkendiagramm_Zufall extends PApplet
{ 
    int[] zahlen;    
    // Schriften
    PFont kleineSchrift;  
    PFont grosseSchrift;  
    int fgColor=0;
    int bgColor=255;
    int barColor=0xff0000ff;
    

    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(1000,700);
    }        

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        background(bgColor);
        kleineSchrift = createFont("fonts/NotoSans-Medium.ttf", 12); //12 / 26
        grosseSchrift = createFont("fonts/NotoSansDisplay-Medium.ttf",20); //20 /48

        // Zufallszahlen erzeugen und anzeigen
        erzeugeZufallsarray(20);
        zeichneBalken();
    }

    public int getZufallszahl(int min, int max) {
        java.util.Random r = new java.util.Random();
        return r.nextInt(max-min+1)+min;
    }

    public void erzeugeZufallsarray(int laenge) {
        // ToDo: Neues Array der richtigen Länge erzeugen
        if (laenge<0) return;
        
        zahlen= new int [laenge];
        for(int x=0; x<laenge; x=x+1){    
            
            zahlen[x] =  getZufallszahl(0, 300);
        }
        // ToDo: Jedes Element mit einer Zufallszahl belegen
        

    }

    public void zeichneBalken() {

        clear();
        background(bgColor);

        // Überschrift
        fill(fgColor);
        textFont(grosseSchrift);
        text("Balkendiagramm", 2, 20);
        textFont(kleineSchrift);

        // ToDo: Kopiere Code aus Balkendiagramm
        for (int i=0; i<zahlen.length; i=i+1){
            fill(barColor);
            rect(120, 25+i*15, zahlen[i],8);
            fill(fgColor);
            text("i="+i+ " zahlen["+i+"]"+"="+ zahlen [i], 5, 35+i*15);
        }
    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(Balkendiagramm_Zufall.class, _args);
    }

}

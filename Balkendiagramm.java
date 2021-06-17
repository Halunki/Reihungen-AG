
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Balkendiagramm.
 * Beschreibung: 
 *
 * @author Thomas Schaller, Simon Gebert 
 * @version 1.1 vom 05.02.2020
 */
public class Balkendiagramm extends PApplet
{ 
    int[]   zahlen={45, 23, 123, 87, 98, 2, 1, 23, 23, 34};    
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
        zeichneBalken();
    }

    public void zeichneBalken() {
        clear();
        background(bgColor);

        // Überschrift
        fill(fgColor);
        textFont(grosseSchrift);
        text("Balkendiagramm", 2, 20);
        textFont(kleineSchrift);

        // ----------------------------------------------------------------------
        // To Do
        // ----------------------------------------------------------------------
        // Version 1: 
        // Implementiere die ersten vier Balken durch Angabe der Koordinaten aus der Tabelle. 
        // Ergänze dazu die Methode zeicheBalken an der "ToDo"-Stelle.
        // Version 2:
        // Ersetze die y-Koordinate und die Breite durch die oben ermittelte Formel. 
        // Deklariere vorher eine Integer-Variable i. Setze i vor der ersten Rechteck 
        // auf 0, vor dem zweite auf 1 usw. Überprüfe, ob deine Rechtecke immer noch 
        // korrekt gezeichnet werden.
        // Version 3:
        // Verwende eine for-Schleife, um alle Balken zeichnen zu lassen. Diese muss das i
        // in jedem Durchgang um 1 erhöhen. Die Anzahl der Elemente im Array bekommst du 
        // durch zahlen.length.
        // Tipp: Vergleiche mit deiner Implementation von der Kaffeehaus-Täuschung.

    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(Balkendiagramm.class, _args);
    }

}

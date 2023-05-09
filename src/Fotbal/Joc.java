package Fotbal;

public class Joc {
    private String numeEchipa1, numeEchipa2;
    private int scorEchipa1, scorEchipa2, numarOuturi, numarCornere;
    
    public Joc(String numeEchipa1, String numeEchipa2) {
        this.numeEchipa1 = numeEchipa1;
        this.numeEchipa2 = numeEchipa2;
        this.scorEchipa1 = 0;
        this.scorEchipa2 = 0;
        this.numarOuturi = 0;
        this.numarCornere = 0;
    }
    
    public void simuleaza() {
        Minge minge = new Minge(50, 25);
        
        for (int i = 0; i < 1000; i++) {
            try {
                minge.suteaza();
                System.out.println(numeEchipa1 + " - " + numeEchipa2 + ": Mingea se afla la coordonatele (" +  minge.getX() + ", " + minge.getY() + ")");
            } catch (Out e) {
                numarOuturi++;
                System.out.println("Out! " + numeEchipa2 + " primeste o aruncare de la margine.");
                minge = new Minge(minge.getX(), minge.getY());
            } catch (Gol e) {
                if (minge.getX() == 0) {
                    scorEchipa2++;
                } else {
                    scorEchipa1++;
                }
                System.out.println("Gol! Scorul este acum: " + numeEchipa1 + " " + scorEchipa1 + " - " + scorEchipa2 + " " + numeEchipa2);
                minge = new Minge(50, 25);
            } catch (Corner e) {
                numarCornere++;
                System.out.println("Corner! " + numeEchipa1 + " primeste o lovitura de la colt.");
                if (minge.getX() == 0) {
                    minge = new Minge(1, 1);
                } else {
                    minge = new Minge(99, 49);
                }
            }
        }
        
        System.out.println("Meci terminat!");
        System.out.println(numeEchipa1 + " " + scorEchipa1 + " - " + scorEchipa2 + " " + numeEchipa2);
        System.out.println("Numar de out-uri: " + numarOuturi);
        System.out.println("Numar de cornere: " + numarCornere);
    }
}

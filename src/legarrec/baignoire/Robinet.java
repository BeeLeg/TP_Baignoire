package legarrec.baignoire;

public class Robinet extends Thread{
    private Baignoire baignoire;
    private int volumeDebite;

    public Robinet(Baignoire baignoire, int volumeDebite) {
        this.baignoire = baignoire;
        this.volumeDebite = volumeDebite;
    }

    private void debite() throws InterruptedException {
        do {
            volumeDebite += volumeDebite;
            Thread.sleep(2000);
            System.out.println("Volume d'eau "+volumeDebite);
        }while (volumeDebite <= baignoire.getVolumeMax());

    }
}

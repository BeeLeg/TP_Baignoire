package legarrec.baignoire;

public class Baignoire {
    private int volumeMax;
    private int volumeEau;

    public Baignoire(int volumeMax) {
        this.volumeMax = volumeMax;
    }

    public int getVolumeMax() {
        return volumeMax;
    }

    public void setVolumeEau(int volumeEau) {
        this.volumeEau = volumeEau;
    }
}

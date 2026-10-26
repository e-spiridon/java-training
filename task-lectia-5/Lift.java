public class Lift extends Mecanism
{
    private int pozitie = 0;

    public Lift(int final pozitie) {this.pozitie = pozitie;}
    public Lift(String final tip, int final pozitie) {this.tip = tip; this.pozitie = pozitie;}

    void afiseazaPozitie()
    {
        System.out.println("Pozitie lift: " + this.pozitie);
    }

    void mutaLift(int final pozitie) {this.pozitie = pozitie;}

    void seteazaTip(String final tip) {this.tip = tip;}
}
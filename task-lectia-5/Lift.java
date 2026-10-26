public class Lift extends Mecanism
{
    private int pozitie = 0;

    public Lift(String tip) {super(tip);}
    public Lift(int pozitie) {super("Lift"); this.pozitie = pozitie;}
    public Lift(String tip, int pozitie) {super(tip); this.pozitie = pozitie;}

    public void afiseazaPozitie()
    {
        System.out.println("Pozitie lift: " + this.pozitie);
    }

    public void mutaLift(int pozitie) {this.pozitie = pozitie;}

    public void seteazaTip(String tip) {this.tip = tip;}
}
public class Brat extends Mecanism
{
    private int pozitie = 0;

    public Brat(int final pozitie) {this.pozitie = pozitie;}
    public Brat(String final tip, int final pozitie) {this.tip = tip; this.pozitie = pozitie;}

    void afiseazaPozitie()
    {
        System.out.println("Pozitie brat: " + this.pozitie);
    }

    void mutaBrat(int final pozitie) {this.pozitie = pozitie;}

    void seteazaTip(String final tip) {this.tip = tip;}
}
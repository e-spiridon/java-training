public class Brat extends Mecanism
{
    private int pozitie = 0;

    public Brat(String tip) 
    {super(tip);}
    public Brat(int pozitie) 
    {super("Brat"); this.pozitie = pozitie;}
    public Brat(String tip, int pozitie) 
    {super(tip); this.pozitie = pozitie;}

    public void afiseazaPozitie()
    {
        System.out.println("Pozitie brat: " + this.pozitie);
    }

    public void mutaBrat(int pozitie) 
    {this.pozitie = pozitie;}

    public void seteazaTip(String tip) 
    {this.tip = tip;}
}
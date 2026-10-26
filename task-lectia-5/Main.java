public class Main
{
    public static void main(String[] args)
    {
        Brat brat = new Brat(0);
        Lift lift = new Lift(4);

        brat.seteazaTip("Brat");
        lift.seteazaTip("Lift");

        brat.mutaBrat(7);
        lift.mutaLift(3);

        brat.afiseazaTip();
        brat.afiseazaPozitie();

        lift.afiseazaTip();
        lift.afiseazaPozitie();
    }
}
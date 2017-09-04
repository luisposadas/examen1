
public class Sistema
{
    public int calculaCosto(int hrE,int minE,int hrS,int minS)
    {
        int horas = hrS - hrE;
        int minutos = minS - minE;
        int precio = (15/60) * minutos + 15*horas;
        return precio;
    }
}
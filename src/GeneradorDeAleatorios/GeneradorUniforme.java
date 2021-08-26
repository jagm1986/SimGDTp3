
package GeneradorDeAleatorios;


public class GeneradorUniforme extends IGeneradorNumerosAleatorios
{
    private final double extremoIzquierdo;
    private final double extremoDerecho;

    public GeneradorUniforme(double extremoIzquierdo, double extremoDerecho) {
        this.extremoIzquierdo = extremoIzquierdo;
        this.extremoDerecho = extremoDerecho;
    }

    @Override
    public double generarAleatorio()
    {
        double rnd = generador.nextDouble(); 
        double diferenciaExtremos = extremoDerecho - extremoIzquierdo;
        
        double resultado = extremoIzquierdo + (rnd * diferenciaExtremos);
        
       double aux = (double) Math.round(resultado * 10000d) / 10000d;
       resultado = aux;
        
        return resultado;
    }
            
    @Override
    public double valuarFuncionDeDensidad(double valorAleatorio)
    {
        double amplitud = extremoDerecho - extremoIzquierdo;
        double resultado = 1/amplitud;
        return resultado;
    }
}

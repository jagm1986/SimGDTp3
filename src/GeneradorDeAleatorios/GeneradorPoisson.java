package GeneradorDeAleatorios;

import java.util.ArrayList;
import org.apache.commons.math3.distribution.PoissonDistribution;

public class GeneradorPoisson extends IGeneradorNumerosAleatorios
{
    private final float lambda;
    
    public GeneradorPoisson(float lambda) {
        super();
        this.lambda = lambda;

        
    }
    
    
    
    @Override
    public double generarAleatorio()
    {
        float p = 1;
        int resultado = -1;
        
        float opuestoLambda = 0 - lambda;
        double a = Math.pow(Math.E, opuestoLambda);
        
       
        float u;
        
        do 
        {
            u = generador.nextFloat();
            p *= u;
            resultado++;
            
            
        } while (p >= a);
        
        return resultado;

    }

    @Override
    public double valuarFuncionDeDensidad(double valorAleatorio)
    {
            // Formula: (e^-λ * λ^x)/x!
        
        int vA = (int)valorAleatorio;
        double lambdaALaX = Math.pow(lambda, (double)vA);
        
        double menosLambda = 0 - lambda;
        double eALaLambda = Math.exp(menosLambda);
        
        double factorial = factorial((int)vA);
        
        double producto = lambdaALaX * eALaLambda;
       
        double resultado = producto/factorial;
        return resultado;
    }
    

    
    private int factorial(int x)
    {
        int resultado = 1;
        for(int i = 1; i <= x; i++)
        {
            resultado*= i;
        }
        return resultado;
    } 
    
    
}

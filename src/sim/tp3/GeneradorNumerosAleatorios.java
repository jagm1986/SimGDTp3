package sim.tp3;

import java.util.Random;

public class GeneradorNumerosAleatorios {
    protected Random generador ;
    public GeneradorNumerosAleatorios() 
    {
         generador = new Random();
    }

    public GeneradorNumerosAleatorios(int semilla) 
    {
         generador = new Random(semilla);
    }
    public double generarAleatorioUniforme(double extremoIzquierdo, double extremoDerecho)
    {
       
        
        double rnd = generador.nextDouble(); 
        double diferenciaExtremos = extremoDerecho - extremoIzquierdo;
        
        double resultado = extremoIzquierdo + (rnd * diferenciaExtremos);
        return resultado;
    }
    
    public double generarAleatorioExponencial(float lambda)
    {
        
        double rnd = generador.nextDouble();
        float inversaLambda = ((float) -1)/lambda;
        
        double complementoRND = 1 - rnd;
        double logaritmoNaturalComplemento = Math.log(complementoRND);
  
        double resultado = inversaLambda * logaritmoNaturalComplemento;
        return resultado;
    }
    
    public int generarAleatorioPoisson(float lambda)
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
    
    public double generarAleatorioNormalConvolucion(int N, float media, float desviacion)
    {
        
        double acum=0;
        
        for (int i = 0; i < N; i++)
        {
            double rnd1=generador.nextDouble();
            acum += (rnd1-6);   
        }
        
        double multi=acum*desviacion;
        
        return (multi+media);
        
    }
    
    
    public double[] generarAleatorioNormalBoxMuller(float media, float desviacion)
    {
        double[] resultado = new double[2];
        
        
        double rnd1 = generador.nextDouble();
        double rnd2 = generador.nextDouble();
        
        double lnRND1 = Math.log(rnd1);
        
        double factorIzquierdo = ((-2) * lnRND1);
        double raizFactor = Math.sqrt(factorIzquierdo);
        
        double factorDerecho = 2 * (Math.PI) * rnd2;
        
        double cosenoFactor = Math.cos(factorDerecho);
        double senoFactor = Math.sin(factorDerecho);
        
        double z1 = raizFactor * cosenoFactor;
        double z2 = raizFactor * senoFactor;
        
        double n1 = ((z1 * desviacion) + media);
        double n2 = ((z2 * desviacion) + media);
        
        resultado[0] = n1;
        resultado[1] = n2;
        
        return resultado;
    }
}

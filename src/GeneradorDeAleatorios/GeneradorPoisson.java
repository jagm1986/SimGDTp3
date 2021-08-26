package GeneradorDeAleatorios;

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
        double lambdaALaX = Math.pow(lambda, valorAleatorio);
        
        double menosLambda = 0 - lambda;
        double eALaLambda = Math.exp(menosLambda);
        
        double factorial = factorial((int)valorAleatorio);
        
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

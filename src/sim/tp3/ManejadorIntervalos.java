package sim.tp3;

import GeneradorDeAleatorios.GeneradorExponencial;
import GeneradorDeAleatorios.GeneradorNormal;
import GeneradorDeAleatorios.GeneradorUniforme;
import GeneradorDeAleatorios.IGeneradorNumerosAleatorios;
import java.util.ArrayList;

public class ManejadorIntervalos {

    private ArrayList<Intervalo> intervalos;
    private int N;

    private ArrayList<Double> numerosGenerados;

    private double valorMinimo;
    private double valorMaximo;

    IGeneradorNumerosAleatorios gna; // gna es una abstraccion de un generador que sirve como interfaz para los diferentes tipos

    public ManejadorIntervalos() {
        N = 0;
        valorMinimo = 0;
        valorMaximo = 0;
        intervalos = new ArrayList<>();
        numerosGenerados = new ArrayList<>();
    }

    public ArrayList<Double> getNumerosGenerados() {
        return numerosGenerados;
    }

    public ArrayList<Intervalo> getIntervalos() {
        return intervalos;
    }

    public int getN() {
        return N;
    }

    public double getMin() {
        return valorMinimo;
    }

    public double getMax() {
        return valorMaximo;
    }

    public void setN(int N) {
        this.N = N;
    }

    public void generarDistribucionUniforme(double a, double b) {

        gna = new GeneradorUniforme(a, b);
        // generar numeros 
        for (int i = 0; i < N; i++) {
            double rnd = gna.generarAleatorio();
            numerosGenerados.add(rnd);

            if (i == 0) {
                valorMinimo = rnd;
                valorMaximo = rnd;
            } else {
                if (rnd > valorMaximo) {
                    valorMaximo = rnd;
                }
                if (rnd < valorMinimo) {
                    valorMinimo = rnd;
                }
            }
        }
        System.out.println("valor maximo: " + valorMaximo + "|| valor minimo: " + valorMinimo);
        valorMinimo = a !=0 ? a- 0.0001 : a;
        valorMaximo = b + 0.0001;
        System.out.println("valor maximo nuevo: " + valorMaximo + "|| valor minimo nuevo: " + valorMinimo);
    }

    public void generarDistribucionExponencial(float lambda) {
        gna = new GeneradorExponencial(lambda);
        //creo el generador para el tipo seleccionado.

        for (int i = 0; i < N; i++)// recorro el valor completo de N
        {

            double numeroGenerado = gna.generarAleatorio();//gna genera 
            numerosGenerados.add(numeroGenerado); // voy agregando al array de numeros cada elemento generado.

            if (i == 0) // esto lo que hace es que permite setear un valor inicial que es el primer random generado a valor minimo y maximo para luego poder
            // hacer la comparacion sin errores
            {
                valorMinimo = numeroGenerado;
                valorMaximo = numeroGenerado;
            } else {
                if (numeroGenerado > valorMaximo) {
                    valorMaximo = numeroGenerado;//si el ultimo random generado es mas grande que el ultimo mas grande pasa a ser el nuevo maximo
                }
                if (numeroGenerado < valorMinimo) {
                    valorMinimo = numeroGenerado;// idem arriba pero minimo.
                }
            }
        }
        System.out.println("valor maximo: " + valorMaximo + "|| valor minimo: " + valorMinimo);
        valorMaximo = valorMaximo + 0.0001;
        System.out.println("valor maximo nuevo: " + valorMaximo + "|| valor minimo nuevo: " + valorMinimo);

    }

    public void generarDistribucionNormal(float media, float desviacion) {
        System.out.println("Media = " + media);
        System.out.println("Desviacion = " + desviacion);

        gna = new GeneradorNormal(media, desviacion);

        for (int i = 0; i < N; i++) {
            double numeroGenerado = gna.generarAleatorio();
            numerosGenerados.add(numeroGenerado);

            if (i == 0) {
                valorMinimo = numeroGenerado;
                valorMaximo = numeroGenerado;
            } else {
                if (numeroGenerado > valorMaximo) {
                    valorMaximo = numeroGenerado;
                }
                if (numeroGenerado < valorMinimo) {
                    valorMinimo = numeroGenerado;
                }
            }
        }
        System.out.println("valor maximo: " + valorMaximo + "|| valor minimo: " + valorMinimo);
        valorMaximo = valorMaximo + 0.0001;
        valorMinimo = valorMinimo - 0.0001;
        System.out.println("valor maximo nuevo: " + valorMaximo + "|| valor minimo nuevo: " + valorMinimo);
    }

    public void calcularFrecuenciaEsperadaParaIntervalos() {
        for (Intervalo intervaloActual : intervalos) { //Para cada intervalo
            
            double valorFinIntervaloActual = intervaloActual.getValorFin();
            double valorInicioIntervaloActual = intervaloActual.getValorInicio();

            double probabilidadIntervaloActual=0;
            double frecuenciaEsperadaIntervaloActual;

            if (gna instanceof GeneradorExponencial || gna instanceof GeneradorNormal){ // Si es generador exponencial o normal

            probabilidadIntervaloActual = gna.valuarFuncionDeDensidad(valorFinIntervaloActual) - gna.valuarFuncionDeDensidad(valorInicioIntervaloActual);
                
            }
            else if (gna instanceof GeneradorUniforme){ // Si es generador uniforme
                probabilidadIntervaloActual = 1.0/intervalos.size();
            }
            
            frecuenciaEsperadaIntervaloActual = probabilidadIntervaloActual * N; // se multiplica la funcion de densidad por el N para calcular la frecuencia esperada.
            intervaloActual.setFrecuenciaEsperada(frecuenciaEsperadaIntervaloActual); //se setea la frecuencia esperada para cada intervalo de la lista.
            //intervaloActual.setFrecuenciaEsperada(frecuenciaEsperadaIntervaloActual);
            
            
        }
    }


    public void contarFrecuenciaObservadaPorIntervalo() {

        for (double numeroGenerado : numerosGenerados) 
        // recorre todos los intervalos preguntando si lo contiene.
        {
            for (Intervalo intervalo : intervalos) {
                if (intervalo.contiene(numeroGenerado)) { 
                    intervalo.aumentarFrecuenciaObservada();// Si lo contiene, aumenta la frecuencia observada
                    break;
                }
            }
        }
    }

    public void crearIntervalos(int cantidadIntervalos) // luego de generarse la lista de numeros y tener el maximo y minimo creo los intervalos. la cantidad de intervalos entra por parametro
    {
    
        
            double k = 0;
            double amplitud = 1.0;
            Intervalo aux = null;
            for (int i = 0; i < cantidadIntervalos; i++) 
            {
                 if (i == (cantidadIntervalos - 1)) {
                aux = new Intervalo(k, k + amplitud, 0, true);
            }
                 if (i < (cantidadIntervalos - 1)) {
                aux = new Intervalo(k, (k + amplitud), 0, false);
            }
                  intervalos.add(aux); //intervalos es un array con intervalos.
            k += amplitud; // k se le suma la amplitud que es el valor final del intervalo anterior para que sea el valor inicial del proximo.
        
            }
            
        
    }
 
    public void mostrarIntervalos() {
        for (Intervalo intervalo : intervalos) {
            System.out.println(intervalo);
        }
    }

    public void resetear() {
        N = 0;
        valorMinimo = 0;
        valorMaximo = 0;
        intervalos = new ArrayList<>();
        numerosGenerados = new ArrayList<>();

    }

}

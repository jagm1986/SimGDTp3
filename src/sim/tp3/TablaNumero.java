
package sim.tp3;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class TablaNumero extends DefaultTableModel
{
    public TablaNumero(ArrayList<Intervalo> filasTabla)
    {
      cargarDatos(filasTabla);
    }
    private void cargarDatos(ArrayList<Intervalo> filasTabla)
    {
           Object[][] matrizTabla = new Object[filasTabla.size()+1][4];
            int i = 0; float acumuladorFrecuenciaObservada =0,acumuladorEstadistico=0,acumuladorFrecuenciaEsperada=0;
            for(Intervalo intervaloActual : filasTabla)
            {
                
                matrizTabla[i][0]=intervaloActual.nombreIntervalo();// fila i columna intervalo
                matrizTabla[i][1]=intervaloActual.getFrecuenciaObservada();// fila i columna frecuencia observada
                matrizTabla[i][2]=intervaloActual.getFrecuenciaEsperada();// fila i columna frecuencia esperada
                matrizTabla[i][3]=Math.round(intervaloActual.getEstadistico() * 10000d) / 10000d;//fila i columna estadistico
                acumuladorFrecuenciaObservada += intervaloActual.getFrecuenciaObservada();;
                acumuladorEstadistico += intervaloActual.getEstadistico();
                acumuladorFrecuenciaEsperada += intervaloActual.getFrecuenciaEsperada();
                i++;
            } 
            matrizTabla[i][0]="Total";
            matrizTabla[i][1]=acumuladorFrecuenciaObservada;
            matrizTabla[i][2]=acumuladorFrecuenciaEsperada;
            matrizTabla[i][3]=Math.round(acumuladorEstadistico * 10000d) / 10000d;
            String[] NombresDeColumnas =  new String [] 
            {  "Intervalo", "Frecuencia observada", "Frecuencia esperada", "Estadístico de la prueba" };
            
            this.setDataVector(matrizTabla, NombresDeColumnas);
    }
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex){return false; }
}

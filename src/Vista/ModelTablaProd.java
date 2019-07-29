
package Vista;


import Modelo.FacturaDetalle;
import Modelo.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class ModelTablaProd extends AbstractTableModel{
    private String[] cabezera = {"DESCRIPCION", "VALOR UNITARIO"};
    private Class[] columnaDatos={String.class, String.class };
    private List<FacturaDetalle> datos;

    public ModelTablaProd() {
        datos = new ArrayList<FacturaDetalle>();
    }
    
    public ModelTablaProd(List<FacturaDetalle> datos){
        this.datos = datos;
    }
    
    @Override
    public int getRowCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return cabezera.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        FacturaDetalle dato = (FacturaDetalle) (datos.get(rowIndex));

        switch (columnIndex) {
            case 0:
                return dato.getDescripcion();
            case 1:
                return dato.getValorUni();
                
            default:
                break;
        }
        return new String();
    }
    
    public void setValueAt(Object value, int row, int col) {
        FacturaDetalle dato = (FacturaDetalle) (datos.get(row));

        switch (col) {
            case 0:
                dato.setDescripcion((String) value);
                break;
            case 1:
                dato.setValorUni((String) value);
                break;
            
            default:
                break;
        }
    }
    
    public String getColumnName(int col) {
        return cabezera[col];
    }

    public Class getColumnClass(int col) {
        return columnaDatos[col];
    }
    
}

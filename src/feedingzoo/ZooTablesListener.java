/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feedingzoo;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author rnavarro
 */
public class ZooTablesListener implements TableModelListener  {
    
    private final Database db;
    private final String nombret;
    public ZooTablesListener(Database d, String nombretabla) {
        super();
        db = d;
        nombret = nombretabla;
    }

    @Override
    
       
    public void tableChanged(TableModelEvent event) {
        JDBCTableAdpater modelo = (JDBCTableAdpater) event.getSource();        
        int row = event.getFirstRow();
        int column = event.getColumn();
        int type = event.getType();
        
        //No se puede modificar una clave primaria
        if( column == 0  ) {
            return;
        }      
        if (nombret == "animal"||nombret == "staff"||nombret == "comida"||nombret == "alimentacion") {
        String colSQLName = modelo.getSQLColumnName(column);        
        String sql = String.format(
                "UPDATE "+nombret+" SET %s = \'%s\' WHERE id_"+nombret+" = \'%s\'",
                colSQLName,
                modelo.getValueAt(row, column),
                modelo.getValueAt(row, 0));
        
        try {
            db.update(sql);
        } catch (SQLException ex) {           
            System.out.println(ex.getMessage());
        }
        System.out.println(sql);
        }
        }
            
        
    }
    
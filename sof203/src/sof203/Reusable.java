package sof203;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Reusable {

    public void dataRelate() {
        String query = "select * from tablename";
        String user = "sa";
        String pass = "password";
        String url = "jdbc:sqlserver://localhost:1433;databaseName=" 
                + "databasename" + ";encrypt=false";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                System.out.print(rs.getString("tenCot"));
            }
            con.close();
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
            System.out.println(ex);
        }
    }
    
    public void fillToTable(JTable jtable, ArrayList<Object> ds) {
        DefaultTableModel model = (DefaultTableModel) jtable.getModel();
        model.setRowCount(0);
        
        for (Object obj : ds) {
            Object[] row = {};
        }
    }
    
    public void checkDuplicate() {
        
    }
}

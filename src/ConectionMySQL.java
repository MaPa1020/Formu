import java.sql.*; 
public class ConectionMySQL {
    static String bd = "conocerme";
    static String login = "root";
    static String password = "";
    static String url = "jdbc:mysql://127.0.0.1/"+bd;
    Connection conn = null;
    public String cadena1="Conectado a base de datos "; 
    public String result;
    /** Constructor de DbConnection */
    public  ConectionMySQL() {
        try{
            //obtenemos el driver de para mysql
            Class.forName("com.mysql.jdbc.Driver");
            //obtenemos la conexion
            conn = DriverManager.getConnection(url,login,password);
            if (conn!=null){

                result= cadena1.concat(bd);

            }
        }catch(SQLException e){
            System.out.println(e);
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }
    }

    public Connection getConnection(){
        return conn;
    }

}


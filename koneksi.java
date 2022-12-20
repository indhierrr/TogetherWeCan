
package TogetherWeCan;

import java.sql.DriverManager;

public class koneksi {
    private static java.sql.Connection koneksi;
    
    public static java.sql.Connection getkoneksi(){
        if (koneksi == null){
            try{
                String url = "jdbc:mysql://localhost:3306/togetherwecan";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, password);
                System.out.println("Connection Successfully");
            }catch (Exception e){
                System.out.println("Error");
            }
        }
        return koneksi;
    }
    
    public static void main(String args[]){
        getkoneksi();
    }
}

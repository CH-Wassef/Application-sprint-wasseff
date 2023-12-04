import java.sql.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static Connection con;
    static String url = "jdbc:mysql://localhost:3306/produit";
    static String user = "root";
    static String pwd = "";

    private static Statement ste;
    public static void main(String[] args) {
        try {
            con = DriverManager.getConnection(url, user, pwd);
            System.out.println(con);
            System.out.println("connexion établie");
        }catch (SQLException ex)
        {
            System.out.println(ex);
        }
        try {
            ste = con.createStatement();
            String req="INSERT INTO `produit` (`id`, `nom`,`libelle`, `prix`, `matricule`) VALUES ('1', 'tree', 'sanawber123', '30000','12');";
            int res= ste.executeUpdate(req);

            System.out.println("produit ajouté");
        }catch (SQLException e){
            System.out.println(e);
        }
        try {
            ResultSet resultSet = ste.executeQuery("select * from produit");
            while (resultSet.next())
            {
                int id=resultSet.getInt("id");
                String nom=resultSet.getString(2);

                String libelle=resultSet.getString(3);
                double prix=resultSet.getDouble(4);
                int matricule=resultSet.getInt(5);
                System.out.println("id :"+id);
                System.out.println("nom :"+nom);
                System.out.println("libelle :"+libelle);
                System.out.println("prix :"+prix);
                System.out.println("matricule :"+matricule);
            }

        }catch (SQLException e)
        {
            System.out.println(e);
        }
    }
}
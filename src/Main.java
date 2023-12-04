import Entity.Fournisseur;

import java.sql.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static Connection con;
    static String url = "jdbc:mysql://localhost:3306/Stock";
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
            String req="INSERT INTO `fournisseur` (`id`, `nom`,`prenom`, `email`,`adresse`) VALUES ('1', 'wassef', 'chargui', 'medwassef@esprit.tn','la goulette');";
            int res= ste.executeUpdate(req);

            System.out.println("fournisseur ajouté");
        }catch (SQLException e){
            System.out.println(e);
        }
        try {
            ResultSet resultSet = ste.executeQuery("select * from fournisseur");
            while (resultSet.next())
            {
                int id=resultSet.getInt("id");
                String nom=resultSet.getString(2);
                String prenom=resultSet.getString(3);
                String email=resultSet.getString(4);
                String adresse=resultSet.getString(5);

                System.out.println("id :"+id);
                System.out.println("nom :"+nom);
                System.out.println("prenom :"+prenom);
                System.out.println("email :"+email);
                System.out.println("adresse :"+adresse);
            }

        }catch (SQLException e)
        {
            System.out.println(e);
        }
    }
}
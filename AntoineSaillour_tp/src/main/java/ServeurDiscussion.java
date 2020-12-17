import java.time.Clock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServeurDiscussion
{
    public static void main(String[] args)
    {
        new ServeurDiscussion();
    }
    //constructeur
    public ServeurDiscussion()
    {
        nom = "ServeurEnsim";

        canaux.add(new Canal("canal_discussion",  1));
        canaux.add(new Canal("canal_vocal", 2));
        canaux.add(new Canal("canal_aide", 3));
        Utilisateur user1 = new Utilisateur("John", "Daz", "John2", "John234", "John@hotmail.fr");

        //mapping_role_utilisateurs.put(, Utilisateur)

        System.out.println(canaux + nom + user1);
    }

    List<Canal> canaux = new ArrayList<Canal>();
    String nom;
    Map<Rôle, List<Utilisateur>> mapping_role_utilisateurs = new HashMap<Rôle, List<Utilisateur>>();
}

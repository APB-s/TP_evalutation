import java.util.List;

public class Utilisateur
{
    public Utilisateur(String prenom, String nom, String login, String motDePasse, String mail)
    {
        Utilisateur.this.prenom = prenom;
        Utilisateur.this.nom = nom;
        Utilisateur.this.login = login;
        Utilisateur.this.motDePasse = motDePasse;
        Utilisateur.this.mail = mail;
    }

    List<ServeurDiscussion> serveurs;
    String prenom;
    String nom;
    String login;
    String motDePasse;
    String mail;
}
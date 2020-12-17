import java.util.List;

public class Canal
{

    int ordre;
    List<Webhook> webhooks;
    List<Message> historiques;
    String nom;

    public Canal(String nom, int ordre)
    {
        Canal.this.nom = nom;
        Canal.this.ordre = ordre;
    }

    public <Utilisateur> void ecrireMessage(Utilisateur user, Message msg)
    {
        //test
    }

    public int campareTo(Canal canal)
    {
        int init = 0;
        return init;
    }
}

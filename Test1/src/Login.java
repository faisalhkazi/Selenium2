public class Login
{

    public void log(String id, String pwd) {
        if (id.equals("faisal")&& pwd.equals("faisalkazi"))
        {
            Shop s=new Shop();
            s.shopping();
        }
        else{
            Register r=new Register();
            r.reg(id,pwd);
        }
    }
    public static void main (String[] args) {

        Login l=new Login();
        l.log("faisal", "faisalkazi");

    }
}

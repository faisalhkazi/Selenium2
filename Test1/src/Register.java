public class Register {

    public void reg(String id, String pwd) {
        if (id.equals("faisal") && pwd.equals("faisalkazi")){
            System.out.println("Already register - Please login");
            Login l=new Login();
            l.log(id,pwd);
        }
        else{
            System.out.println("Please proceed with registration");
            System.out.println("Successfully registered");
            Login l=new Login();
            l.log(id,pwd);

        }
    }
    public static void main(String args[]){

        Register r=new Register();
        r.reg("faisal", "faisalkazi2");


    }

}

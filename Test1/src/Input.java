import java.io.*;
public class Input {


    
    public static void main(String[] args) throws IOException

    {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter date of birth");

        int i=Integer.parseInt(br.readLine().trim());


        System.out.println("Enter the present date");
        String nn2=br.readLine();
        String y=nn2.trim();
        int j=Integer.parseInt(y);

        int val=j-i;
        System.out.println(val);

    }
}

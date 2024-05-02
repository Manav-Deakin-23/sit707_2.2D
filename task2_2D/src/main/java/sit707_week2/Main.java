package sit707_week2;

import java.io.IOException;

/**
 * Hello world!
 * @author Ahsan Habib
 */
public class Main 
{
    public static void main( String[] args ) throws IOException
    {
        SeleniumOperations.officeworks_registration_page("https://www.officeworks.com.au/app/identity/create-account?redirect_path=%2Fapp%2Fcatalogue%2Flogin-redirect%3Fcomponent_id%3DODP-login-button%26entry_point%3D%2F");
    }
}
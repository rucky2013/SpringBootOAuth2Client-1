package Andreea.Bican;

import Andreea.Bican.Commands.*;

/**
 * Created by andre on 10.08.2016.
 */
public class CommandParser {

    public ICommand getCommand(String input){
        if(input.toLowerCase().startsWith("/logingoogle")){
            return new AutoLoginEndpoint();
        }else if(input.toLowerCase().startsWith("/login/google")){
            return new LoginGoogleEndpoint();
        }else if(input.toLowerCase().startsWith("/login/facebook")) {
            return new LoginFacebookEndpoint();
        }else if(input.toLowerCase().startsWith("localhost")) {
            return new LocalHostEndpoint();
        }else if(input.toLowerCase().startsWith("refreshtoken")) {
            return new GoogleRefreshToken();
        }else{
            return null;
        }
    }
}

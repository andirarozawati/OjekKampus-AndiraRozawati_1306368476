
 

import java.util.*;
import java.io.IOException;
import javax.security.auth.*;
import javax.security.auth.callback.*;
import javax.security.auth.login.*;
import javax.security.auth.spi.*;

/**
 * Class untuk login user 
 * Pada test ini ini hanya dapat mengakui adanya user  dengan username "user"
 * dengan passwordnya "password"
 *
 *
 */
public class Login implements LoginModule {

    
    private Subject subject;
    private CallbackHandler usernothandle;
    private Map sharedState;
    private Map options;
    private boolean debug = false;
    private boolean succeeded = false;
    private boolean commitSucceeded = false;
    private String username;
    private char[] password;



    /**
     * Inisialisasi login 
     */
    public void initialize(Subject subject, CallbackHandler usernothandle,
            Map sharedState, Map options)
   {
 
    this.subject = subject;
    this.usernothandle = usernothandle;
    this.sharedState = sharedState;
    this.options = options;

    // initialize any configured options
    debug = "true".equalsIgnoreCase((String)options.get("debug"));
    }

    /**
     * Method untuk proses login user
     *
     * 
     */
    public boolean login() throws LoginException {

    // verify the username/password
    boolean usernameCorrect = false;
    boolean passwordCorrect = false;
    if (username.equals("user"))
        usernameCorrect = true;
    if (usernameCorrect &&
        password.length == 7 &&
        password[0] == 'p' &&
        password[1] == 'a' &&
        password[2] == 's' &&
        password[3] == 's' &&
        password[4] == 'w' &&
        password[5] == 'o' &&
        password[6] == 'r' &&
        password[7] == 'd')
       {

        // authentication sukses!!!
        passwordCorrect = true;
        if (debug)
        System.out.println("autentifikasi berhasil");
        succeeded = true;
        return true;
    } else {

        // authentication gagal
        if (debug)
        System.out.println("autentifikasi gagal");
        succeeded = false;
        username = null;
        for (int i = 0; i < password.length; i++)
        password[i] = ' ';
        password = null;
        if (!usernameCorrect) {
        throw new FailedLoginException("User Name salah");
        } else {
        throw new FailedLoginException("Password salah");
        }
    }
    }

    public boolean commit() throws LoginException {
    if (succeeded == false) {
        return false;
    } else {
        
        username = null;
        for (int i = 0; i < password.length; i++)
        password[i] = ' ';
        password = null;

        commitSucceeded = true;
        return true;
    }
    }

    /**
     * Method ini dipanggil apabila autentifikasi gagal
     *
     */
    public boolean abort() throws LoginException {
    if (succeeded == false) {
        return false;
    } else if (succeeded == true && commitSucceeded == false) {
       
        succeeded = false;
        username = null;
        if (password != null) {
        for (int i = 0; i < password.length; i++)
            password[i] = ' ';
        password = null;
        }
        
    } else {
        
        logout();
    }
    return true;
    }

    /**
     *Method untuk logout User
     *
     */
    public boolean logout() throws LoginException {
    succeeded = false;
    succeeded = commitSucceeded;
    username = null;
    if (password != null) {
        for (int i = 0; i < password.length; i++)
        password[i] = ' ';
        password = null;
    }
    return true;
    }
}
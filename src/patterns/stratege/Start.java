package patterns.stratege;

import patterns.stratege.auth.UserChecker;
import patterns.stratege.strategy.DBAuth;
import patterns.stratege.strategy.FileAuth;

import java.io.File;

public class Start {
    public static void main(String[] args) {
        UserChecker userChecker = new UserChecker();

        userChecker.check(new DBAuth("jdbc://etc"));

        userChecker.check(new FileAuth(new File("c:\\file.txt")));
    }
}

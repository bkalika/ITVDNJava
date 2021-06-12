package patterns.stratege.strategy;

public interface AuthStrategy {
    boolean checkLogin(String name, String password);
}

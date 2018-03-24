package login;

public class Greeting {

    private final boolean validTokenFlag;
    private final String name;

    public Greeting(boolean validTokenFlag, String name) {
        this.validTokenFlag = validTokenFlag;
        this.name = name;
    }

    public boolean getValidTokenFlag() {
        return validTokenFlag;
    }

    public String getName() {
        return name;
    }
}

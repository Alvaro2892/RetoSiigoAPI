package co.com.certificacion.SiigoApiRegresIn.util;

public enum RestService
{
    BASE_URL("https://reqres.in"),
    CREATE_USER("/api/users");
    private String uri;
    RestService(String uri) {
        this.uri = uri;
    }
    @Override
    public String toString() {
        return uri;
    }
}

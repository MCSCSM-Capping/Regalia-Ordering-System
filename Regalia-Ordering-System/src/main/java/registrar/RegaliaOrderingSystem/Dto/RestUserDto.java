package registrar.RegaliaOrderingSystem.Dto;

public class RestUserDto {
    public String username;

    public RestUserDto(String username) {
        this.username = username;
    }

    public RestUserDto(){

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

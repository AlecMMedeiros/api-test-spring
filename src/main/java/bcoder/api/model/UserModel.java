package bcoder.api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class UserModel {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "user_id")
  private Integer id;
  @Column( length = 50, nullable = false, unique = true)
  private String email;
  @Column(length = 20, nullable = false, unique = true)
  private String login;
  @Column(length = 100, nullable = false)
  private String password;

  public UserModel () {}

  public UserModel ( String login, String password){
    this.login = login;
    this.password = password;
  }

  public Integer getId () {
    return id;
  }

  public void setId ( Integer id ) {
    this.id = id;
  }

  public String getLogin () {
    return login;
  }

  public void setLogin ( String login ) {
    this.login = login;
  }

  public String getPassword () {
    return password;
  }

  public void setPassword ( String password ) {
    this.password = password;
  }

  public String getEmail () {
    return email;
  }

  public void setEmail ( String email ) {
    this.email = email;
  }

  @Override
  public String toString () {
    return "UserModel{" +
        "id=" + id +
        ", Email='" + email + '\'' +
        ", login='" + login + '\'' +
        ", password='" + password + '\'' +
        '}';
  }
}

package ClothifyStore.icet.demo.entity;

import org.springframework.context.annotation.Primary;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private
    Integer id;
    @Column(nullable = false)
    private
    String password;
    @Column(nullable = false)
    private
    String address;
    @Column(unique = true, nullable = false)
    private
    String email;
    @Column(nullable = false)
    private
    String name;
    @Column(nullable = false)
    private
    String number;

    @OneToOne(mappedBy = "user")
    private Cart cart;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}

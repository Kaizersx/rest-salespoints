package springboottest.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "salespointdo")
@Getter
@Setter
public class Salespointdo {

    @Id
    @SequenceGenerator(name ="seq", sequenceName = "hibernate_sequence")
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "seq")
    private int id;

    @Column(name = "address")
    private String address;

    @Column(name = "c_code")
    private String city;

    @Column(name = "name")
    private String name;

    public Salespointdo() {
    }


}






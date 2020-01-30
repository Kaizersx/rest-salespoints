package springboottest.model;

import javax.persistence.*;

@Entity
@Table(name = "salespointdo")
public class SalesPoint {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;

@Column(name = "name")
private String name;

@Column(name = "city")
private String city;

@Column(name = "address")
private String address;

    public SalesPoint() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "City: "+getCity()+" Address: "+getAddress();
    }
}


/**
 * The Person class represents a person in the clinic system. 
 * Each person has an id, name, email, gender, phone, and age.
 */
import java.util.Scanner;
/**
 *
 * @author Ghala Mansour
 */
public class Person {
    private int id;
    private String name;
    private String email;
    private String gender;
    private String phone;
    private String age;
    
 Scanner in = new Scanner(System.in);
    /**
 * The Person class represents a person in the clinic system. Each person has an id, name, email, gender, phone, and age.
 */ 
    public Person(){
    }
     /**
     * Constructs a new Person object with the specified values for all fields.
     *
     * @param id     the person's id integer type
     * @param name   the person's name string type
     * @param email  the person's email address string type
     * @param gender the person's gender string type
     * @param phone  the person's phone number string type
     * @param age    the person's age string type
     */
    public Person(int id, String name,String email,String gender,String phone,String age){
        this.name= name;
        this.email= email;
        this.gender= gender;
        this.phone= phone;
        this.age= age;
        this.id= id;
    }
/**
     * Returns the person's id.
     *
     * @return the person's id integer type
     */
    public int getId() {
        return id;

        
    }
    /**
     * Sets the person's id.
     *
     * @param id the person's id integer type
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * Returns the person's name.
     *
     * @return the person's name string type
     */
    public String getName() {
        return name;
    }
    /**
     * Sets the person's name.
     *
     * @param name the person's name string type
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Returns the person's email address.
     *
     * @return the person's email address string type
     */
    public String getEmail() {
        return email;
    }
    /**
     * Sets the person's email address.
     *
     * @param email the person's email address string type
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * Returns the person's phone number.
     *
     * @return the person's phone number string type
     */
    public String getPhone() {
        return phone;
    }
    /**
     * Sets the person's phone number.
     *
     * @param phone the person's phone number string type
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
    /**
     * Returns the person's gender.
     *
     * @return the person's gender string type
     */
    public String getGender() {
        return gender;
    }
    /**
     * Sets the person's gender.
     *
     * @param gender the person's gender string type
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
    /**
     * Returns the person's age.
     *
     * @return the person's age string type
     */
    public String getAge() {
        return age;
    }
    /**
     * Sets the person's age.
     *
     * @param age the person's age string type
     */
    public void setAge(String age) {
        this.age = age;
    }


}
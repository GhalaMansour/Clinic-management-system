/**The Patient class represents a patient, which is a type of Person with additional properties such as address, medical history, and date of birth.
* It provides methods for adding, updating, searching, and deleting a patient from a list of patients
*patient class mangaes patient informationt and extends the person class 
 */
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ghala Mansour
 */
public class Patient extends Person  {

  private String address;
    private static String medicalHistor;
    private static String dayOfBirth;
    private static ArrayList<Patient> patientsList = new ArrayList<Patient>();
    Scanner keyboard = new Scanner(System.in);
  
    /**
 * This method takes a patient ID as input and returns the name of the patient with the corresponding ID.
 * It searches for the patient with the given ID in the `patientsList` and returns the name of the first patient found.
 * If no patient is found with the given ID, it prints an error message and returns null.
 *
 * @param id the ID of the patient to search for long type
 * @return the name of the patient with the given ID, or null if no patient is found
 */
    public static String getPatientName(Long id) {
    for (int i = 0; i < patientsList.size(); i++) {
        Patient p = patientsList.get(i);
        if (p.getId() == id) {
            System.out.println("Patient name: " + p.getName());
            return p.getName();
        }
    }
    System.out.println("Patient not found.");
    return null;
    
}/**Creates a new instance of the Patient class 
*with default values for all its properties
 */
    
    public Patient() {
        super();
    }
/**
     * Creates a new instance of the Patient class with the specified
     *  values for its properties.
     *
     * @param name the name of the patient string type
     * @param id the unique identifier of the patient integer type
     * @param age the age of the patient string type
     * @param gender the gender of the patient string type
     * @param address the address of the patient string type
     * @param medicalHistor the medical history of the patient string type 
     * @param dayOfBirth the date of birth of the patient string type
     * @param email the email address of the patient string type
     * @param phone the phone number of the patient string type
     */

    public Patient(String name,int id, String age, String gender, String address, String medicalHistor, String dayOfBirth, String email, String phone) {
       super(id, name, email, gender, phone, age);
       this.address= address;
       this.dayOfBirth= dayOfBirth ;
       this.medicalHistor= medicalHistor;
       
    }
  // Getters and setters 
      /**
     * Returns the address of the patient.
     *
     * @return the address of the patient string type
     */

    public String getAddress() {
        return address;
    }
    /**
     * Sets the address of the patient.
     *
     * @param address the new address of the patient string type
     */

    public void setAddress(String address) {
        this.address = address;
    }
    /**
     * Returns the medical history of the patient.
     *
     * @return the medical history of the patient string type
     */

    public static String getMedicalHistor() {
        return medicalHistor;
    }
/**
     * Sets the medical history of the patient.
     *
     * @param medicalHistor the new medical history of the patient string type
     */

    public void setMedicalHistor(String medicalHistor) {
        this.medicalHistor = medicalHistor;
    }
        /**
     * Returns the date of birth of the patient.
     *
     * @return the date of birth of the patient string type
     */

    public String getDayOfBirth() {
        return dayOfBirth;
    }
/**
     * Sets the date of birth of the patient.
     *
     * @param dayOfBirth the new date of birth of the patient string type
     */

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }
    /**
     * Adds the medical history of the patient by prompting the user with a series of
     *  questions and updating the medicalHistor property accordingly.
     */
    public void AddMedicalHistor() {
        
        System.out.print("Dose the patient have diabetes?");
        String str1 = keyboard.next();
        if (str1.equalsIgnoreCase("yes")) {
            str1 = "diabetes";
        }else{str1="";}
        
        System.out.println("Dose the patient have blood pressure?");
        String str2 = keyboard.next();
        if (str2.equalsIgnoreCase("yes")) {
            str2 = "pressure";
        }else{str2="";}
        
        System.out.println("Dose the patient have other disease?");
        String str3 = keyboard.next();
        String str4 = "";
        keyboard.nextLine();
        if (str3.equalsIgnoreCase("yes")) {
            System.out.println("please write it down:");
           str4=keyboard.nextLine();
        }else{str4="";}
      
        medicalHistor = "\n-"+str1 +" \n-"+ str2 +"\n-"+ str4 ;
    }
    /**
     * Adds the date of birth of the patient by prompting the user with a 
     * series of questions and updating the dayOfBirth property accordingly.
     */
public  void AddDayOfBirth(){
 System.out.println("Enter the patient birth day");
System.out.println("Day:");
String day=keyboard.next();
System.out.println("Month:");
String month =keyboard.next();
System.out.println("year:");
String year=keyboard.next();
dayOfBirth =day+"/"+month+"/"+year;

 }
 /**
     * Returns the medical history of the patient.
     *
     * @return the medical history of the patient string type
     */

public  static String viewMedicalHistor(){
      return medicalHistor;
}
/**
     * Returns the date of birth of the patient.
     *
     * @return the date of birth of the patient string type
     */
public  static String viewDayOfBirth(){
      return dayOfBirth ;
}

    /**
     * Adds a new patient to the list of patients by prompting the user with a
     *  series of questions and creating a new instance of the Patient class with 
     * the provided information.
     */

    public  void addPatient() {

        System.out.println("Enter patient name: ");
        String name = keyboard.nextLine();
        
        System.out.println("Enter patient ID: ");
        int id = keyboard.nextInt();
        keyboard.nextLine();
       
        System.out.println("Enter patient age: ");
        String age = keyboard.nextLine();
        
        System.out.println("Enter patient gender male or female: ");
        String gender = keyboard.nextLine();
        
        System.out.println("Enter patient phone: ");
        String phone = keyboard.nextLine();
        
        System.out.println("Enter patient email: ");
        String email = keyboard.nextLine();
        
        System.out.println("Enter your address:");
        String address=keyboard.nextLine(); 
        Patient patient = new Patient();
        patient.AddDayOfBirth();
        patient.AddMedicalHistor();
        Patient newPatient = new Patient(name, id, age,gender ,address, medicalHistor, dayOfBirth, email,phone  );
        patientsList.add(newPatient);

        System.out.println("Patient added successfully.\n");
    }
    
    
     /**
     * Updates an existing patient in the list of patients by prompting the user with a
     *  series of questions and updating the properties of the selected patient.
     */
    public void updatePatient() {

        System.out.print("Enter the patient id to update: ");
        int idToUpdate = keyboard.nextInt();

        Patient patientToUpdate = null;
        for (int i = 0; i < patientsList.size(); i++) {
            if (patientsList.get(i).getId() == idToUpdate) {
                patientToUpdate = patientsList.get(i);
                break;
            }
        }

        if (patientToUpdate != null) {
            keyboard.nextLine();
            System.out.println("Enter new patient name: ");
            String name = keyboard.nextLine(); 
            System.out.println("Enter new patient age: ");
            String age = keyboard.nextLine();
            System.out.println("Enter new patient gender: ");
            String gender = keyboard.nextLine();
           
            System.out.println("Enter new patient phone: ");
            String phone = keyboard.nextLine();
            System.out.println("Enter new patient email: ");
            String email = keyboard.nextLine();
             System.out.println("Enter your address:");
        String address=keyboard.nextLine();
       Patient patient= new Patient();
       patient.AddDayOfBirth();
       patient.AddMedicalHistor();
       
        
            patientToUpdate.setName(name);
            patientToUpdate.setAge(age);
            patientToUpdate.setGender(gender);
            patientToUpdate.setPhone(phone);
            patientToUpdate.setEmail(email);
            patientToUpdate.setAddress(address);
            patientToUpdate.setMedicalHistor(medicalHistor);
            patientToUpdate.setDayOfBirth(dayOfBirth);

            System.out.println("patient updated successfully.\n");
        } else {
            System.out.println("patient not found.\n");
        }
    }
   
    
/**
 * Searches for a patient in the list of patients by ID and prints the information of the matching patient.
 * Prompts the user for the ID of the patient to search for.
 * Prints the name, ID, age, gender, phone number, email address, address, medical history, and date of 
 * birth of the matching patient.
 * If no patient is found with the specified ID, prints a message indicating that the patient was not found.
 */
    public  void searchPatientById() {

        System.out.print("Enter the ID of the patient to search for: ");
        int idToSearch = keyboard.nextInt();
        keyboard.nextLine();

        for (int i = 0; i < patientsList.size(); i++) {
            Patient Patient = patientsList.get(i);
            if (Patient.getId() == idToSearch) {
                System.out.println("Patient found:");
                System.out.println("Name:" + Patient.getName());
                System.out.println("ID:" + Patient.getId()); 
                System.out.println("Age:" + Patient.getAge());
                System.out.println("Gender:" + Patient.getGender());
                System.out.println("phone:" + Patient.getPhone());
                System.out.println("Email:" + Patient.getEmail());
                System.out.println("Address:" + Patient.getAddress());
                System.out.println("MedicalHistor:" + Patient.viewMedicalHistor());
System.out.println("DayOfBirth:" + Patient.getDayOfBirth());
                return;
            }
        }

        System.out.println("Patient not found.\n");
    }

   /**
     * Deletes a patient from the list of patients by ID.
     *
     * @param idToDelete the ID of the patient to delete integer type
     */
    public  void deletePatient() {

        System.out.print("Enter the patient ID to delete: ");
        int idToDelete = keyboard.nextInt();

        Patient patientToDelete = null;
        for (int i = 0; i < patientsList.size(); i++) {
            Patient patient = patientsList.get(i);
            if (patient.getId() == idToDelete) {
                patientToDelete = patient;
                break;
            }
        }

        if (patientToDelete != null) {

            patientsList.remove(patientToDelete);

            System.out.println("Patient deleted successfully.\n");
        } else {
            System.out.println("Patient not found.\n");
        }
    }
/**
 * Displays a menu of options for managing patients and prompts the user to select an option.
 * Depending on the selected option, calls the corresponding method to add, update, search, or delete a patient, or returns to the main page.
 * The method uses a infinite loop to display the menu continuously until the user chooses to go back to the main page.
 */
    public  void selectPatient() {
        for (;;) {
            System.out.println("1. Add a new patient");
            System.out.println("2. Update a new patient");
            System.out.println("3. search for a patient");
            System.out.println("4. Delete a patient");
            System.out.println("5. to go back to the main page...\n");

            int option = keyboard.nextInt();
            keyboard.nextLine();
            switch (option) {
                case 1:
         Patient patient = new Patient();
                    patient.addPatient();
                    break;
               case 2:
                    Patient Patient= new Patient();
                    Patient.updatePatient();
                    break;
                    case 3:
                        Patient patientSearch= new Patient();
                    patientSearch.searchPatientById();
                    break;
                    case 4:
                        Patient patientDelete= new Patient();
                    patientDelete.deletePatient();
                    break;
                    case 5:
                    return;
                default:
                    System.out.println("Invalid option,  Please enter a number between 1 and 5.");
                    break;
            }
        }
        } 
    }

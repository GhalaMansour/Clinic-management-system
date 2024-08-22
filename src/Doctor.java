
import java.util.Scanner;
import java.util.ArrayList;

/**
 * The Doctor class represents a doctor in a clinic system, with a name, ID, gender, age, phone, email, education, and clinic name.
 * This class extends the Person class and provides methods for adding, updating, searching, and deleting doctors from the ArrayList.
 */

public class Doctor extends Person {

    private String education;
    private String clinicName;
    private static final ArrayList<Doctor> doctorsList = new ArrayList<>();

 /**
     * Constructs a new Doctor object with default values for all fields.
     * The name, education, and clinic name fields are set to empty strings.
     */
public Doctor() {
        super();
        this.education = "";
        this.clinicName = "";
    }

      /**
     * Constructs a new Doctor object with the given name, ID, gender, age, phone, email, education, and clinic name.
     * @param name the name of the doctor Strint type
     * @param id the ID of the doctor integer type
     * @param gender the gender of the doctor Strint type
     * @param age the age of the doctor Strint type
     * @param phone the phone number of the doctor Strint type
     * @param email the email address of the doctor Strint type
     * @param education the education level of the doctor Strint type
     * @param clinicName the name of the clinic where the doctor works Strint type
     */
    public Doctor(String name, int id, String gender, String age, String phone, String email,
            String education, String clinicName) {
        super(id, name, email, gender, phone, age);
        this.education = education;
        this.clinicName = clinicName;
    }

     /**
     * Returns a string containing the name and clinic name of the doctor at the specified index in the list of doctors.
     * @param i the index of the doctor in the list of doctors integer type
     * @return a string containing the name and clinic name of the doctor at the specified index
     */
public static String getDoctorName(int i) {
        String name= doctorsList.get(i).getName();
        String clinic= doctorsList.get(i).getClinicName();
        System.out.println("The doctor name:"+name+  "\nThe clinic:"+ clinic+ "\n");
        String getDoctorInfo="The doctor name:"+ name +"\nThe clinic:"+ clinic;
    return getDoctorInfo;
}

 /**
     * Returns the education level of the doctor.
     * @return the education level of the doctor String type
     */
    public String getEducation() {
        return education;
    }

 /**
     * Sets the education level of the doctor.
     * @param education the education level of the doctor String type
     */
    public void setEducation(String education) {
        this.education = education;
    }
/**
     * Returns the name of the clinic where the doctor works.
     * @return the name of the clinic where the doctor works String type
     */
    public String getClinicName() {
        return clinicName;
    }
/**
     * Sets the name of the clinic where the doctor works.
     * @param clinicName the name of the clinic where the doctor works String type
     */
    public void setClinicName(String clinicName) {
        this.clinicName = clinicName;
    }

     /**
     * Prompts the user to enter details of a new doctor and adds the doctor to the list of doctors.
     */
    public static void addDoctor() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter doctor name: ");
        String name = input.nextLine();
        System.out.println("Enter doctor ID: ");
        int id = input.nextInt();
        input.nextLine(); 
        System.out.println("Enter doctor age: ");
        String age = input.nextLine();
        System.out.println("Enter doctor gender male or female: ");
        String gender = input.nextLine();
      
        System.out.println("Enter doctor phone: ");
        String phone = input.nextLine();
        System.out.println("Enter doctor email: ");
        String email = input.nextLine();
        System.out.println("Enter doctor education: ");
        String education = input.nextLine();
        System.out.println("Enter clinic name: ");
        String clinicName = input.nextLine();

        Doctor newDoctor = new Doctor(name, id, gender, age, phone, email, education, clinicName);
        doctorsList.add(newDoctor);

        System.out.println("Doctor added successfully.\n");
    }

 /**
     * Prompts the user to enter the ID of the doctor to update and allows the user to update the details of the doctor, including name, gender, age, phone, email, education, and clinic name.
     * If the doctor is found in the list of doctors, their details are updated and a success message is printed.
     * If the doctor is not found, an error message is printed.
     */
    
    public static void updateDoctor() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the doctor id to update: ");
        int idToUpdate = input.nextInt();

        Doctor doctorToUpdate = null;
        for (int i = 0; i < doctorsList.size(); i++) {
            if (doctorsList.get(i).getId() == idToUpdate) {
                doctorToUpdate = doctorsList.get(i);
                break;
            }
        }

        if (doctorToUpdate != null) {
            input.nextLine();
            System.out.println("Enter new doctor name: ");
            String name = input.nextLine();
            System.out.println("Enter new doctor gender: ");
            String gender = input.nextLine();
            System.out.println("Enter new doctor age: ");
            String age = input.nextLine();
            System.out.println("Enter new doctor phone: ");
            String phone = input.nextLine();
            System.out.println("Enter new doctor email: ");
            String email = input.nextLine();
            System.out.println("Enter new doctor education: ");
            String education = input.nextLine();
            System.out.println("Enter new clinic name: ");
            String clinicName = input.nextLine();

            doctorToUpdate.setName(name);
            doctorToUpdate.setGender(gender);
            doctorToUpdate.setAge(age);
            doctorToUpdate.setPhone(phone);
            doctorToUpdate.setEmail(email);
            doctorToUpdate.setEducation(education);
            doctorToUpdate.setClinicName(clinicName);

            System.out.println("Doctor updated successfully.\n");
        } else {
            System.out.println("Doctor not found.\n");
        }
    }
    
     /**
     * Prompts the user to enter the ID of the doctor to search for and searches for the doctor in the list of doctors by ID.
     * If the doctor is found, their details are printed.
     * If the doctor is not found, an error message is printed.
     */
    public static void searchDoctorById() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the ID of the doctor to search for: ");
        int idToSearch = input.nextInt();
        input.nextLine();

        for (int i = 0; i < doctorsList.size(); i++) {
            Doctor doctor = doctorsList.get(i);
            if (doctor.getId() == idToSearch) {
                System.out.println("Doctor found:");
                System.out.println("Name:" + doctor.getName());
                System.out.println("ID:" + doctor.getId());
                System.out.println("Gender:" + doctor.getGender());
                System.out.println("Age:" + doctor.getAge());
                System.out.println("phone:" + doctor.getPhone());
                System.out.println("Email:" + doctor.getEmail());
                System.out.println("Education:" + doctor.getEducation());
                System.out.println("Clinic name:" + doctor.getClinicName()+"\n");

                return;
            }
        }System.out.println("\n");

        System.out.println("Doctor not found.\n");
    }

/**
     * Prints the list of doctors with their names and clinic names.
     */
    public static void printDoctorsList() {

        System.out.println("List of doctors:");
        for (int i = 0; i < doctorsList.size(); i++) {
            Doctor doctor = doctorsList.get(i);

            System.out.println((i + 1 + ". ") + doctor.getName()+ "("+ doctor.getClinicName()+")");
        }System.out.println("\n");
    }
    

 /**
     * Prompts the user to enter the ID of the doctor to delete and deletes the doctor from the list of doctors.
     * If the doctor is found in the list of doctors, they are deleted and a success message is printed.
     * If the doctor is not found, an error message is printed.
     */
    
        public static void deleteDoctor() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the doctor ID to delete: ");
        int idToDelete = input.nextInt();

        Doctor doctorToDelete = null;
        for (int i = 0; i < doctorsList.size(); i++) {
            Doctor doctor = doctorsList.get(i);
            if (doctor.getId() == idToDelete) {
                doctorToDelete = doctor;
                break;
            }
        }

        if (doctorToDelete != null) {

            doctorsList.remove(doctorToDelete);

            System.out.println("Doctor deleted successfully.\n");
        } else {
            System.out.println("Doctor not found.\n");
        }
    }

/**
     * Displays a menu for selecting options related to managing the list of doctors, including adding a new doctor, updating an existing doctor, searching for a doctor, printing the list of doctors, and deleting a doctor.
     */
    public static void selectDoctor() {
        Scanner input = new Scanner(System.in);
        for (;;) {
            System.out.println("Select an option:");
            System.out.println("1. Add a new doctor");
            System.out.println("2. Update an existing doctor");
            System.out.println("3. Delete a doctor");
            System.out.println("4. Print the list of doctors");
            System.out.println("5. search for a doctor");
            System.out.println("6. to go back to the main page...\n");

            int option = input.nextInt();
            input.nextLine();

            switch (option) {
                case 1:
                    Doctor.addDoctor();
                    break;
                case 2:
                    Doctor.updateDoctor();
                    break;
                case 3:
                    Doctor.deleteDoctor();
                    break;
                case 4:
                    Doctor.printDoctorsList();
                    break;
                case 5:
                    Doctor.searchDoctorById();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid option,  Please enter a number between 1 and 6.");
                    break;
            }
        }
    }
}
/*
 * Project Name: Clinic management system
 * Ghala Mansour 
 * CS 1312
 */
/**
* The Main class is the entry point of the clinic management system program.
 * It creates instances of the `Patient` and `Appointment` classes and displays a menu of options to the user.
 * The user can select to interact with the `Doctor`, `Appointment`, or `Patient` classes or exit the program.
 * The selected class's corresponding method is called based on the user's choice of option
 */
import java.util.Scanner;
import java.io.*;
public class Main{
     /**
     * The main method is the entry point of the clinic management system program.
     * It creates instances of the `Patient` and `Appointment` classes and displays a menu of options to the user.
     * The user can select to interact with the `Doctor`, `Appointment`, or `Patient` classes or exit the program.
     * The selected class's corresponding method is called based on the user's choice of option.
     * @param args an array of command-line arguments for the program (not used)
     */
	public static void main (String[] args){

       /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
   

        Scanner input = new Scanner(System.in);
        // Create instances of the Patient and Appointment classes
        Patient Patient = new Patient();
        Appointment appointment = new Appointment();
        // Write an example of an appointment information card to the file

        try{
          File clinicFile = new File("clinic.txt");
          FileWriter  writer = new FileWriter (clinicFile);
          writer.write("Patient Name: Ali mohammad\n");
          writer.write("Appointment Date:  2023-5-27\n");
          writer.write("Doctor Name: Dr.Ahmad\n");
          writer.write("Notes: Patient has a history of high blood pressure.\n");
          writer.close();
        }catch(IOException e){
            
         System.out.println("File I/O Error");
        
        }
// Display the menu of options to the user and execute 
        for (;;) {
            System.out.println("Select an option:");
            System.out.println("1.Doctor: ");
            System.out.println("2.Appointment: ");
            System.out.println("3.patient: ");
            System.out.println("4.Exit\n ");

            int option = input.nextInt();
            input.nextLine();
            switch (option) {
                case 1:
                    Doctor.selectDoctor();
                    break;
                case 2:
                    appointment.selectAppointment();
                    break;
                case 3:

                    Patient.selectPatient();
                    break;
                case 4:
                    System.out.println("The system is closed.");
                    return;
                default:
                    System.out.println("Invalid option,  Please enter a number between 1 and 4.");
                    break;
            }
        }

    }
}
    
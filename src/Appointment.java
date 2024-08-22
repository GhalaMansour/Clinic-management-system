
//import java.util.ArrayList;
import java.util.*;

/**
 * The Appointment class represents an appointment in a clinic system, with an ID, date, time, patient name, doctor name, and clinic name.
 * This class provides methods for booking a new appointment, canceling an existing appointment, and displaying appointment information.
 */
public class Appointment {
    
    private Long id;
    private int year;
    private int month;
    private int day;
    private String patientName;
    private String doctorName;
    private String clinicName;
    private String dateOfAppointment;
    private int hour;
    private int minute;
    public static Scanner scan=new Scanner(System.in);
    public static HashMap<Long,Date> bookingAppointment=new HashMap<Long,Date>();
    public static Date object=new Date();
    
     /**
     * Sets the hour of the appointment.
     * @param hour the hour of the appointment integer type
     */  
    public void setHour(int hour){
        this.hour=hour;
    }
    /**
     * Returns the hour of the appointment.
     * @return the hour of the appointment integer type
     */ 
    public int getHour(){
        return hour;
    }
    /**
     * Sets the minute of the appointment.
     * @param minute the minute of the appointment integer type
     */
    public void setMinute(int minute){
        this.minute=minute;
    }
    /**
     *Returns the minute of the appointment.
     * @return the minute of the appointment integer type
     */ 
    public int getMinute(){
        return minute;
    }
    /**
     * Sets the name of the doctor for the appointment.
     * @param doctorName the name of the doctor for the appointment String type
     */
     public void setDoctorName(String doctorName){
        this.doctorName=doctorName;
    }
    /**
     * Returns the name of the doctor for the appointment.
     * @return the name of the doctor for the appointment String type
     */ 
    public String getDoctorName(){
        return doctorName;
    }
    /**
     * Sets the name of the clinic for the appointment.
     * @param clinicName the name of the clinic for the appointment String type
     */
     public void setClinicName(String clinicName){
        this.clinicName=clinicName;
    }
    /**
     * Returns the name of the clinic for the appointment.
     * @return the name of the clinic for the appointment String type
     */ 
    public String getClinicName(){
        return clinicName;
    }
     /**
     * Returns the ID of the appointment.
     * @return the ID of the appointment Long type
     */
    public Long getId() {
        return id;
    }
     /**
     * Sets the ID of the appointment.
     * @param id the ID of the appointment Long type
     */
    public void setId(Long id) {
        this.id = id;
    }
    /**
     * Returns the name of the patient for the appointment.
     * @return the name of the patient for the appointment String type
     */
    public String getPatientName() {
        return patientName;
    }
    /** 
     * Sets the name of the patient for the appointment.
     * @param patientName the name of the patient for the appointment String type
     */
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
    /**
     * Returns the year of the appointment.
     * @return the year of the appointment integer type
     */
    public int getYear() {
        return year;
    }
    /**
     * Sets the year of the appointment.
     * @param year the year of the appointment integer type
     */
    public void setYear(int year) {
        this.year = year;
    }
    /**
     * Returns the month of the appointment.
     * @return the month of the appointment integer type
     */
    public int getMonth() {
        return month;
    }
    /**
     * Returns the month of the appointment.
     * @return the month of the appointment integer type
     */
    public void setMonth(int month) {
        this.month = month;
    }
    /**
     * Returns the day of the appointment.
     * @return the day of the appointment integer type
     */
    public int getDay() {
        return day;
    }
     /**
     * Sets the day of the appointment.
    * @param day the day of the appointment integer type
     */
    public void setDay(int day) {
        this.day = day;
    }
    /**
     * Returns the date of the appointment.
     * @return the date of the appointment String type
     */
    public String getDateOfAppointment() {
        return dateOfAppointment;
    }
    /**
     * Sets the date of the appointment.
     * @param dateOfAppointment the date of the appointment String type
     */
    public void setDateOfAppointment(String dateOfAppointment) {
        this.dateOfAppointment = dateOfAppointment;
    }

    /**
     * Books a new appointment for a patient with a doctor on a specified date and time.
     * Prompts the user to enter the patient ID, doctor name, year, month, day, hour, and minute.
     */
    public void bookingAppointment() {
        System.out.println("Enter the patient Id:");
       // patientName = scan.nextLine();
        //System.out.println("Enter your id:");
        id = scan.nextLong();
        patientName=Patient.getPatientName(id);
        scan.nextLine();
        
        System.out.println("Choose one of the doctors:");
        Doctor.printDoctorsList();
        int num = scan.nextInt(); 
        doctorName = Doctor.getDoctorName(num-1);
        System.out.println("Enter the year of the appointment:");
        year = scan.nextInt();
        System.out.println("Enter the month of the appointment:");
        month = scan.nextInt();
        System.out.println("Enter the day of the appointment:");
        day = scan.nextInt();
        dateOfAppointment= day+ "/"+ month+ "/"+ year ;
            if(object.check(month, day, year)==false){
                System.out.println("Appointment cannot be booked");
                if (bookingAppointment.containsValue(object)==true)
                     System.out.println("booked, choose another date");  
                }
            else{
                 bookingAppointment.put(id,object); 
                 System.out.println("Enter the hour:");
                 hour = scan.nextInt();
                 System.out.println("Enter the minute:");
                 minute = scan.nextInt();
                 System.out.println("The appointment has been booked successfully");   
            }
               
    }
    
     /**
     * Cancels an existing appointment for a patient.
     * Prompts the user to enter the patient ID.
     */
    public  void cancelAppointment(){ 
        System.out.println("Enter your id:");
        id = scan.nextLong();
        if(bookingAppointment.containsKey(id)){
            bookingAppointment.remove(id);
            System.out.println("The appointment has been canceled successfully");
        }
        
        else 
            System.out.println("Don't have an appointment");   
    }

    /**
     * Displays the appointment information for a patient.
     * Prompts the user to enter the patient ID.
     */
    public  void displayAppointmentInfo(){
        System.out.println("Enter the patient ID to display the appointment information:");
        id = scan.nextLong();
             if(bookingAppointment.containsKey(id)){  
                System.out.println("Patient name: "+patientName);
                System.out.println("Patient id: "+id);
                System.out.println("the date: "+ dateOfAppointment);
                System.out.println("the time: "+hour+":"+minute);
                System.out.println(doctorName);
            }
             
             else 
                 System.out.println("Don't have an appointment");
              
                  
    }
     /**
     * Provides a menu for the user to select an option related to appointments.
     * The user can add a new appointment, cancel an existing appointment, display appointment information, or return to the main menu.
     */
    public void selectAppointment() { 
        Appointment a=new Appointment();
        for (;;) { 
            System.out.println("Select an option:"); 
            System.out.println("1. Add a new Appointment");  
            System.out.println("2. Cancel appointment"); 
            System.out.println("3. Print appointment information"); 
            System.out.println("4. to go back to the main page...\n"); 
 
            int option = scan.nextInt(); 
            scan.nextLine(); 
 
            switch (option) { 
                case 1: 
                    a.bookingAppointment(); 
                    break; 
                case 2: 
                    a.cancelAppointment(); 
                    break;  
                case 3: 
                     a.displayAppointmentInfo(); 
                    break;
                case 4:
                     return; 
                default: 
                    System.out.println("Invalid option,  Please enter a number between 1 and 4."); 
                    break; 
            } 
        } 
    }
  
    
    
}
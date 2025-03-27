import java.util.ArrayList;

class Patient{
    private String name;
    private int patientId;
    private ArrayList<Doctor> consultedDoctors;
    public Patient(String name,int patientId){
        this.name=name;
        this.patientId=patientId;
        this.consultedDoctors=new ArrayList<>();
    }
    public String getName(){
        return name;
    }
    public void addDoctor(Doctor doctor){
        if(!consultedDoctors.contains(doctor)){
            consultedDoctors.add(doctor);
            System.out.println("Dr. "+doctor.getName()+" is consulted by "+name);
        }
    }
    public void viewConsultedDoctors(){
        System.out.println(name+" has consulted the following doctors:");
        if(consultedDoctors.isEmpty()) System.out.println("No Doctors");
        else{
            for(Doctor d:consultedDoctors){
                System.out.println(d.getName());
            }
        }
    }
}
class Doctor{
    private String name;
    private String Specialisation;
    private ArrayList<Patient> patients;
    public Doctor(String name,String Specialisation){
        this.name=name;
        this.Specialisation=Specialisation;
        this.patients=new ArrayList<>();
    }
    public String getName(){
        return name;
    }
    public void consult(Patient patient){
        if(!patients.contains(patient)){
            patients.add(patient);
            patient.addDoctor(this);
        }
        System.out.println("Dr. "+name+" is consulting patient: "+patient.getName());
    }
    public void displayPatients(){
        System.out.println("Dr. "+name+" has consulted the following patients");
        if(patients.isEmpty()) System.out.println("No Patients");
        else{
            for(Patient p:patients){
                System.out.println(p.getName()); 
            }
        }
    }
}
class Hospital{
    private String name;
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;
    public Hospital(String name){
        this.name=name;
        this.doctors=new ArrayList<>();
        this.patients=new ArrayList<>();
    }
    public void addDoctor(Doctor doctor){
        doctors.add(doctor);
        System.out.println("Doctor: "+doctor.getName()+" is added to hospital "+name);
    }
    public void addPatients(Patient patient){
        patients.add(patient);
        System.out.println("Patient: "+patient.getName()+" is added to hospital "+name);
    }
    public void displayHospitalDetails(){
        System.out.println("Hospital: "+name);
        System.out.println("Doctors:");
        for(Doctor d:doctors){
            System.out.println(d.getName());
        }
        System.out.println("Patients:");
        for(Patient p:patients){
            System.out.println(p.getName());
        }
    }
}
public class Program6 {
    public static void main(String[] args) {
        Hospital hospital=new Hospital("Apollo");
        Doctor doctor1=new Doctor("Rakesh","Cardiologist");
        Doctor doctor2=new Doctor("Monesh","Neurologist");
        Patient patient1=new Patient("Balaji",123); 
        Patient patient2=new Patient("Ramya",456);
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatients(patient1);
        hospital.addPatients(patient2);
        doctor1.consult(patient1);
        doctor1.consult(patient2);
        doctor2.consult(patient2);
        doctor1.displayPatients();
        patient2.viewConsultedDoctors();
        hospital.displayHospitalDetails();
    }
    
}

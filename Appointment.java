import java.util.Scanner;
public class Appointment
{
    private int appointmentID;
    private String patientName;
    private String doctorName;
    private String specialization;
    private int day, month, year;
    private int consultationFee;
   // private String status;

    Appointment()
    {
        this.appointmentID=111;
        this.patientName="Rahul Malhotra";
        this.doctorName="Dr.Saxena";
        this.specialization="Dermatologist";
        this.day=01;
        this.month=01;
        this.year=2025;
        this.consultationFee=550;
        //this.status="Scheduled";
    }
    Appointment(int appointmentID, String patientName, String doctorName, String specialization, int day, int month, int year, int consultationFee,
                    String status)
    {
        this.appointmentID=appointmentID;
        this.patientName=patientName;
        this.doctorName=doctorName;
        this.specialization=specialization;
        this.day=day;
        this.month=month;
        this.year=year;
        this.consultationFee=consultationFee;
        //this.status=status;
    }

    void setAppointmentID(int aid)
    {
        this.appointmentID=aid;
    }
    void setPatientName(String pn)
    {
        this.patientName=pn;
    }
    void setDoctorName(String dn)
    {
        this.doctorName=dn;
    }
    void setSpecialization(String spc)
    {
        this.specialization=spc;
    }
    void setDay(int day)
    {
        this.day=day;
    }
    void setMonth(int month)
    {
        this.month=month;
    }
    void setYear(int year)
    {
        this.year=year;
    }
    void setConsultationFee(int cf)
    {
        this.consultationFee=cf;
    }
   /* void setStatus(String stt)
    {
        this.status=stt;
    }*/
    int getAppointmentID() {
        return appointmentID;
    }
    String getPatientName() {
        return patientName;
    }
    String getDoctorName() {
        return doctorName;
    }
    String getSpecialization() {
        return specialization;
    }
    int getDay() {
        return day;
    }
    int getMonth() {
        return month;
    }
    int getYear() {
        return year;
    }
    int getConsultationFee() {
        return consultationFee;
    }
    String getStatus()
    {
        switch (st) {
            case 1:
                return "Scheduled";
            case 2:
                return "Completed";
            case 3:
                return "Cancelled";
            default:
                return "Ooops Errorr....";
        }
    }

    Scanner sc=new Scanner(System.in);

    String specialization()
    {
        System.out.println("Enter D for Dermatology");
        System.out.println("Enter C for Cardiology");
        specialization=sc.nextLine();
        switch(specialization)
        {
            case "D":setSpecialization("Dermatology");
            break;
            case "C":setSpecialization("Cardiology");
            break;
            default:
                System.out.println("Retry & select D or C");
                System.exit(0);
        }
        return specialization;
    }

    String doctorName()
    {
        if(specialization.equals("Dermatology"))
        {
            setDoctorName("Dr.Munna Bhai");
        }
        else{
        setDoctorName("Dr.Circuit Bhai");
        }
        return doctorName;
    }

    void appointmentDate()
    {
        System.out.println("Enter day");
        day=sc.nextInt();
        System.out.println("Enter month");
        month=sc.nextInt();
        System.out.println("Enter Year");
        year=sc.nextInt();
        if(day<1 || day>31)
        {
            System.out.println("Retry & Enter Day Between 1 to 31");
            System.exit(0);
        }
        if(month<1 || month>12)
        {
            System.out.println("Retry & Enter Month Between 1 to 12");
            System.exit(0);
        }
        if(year<1000 || year>9999)
        {
            System.out.println("Retry & Year CORRECTLY");
            System.exit(0);
        }
        System.out.println(day+"-"+month+"-"+year);
    }

    private int cf;
    int consultationFee()
    {
        System.out.println("Enter 1 for Visit Rs.550");
        System.out.println("Enter 2 for Visit + injection Rs.1000");
        System.out.println("Enter 3 for Operation Rs.50000");
        cf=sc.nextInt();
        if(cf==1)
        {
            consultationFee=550;
        }
        else if(cf==2)
        {
            consultationFee=1000;
        }
        else if(cf==3)
        {
            consultationFee=50000;
        }
        else 
        {
            System.out.println("Retry & Enter 1/2/3");
            System.exit(0);
        }
        return consultationFee;
    }

    public int st;
    void updateStatus()
    {
        System.out.println("Enter 1 for Scheduled");
        System.out.println("Enter 2 for Completed");
        System.out.println("Enter 3 for camcelled");
        st=sc.nextInt();
        switch(st) 
        {
            case 1:
                System.out.println("Scheduled");
                break;
            case 2:
                System.out.println("Completed");
                break;
            case 3:
                System.out.println("Cancelled");
                break;
            default:
                System.out.println("Invalid input. Please enter 1, 2, or 3.");
                System.exit(0);
        }
    }

    public void sortSpecification(Appointment arr[])
    {
        System.out.println("==========================================");
        System.out.println("\n********Sort by Specialization*********\n");
        for(int i=0; i <arr.length - 1; i++) 
        {
            for(int j=0; j <arr.length - i - 1; j++) 
            {
                if(arr[j].getSpecialization().compareTo(arr[j+1].getSpecialization()) > 0) 
                {
                    Appointment temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("==========================================");
        System.out.println("\n**********Display Patients By Specialization*************\n");
        for(int i =0; i< arr.length; i++) 
        {
            System.out.println("ID: " + arr[i].getAppointmentID());
            System.out.println("Patient Name: " + arr[i].getPatientName());
            System.out.println("Doctor Name: " + arr[i].getDoctorName());
            System.out.println("Specialization: " + arr[i].getSpecialization());
            System.out.println("Appointment Date: " + arr[i].getDay() + "-" + arr[i].getMonth() + "-" + arr[i].getYear());
            System.out.println("Consultation Fee: " + arr[i].getConsultationFee());
            System.out.println("Status: " + arr[i].getStatus());
            System.out.println();
        }
    }

    public void sortDate(Appointment arr[])
    {
        System.out.println("==========================================");
        System.out.println("\n********Sort by Date*********\n");
        for(int i=0; i<arr.length-1; i++)
        {
            for(int j=0; j<arr.length-i-1; j++)
            {
                if(arr[j].getDay()>arr[j+1].getDay())
                {
                    Appointment temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                if(arr[j].getMonth()>arr[j+1].getMonth())
                {
                    Appointment temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                if(arr[j].getYear()>arr[j+1].getYear())
                {
                    Appointment temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }
        System.out.println("==========================================");
        System.out.println("\n**********Display Patients By Dates*************\n");
        for(int i =0; i< arr.length; i++) 
        {
            System.out.println("ID: " + arr[i].getAppointmentID());
            System.out.println("Patient Name: " + arr[i].getPatientName());
            System.out.println("Doctor Name: " + arr[i].getDoctorName());
            System.out.println("Specialization: " + arr[i].getSpecialization());
            System.out.println("Appointment Date: " + arr[i].getDay() + "-" + arr[i].getMonth() + "-" + arr[i].getYear());
            System.out.println("Consultation Fee: " + arr[i].getConsultationFee());
            System.out.println("Status: " + arr[i].getStatus());
            System.out.println();
        }
    }
    
    public void sortName(Appointment arr[])
    {
        for(int i=0; i<arr.length-1; i++)
        {
            int index=i;
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[j].getPatientName().compareTo(arr[index].getPatientName())<0)
                {index=j;}
            }
            Appointment smaller=arr[index];
            arr[index]=arr[i];
            arr[i]=smaller;
        }
        System.out.println("==========================================");
        System.out.println("\n**********Display Patients By Names*************\n");
        for(int i =0; i< arr.length; i++) 
        {
            System.out.println("ID: " + arr[i].getAppointmentID());
            System.out.println("Patient Name: " + arr[i].getPatientName());
            System.out.println("Doctor Name: " + arr[i].getDoctorName());
            System.out.println("Specialization: " + arr[i].getSpecialization());
            System.out.println("Appointment Date: " + arr[i].getDay() + "-" + arr[i].getMonth() + "-" + arr[i].getYear());
            System.out.println("Consultation Fee: " + arr[i].getConsultationFee());
            System.out.println("Status: " + arr[i].getStatus());
            System.out.println();
        }
    }

    

}

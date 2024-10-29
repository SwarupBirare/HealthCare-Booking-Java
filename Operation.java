//import java.util.*;
public class Operation {

    Appointment a=new Appointment();

   public void printAppointmentDetails(Appointment arr[])
   {
        System.out.println("==========================================");
        System.out.println("\n**********Display Patient*************\n");
        for(int i=0; i<arr.length; i++)
        {
            System.out.println("ID: "+arr[i].getAppointmentID());
            System.out.println("Patient Name: "+arr[i].getPatientName());
            System.out.println("Doctor Name: "+arr[i].getDoctorName());
            System.out.println("Specialization: "+arr[i].getSpecialization());
            System.out.printf("AppointmentDate: "+arr[i].getDay());
            System.out.printf("-"+arr[i].getMonth());
            System.out.printf("-"+arr[i].getYear());
            System.out.println("\nConsultationFee: "+arr[i].getConsultationFee());
            System.out.println("Status: "+arr[i].getStatus());
            System.out.println("\n");
        }
    }

/* 
    int idd, choice;
    public void updateStatuses(Appointment arr[])
    {
        boolean found=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("==========================================");
        System.out.println("\n**********Update Status*************\n");
        System.out.println("Enter Id to UpdateStatus: ");
        idd=sc.nextInt();
        
        for(int i=0; i<arr.length; i++)
        {
            if(idd==arr[i].getAppointmentID())
            {
                found=true;
                System.out.println("Enter 1 for Scheduled");
                System.out.println("Enter 2 for Completed");
                System.out.println("Enter 3 for camcelled");
                choice=sc.nextInt();
                switch(choice) 
                {
                    case 1:
                        System.out.println("Status: Scheduled");
                        arr[i].setStatus("Scheduled");
                        break;
                    case 2:
                        System.out.println("Completed");
                        arr[i].setStatus("Completed");
                        break;
                    case 3:
                        System.out.println("Cancelled");
                        arr[i].setStatus("Cancelled");
                        break;
                    default:
                        System.out.println("Invalid input. RETRY");
                        break;
                }
                break;
            }
        }
        if (!found) {
            System.out.println("Appointment ID not found. Please retry.");
        }
        sc.close();
    }
        */
}

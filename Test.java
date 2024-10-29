import java.util.Scanner;
public class Test {
    static void createPatient(Appointment arr[])
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<arr.length; i++)
        {
            Appointment a=new Appointment();
            System.out.println("***************ENTER DETAILS****************");
            a.setAppointmentID((i));
            System.out.println("Enetr Patient Name: ");
            a.setPatientName(sc.nextLine());
            System.out.println("------");
            System.out.println("--Select Specialization--");
            a.specialization();
            System.out.println("------");
           // System.out.println("--Doctor--");
            a.doctorName();
            System.out.println("--Enter AppointmentDate:--");
            System.out.println("(Format: dd-mm-yyyy)");
            a.appointmentDate();
            System.out.println("------");
            System.out.println("-Select ConsultationFees-");
            a.consultationFee();
            System.out.println("------");
            System.out.println("-----Select Status-----");
            a.updateStatus();
            System.out.println("------\n");
            arr[i]=a;
        }
    }
    public static void main(String args[])
    {
        System.out.println("==========================================");
        System.out.println("**MEDICARE HOSPITAL**");
        System.out.println("------------------------------------------");

        Scanner sc=new Scanner(System.in);
        int size;
        System.out.println("Enter the size: ");
        size=sc.nextInt();
        sc.nextLine();
        System.out.println("------------------------------------------\n");
        Appointment arr[]=new Appointment[size];
        Operation o=new Operation();
        createPatient(arr);
        Appointment a=new Appointment();
        int x=1;
    do
    {
        System.out.println("==========================================");
        int opt;
        System.out.println("----Select the Option----");
        System.out.println("1.Sorted Specification");
        System.out.println("2.Sorted Datewise");
        System.out.println("3.Sorted Namewise");
        System.out.println("4.Show Details");
        System.out.println("0.EXIT");
        opt=sc.nextInt();
        sc.nextLine();
        switch(opt)
        {
        case 1: a.sortSpecification(arr);
                System.out.println("==========================================");
                break;
        case 2: a.sortDate(arr);
                System.out.println("==========================================");
                break;
        case 3: a.sortName(arr);
                System.out.println("==========================================");
                break;
        case 4: o.printAppointmentDetails(arr);
                System.out.println("==========================================");
                break;
        default: System.out.println("Have A Nice Day...!!! Visit Again....");
                 break;
        }
    System.out.println("\n=====Press 1 to Continue=====");
    x=sc.nextInt();
    sc.nextLine();
    }
    while(x==1);
       /*  o.updateStatuses(arr);
        System.out.println("------------------------------------------\n");
        o.printAppointmentDetails(arr);
        */
        sc.close();
    }
    
}

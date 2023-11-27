import java.util.*;
public class Register_Complaint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Complaint> arr=new ArrayList<>();
        while(true)
        {
            System.out.println("[1] Register Complaint\n[2] Delete Complaint\n[3] Search Complaints\n[4] Exit");
            System.out.println("Enter Choice");
            int choice=sc.nextInt();
            switch (choice)
            {
                case 1:
                    Register(arr);
                    break;
                case 2:
                    Delete_Complaint(arr);
                    break;
                case 3:
                    Search_Complaint(arr);
                    break;
                default:
                    System.out.println("Invalid Input");
            }
            if(choice==4)
            {
                break;
            }
        }

    }
    public static void Register(ArrayList<Complaint> arr)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Registration Details");
        System.out.println("Enter Complaint Id");
        int Complaint_id=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Complaint Type");
        String Complaint_type=sc.nextLine();
        System.out.println("Enter Category");
        String category=sc.nextLine();
        System.out.println("Enter Landmark");
        String landmark=sc.nextLine();
        System.out.println("Enter Customer Name");
        String Customer_Name=sc.nextLine();
        System.out.println("Enter Problem Description");
        String Problem=sc.nextLine();
        System.out.println("Enter Consumer Number");
        int Consumer_Number=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Address");
        String Address=sc.nextLine();
        System.out.println("Enter Mobile Number");
        long Mobile_Number=sc.nextInt();
        Complaint c=new Complaint(Complaint_type,Complaint_id,category,landmark,Customer_Name,Problem
        ,Consumer_Number,Address,Mobile_Number);
        arr.add(c);
        System.out.println("Successfully Registered Complaint");
    }
    public static void Delete_Complaint(ArrayList<Complaint> arr)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.println("Enter Complaint Id");
        int id=sc.nextInt();
        int count=0;
        for(int i=0;i<arr.size();i++)
        {
            if(arr.get(i).getComplaint_Id()==id)
            {
                arr.remove(i);
                count=1;
            }
        }
        if(count==0)
        {
            System.out.println("Incorrect Complaint Id");
        }
        else
        {
            System.out.println("Complaint Deleted Successfully");
        }
    }
    public static void Search_Complaint(ArrayList<Complaint> arr)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.println("Enter Complaint Id");
        int id=sc.nextInt();
        int count=0;
        for(int i=0;i<arr.size();i++)
        {
            if(arr.get(i).getComplaint_Id()==id)
            {
                System.out.println("Complaint Id: "+arr.get(i).getComplaint_Id());
                System.out.println("Complaint Type: "+arr.get(i).getComplaint_Type());
                System.out.println("Category: "+arr.get(i).getCategory());
                System.out.println("Landmark: "+arr.get(i).getLandmark());
                System.out.println("Customer Name: "+arr.get(i).getCustomer_Name());
                System.out.println("Problem Description: "+arr.get(i).getProblem());
                System.out.println("Consumer Number: "+arr.get(i).getConsumer_Number());
                System.out.println("Address: "+arr.get(i).getAddress());
                System.out.println("Mobile Number: "+arr.get(i).getMobile_Number());
                count=1;
            }
        }
        if(count==0)
        {
            System.out.println("Complaint Not found");
        }
    }
}
class Complaint
{
    private String Complaint_Type;
    private int Complaint_Id;
    private String Category;
    private String Landmark;
    private String Customer_Name;
    private String problem;
    private int Consumer_Number;
    private String Address;
    private long Mobile_Number;

    public Complaint(String complaint_Type,int Complaint_Id, String category, String landmark, String customer_Name, String problem, int consumer_Number, String address, long mobile_Number) {
        Complaint_Type = complaint_Type;
        this.Complaint_Id=Complaint_Id;
        Category = category;
        Landmark = landmark;
        Customer_Name = customer_Name;
        this.problem = problem;
        Consumer_Number = consumer_Number;
        Address = address;
        Mobile_Number = mobile_Number;
    }

    public String getComplaint_Type() {
        return Complaint_Type;
    }

    public void setComplaint_Type(String complaint_Type) {
        Complaint_Type = complaint_Type;
    }

    public int getComplaint_Id() {
        return Complaint_Id;
    }

    public void setComplaint_Id(int complaint_Id) {
        Complaint_Id = complaint_Id;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getLandmark() {
        return Landmark;
    }

    public void setLandmark(String landmark) {
        Landmark = landmark;
    }

    public String getCustomer_Name() {
        return Customer_Name;
    }

    public void setCustomer_Name(String customer_Name) {
        Customer_Name = customer_Name;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public int getConsumer_Number() {
        return Consumer_Number;
    }

    public void setConsumer_Number(int consumer_Number) {
        Consumer_Number = consumer_Number;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public long getMobile_Number() {
        return Mobile_Number;
    }

    public void setMobile_Number(long mobile_Number) {
        Mobile_Number = mobile_Number;
    }
}

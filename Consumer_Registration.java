import java.util.*;
public class Customer_Registration
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Customer> arr = new ArrayList<>();
        while(true) {
            System.out.println("[1] Add Customer\n[2] Update Customer\n[3] Delete Customer\n[4] Display Customers\n[5] Exit");
            System.out.println();
            System.out.println("Enter Your Choice ");
            int choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                    Add_Details(arr);
                    break;
                case 2:
                    Update_Details(arr);
                    break;
                case 3:
                    Delete_Details(arr);
                    break;
                case 4:
                    Display_Customer(arr);
                    break;
                default:
                    System.out.println("Invalid input");
            }
            if(choice==5)
            {
                break;
            }
        }
    }
    public static void Add_Details(ArrayList<Customer> arr)
    {
        System.out.println("Enter the Details of Customer");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Customer Id");
        int Consumer_Id=sc.nextInt();
        System.out.println("Enter Bill Number");
        int Bill_Number=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Title");
        String Title=sc.nextLine();
        System.out.println("Enter Customer Name");
        String Customer_Name=sc.nextLine();
        System.out.println("Enter Email");
        String Email=sc.nextLine();
        System.out.println("Enter Mobile Number");
        long Mobile_Number=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter User Id");
        String User_Id=sc.nextLine();
        System.out.println("Enter Password");
        String Password=sc.nextLine();
        System.out.println("Confirm password");
        String Confirm_password=sc.nextLine();
        Customer c=new Customer(Consumer_Id,Bill_Number,Title,Customer_Name,Email,Mobile_Number,User_Id,Password,Confirm_password);
        arr.add(c);
        System.out.println("Customer Registration Successful");
    }
    public static void Update_Details(ArrayList<Customer> arr)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Consumer Id and Updated Email");
        int Id=sc.nextInt();
        sc.nextLine();
        String em=sc.nextLine();
        int count=0;
        for (Customer customer : arr) {
            if (customer.getConsumer_Id() == Id) {
                customer.setEmail(em);
                count = 1;
            }
        }
        if(count==0)
        {
            System.out.println("Consumer Not found");
        }
        else
        {
            System.out.println("Details Updated Succesfully");
        }
    }
    public static void Delete_Details(ArrayList<Customer> arr)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Consumer Id");
        int Id=sc.nextInt();
        int count=0;
        for(int i=0;i<arr.size();i++)
        {
            if(arr.get(i).getConsumer_Id()==Id)
            {
                arr.remove(i);
                count=1;
            }
        }
        if(count==0)
        {
            System.out.println("Consumer Not found");
        }
        else
        {
            System.out.println("Customer Deleted Succesfully");
        }
    }
    public static void Display_Customer(ArrayList<Customer> arr)
    {
        System.out.println("Customer Details are");
        for (Customer customer : arr) {
            System.out.println("Customer Id: "+customer.getConsumer_Id());
            System.out.println("Bill Number: "+customer.getBill_Number());
            System.out.println("Title: "+customer.getTitle());
            System.out.println("Customer Name: "+customer.getCustomer_Name());
            System.out.println("Customer Email: "+customer.getEmail());
            System.out.println("Mobile Number: "+customer.getMobile_Number());
        }

    }
}
class Customer
{
    private int Consumer_Id;
    private int Bill_Number;
    private String Title;
    private String Customer_Name;
    private String Email;
    private long Mobile_Number;
    private String User_Id;
    private String Password;
    private String Confirm_Password;
    Customer(int consumer_Id, int bill_Number, String title, String customer_Name, String email, long mobile_Number, String user_Id, String password, String confirm_Password) {
        this.Consumer_Id = consumer_Id;
        this.Bill_Number = bill_Number;
        this.Title = title;
        this.Customer_Name = customer_Name;
        this.Email = email;
        this.Mobile_Number = mobile_Number;
        this.User_Id = user_Id;
        this.Password = password;
        this.Confirm_Password = confirm_Password;
    }
    public int getConsumer_Id() {
        return Consumer_Id;
    }
    public void setConsumer_Id(int consumer_Id) {
        this.Consumer_Id = consumer_Id;
    }
    public int getBill_Number() {
        return Bill_Number;
    }
    public void setBill_Number(int bill_Number) {
        this.Bill_Number = bill_Number;
    }
    public String getTitle() {
        return Title;
    }
    public void setTitle(String title) {
        this.Title = title;
    }
    public String getCustomer_Name() {
        return Customer_Name;
    }
    public void setCustomer_Name(String customer_Name) {
        this.Customer_Name = customer_Name;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        this.Email = email;
    }
    public long getMobile_Number() {
        return Mobile_Number;
    }
    public void setMobile_Number(long mobile_Number) {
        this.Mobile_Number = mobile_Number;
    }
    public String getUser_Id() {
        return User_Id;
    }
    public void setUser_Id(String user_Id) {
        this.User_Id = user_Id;
    }
    public String getPassword() {
        return Password;
    }
    public void setPassword(String password) {
        this.Password = password;
    }
    public String getConfirm_Password() {
        return Confirm_Password;
    }
    public void setConfirm_Password(String confirm_Password) {
        this.Confirm_Password = confirm_Password;
    }
}
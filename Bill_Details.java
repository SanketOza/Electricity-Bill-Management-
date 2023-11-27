import java.util.*;
public class Bill_Details {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Bill> arr=new ArrayList<>();
        while(true)
        {
            System.out.println("[1] Add Bill\n[2] Update Bill\n[3] Delete Bill\n[4] View Bills\n[5] Exit");
            System.out.println("Enter choice");
            int choice=sc.nextInt();
            switch (choice)
            {
                case 1:
                    Add_Bill(arr);
                    break;
                case 2:
                    Update_Bill(arr);
                    break;
                case 3:
                    Delete_Bill(arr);
                    break;
                case 4:
                    Display_Bills(arr);
                    break;
                default:
                    System.out.println("Invalid Input");
            }
            if(choice==0)
            {
                break;
            }
        }
    }
    public static void Add_Bill(ArrayList<Bill> arr)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Bill Details");
        System.out.println("Enter Consumer Id");
        int Consumer_Id=sc.nextInt();
        sc.nextLine();
        System.out.println("Consumer Number");
        int Consumer_Number=sc.nextInt();
        System.out.println("Enter Due Amount");
        double Due_Amount=sc.nextDouble();
        System.out.println("Enter Payable amount");
        double Payable_Amount=sc.nextDouble();
        Bill b=new Bill(Consumer_Id,Consumer_Number,Due_Amount,Payable_Amount);
        arr.add(b);
        System.out.println("Bill Details are Added Succesfully");
    }
    public static void Update_Bill(ArrayList<Bill> arr)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Consumer Number and amount");
        int Number=sc.nextInt();
        int amount=sc.nextInt();
        int count=0;
        for(int i=0;i<arr.size();i++)
        {
            if(arr.get(i).getConsumer_Number()==Number)
            {
                arr.get(i).setPayable_Amount(amount);
                count=1;
            }
        }
        if(count==0)
        {
            System.out.println("Consumer Not Found");
        }
        else
        {
            System.out.println("Bill Details are updated successfully");
        }
    }
    public static void Delete_Bill(ArrayList<Bill> arr)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter consumer number");
        int number=sc.nextInt();
        int count=0;
        for(int i=0;i<arr.size();i++)
        {
            if(arr.get(i).getConsumer_Number()==number){
                arr.remove(i);
            count=1;
        }}
        if(count==0)
        {
            System.out.println("Consumer not found");
        }
        else
        {
            System.out.println("Bill Details are deleted");
        }
    }
    public static void Display_Bills(ArrayList<Bill> arr)
    {
        System.out.println("Bill Details are as follows");
        for(int i=0;i<arr.size();i++)
        {
            System.out.println("Customer Id: "+arr.get(i).getConsumer_Id());
            System.out.println("Consumer Number: "+arr.get(i).getConsumer_Number());
            System.out.println("Due Amount: "+arr.get(i).getDue_Amount());
            System.out.println("Payable Amount: "+arr.get(i).getPayable_Amount());
        }
    }
}
class Bill
{
    private int Consumer_Id;
    private int Consumer_Number;
    private double Due_Amount;
    private double Payable_Amount;
    public Bill(int Consumer_Id,int consumer_Number, double due_Amount, double Payable_Amount) {
        this.Consumer_Id=Consumer_Id;
        this.Consumer_Number = consumer_Number;
        this.Due_Amount = due_Amount;
        this.Payable_Amount = Payable_Amount;
    }

    public int getConsumer_Id() {
        return Consumer_Id;
    }

    public void setConsumer_Id(int consumer_Id) {
        Consumer_Id = consumer_Id;
    }

    public int getConsumer_Number() {
        return Consumer_Number;
    }
    public void setConsumer_Number(int consumer_Number) {
        this.Consumer_Number = consumer_Number;
    }
    public double getDue_Amount() {
        return Due_Amount;
    }
    public void setDue_Amount(double due_Amount) {
        this.Due_Amount = due_Amount;
    }
    public double getPayable_Amount() {
        return Payable_Amount;
    }
    public void setPayable_Amount(double Payable_Amount) {
        this.Payable_Amount = Payable_Amount;
    }
}

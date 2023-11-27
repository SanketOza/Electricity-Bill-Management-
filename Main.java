import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Customer> cust_Regi = new ArrayList<>();
        ArrayList<Bill> bill_det = new ArrayList<>();
        ArrayList<Complaint> regi = new ArrayList<>();
        while (true) {
            System.out.println("[1] Add Customer");
            System.out.println("[2] Delete Customer");
            System.out.println("[3] Update Customer");
            System.out.println("[4] Add Bill");
            System.out.println("[5] Delete Bill");
            System.out.println("[6] Update Bill");
            System.out.println("[7] Register Complaint");
            System.out.println("[8] Delete Complaint");
            System.out.println("[9] Search Complaint");
            System.out.println("[0] Exit");
            System.out.println();
            System.out.println("Enter Your Choice");
            int choice=sc.nextInt();
            switch (choice)
            {
                case 1:
                    Customer_Registration.Add_Details(cust_Regi);
                    break;
                case 2:
                    Customer_Registration.Delete_Details(cust_Regi);
                    break;
                case 3:
                    Customer_Registration.Update_Details(cust_Regi);
                    break;
                case 4:
                    Bill_Details.Add_Bill(bill_det);
                    break;
                case 5:
                    Bill_Details.Delete_Bill(bill_det);
                    break;
                case 6:
                    Bill_Details.Update_Bill(bill_det);
                    break;
                case 7:
                    Register_Complaint.Register(regi);
                    break;
                case 8:
                    Register_Complaint.Delete_Complaint(regi);
                    break;
                case 9:
                    Register_Complaint.Search_Complaint(regi);
                    break;
                default :
                    System.out.println("Invalid Input");
            }
            if(choice==0)
            {
                break;
            }
        }
    }
}
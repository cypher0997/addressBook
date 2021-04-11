import java.util.*;
class contactPerson {
    private int id;
   private String firstName;
   private String lastName;
   private String address;
   private String city;
   private String state;
   private String zip;
   private String phoneNumber;

   public contactPerson(String firstName,String lastName,String address,String city,String state,
                            String zip,String phoneNumber,int id){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
   }
   
   contactPerson()
   {
       //pass
   }

   public String[] userInput()
   {
        String arr[] = new String[7];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter FirstName  : ");
        String firstName = sc.nextLine();
        arr[0] = firstName;
        System.out.print("Enter LastName  : ");
        String lastName = sc.nextLine();
        arr[1] = lastName;
        System.out.print("Enter Address  : ");
        String address = sc.nextLine();
        arr[2] = address;
        System.out.print("Enter City  : ");
        String city = sc.nextLine();
        arr[3] = city;
        System.out.print("Enter State : ");
        String state = sc.nextLine();
        arr[4] = state;
        System.out.print("Enter PhoneNUmber : ");
        String phoneNumber = sc.nextLine();
        arr[5] = phoneNumber;
        System.out.print("Enter Zip : ");
        String zip = sc.nextLine();
        arr[6] = zip;
        return arr;
   }
   
   public void display()
   {
        System.out.println("Id: "+this.id);
        System.out.println("FirstName: "+this.firstName);
        System.out.println("LastName: "+this.lastName);
        System.out.println("Address: "+this.address);
        System.out.println("City: "+this.city);
        System.out.println("State: "+this.state);
        System.out.println("Zip: "+this.zip);
        System.out.println("PhoneNumber: "+this.phoneNumber);
    }
}

   public class addressBook
   {
    public static void main(String args[])
    {
        System.out.println("enter the number of user you want to enter");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int comp = (int)n;
        contactPerson Storage[] = new contactPerson[n];
        contactPerson ob = new contactPerson();
        for(int i = 0;i<Storage.length;i++)
        {   
            String res[] = ob.userInput();
                    String firstName = res[0];
                    String lastName = res[1];
                    String address = res[2];
                    String city = res[3];
                    String state = res[4];
                    String zip = res[5];
                    String phoneNumber = res[6];
                    int uid = i;
                    Storage[i] = new contactPerson(firstName, lastName, address, city, state, zip, phoneNumber, uid);
                    System.out.println(" ");
                    if(comp > 1)
                    {
                        System.out.println("enter deatils of next user ");
                    }
                        
                    
        }
        for(int i = 0; i<Storage.length; i++) 
        {
            Storage[i].display();
            System.out.println(" ");
        }
        
}
}



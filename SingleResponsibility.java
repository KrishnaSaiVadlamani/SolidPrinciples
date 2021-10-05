class AccountService{
     AccountRepository r=new AccountRepository();
     Notification n=new Notification();
     public void openAccount(){
     System.out.println("Fill Form inorder to open account");  //primary responsibility
     r.Create();
     n.sendNotification();
     }
}

class AccountRepository{
     public void Create(){
      System.out.println("Store account obj in database");
      }
}

class Notification{
      public void sendNotification(){
        System.out.println("send a message");
        }
}  

class SingleResponsibility{
public static void main(String[] args){
   AccountService AS=new AccountService();
   AS.openAccount();
   }
}

// AccountService need accountrepo and notification as dependencies 

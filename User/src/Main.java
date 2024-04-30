public class Main {
    String name;
    String password;

    String logo(){
        return "Logged in";
}
 void Register() {
     if (name.equals("") || password.equals("")) {
         System.out.println("Invalid Login");
     } else {
         System.out.println("Success");
     }
 }
}
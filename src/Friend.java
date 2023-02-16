public class Friend extends Person{
    private String foodToBring;

     public Friend(String firstName, String lastName, boolean isInvited, String foodToBring){
         super(firstName, lastName, isInvited);
         this.foodToBring = foodToBring;
     }

     public String toString(){
         String message = this.getFullName() + " is bringing " + this.foodToBring + ".";

         if(this.getIsInvited()){
             return message + " They are invited to the party.";
         } else {
             return message + " They are NOT invited to the party.";
         }
     }
}

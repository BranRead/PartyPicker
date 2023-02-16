public class Friend extends Person{
    //region Attributes for Friend
    private String foodToBring;
    //endregion

    //region Behaviours for Friend
    //Constructor with super from Person
    public Friend(String firstName, String lastName, boolean isInvited, String foodToBring){
         super(firstName, lastName, isInvited);
         this.foodToBring = foodToBring;
    }

    //toString behaviour written so the string will reflect whether the person is invited or not.
    public String toString(){
        String message = this.getFullName() + " is bringing " + this.foodToBring + ".";

        if(this.getIsInvited()){
            return message + " They are invited to the party.";
        } else {
            return message + " They are NOT invited to the party.";
        }
    }
     //endregion
}

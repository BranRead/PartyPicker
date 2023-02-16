public class Person {
    //region Attributes for Person
    private String firstName;
    private String lastName;
    private boolean isInvited;
    //endregion

    //region Behaviours for Person
    public Person(String firstName, String lastName, boolean isInvited){
        this.firstName = firstName;
        this.lastName = lastName;
        this.isInvited = isInvited;
    }

    public boolean getIsInvited(){
        return isInvited;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
    //endregion
}

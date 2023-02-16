import java.util.ArrayList;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //region Testing
        //Initial testing
        //Friend Brandon = new Friend("Brandon" , "Read", true, "cookies");
        //System.out.println(Brandon.toString());
        //endregion

        //region Variable Init
        //Array List for Friend objects
        ArrayList<Friend> friends = new ArrayList<Friend>();

        //Title of program
        String program = "Party Picker 5000";

        //Vars for Friend objects
        String firstName = "";
        String lastName = "";
        String food = "";
        boolean isInvited = true;

        //boolean triggers
        boolean run = true;
        boolean quit = false;

        //String to concatenate in loop for ending message.
        String message = "";
        //endregion

        //region Program
        //Starting message. Exiting or "OK" will proceed to next.
        JOptionPane.showMessageDialog(null, "Welcome to the Party Picker! \n" + "\n" +
                "Enter the person's name and the type of food they're most likely to bring,\n" +
                "then indicate whether they're invited or not.", program,
                JOptionPane.INFORMATION_MESSAGE);

        //do while loop for prompts
        do {

            //Input dialog for first name
            firstName = JOptionPane.showInputDialog(null, "Enter their first name",
                        program, JOptionPane.QUESTION_MESSAGE);

            //multiple if statements to check for entries. If null it will skip the rest of the prompts until
            //user is asked if they want to enter someone else.
            if(firstName == null) {
                quit = true;
            }

            //Just checks to make sure no null entry has been captured
            if(!quit) {
                //prompt for last name
                lastName = JOptionPane.showInputDialog(null, "Enter their last name",
                        program, JOptionPane.QUESTION_MESSAGE);
            }

            if(lastName == null) {
                quit = true;
            }

            if(!quit) {
                //prompt for food brought
                food = JOptionPane.showInputDialog(null, "Enter the food they usually bring",
                        program, JOptionPane.QUESTION_MESSAGE);
            }
            if(food == null) {
                quit = true;
            }
            //Custom buttons for invited/not question
            Object[] myButtons = {"Invited", "Not Invited"};

            if(!quit) {
                //Prompts user if person entered is invited
                int choice = JOptionPane.showOptionDialog(null, "Is this guest invited?",
                        program, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, myButtons,
                        myButtons[0]);
                //User can exit the above
                //If so the code below won't run and they will be asked if they want to enter someone else.
                if(choice == -1) {
                } else {
                    //If user has given valid input for the prompt
                    //it's turned into the corresponding boolean value
                    if (choice == 0) {
                        isInvited = true;
                    } else if (choice == 1) {
                        isInvited = false;
                    }
                    //friend object is made and then added to array list
                    Friend friend = new Friend(firstName, lastName, isInvited, food);
                    friends.add(friend);
                }
            }
            //THIS IS THE POINT SKIPPED TO IF USER EXITS ANYTHING ABOVE
            //User is asked if they want to enter another guest
            int cont = JOptionPane.showConfirmDialog(null, "Enter another guest?",
                    program, JOptionPane.YES_NO_OPTION);
            //If the user hits "Yes" than this whole thing will repeat.
            //No will exit the loop
            if (cont == 0){
                run = true;
                quit = false;
            } else {
                run = false;
            }
        } while(run);

        //I wanted to give a different message if no one was entered.
        //This checks to see if the array has any Friend objects in it
        if(friends.size() > 0) {
            //If so, it loops through the array list and adds the toString() method for each Friend object
            //on a different line for each.
            for (Friend friend : friends){
                message += friend.toString() + "\n";
            }
            //The concatenated string is then fed into the message of this message dialog.
            JOptionPane.showMessageDialog(null,
                    "Guests: \n" + "\n" + message,
                    program,
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            //If the array list is empty (the user hasn't entered the complete info for anyone)
            //Then I show a warning message stating that they're exiting without entering anyone's info
            JOptionPane.showMessageDialog(null,
                    "You have chosen to exit without entering guests.",
                    program,
                    JOptionPane.WARNING_MESSAGE);
        }
        //endregion

    }
}
import java.util.ArrayList;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //region Testing
        //Initial testing
        //Friend Brandon = new Friend("Brandon" , "Read", true, "cookies");
        //System.out.println(Brandon.toString());
        //endregion

        ArrayList<Friend> friends = new ArrayList<Friend>();
        String program = "Party Picker 5000";
        boolean isInvited = true;

        JOptionPane.showMessageDialog(null, "Welcome to the Party Picker! \n" + "\n" +
                "Enter the person's name and the type of food they're most likely to bring,\n" +
                "then indicate whether they're invited or not.", program,
                JOptionPane.INFORMATION_MESSAGE);

        String firstName = JOptionPane.showInputDialog(null, "Enter their first name",
                program, JOptionPane.QUESTION_MESSAGE);
        System.out.println(firstName);

        String lastName = JOptionPane.showInputDialog(null, "Enter their last name",
                program, JOptionPane.QUESTION_MESSAGE);

        String food = JOptionPane.showInputDialog(null, "Enter the food they usually bring",
                program, JOptionPane.QUESTION_MESSAGE);

        Object[] myButtons = {"Invited", "Not Invited"};

        int choice = JOptionPane.showOptionDialog(null, "Is this guest invited?",
                program, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, myButtons, myButtons[0]);

        if(choice == 0){
            isInvited = true;
        } else if(choice == 1){
            isInvited = false;
        }

        Friend friend = new Friend(firstName, lastName, isInvited, food);

        friends.add(friend);

        JOptionPane.showConfirmDialog(null, "Enter another guest?",
                program, JOptionPane.YES_NO_OPTION);

        JOptionPane.showMessageDialog(null, "Guests: \n" + "\n" + friends.get(0).toString(),
                program,
                JOptionPane.INFORMATION_MESSAGE);



    }
}
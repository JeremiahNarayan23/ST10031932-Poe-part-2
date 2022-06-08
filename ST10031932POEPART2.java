/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.application.poe.part.pkg1;

/**
 *
 * @author DISD3
 */
public class POEPART2 {

    public static int arraySize;

    public static void main(String[] args) {

        login mk = new login();

        boolean closeProgram = false;

        int menuChoice;

        JOptionPane.showMessageDialog(null, "Salutations");

        while (mk.checkUsername && mk.checkPasswordComplexity) {

            mk.username = JOptionPane.showInputDialog(null, "Originate your username" + "\n-must be a requirement of a underscore" + "\n-The most amount of charaters entered must be 5");

            mk.checkUsername = mk.CheckUserName(mk.username);

            mk.passwordCheck = JOptionPane.showInputDialog(null, "Construct your password" + "Your password must consist of:" + "\n-The least amount of characters entered must be 8" + "\n1 Upper case letter" + "\n1 Digit" + "\n1 unique charater");

            System.out.println(mk.checkUsername);

            System.out.println(mk.checkPasswordComplexity);

            System.out.println(mk.registerUser);

        }//In The Process Of The Loop

        String usernameCheck = mk.usernameCheck;

        while (mk.loginUser == false) {

            mk.usernameCheck = JOptionPane.showInputDialog(null, "");

            mk.passwordCheck = JOptionPane.showInputDialog(null, "input your password");

            System.out.print(mk.returnLoginStatus());

            System.out.println(mk.returnLoginStatus);

        }

        arraySize = Integer.parseInt(JOptionPane.showInputDialog(null, "Please state the amount of tasks you would to accomplish "));

        while (closeProgram == false) {

            menuChoice = Integer.parseInt(JOptionPane.showInputDialog(null, "Primary menu" + "\nPlease select the option you would like to choose " + "\n1. Select a task " + "\n2. Display chosen report " + "\n3.Depart"));

            switch (menuChoice) {

                case 1:
                    tasks();
                    break;

                case 2:
                    JOptionPane.showMessageDialog(null, "Therefore Fourthcoming");
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, "Exit Program");
                    closeProgram = true;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Please Enter A Option That Is Valid");
                    break;

            }

        }

    }

    public static void tasks() {

        String[] taskName = new String[arraySize];

        String[] taskDesc = new String[arraySize];

        String[] taskDevDetails = new String[arraySize];

        String[] taskStatus = new String[arraySize];

        String[] taskID = new String[arraySize];

        int[] taskNumber = new int[arraySize];

        int[] taskDuration = new int[arraySize];

        int taskStatusNumber;

        int totalHours = 0;

        assignment mk = new assignment();

        for (int i = 0; i < arraySize; i++) {

            taskNumber[i] = (i + 1);

            taskName[i] = JOptionPane.showInputDialog(null, "Please Input The Tasks Name" + taskNumber[i]);

            mk.checkTaskDescription = false;

            while (mk.checkTaskDescription == false) {

                taskDesc[i] = JOptionPane.showInputDialog(null, "Please Enter The Tasks Details" + taskNumber[i] + "\ndescription should not be more than 50 charaters");

                System.out.println(mk.checkTaskDescription(taskDesc[i]));

            }

            taskDevDetails[i] = JOptionPane.showInputDialog(null, "Please Insert The Credentials Of The Developer Of The Task(Name And Surname).");

            taskDuration[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Insert the Amount Of Time The Task Has Taken in Hours."));

            taskStatusNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Select An Alternative for the Task Status." + "\n1. To Be Done" + "\n2. In The Process" + "\n3. Completed"));

            switch (taskStatusNumber) {

                case 1:
                    taskStatus[i] = "To Be Done";
                    break;

                case 2:
                    taskStatus[i] = "In The Process";
                    break;

                case 3:
                    taskStatus[i] = "Completed";
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "The Option You Have Selected Is Incorrect");

            }

            taskID[i] = mk.getCreateTaskID(taskName[i], taskNumber[i], taskDevDetails[i], taskID[i]);
            System.out.println("Aquire taskID");

            System.out.println("Extracting The end Product of The Task");

            System.out.println("The ID Of The Task Is Now " + taskID[i]);

            System.out.println(mk.printTaskDetails(taskStatus[i], taskDevDetails[i], taskNumber[i], taskDesc[i], taskID));

            totalHours = mk.returnTotalhours(taskDuration[i], totalHours);
            System.out.println("Total Amount Of Time Added In Hours");

        }

        JOptionPane.showMessageDialog(null, "The Tasks Total Amount Of Hours is" + totalHours);

    }

}

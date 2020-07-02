package edu.uog.main;
import edu.uog.item.*;
import java.util.Scanner;

public class Patient_System {

    public static void main(String[] args){


        Main_menu Menu = new Main_menu();
        Scanner scan = new Scanner(System.in);
        Patient itemx = new Patient();
        ShowPatients showPatients = new ShowPatients();
        Add_newPatient add_Patient = new Add_newPatient();
        Search_patient search_item = new Search_patient();
        Delete_Patient delPatient = new Delete_Patient();

        Menu.Display();


            do {
                itemx.setMenu_Choice(scan.nextInt());

                switch (itemx.getMenu_Choice()) {
                    case 1:
                        showPatients.Show_all_patients();
                        Menu.Display();
                        break;
                    case 2:
                        add_Patient.add_newPatient();
                        Menu.Display();
                        break;
                    case 3:
                        search_item.SearchBy_ID();
                        Menu.Display();
                        break;
                    case 4:
                        search_item.SearchBy_Name();
                        Menu.Display();
                        break;
                    case 5:
                        System.out.println("Enter the ID of item to delete:");
                        int delID = scan.nextInt();
                        delPatient.DeleteBy_ID(delID);
                        Menu.Display();
                        break;
                    default:
                        System.out.println("Invalid Choice, Try again");

                        break;
                    }
                }while(itemx.getMenu_Choice()!=6);
    }

}

package edu.uog.person;

import java.util.List;
import java.util.Scanner;

public class personInterface {





    public static void PersonManu() {
        Scanner scan = new Scanner(System.in);
        int choice;

        choice = -1;
        while (choice!=10) {
            System.out.println("=====================================================");
            System.out.println("Person Menu");
            System.out.println("=====================================================");
            System.out.println("1.   Insert New Person");
            System.out.println("2.   Delete A Person By ID");
            System.out.println("3.   Show All Persons");
            System.out.println("4.   Search A Person By ID");
            System.out.println("5.   Delete All Person Data");
            System.out.println("10.   Back To Main Menu");
            System.out.print("Enter Your Choice [1-10]: ");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("---------------------------------");
                    System.out.println("Add New Person");
                    System.out.println("---------------------------------");
                    Person personA = new Person();


                    System.out.println("Enter Fore Name: ");
                    String Forename = scan.nextLine();
                    Forename+=scan.nextLine();
                    personA.setFORE_NAME(Forename);


                    System.out.println("Enter Sur Name: ");
                    String Surname = scan.nextLine();
                    personA.setSUR_NAME(Surname);

                    System.out.println("Enter Title: ");
                    String Title = scan.nextLine();
                    personA.setTITLE(Title);

                    System.out.println("Enter Age: ");
                    int Age = scan.nextInt();
                    personA.setAGE(Age);

                    System.out.println("Enter Gender: ");
                    String Gender = scan.nextLine();
                    Gender+=scan.nextLine();
                    personA.setGENDER(Gender);


                    System.out.println("Enter Address: ");
                    String Address = scan.nextLine();
                    personA.setADDRESS(Address);



                    Person person = personData.Save(personA);

                    System.out.println(person.toString());
                    System.out.println("---------------------------------");
                    break;
                case 2:
                    System.out.println("---------------------------------");
                    System.out.println("Delete A Person");
                    System.out.println("---------------------------------");
                    System.out.println("Enter Person ID: ");
                    int person_ID = scan.nextInt();

                    Person persondelete = personData.deleteOne(person_ID);
                    System.out.println(persondelete.toString());
                    System.out.println("---------------------------------");
                    break;
                case 3:
                    System.out.println("---------------------------------");
                    System.out.println("Show All Persons Data");
                    System.out.println("---------------------------------");
                    List<Person> persons = personData.showAll();
                    for (int i=0; i<persons.size(); i++) {
                        System.out.println(persons.get(i).toString());
                    }
                    System.out.println("---------------------------------");
                    break;
                case 4:
                    System.out.println("---------------------------------");
                    System.out.println("Search Person");
                    System.out.println("---------------------------------");
                    System.out.println("Enter Person ID: ");
                    String search = scan.nextLine();
                    search+=scan.nextLine();
                    List<Person> personSearch = personData.search(search);
                    for (int i=0; i<personSearch.size(); i++) {
                        System.out.println(personSearch.get(i).toString());
                    }
                    System.out.println("---------------------------------");

                    break;
                case 5:
                    personData.deleteAll();
                    break;


                case 10:
                    break;
            }
        }
    }





}

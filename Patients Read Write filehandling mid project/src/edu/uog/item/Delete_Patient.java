package edu.uog.item;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Delete_Patient {
    ShowPatients showPatients = new ShowPatients();
    Search_patient delPATIENT = new Search_patient();

    public void DeleteBy_ID(int patient_ID) {

        String line;

        FileWriter fileWriter;

        List<Patient> patients = showPatients.ShowAll();
        delPATIENT.SearchBy_ID(patient_ID);

            try {
                fileWriter = new FileWriter(Patient.csvFile);

                    for (int i = 0; i < patients.size(); i++) {
                    if (patients.get(i).getPATIENT_ID() != patient_ID) {

                    fileWriter.append(patients.get(i).toString());
                    fileWriter.append("\n");
                    }

                }
                System.out.println("The Patient deleted ");

                    fileWriter.flush();
                    fileWriter.close();
            } catch(IOException e){
                System.out.println("Error");
                e.printStackTrace();
                }




    }
}

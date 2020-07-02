package edu.uog.item;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ShowPatients {

    public List<Patient> ShowAll(){
        List<Patient> patients = new ArrayList<Patient>();
        String line;

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(Patient.csvFile));

            while ((line = bufferedReader.readLine()) !=null){
                Patient patient = new Patient();
                String[] patientRow = line.split(",");

                patient.setPATIENT_ID(Integer.parseInt(patientRow[0]));
                patient.setPATIENT_NAME(patientRow[1]);
                patient.setPATIENT_DESC(patientRow[2]);
                patient.setPATIENT_FEE(Integer.parseInt(patientRow[3]));
                patient.setPATIENT_WEIGHT(Integer.parseInt(patientRow[4]));
                patient.setPATIENT_HEIGHT(patientRow[5]);

                patients.add(patient);

            }
        } catch (IOException e) {
            System.out.println("errrror");
            e.printStackTrace();
        }

        return patients;
    }


    public void Show_all_patients(){

        System.out.println("Following Is The Full Record Of Patients In Store\n");
        System.out.println("_______________________________________________________________");


        List<Patient> patients = ShowAll();
        for (int i=0; i<patients.size(); i++){
            System.out.println(patients.get(i).toString());
        }
        System.out.println("_______________________________________________________________");

    }


}

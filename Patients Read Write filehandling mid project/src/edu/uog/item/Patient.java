package edu.uog.item;

public class Patient {

    public static String csvFile = "D:\\PATIENT.csv";

    private  int PATIENT_ID;

    private String PATIENT_NAME;

    private String PATIENT_DESC;

    private int PATIENT_WEIGHT;

    private int PATIENT_FEE;

    private String PATIENT_HEIGHT;


    private String NEW_PATIENT_NAME;

    private String NEW_PATIENT_DESC;

    private int NEW_PATIENT_WEIGHT;

    private int NEW_PATIENT_FEE;

    private String NEW_PATIENT_HEIGHT;

    private int menu_Choice;

    private String searchedName;

    private int searchedID;

    public int getPATIENT_ID() {
        return PATIENT_ID;
    }

    public void setPATIENT_ID(int PATIENT_ID) {
        this.PATIENT_ID = PATIENT_ID;
    }

    public String getPATIENT_NAME() {
        return PATIENT_NAME;
    }

    public void setPATIENT_NAME(String PATIENT_NAME) {
        this.PATIENT_NAME = PATIENT_NAME;
    }

    public String getPATIENT_DESC() {
        return PATIENT_DESC;
    }

    public void setPATIENT_DESC(String PATIENT_DESC) {
        this.PATIENT_DESC = PATIENT_DESC;
    }

    public int getPATIENT_WEIGHT() {
        return PATIENT_WEIGHT;
    }

    public void setPATIENT_WEIGHT(int PATIENT_WEIGHT) {
        this.PATIENT_WEIGHT = PATIENT_WEIGHT;
    }

    public int getPATIENT_FEE() {
        return PATIENT_FEE;
    }

    public void setPATIENT_FEE(int PATIENT_FEE) {
        this.PATIENT_FEE = PATIENT_FEE;
    }

    public String getPATIENT_HEIGHT() {
        return PATIENT_HEIGHT;
    }

    public void setPATIENT_HEIGHT(String PATIENT_HEIGHT) {
        this.PATIENT_HEIGHT = PATIENT_HEIGHT;
    }

    public String getNEW_PATIENT_NAME() {
        return NEW_PATIENT_NAME;
    }

    public void setNEW_PATIENT_NAME(String NEW_PATIENT_NAME) {
        this.NEW_PATIENT_NAME = NEW_PATIENT_NAME;
    }

    public String getNEW_PATIENT_DESC() {
        return NEW_PATIENT_DESC;
    }

    public void setNEW_PATIENT_DESC(String NEW_PATIENT_DESC) {
        this.NEW_PATIENT_DESC = NEW_PATIENT_DESC;
    }

    public int getNEW_PATIENT_WEIGHT() {
        return NEW_PATIENT_WEIGHT;
    }

    public void setNEW_PATIENT_WEIGHT(int NEW_PATIENT_WEIGHT) {
        this.NEW_PATIENT_WEIGHT = NEW_PATIENT_WEIGHT;
    }

    public int getNEW_PATIENT_FEE() {
        return NEW_PATIENT_FEE;
    }

    public void setNEW_PATIENT_FEE(int NEW_PATIENT_FEE) {
        this.NEW_PATIENT_FEE = NEW_PATIENT_FEE;
    }

    public String getNEW_PATIENT_HEIGHT() {
        return NEW_PATIENT_HEIGHT;
    }

    public void setNEW_PATIENT_HEIGHT(String NEW_PATIENT_HEIGHT) {
        this.NEW_PATIENT_HEIGHT = NEW_PATIENT_HEIGHT;
    }

    public int getMenu_Choice() {
        return menu_Choice;
    }

    public void setMenu_Choice(int menu_Choice) {
        this.menu_Choice = menu_Choice;
    }

    public String getSearchedName() {
        return searchedName;
    }

    public void setSearchedName(String searchedName) {
        this.searchedName = searchedName;
    }

    public int getSearchedID() {
        return searchedID;
    }

    public void setSearchedID(int searchedID) {
        this.searchedID = searchedID;
    }

    public String toString(){
        String str = null;

        str =   this.PATIENT_ID
                +","+ this.PATIENT_NAME
                +","+ this.PATIENT_DESC
                +","+ this.PATIENT_FEE
                +","+ this.PATIENT_WEIGHT
                +","+ this.PATIENT_HEIGHT;

        return str;
    }
}

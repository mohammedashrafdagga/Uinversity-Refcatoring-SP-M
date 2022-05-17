package modelv1;

interface IReportDepartment {
    abstract void generateReport();
}

interface IAdminRecpationDepartment {
    abstract void viewPersoinalInformation();
}

class IMedicalRecpation implements IAdminRecpationDepartment {
    void registerPatient() {
        System.out.println("registerPatient");
    }

    @Override
    public void viewPersoinalInformation() {
        System.out.println("viewPersoinalInformation");
    };

}

class Mangers implements IReportDepartment, IAdminRecpationDepartment {

    //
    @Override
    public void viewPersoinalInformation() {
        System.out.println("viewPersoinalInformation");
    }

    @Override
    public void generateReport() {
        System.out.println("generateReport");
    }

    // For this class only
    public void exportStatiscs() {
        System.out.println("ExportStatisic");
    }

}

interface INursingDepartment {
    abstract void viewRecord();

    abstract void editRecord();
}

class Doctor implements IReportDepartment, INursingDepartment {

    @Override
    public void viewRecord() {
        System.out.println("viewRecord");
    }

    @Override
    public void editRecord() {
        System.out.println("editRecord");
    }

    @Override
    public void generateReport() {
        System.out.println("generateReport");
    }

    // This is for onlt this class
    public void setupConsultation() {
        System.out.println("setupConsultation");
    }

}

class Nurse implements INursingDepartment {

    @Override
    public void viewRecord() {
        System.out.println("viewRecord");
    }

    @Override
    public void editRecord() {
        System.out.println("editRecord");
    }

}

public class Model {

    public static void main(String[] args) {
        // System.out.println("Hello");
    }

}
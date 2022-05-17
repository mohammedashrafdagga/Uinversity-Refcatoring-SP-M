package modelv2;

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

interface Mangers extends IReportDepartment, IAdminRecpationDepartment {

    // For this class only
    abstract void exportStatiscs();

}

class Manger implements Mangers {

    @Override
    public void generateReport() {
        // TODO Auto-generated method stub
        System.out.println("generateReport");

    }

    @Override
    public void viewPersoinalInformation() {
        // TODO Auto-generated method stub
        System.out.println("viewPersoinalInformation");

    }

    @Override
    public void exportStatiscs() {
        // TODO Auto-generated method stub
        System.out.println("exportStatiscs");

    }

}

interface INursingDepartment {
    abstract void viewRecord();

    abstract void editRecord();
}

interface Doctos extends IReportDepartment, INursingDepartment {
    abstract void setupConsultation();
}

class Doctor implements Doctos {

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

    }
}

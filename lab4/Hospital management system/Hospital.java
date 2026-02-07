public class Hospital {

        void admitPatient(Patient p) {
            System.out.println("---- Patient Details ----");
            p.showPatientInfo();

            System.out.println("---- Assigned Doctor ----");
            Doctor d = p.generateDoctorInfo();
            if (d != null) {
                d.showDoctorInfo();
            } else {
                System.out.println("No doctor assigned");
            }
        }
    }



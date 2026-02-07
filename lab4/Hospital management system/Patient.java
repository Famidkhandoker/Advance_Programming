public class Patient {

        int patientId;
        String patientName;
        Doctor assignedDoctor;

        Patient(int patientId, String patientName) {
            this.patientId = patientId;
            this.patientName = patientName;
        }

        void assignDoctor(Doctor d) {
            assignedDoctor = d;
        }

        Doctor generateDoctorInfo() {
            return assignedDoctor;
        }

        void showPatientInfo() {
            System.out.println("Patient ID: " + patientId);
            System.out.println("Patient Name: " + patientName);
        }
    }



public class Doctor {

        int doctorId;
        String doctorName;
        String specialization;


        Doctor(int doctorId, String doctorName, String specialization) {
            this.doctorId = doctorId;
            this.doctorName = doctorName;
            this.specialization = specialization;
        }

        void showDoctorInfo() {
            System.out.println("Doctor ID: " + doctorId);
            System.out.println("Doctor Name: " + doctorName);
            System.out.println("Specialization: " + specialization);
        }
    }



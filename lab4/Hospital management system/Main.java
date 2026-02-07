public class Main {
    public static void main(String[] args) {
        Doctor d1 = new Doctor(101, "Dr. Rahman", "Cardiology");
        Patient p1 = new Patient(201, "Ahmed Ali");
        p1.assignDoctor(d1);
        Hospital h = new Hospital();
        h.admitPatient(p1);
    }
}

//output
// ---- Patient Details ----
// Patient ID: 201
// Patient Name: Ahmed Ali
// ---- Assigned Doctor ----
// Doctor ID: 101
// Doctor Name: Dr. Rahman
// Specialization: Cardiology


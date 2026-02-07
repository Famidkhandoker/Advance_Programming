public class Main {
    public static void main(String[] args) {
        Doctor d1 = new Doctor(101, "Dr. Rahman", "Cardiology");
        Patient p1 = new Patient(201, "Ahmed Ali");
        p1.assignDoctor(d1);
        Hospital h = new Hospital();
        h.admitPatient(p1);
    }
}


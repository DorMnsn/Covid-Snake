public class Atom {
    double ProtonMass=16726.2192369; // ×10−31
    double ElectronMass =9.10938356; //×10−31
    double NeutronsMass = 16749.27471; //10−31
    double mass;
    int electricCharge;
    int LocationInSpace;
    private Atom(int protons, int electrons, int neutrons, int location) {
        electricCharge = protons - electrons;
        mass = protons * ProtonMass + electrons * ElectronMass + neutrons * NeutronsMass;
        LocationInSpace=location;
    }
}

public class Student {
    private String name;
    private String specialitate;
    private int anulNasterii;
    private double notaTest1;
    private double notaTest2;
    private double notaExamen;

    public Student(String name, String specialitate, int anulNasterii, double notaTest1, double notaTest2, double notaExamen) {
        this.name         = name;
        this.specialitate =  specialitate;
        this.anulNasterii = anulNasterii;
        this.notaTest1    = notaTest1;
        this.notaTest2    = notaTest2;
        this.notaExamen   = notaExamen;
    }
    public int getVirsta() {
        return  2026 - anulNasterii;
    }
    public double getMedie() {
        return (notaTest1 + notaTest2 + notaExamen) / 3.0;
    }

    public void afisareStudentilor() {
        System.out.println("Student: " + name + "\nvirsta: " + getVirsta() + " ani");
        System.out.println("Specialitatea aleasa: " + specialitate);
        System.out.printf("Media finala: " + "%.2f", getMedie());
        System.out.println();

        if (getMedie() > 9) {
            System.out.println("ESTI PROMOVAT!");
        }else {
            System.out.println("Nu ati trecut cu brio, incercati in semestrul urmator");
        }
    }
}

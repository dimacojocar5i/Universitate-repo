import java.util.Scanner;

public class RunStudent {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Intrare in program ");
        System.out.println("Introduceti facultatea (Matematica sau Informatica)");
        String facultate = scanner.nextLine();

        System.out.println("Doriti sa introduceti studenti noi? DA/NU");
        String raspuns = scanner.nextLine();

        if (raspuns.equalsIgnoreCase("DA")) {
            System.out.println("Creati numele grupei noi");
            String grupa = scanner.nextLine();

        }else {
            System.out.println("Iesire din program");
            return;
        }

        String count = "Da";
        int nrStudent = 1 ;

        while (count.equalsIgnoreCase("Da")) {
            System.out.println("Introduceti numele studentului " + nrStudent);
            String nume1 = scanner.nextLine();

            System.out.println("Introduceti anul nasterii studentului: " + nume1);
            int anulNasterii = scanner.nextInt();
            scanner.nextLine();

            int virsta = 2026 - anulNasterii;
            System.out.println("Studentul " + nume1 + "\nVirsta: " + virsta + " ani");
            System.out.println();

            System.out.println("Introduceti specialitatea preferata: (Algebra/Geometria/Calcul_Integral)");
            String specialitate = scanner.nextLine();

            System.out.println("Introduceti nota la Test1: ");
            double test1 = scanner.nextDouble();

            System.out.println("Introduceti nota la Test2: ");
            double test2 = scanner.nextDouble();

            System.out.println("Introduceti nota la examen: ");
            double examen = scanner.nextDouble();
            scanner.nextLine();

            Student student = new Student(nume1, specialitate, anulNasterii, test1, test2, examen);
            student.afisareStudentilor();
            System.out.println();

            System.out.println("Doriti sa introduceti studenti noi? DA/NU");
            count = scanner.nextLine();

            nrStudent++;
        }
        scanner.close();













    }

}

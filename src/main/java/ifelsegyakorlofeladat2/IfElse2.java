package ifelsegyakorlofeladat2;

public class IfElse2 {

        public static void main(String[] args) {

            // double-típusú változó deklarálása
            Double n1 = -1.0, n2 = 8.5, n3 = -2.3, largest;

            // n1 nagyobb vagy egyenlő n2-vel?
            if (n1 >= n2) {

                // n1 nagyobb vagy egyenlő n3-vel?
                if (n1 >= n3) {
                    largest = n1;
                }

                else {
                    largest = n3;
                }
            } else {

                // n2 nagyobb vagy egyenlő n3-vel?
                if (n2 >= n3) {
                    largest = n2;
                }

                else {
                    largest = n3;
                }
            }

            System.out.println("A legnagyobb szám a : " + largest);

        }

}


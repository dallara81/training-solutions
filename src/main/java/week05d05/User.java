package week05d05;

// E-mail cím ellenőrző
// PONT ilyen feladatot kívántam 1,5-2 hete egy kommentben :)))
// Emlékeztető: csinálni búnuszfeladatként TLD-ellenőrzőt is!

    public class User {

        private String email;
        private String firstName;
        private String lastName;

        public User(String firstName, String lastName, String email) {

            int occurence=email.indexOf("@");
            if (email.indexOf("@") == -1 || email.substring(occurence).indexOf(".")== -1){

                throw new IllegalArgumentException("Helytelen e-mail cím! A\'.\' vagy a \'@\' nem található!");

            }

            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;

        }

        public String getFullName() {
            return (firstName+" "+lastName);

        }

        public static void main(String[] args) {

            System.out.println("István Kovács, istvan.kovacs@sil.space");
            User user1 = new User("István","Kovács","istvan.kovacs@sil.space");

        }

}

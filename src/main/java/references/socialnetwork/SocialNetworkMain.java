package references.socialnetwork;

public class SocialNetworkMain {

    public static void main(String[] args) {

        SocialNetwork socialNetwork = new SocialNetwork();
        socialNetwork.addMember("György");
        socialNetwork.addMember("Géza");
        socialNetwork.addMember("Arnold");
        socialNetwork.addMember("Frigyes");
        socialNetwork.addMember("Aladár");

        System.out.println(socialNetwork);
        socialNetwork.connect("György", "Géza");
        System.out.println(socialNetwork);
        socialNetwork.connect("Géza", "György");
        System.out.println(socialNetwork);

        System.out.println(socialNetwork.bidirectionalConnections());

    }

}
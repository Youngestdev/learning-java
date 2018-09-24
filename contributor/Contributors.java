package contributor;

/**
 * Contributors
 */
public class Contributors {
    private String name;
    private String twitterHandle;
    private String githubHandle;

    Contributors(String Cname, String tHandle, String gHandle) {
        name = Cname;
        twitterHandle = tHandle;
        githubHandle = gHandle;
    }

    void showContributors() {
        System.out.println(name);
        System.out.println(twitterHandle);
        System.out.println(githubHandle);
    }
}

class ContributorsDemo {
    public static void main(String[] args) {
        Contributors simplelang[] = new Contributors[4];
        simplelang[0] = new Contributors("Adewale Azeez", "@iamThecarisma", "Thecarisma");
        simplelang[1] = new Contributors("Abdulazeez Abdulazeez Adeshina", "@kvng_zeez", "Youngestdev");
        simplelang[2] = new Contributors("Micheal Ikechi", "@mykeels", "mykeels");
        simplelang[3] = new Contributors("Steve Akinyemi", "@theappcypher", "appcypher");

        for(int i = 0; i < simplelang.length; i++) {
            simplelang[i].showContributors();
        }
    }
}
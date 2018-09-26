package contributordemo;
import contributor.*;

/*
 * ContributorsDemo.java
 * Displaying how imported packages value can be used.
*/

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
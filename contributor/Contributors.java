package contributor;

/**
 * Contributors
 */
public class Contributors {
    private String name;
    private String twitterHandle;
    private String githubHandle;

    public Contributors(String Cname, String tHandle, String gHandle) {
        name = Cname;
        twitterHandle = tHandle;
        githubHandle = gHandle;
    }

    public void showContributors() {
        System.out.println(name);
        System.out.println(twitterHandle);
        System.out.println(githubHandle);
    }
  }

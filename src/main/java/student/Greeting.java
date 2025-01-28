package student;

/**
 * This class is a place holder which you will fully implement based on the javadoc
 * 
 * https://cs5004-khoury-lionelle.github.io/hello_world/student/package-summary.html
 * 
 */

// Store
public class Greeting {
    private int localityID;
    private String localityName;
    private String asciiGreeting;
    private String unicodeGreeting;
    private String formatStr;

    // Create English greetings
    public Greeting(int localityID, String localityName){
        this(localityID, localityName, "Hello", "Hello", "Hello, %%s!");
    }

    /**
     * Creates greeting with ASCII/Unicode format.
     * @param localityID ID, encoded as int
     * @param localityName name, encoded as string
     * @param greeting greeting texts, encoded as string
     */
    public Greeting(int localityID, String localityName, String greeting){
        this(localityID, localityName, greeting, greeting, "%s, %%s!");
    }

    /**
     * Create greeting with format
     * @param localityID ID, encoded as int
     * @param localityName Name, encoded as string
     * @param asciiGreeting ASCII, encoded as string
     * @param unicodeGreeting UNICODE, encoded as string
     * @param formatStr format, encoded as string
     */
    public Greeting(int localityID, String localityName, String asciiGreeting, String unicodeGreeting, String formatStr){
        this.localityID = localityID;
        this.localityName = localityName;
        this.unicodeGreeting = unicodeGreeting;
        this.asciiGreeting = asciiGreeting;
        this.formatStr = formatStr;
    }

    // Getter for localityID
    public int getLocalityID() {
        return localityID;
    }
    // Getter for localityName
    public String getLocalityName() {
        return localityName;
    }
    // Getter for asciiGreeting
    public String getAsciiGreeting() {
        return asciiGreeting;
    }
    // Getter for unicodeGreeting
    public String getUnicodeGreeting() {
        return unicodeGreeting;
    }

    // Return string with unicode or ascii format
    public String getFormatStr() {
        return String.format(formatStr, unicodeGreeting).replace("%%s", "%s");
    }

    public String getFormatStr(boolean asciiOnly) {
        String greeting = asciiOnly ? asciiGreeting : unicodeGreeting;
        return String.format(formatStr, greeting).replace("%%s", "%s");
    }

    public String toString() {
        return String.format("{localityID:%d, localityName:\"%s\", asciiGreeting:\"%s\", unicodeGreeting:\"%s\"}",
                localityID, localityName, asciiGreeting, unicodeGreeting);
    }
}

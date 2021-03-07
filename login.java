public class login {

    private static String[] username = {"arunie", "podi", "loku", "amma"};
    private static String[] password = {"arunie123", "podi123", "loku123", "amma123"};

    public static void auth(String name, String pass1){

        boolean found = false;
        int index = 0;

        for(int x=0; x<4; x++){
            if (name.equals(username[x]) && pass1.equals(password[x])) {
                index = x;
                found = true;
                break;
            }
        }

        if(found){
            System.out.println("\nWelcome " +username[index]+ "!\n" );
        }
        else{
            System.out.println("Invalid Login");
        }
    }
}
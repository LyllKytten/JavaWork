import java.io.File;

public class propsRun {
    public static void main(String[] args) {
        boolean withProps = false;
        try {
            if (args != null) {
                for (String obj : args) {
                    if (obj.equals("gitler")) {
                        System.out.println("priver Egor");
                    }
                    else if (obj.equals("--help")) {
                        System.out.println("this is HELPER with your stupid brain");
                    }
                    else if (obj.equals("porno")) {
                        System.out.println("AAAHHHHH AAHHHHHH AAAAHHHHHH MOOOOORREEEEEE");
                    }
                    else if (obj.equals("rename")) {
                        File oldFile = new File(args[1]);
                        File newFile = new File(args[2]);

                        try {
                            if (oldFile.renameTo(newFile)) {
                                System.out.println("Successfully renamed file");
                            } else {
                                System.out.println("Unexpected Error ( check filename path or name )");
                            }
                        } catch (Exception exception) {
                            System.out.println("Error : " + exception);
                        }
                    }
                }
            }
        } catch (Exception error) {
            withProps = true; //work only for linux
        }

        if (withProps) {
            System.out.print("Program runned without any props");
        } else {
            System.out.print("Program runned with any props");
        }
    }
}
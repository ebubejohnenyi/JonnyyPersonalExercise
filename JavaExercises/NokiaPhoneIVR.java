import java.util.Scanner;

public class NokiaPhoneIVR {
    public static void main (String[] args){
        MenuFunction();
    }

    public static void MenuFunction(){
        Scanner input = new Scanner(System.in);
        System.out.println("Press 1 -> PhoneBook");
        System.out.println("Press 2 -> Messages");
        System.out.println("Press 3 -> Chat");
        System.out.println("Press 4 -> Call Register");
        System.out.println("Press 5 -> Tones");
        System.out.println("Press 6 -> Settings");
        System.out.println("Press 7 -> Call Divert");
        System.out.println("Press 8 -> Games");
        System.out.println("Press 9 -> Calculator");
        System.out.println("Press 10 -> Reminders");
        System.out.println("Press 11 -> Clock");
        System.out.println("Press 12 -> Profiles");
        System.out.println("Press 13 -> SIM Services");
        System.out.println("Dear Customer, Kindly Enter Your Choice Of Number: ");
        int menuFunctionChoice = input.nextInt();
        switch (menuFunctionChoice){
            case 1: PhoneBook();
                break;
            case 2: Messages();
                break;
            case 3: Chat();
                break;
            case 4: CallRegister();
                break;
            case 5: Tones();
                break;
            case 6: Settings();
                break;
            case 7: CallDivert();
                break;
            case 8:Games();
                break;
            case 9: Calculator();
                break;
            case 10: Reminder();
                break;
            case 11: Clock();
                break;
            case 12: Profile();
                break;
            case 13: SIMService();
                break;
        }
    }


    public static void PhoneBook(){
        Scanner input = new Scanner(System.in);
        System.out.println("Press 1 -> Search");
        System.out.println("Press 2 -> Service Nos");
        System.out.println("Press 3 -> Add Name");
        System.out.println("Press 4 -> Erase");
        System.out.println("Press 5 -> Edit");
        System.out.println("Press 6 -> Assign tone");
        System.out.println("Press 7 -> Send b' card");
        System.out.println("Press 8 -> Option");
        System.out.println("Press 9 -> Speed Dials");
        System.out.println("Press 10 -> Voice Tags");
        System.out.println("Press 11 -> Main Menu");
        int phoneBookChoice = input.nextInt();
        switch (phoneBookChoice){
            case 1:{
                System.out.println("Search");
                break;
            }
            case 2: {
                System.out.println("Service Nos");
            }
            case 3: {
                System.out.println("Add Name");
                break;
            }
            case 4: {
                System.out.println("Erase");
                break;
            }
            case 5: {
                System.out.println("Edit");
                break;
            }
            case 6: {
                System.out.println("Assign tone");
                break;
            }
            case 7: {
                System.out.println("Send b' card");
                break;
            }
            case 8: {
                System.out.println("Press 1 -> Type of view");
                System.out.println("Press 2 -> Memory Status");
                System.out.println("Press 3 -> Previous Page");
                int optionChoice = input.nextInt();
                switch (optionChoice){
                    case 1: {
                        System.out.println("Type of View");
                        break;
                    }
                    case 2: {
                        System.out.println("Memory Status");
                        break;
                    }
                    case 3: {
                        PhoneBook();
                    }
                }
                break;
            }
            case 9: {
                System.out.println("Speed Dials");
                break;
            }
            case 10: {
                System.out.println("Voice Settings");
                break;
            }
            case 11: {
                MenuFunction();
                break;
            }
        }
    }


    public static void Messages(){
        Scanner input = new Scanner(System.in);
        System.out.println("Press 1 -> Write Messages");
        System.out.println("Press 2 -> Inbox");
        System.out.println("Press 3 -> Outbox");
        System.out.println("Press 4 -> Picture Message");
        System.out.println("Press 5 -> Templates");
        System.out.println("Press 6 -> Smileys");
        System.out.println("Press 7 -> Message Settings");
        System.out.println("Press 8 - > Info Service ");
        System.out.println("Press 9 -> Voice Mailbox Number ");
        System.out.println("Press 10 -> Service Command Editor");
        int messageMenuChoice = input.nextInt();
        switch (messageMenuChoice){
            case 1: {
                System.out.println("Write Message");
                break;
            }
            case 2: {
                System.out.println("Inbox");
                break;
            }
            case 3: {
                System.out.println("Outbox");
                break;
            }
            case 4: {
                System.out.println("Picture Message");
                break;
            }
            case 5: {
                System.out.println("Templates");
                break;
            }
            case 6: {
                System.out.println("Smileys");
                break;
            }
            case 7: {
                System.out.println("Press 1 -> Set 1");
                System.out.println("Press 2 -> Common");
                System.out.println("Press 3 -> Back");
                int messageSettingsChoice = input.nextInt();
                switch (messageSettingsChoice){
                    case 1: {
                        System.out.println("Message center number");
                        System.out.println("Message sent as");
                        System.out.println("Message validity");
                        break;
                    }
                    case 2: {
                        System.out.println("Delivery reports");
                        System.out.println("Reply via same center");
                        System.out.println("Character support");
                        break;
                    }
                    case 3: {
                        Messages();
                    }
                }
                break;
            }
            case 8: {
                System.out.println("Info Service");
                break;
            }
            case 9: {
                System.out.println("Voice MailBox Number");
                break;
            }
            case 10: {
                System.out.println("Service Command Editor");
                break;
            }
        }
    }

    public static void Chat(){
        System.out.println("Chat");
    }
    public static void CallRegister(){
        Scanner input = new Scanner(System.in);
        System.out.println("Press 1 -> Missed calls ");
        System.out.println("Press 2 -> Received calls");
        System.out.println("Press 3 -> Dialed number");
        System.out.println("Press 4 -> Erase recent call lists");
        System.out.println("Press 5 -> Show call duration");
        System.out.println("Press 6 -> Show call costs");
        System.out.println("Press 7 -> Call cost settings");
        System.out.println("Press 8 -> Prepaid credit");
        System.out.println("Press 9 -> Main Menu");
        int callRegisterChoice = input.nextInt();
        switch (callRegisterChoice){
            case 1: {
                System.out.println("Missed calls");
                break;
            }
            case 2: {
                System.out.println("Received calls");
                break;
            }
            case 3: {
                System.out.println("Dialed number");
                break;
            }
            case 4: {
                System.out.println("Erase recent call lists");
                break;
            }
            case 5: {
                System.out.println("1. Last call duration");
                System.out.println("2. All call's duration");
                System.out.println("3. Received call's duration");
                System.out.println("4. Dialled call's duration");
                System.out.println("5. Clear timers");
                break;
            }
            case 6: {
                System.out.println("1. Last call's cost");
                System.out.println("2. All call's cost");
                System.out.println("3. Clear counters");
                break;
            }
            case 7: {
                System.out.println("1. Call cost limit");
                System.out.println("2. Show costs in");
                break;
            }
            case 8: {
                System.out.println("Prepaid credit");
                break;
            }
            case 9: {
                PhoneBook();
            }
        }
    }
    public static void Tones(){
        System.out.println("1. Ringing tone");
        System.out.println("2. Ringing volume ");
        System.out.println("3. Incoming call alert");
        System.out.println("4. Composer");
        System.out.println("5. Message alert tone");
        System.out.println("6. Keypad tones");
        System.out.println("7. Warning and game tone");
        System.out.println("8. Vibrating alert");
        System.out.println("9. Screen Saver");
    }
    public static void Settings(){
        Scanner input = new Scanner (System.in);
        System.out.println("Press 1 -> Call settings");
        System.out.println("Press 2 -> Phone settings");
        System.out.println("Press 3 -> Security settings");
        System.out.println("Press 4 -> Restore factory settings");
        int settingsMenuChoice = input.nextInt();
        switch (settingsMenuChoice){
            case 1: {
                System.out.println("1. Automatic redial");
                System.out.println("2. Speed dailing ");
                System.out.println("3. Call waiting options");
                System.out.println("4. Own number sending ");
                System.out.println("5. Phone line in use");
                System.out.println("6. Automatic answer");
                System.out.println("7. Previous page");
                int callSettingsMenuChoice =  input.nextInt();
                switch (callSettingsMenuChoice){
                    case 7: {
                        Settings();
                        break;
                    }
                }
                break;
            }
            case 2: {
                System.out.println("1. Language");
                System.out.println("2. Cell info display");
                System.out.println("3. Welcome note");
                System.out.println("4. Network selection");
                System.out.println("5. Lights ");
                System.out.println("6. Confirm SIM service actions");
                System.out.println("7. Previous page");
                int phoneSettingsMenuChoice = input.nextInt();
                switch (phoneSettingsMenuChoice){
                    case 7: {
                        Settings();
                        break;
                    }
                }
                break;
            }
            case 3: {
                System.out.println("1. PIN code requests");
                System.out.println("2. Call barring services");
                System.out.println("3. Fixed dialing");
                System.out.println("4. Closed user group");
                System.out.println("5. Phone security");
                System.out.println("6. Change access code");
                System.out.println("7. Previous page");
                int securitySettingsMenuChoice = input.nextInt();
                switch (securitySettingsMenuChoice){
                    case 7: {
                        Settings();
                        break;
                    }
                }
                break;
            }
            case 4: {
                System.out.println("Restore factory settings");
            }
        }
    }
    public static void CallDivert(){
        System.out.println("Call divert");
    }
    public static void Games(){
        System.out.println("Games");
    }
    public static void Calculator(){
        System.out.println("Calculator");
    }
    public static void Reminder(){
        System.out.println("Reminder");
    }
    public static void Clock(){
        System.out.println("1. Alarm clock");
        System.out.println("2. Clock settings");
        System.out.println("3. Date settings");
        System.out.println("4. Stopwatch");
        System.out.println("5. Countdown timer");
        System.out.println("6. Auto update of time and date");
    }
    public static void Profile(){
        System.out.println("Profiles");
    }
    public static void SIMService(){
        System.out.println("SIM services");
    }


}
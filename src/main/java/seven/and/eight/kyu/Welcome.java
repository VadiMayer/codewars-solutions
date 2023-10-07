package seven.and.eight.kyu;

import java.util.HashMap;
import java.util.Map;

public class Welcome {
    public static String greet(String language){
        Map<String, String> welcome = new HashMap<>();
        welcome.put("english", "Welcome");
        if (language == null) return welcome.get("english");
        welcome.put("czech", "Vitejte");
        welcome.put("danish", "Velkomst");
        welcome.put("dutch", "Welkom");
        welcome.put("estonian", "Tere tulemast");
        welcome.put("finnish", "Tervetuloa");
        welcome.put("flemish", "Welgekomen");
        welcome.put("french", "Bienvenue");
        welcome.put("german", "Willkommen");
        welcome.put("irish", "Failte");
        welcome.put("italian", "Benvenuto");
        welcome.put("latvian", "Gaidits");
        welcome.put("lithuanian", "Laukiamas");
        welcome.put("polish", "Witamy");
        welcome.put("spanish", "Bienvenido");
        welcome.put("swedish", "Valkommen");
        welcome.put("welsh", "Croeso");
        welcome.put("IP_ADDRESS_INVALID", "Welcome");
        welcome.put("IP_ADDRESS_NOT_FOUND", "Welcome");
        welcome.put("IP_ADDRESS_REQUIRED", "Welcome");
        return welcome.get(language);
    }
}

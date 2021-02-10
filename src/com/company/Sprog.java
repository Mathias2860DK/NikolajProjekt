package com.company;

import java.util.HashMap;

public class Sprog  {

    private HashMap<String, Dialog> dialoger = new HashMap<>();

    public Sprog() {

        // her tilføjer du ny sprog
        dialoger.put("da", new Dansk());
        dialoger.put("eng", new English());
<<<<<<< HEAD
        dialoger.put("Fin", new Finsk());
=======
        dialoger.put("deu", new Tysk());
>>>>>>> 92a5a62c63d3b35f9112d2e83b24fb5a3c7180a0

    }
    public Dialog SkiftSprog(String s) {

       return dialoger.getOrDefault(s, new English());

    }
}

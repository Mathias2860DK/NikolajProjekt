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

        dialoger.put("french", new Fransk());

        dialoger.put("deu", new Tysk());

=======
        dialoger.put("Fin", new Finsk());
        dialoger.put("french", new Fransk());
        dialoger.put("deu", new Tysk());
>>>>>>> cf821985e0604c6c44dba69bd25afc1d0d3a2d05

    }
    public Dialog SkiftSprog(String s) {

       return dialoger.getOrDefault(s, new English());

    }
}

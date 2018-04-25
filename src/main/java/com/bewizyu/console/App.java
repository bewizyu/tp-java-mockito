package com.bewizyu.console;

import java.util.Objects;
import java.util.Scanner;

import com.bewizyu.exception.CalculException;
import com.bewizyu.services.CalculService;

public class App {

    private static final transient org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(App.class);

    private Scanner scanner;

    private CalculService calculatrice;

    public App(Scanner scanner, CalculService calculatrice) {
        this.scanner = scanner;
        this.calculatrice = calculatrice;
    }

    protected void afficherTitre() {
        LOG.info("**** Application Calculatrice ****");

    }

    public void demarrer() {
        afficherTitre();

        Objects.requireNonNull(scanner);

        while (scanner.hasNext()) {
            String userInput = scanner.next();

            switch (userInput) {
            case "fin":
                LOG.info("Aurevoir :-(");
                System.exit(0);
                break;

            default:
                try {
                    this.evaluer(userInput);
                } catch (CalculException ce) {
                    LOG.error("L'expression {} est invalide.",userInput);
                }
                break;
            }
        }
    }

    protected void evaluer(String expression) throws CalculException {
        LOG.info("{}={}",expression,calculatrice.additionner(expression));
    }

}
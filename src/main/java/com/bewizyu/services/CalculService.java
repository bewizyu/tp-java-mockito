package com.bewizyu.services;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import com.bewizyu.exception.CalculException;

public class CalculService {

    private static final transient org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(CalculService.class);

    public int additionner(String expression) throws CalculException{

        //TODO Ajouter un log en niveau DEBUG affichant "Evaluation de l'expression <expression>".
        LOG.debug("Evaluation de l'expression {}", expression);

        //TODO par exemple "Evaluation de l'expression 1+4"
        ScriptEngineManager factory = new ScriptEngineManager();
        ScriptEngine engine = factory.getEngineByName("nashorn");

        int somme = 0;

        try {
            somme = (Integer)engine.eval(expression);
        }catch(ScriptException sce){
            throw new CalculException("CalculException during Expression evaluation",sce);
        }
    


        return somme;

    }

    

}
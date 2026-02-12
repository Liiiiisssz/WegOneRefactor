package br.com.senai.centroweg.wegone;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.json.JSONArray;
import org.json.JSONObject;

public class Traducoes {
    
    private JSONObject traducao;

    public Traducoes(String filePath) throws IOException{

        InputStream is = getClass().getClassLoader().getResourceAsStream(filePath);

        if (is == null) {

            throw new IOException("Arquivo de tradução não encontrado no classpath: " + filePath);
            
        }

        String content = new String(is.readAllBytes(), StandardCharsets.UTF_8);
        traducao = new JSONObject(content);

    }

    public String get(String texto){

        return traducao.getString(texto);

    }

    public String[] getArray(String texto){

        JSONArray array = traducao.getJSONArray(texto);
        String[] resultado = new String[array.length()];

        for(int i = 0; i < array.length(); i++){

            resultado[i] = array.getString(i);

        }

        return (resultado);

    }

}

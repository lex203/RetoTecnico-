package demo.guru99.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import demo.guru99.models.DataUser;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class JsonReader {
    public static List<DataUser> dataUsers(String rutaArchivo){
        try {
            ObjectMapper mapper = new ObjectMapper();
            DataUser [] users = mapper.readValue(new File(rutaArchivo), DataUser[].class);
            return Arrays.asList(users);
        }catch (Exception e){
            e.printStackTrace();

            throw new RuntimeException("Error al leer el archivo Json:" + e.getMessage());

        }
    }
}

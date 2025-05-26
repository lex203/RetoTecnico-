package demo.guru99.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import demo.guru99.models.DataCustomer;
import java.io.File;
import java.util.Arrays;
import java.util.List;

public class JsonReaderCustomer {

    public static List<DataCustomer> readCustomers(String filePath){
        try {
            ObjectMapper mapper = new ObjectMapper();
            DataCustomer[] customers = mapper.readValue(new File(filePath), DataCustomer[].class);
            return Arrays.asList(customers);
        } catch (Exception e) {
            throw new RuntimeException("Error al leer el archivo JSON: " + e.getMessage());
        }
    }
}

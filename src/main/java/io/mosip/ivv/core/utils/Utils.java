package main.java.io.mosip.ivv.core.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Utils {
    /*
     * public static void deleteDirectoryPath(String directoryName, String folderName) { folderPath = directoryName; theDir = new File(folderPath);
     * theDir.delete(); }
     *
     */
    public static void deleteDirectoryPath(String path) {
        File file = new File(path);
        if (file.exists()) {
            do {
                deleteIt(file);
            } while (file.exists());
        } else {
        }
    }

    private static void deleteIt(File file) {
        if (file.isDirectory()) {
            String fileList[] = file.list();
            if (fileList.length == 0) {
                file.delete();
            } else {
                int size = fileList.length;
                for (int i = 0; i < size; i++) {
                    String fileName = fileList[i];
                    String fullPath = file.getPath() + "/" + fileName;
                    File fileOrFolder = new File(fullPath);
                    deleteIt(fileOrFolder);
                }
            }
        } else {
            file.delete();
        }
    }

    public static String createDirectory(String path, String name) {
        String folderPath = path + name;
        File theDir = new File(folderPath);
        if (!theDir.exists()) {
            try {
                theDir.mkdirs();
            } catch (SecurityException se) {
            }
        }
        return folderPath;
    }

    public static String getCurrentDate() {
        DateFormat format = new SimpleDateFormat("yyyy_MM_dd");
        Date date = new Date();
        return format.format(date).toString();
    }

    public static String getCurrentDateAndTime() {
        DateFormat format = new SimpleDateFormat("yyyy_MM_dd_HH:mm:ss");
        Date date = new Date();
        return format.format(date).toString();
    }

    public static String assertResponseStatus(String statusCode) {
        String returnString = null;

        switch (Integer.parseInt(statusCode)) {
            case 200: // Successful or OK
                returnString = "OK, The request has succeeded";
                break;
            case 201: // Created
                returnString = "Created! The request has been fulfilled and resulted in a new resource being created";
                break;
            case 204: // Created
                returnString = "No Content! The server has fulfilled the request but does not need to return an entity-body, and might want to return updated metainformation";
                break;
            case 304: // Created
                returnString = "Not Modified!";
                break;
            case 400: // Bad Request
                returnString = "Bad Request! The request could not be understood by the server due to malformed syntax";
                break;
            case 401: // Unauthorized
                returnString = "Unauthorized! The request requires user authentication";
                break;
            case 403: // Forbidden
                returnString = "Forbidden! The server understood the request, but is refusing to fulfill it";
                break;
            case 404: // Not found
                returnString = "Not Found! The server has not found anything matching the Request-URI";
                break;
            case 405: // Method not allowed
                returnString = "Method not allowed! The method specified in the Request-Line is not allowed for the resource identified by the Request-URI.";
                break;
            case 409: // Conflict
                returnString = "Conflict! The request could not be completed due to a conflict with the current state of the resource.";
                break;
            case 500: // Internal Server Error
                returnString = "Internal Server Error! The server encountered an unexpected condition which prevented it from fulfilling the request";
                break;
            case 503: // Service Unavailable
                returnString = "Service Unavailable! The server is currently unable to handle the request due to a temporary overloading or maintenance of the server";
                break;
        }

        return returnString;
    }

    public static Properties getProperties(String path) {
        Properties prop = new Properties();
        try {
            FileInputStream file = new FileInputStream(path);
            prop.load(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }

    public static HashMap getMap(String path) {
        Object obj = new Object();
        JSONParser jsonParser = new JSONParser();
        try {
            FileReader file = new FileReader(path);
            obj = jsonParser.parse(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }catch (ParseException e) {
            e.printStackTrace();
        }
        return (HashMap) obj;
    }

    public static String csvToJson(String path){
        String json = "";
        File input = new File(path);
        CsvSchema csvSchema = CsvSchema.builder().setUseHeader(true).build();
        CsvMapper csvMapper = new CsvMapper();
        try {
            // Read data from CSV file
            List<Object> readAll = csvMapper.readerFor(Map.class).with(csvSchema).readValues(input).readAll();
            ObjectMapper mapper = new ObjectMapper();
            json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(readAll);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return json;
    }

    public static ArrayList csvToList(String path){
        ArrayList list = new ArrayList();
        File input = new File(path);
        CsvSchema csvSchema = CsvSchema.builder().setUseHeader(true).build();
        CsvMapper csvMapper = new CsvMapper();
        try {
            // Read data from CSV file
            List<Object> readAll = csvMapper.readerFor(Map.class).with(csvSchema).readValues(input).readAll();
            list = (ArrayList) readAll;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static String regex(String exp, String str){
        String parsed = new String();
        Pattern pattern = Pattern.compile(exp);
        Matcher m = pattern.matcher(str);
        while(m.find()) {
            parsed = m.group(1);
        }
        return parsed;
    }

    public static boolean isNumeric(String inputStr) {
        try {
            double d = Double.parseDouble(inputStr);
        } catch (NumberFormatException nfe) {
            return false;
        } catch (NullPointerException npe){
            return false;
        }
        return true;
    }

}

package helper;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JsonFunctions {
    private static final Gson gson = new Gson();

    public static Object json_load(String path) {
//
//        try (FileReader reader = new FileReader(path)) {
//
//            Type type = new TypeToken<Object>() {
//            }.getType();
//
//            return gson.fromJson(reader, type);
//
//        } catch (IOException e) {
//            throw new RuntimeException(
//                    "Cannot load JSON file: " + path,
//                    e
//            );
//        }
        try {

            Path resolved = Paths.get(path);

            if (!resolved.isAbsolute()) {
                resolved = Paths.get("").toAbsolutePath().resolve(path).normalize();
            }

            try (FileReader reader = new FileReader(resolved.toFile())) {

                Type type = new TypeToken<Object>() {
                }.getType();

                return gson.fromJson(reader, type);
            }

        } catch (IOException e) {
            throw new RuntimeException(
                    "Cannot load JSON file: " + path,
                    e
            );
        }

    }

}
